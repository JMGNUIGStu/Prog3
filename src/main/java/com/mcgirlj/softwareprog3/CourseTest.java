package com.mcgirlj.softwareprog3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class CourseTest {

	LocalDate startDate = LocalDate.of(2020, 9, 1);
	LocalDate endDate = LocalDate.of(2021, 4, 1);
	Student stu = new Student("Jack McGirl", 23 , null, 7);
	Course bp4 = new Course("BP4", startDate, endDate);
	Module ct4 = new Module("ct4");
	
	
	@Test
	public void testGetAcademicStartDate() {
		Assert.assertTrue(bp4.getAcademicStartDate().equals(startDate));
	}

	@Test
	public void testSetAcademicStartDate() {
		LocalDate newStartDate = LocalDate.of(2000, 5, 24);
		bp4.setAcademicStartDate(newStartDate);
		Assert.assertTrue(bp4.getAcademicStartDate().equals(newStartDate));
	}

	@Test
	public void testGetAcademicEndDate() {
		Assert.assertTrue(bp4.getAcademicEndDate().equals(endDate));
	}

	@Test
	public void testSetAcademicEndDate() {
		LocalDate newEndDate = LocalDate.of(2000, 5, 24);
		bp4.setAcademicEndDate(newEndDate);
		Assert.assertTrue(bp4.getAcademicEndDate().equals(newEndDate));
	}

	@Test
	public void testGetStudents() {
		List<Student> studentList = new ArrayList<Student>();
		stu.setCourse(bp4);
		Assert.assertTrue(bp4.getStudents().equals(studentList));
	}

	@Test
	public void testSetStudents() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(stu);
		bp4.setStudents(studentList);
		Assert.assertTrue(bp4.getStudents().equals(studentList));
	}

	@Test
	public void testGetModules() {
		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(ct4);
		bp4.setModules(moduleList);
		Assert.assertTrue(bp4.getModules().equals(moduleList));
	}

	@Test
	public void testSetModules() {
		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(ct4);
		bp4.setModules(moduleList);
		Assert.assertTrue(bp4.getModules().equals(moduleList));
	}

	@Test
	public void testGetCourseName() {
		Assert.assertTrue(bp4.getCourseName().equals("BP4"));
	}

	@Test
	public void testSetCourseName() {
		bp4.setCourseName("Course Name Test");
		Assert.assertTrue(bp4.getCourseName().equals("Course Name Test"));
	}
}
