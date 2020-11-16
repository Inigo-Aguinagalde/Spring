package com.example.prueba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class prueba {


	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)


	  private String prueba;


	  public String getPrueba() {
	    return prueba;
	  }

	  public void setPrueba(String prueba) {
	    this.prueba = prueba;
	  }

}
