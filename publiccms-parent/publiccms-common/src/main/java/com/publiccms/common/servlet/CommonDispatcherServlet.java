package com.publiccms.common.servlet;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 兼容性提升
 * 
 * CommonDispatcherServlet
 *
 */
public class CommonDispatcherServlet extends DispatcherServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final int REDIRECT_URL_PREFIX_LENGTH = UrlBasedViewResolver.REDIRECT_URL_PREFIX.length();
    private static final String SPECIAL_REDIRECT_URL = UrlBasedViewResolver.REDIRECT_URL_PREFIX + "//";

    /**
     * @param webApplicationContext
     */
    public CommonDispatcherServlet(WebApplicationContext webApplicationContext) {
        super(webApplicationContext);
    }

    @Override
    public void render(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (!response.isCommitted()) {
            super.render(mv, request, response);
        }
    }

    @Override
    protected View resolveViewName(String viewName, Map<String, Object> model, Locale locale, HttpServletRequest request)
            throws Exception {
        if (viewName.startsWith(SPECIAL_REDIRECT_URL)) {
            String fixedViewName = viewName.substring(0, REDIRECT_URL_PREFIX_LENGTH) + request.getScheme()
                    + viewName.substring(REDIRECT_URL_PREFIX_LENGTH - 1);
            return super.resolveViewName(fixedViewName, model, locale, request);
        } else {
            return super.resolveViewName(viewName, model, locale, request);
        }
    }
}