/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcgirlj.softwareprog3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jack
 */
public class Student {
    
	private String name;
	private int age;
	private LocalDate DOB;
	private int ID;
	private String username;
	private Course course;
	private List<Module> modules = new ArrayList<Module>();
    
    public Student(String name, int age, LocalDate DOB, int ID) 
    {
    	this.name = name;
    	this.age = age;
    	this.DOB = DOB;
    	this.ID = ID;
    	setUsername();
    }
    
    public String getName()
    {
    	return name;
    }
    
    public void setName(String n)
    {
    	name = n;
    }
    
    public int getAge()
    {
    	return age;
    }
    
    public void setAge(int a)
    {
    	age = a;
    }
    
    public LocalDate getDOB()
    {
    	return DOB;
    }
    
    public void setDOB(LocalDate dob)
    {
    	DOB = dob;
    }
    
    public int getID()
    {
    	return ID;
    }
    
    public void setID(int id)
    {
    	ID = id;
    }
    
    public void setUsername()
    {
    	username = name+Integer.toString(age);
    }
    
    public String getUsername()
    {
    	return username;
    }
    
    public String getCourse()
    {
    	return course.getCourseName();
    }
    
    public void setCourse(Course c)
    {
    	course = c;
    }
    
    public List<Module> getModules()
    {
    	return modules;
    }
    
    public void addModule(Module module)
    {
    	modules.add(module);
    }
}