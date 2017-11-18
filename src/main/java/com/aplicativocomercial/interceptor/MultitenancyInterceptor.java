package com.aplicativocomercial.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.aplicativocomercial.constantes.Constantes;

public class MultitenancyInterceptor extends HandlerInterceptorAdapter {

	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		Map<String, Object> pathVars = (Map<String, Object>) req
				.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

		if (pathVars.containsKey(Constantes.TENANT_PATH_VARIABLE)) {
			req.setAttribute(Constantes.IDENTIFICADOR_TENANT, pathVars.get(Constantes.TENANT_PATH_VARIABLE));
		}

		return true;
	}

}