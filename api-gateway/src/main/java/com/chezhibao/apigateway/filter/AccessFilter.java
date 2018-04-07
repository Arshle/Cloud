/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: AccessFilter.java
 * Author:   Arshle
 * Date:     2018年04月07日
 * Description:
 */
package com.chezhibao.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
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
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("accessToken");
        if(token == null || "".equals(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
