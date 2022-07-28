package com.gl.OopsLab1;

public class DriverClass { // main Method

	public static void main(String[] args) {

		// Create 3 methods individually with all data input

		// create Admin Department
		AdminDepartment Ad = new AdminDepartment();

		System.out.println(Ad.departmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Ad.isTodayAHoliday());

		// create Hr Department
		HrDepartment Hd = new HrDepartment();

		System.out.println(Hd.departmentName());
		System.out.println(Hd.getTodaysWork());
		System.out.println(Hd.getWorkDeadline());
		System.out.println(Hd.doActivity());
		System.out.println(Hd.isTodayAHoliday());

		// create Tech Department
		TechDepartment Td = new TechDepartment();

		System.out.println(Td.departmentName());
		System.out.println(Td.getTodaysWork());
		System.out.println(Td.getWorkDeadline());
		System.out.println(Td.getTechStackInformation());
		System.out.println(Td.isTodayAHoliday());

	}
}
