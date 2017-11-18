package com.aplicativocomercial;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.aplicativocomercial.constantes.Constantes;

public class SuporteDeContexto {

	public static final String getCurrentTenantIdentifier() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes != null) {
			String identifier = (String) requestAttributes
					.getAttribute(Constantes.IDENTIFICADOR_TENANT, RequestAttributes.SCOPE_REQUEST);
			if (identifier != null) {
				return identifier;
			}
		}
		return Constantes.TENANT_PADRAO;
	}

}
