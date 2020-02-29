import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * Marisa Tyms
 * Lab3 
 * 2/29/2020
 * 
 * 
 */
public class Animal{
	String name;
	int legs;
	public Animal(String name, int legs) {
		this.name = name; 
		this.legs= legs;
	}
	public int getLegs() {
		return legs;
	}
	public String getName() {
		return name;
		
	}
	@Override
	public String toString() {
		return this.name+" "+ this.legs;
	}
	
	
	

}