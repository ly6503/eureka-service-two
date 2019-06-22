package com.example.eurekazuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.java.Log;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 22:12
 * @Description:
 */
@Log
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info("send " + request.getMethod() + " Request to " + request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token) || token.equals("123")) {
            log.warning("access token is empty");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            try {
                HttpServletResponse response = currentContext.getResponse();
                response.setCharacterEncoding("utf-8");  //设置字符集
                response.setContentType("text/html; charset=utf-8"); //设置相应格式
                response.getWriter().write("token 验证失败");
            } catch (IOException e) {
                log.info("response io异常");
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
