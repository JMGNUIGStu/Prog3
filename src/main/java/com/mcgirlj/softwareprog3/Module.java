/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcgirlj.softwareprog3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jack
 */
public class Module {
	private String moduleName;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> course = new ArrayList<Course>();

    public Module(String name)
    {
    	this.moduleName = name;
    }
    
    public String getModuleName()
    {
    	return moduleName;
    }
    
    public void setModuleName(String moduleName)
    {
    	this.moduleName = moduleName;
    }
    
    public List<Student> getStudents()
    {
    	return students;
    }
    
    public void addStudent(Student student)
    {
    	students.add(student);
    }
    
    public List<Course> getCourse()
    {
    	return course;
    }
    
    public void addCourse(Course courseNew)
    {
    	course.add(courseNew);
    }
    
    
    //The override does not work for some reason, changing compiler versions (the only troubleshooting method online)
    //doesnt fix it so I have reimplemented the method as moduleList
    //@Override
    //public String toString(List<Module> list) {
    //    String result = list.toString();
    //    return result;
    //}
    
    public String moduleListAsString(List<Module> list) {
        String result = list.toString();
        return result;
    }
    
}