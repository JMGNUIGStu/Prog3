package com.mcgirlj.softwareprog3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class StudentTest {	
	LocalDate dob = LocalDate.of(1997, 5, 5);
	Student stu = new Student("Jack McGirl", 23 , dob, 7);
	Course bp4 = new Course("BP4", null, null);
	Module ct4 = new Module("ct4");
		
	@Test
	public void testGetName() 
	{
		Assert.assertTrue(stu.getName() == "Jack McGirl");
	}

	@Test
	public void testSetName() 
	{
		stu.setName("Joe Pesci");
		Assert.assertTrue(stu.getName() == "Joe Pesci");
	}

	@Test
	public void testGetAge() {
		Assert.assertTrue(stu.getAge() == 23);	}

	@Test
	public void testSetAge() {
		stu.setAge(105);
		Assert.assertTrue(stu.getAge() == 105);
	}
		
	@Test
	public void testGetUsername() {
		String username = "Jack McGirl23";
		Assert.assertTrue(stu.getUsername().equals(username));
	}

	@Test
	public void testGetCourse() {
		stu.setCourse(bp4);
		Assert.assertTrue(stu.getCourse() == bp4.getCourseName());
	}

	@Test
	public void testSetCourse() {
		stu.setCourse(bp4);
		Assert.assertTrue(stu.getCourse() == bp4.getCourseName());
	}

	@Test
	public void testGetModules() {
		List<Module> modL = new ArrayList<Module>();
		stu.addModule(ct4);
		modL.add(ct4);
		Assert.assertTrue(stu.getModules().toString().equals(modL.toString()));
	}

	@Test
	public void testAddModule() {
		List<Module> modL = new ArrayList<Module>();
		stu.addModule(ct4);
		modL.add(ct4);
		Assert.assertTrue(stu.getModules().toString().equals(modL.toString()));
	}

	@Test
	public void testGetDOB() {
		Assert.assertTrue(stu.getDOB().equals(dob));
	}

	@Test
	public void testSetDOB() {
		LocalDate newDob = LocalDate.of(1995, 4, 9);	
		stu.setDOB(newDob);
		Assert.assertTrue(stu.getDOB().equals(newDob));
	}

	@Test
	public void testGetID() {
		Assert.assertTrue(stu.getID() == 7);
	}

	@Test
	public void testSetID() {
		stu.setID(9);
		Assert.assertTrue(stu.getID() == 9);
	}
}
