/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.ziyuan.perspective.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * PerspectiveFilter
 *
 * @author ziyuan
 * @since 2017-03-06
 */
public class PerspectiveFilter implements Filter {

    /**
     * 这里初始化一些东西
     *
     * @param filterConfig
     * @throws ServletException
     */
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    public void destroy() {
    }
}
