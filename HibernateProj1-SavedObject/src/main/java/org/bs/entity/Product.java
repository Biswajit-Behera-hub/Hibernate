//Entity class/ Domain class/model class/Persistent class/POJO class/HLO(hibernate language object) class
package org.bs.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Product implements Serializable {
	 //bean properties
	private int pid;
	private String pname;
	private float price;
	private float qty;
	
	
	

}
