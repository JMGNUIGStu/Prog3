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
 * @author Jack McGirl
 */
public class Course {
    private String courseName;
    private List<Module> modules = new ArrayList<Module>();	//Made these tightly typed as good practise for moving forward, would be easier to use strings
    private List<Student> students = new ArrayList<Student>();
    private LocalDate academicStartDate, academicEndDate;
	
    public Course(String name, LocalDate sd, LocalDate ed)
    {
    	this.courseName = name;
    	this.academicStartDate = sd;
    	this.academicEndDate = ed;
    }
    
    public LocalDate getAcademicStartDate() {
		return academicStartDate;
	}
    
	public void setAcademicStartDate(LocalDate academicStartDate) {
		this.academicStartDate = academicStartDate;
	}
	
	public LocalDate getAcademicEndDate() {
		return academicEndDate;
	}
	
	public void setAcademicEndDate(LocalDate academicEndDate) {
		this.academicEndDate = academicEndDate;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Module> getModules() {
		return modules;
	}
	
	public String getModulesString(List<Module> moduleList)
	{
		String moduleString = "";
		for(Module name:moduleList)
		{
			moduleString = moduleString + " " + name.getModuleName();
		}
		return moduleString;
	}
	
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
	


	