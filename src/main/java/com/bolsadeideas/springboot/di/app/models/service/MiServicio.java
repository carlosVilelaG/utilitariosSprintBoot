package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

////@Service  tambien se puede anotar a iun servcio beand spring como service
/// para que pueda ser injectada la clas en los controllers
///@Component("miServicioSimple")
public class MiServicio implements IServicio {
	public String operacion() {
		return "Ejecutando una operacion importanticima simple...";
	}

}
