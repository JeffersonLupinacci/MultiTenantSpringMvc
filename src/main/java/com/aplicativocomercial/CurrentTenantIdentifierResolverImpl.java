package com.aplicativocomercial;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

/*
 * Resolvedor de Banco de Dados
 */
@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    
     @Override
     public String resolveCurrentTenantIdentifier() {
         return SuporteDeContexto.getCurrentTenantIdentifier();
     }
    
     @Override
     public boolean validateExistingCurrentSessions() {
         return true;
     }
}
