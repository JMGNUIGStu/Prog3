package com.mcgirlj.softwareprog3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ModuleTest {

	Student stu = new Student("Jack McGirl", 23 , null, 7);
	Course bp4 = new Course("BP4", null, null);
	Module ct4 = new Module("ct4");
	
	@Test
	public void testGetModuleName() {
		Assert.assertTrue(ct4.getModuleName().equals("ct4"));
	}

	@Test
	public void testSetModuleName() {
		ct4.setModuleName("moduleName");
		Assert.assertTrue(ct4.getModuleName().equals("moduleName"));
	}

	@Test
	public void testGetStudents() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(stu);
		ct4.addStudent(stu);
		Assert.assertTrue(ct4.getStudents().equals(studentList));
	}

	@Test
	public void testAddStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(stu);
		ct4.addStudent(stu);
		Assert.assertTrue(ct4.getStudents().equals(studentList));
	}

	@Test
	public void testGetCourse() {
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(bp4);
		ct4.addCourse(bp4);
		Assert.assertTrue(ct4.getCourse().equals(courseList));
	}

	@Test
	public void testAddCourse() {
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(bp4);
		ct4.addCourse(bp4);
		Assert.assertTrue(ct4.getCourse().equals(courseList));
	}

	@Test
	public void testToStringListOfModule() {
		List<Module> moduleList = new ArrayList<Module>();
		Assert.assertTrue(ct4.moduleListAsString(moduleList).equals(moduleList.toString()));
	}

}
