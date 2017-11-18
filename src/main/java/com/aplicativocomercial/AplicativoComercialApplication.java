package com.aplicativocomercial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 * Para que o Multi Tenance funcione devo desabilitar a 
 * Configuração padrão do DataSource
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AplicativoComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicativoComercialApplication.class, args);
	}
}
