package com.sagarpr.onetoone;

public class Main {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Sagar's laptop");
        laptop.setBrand("HP");

        MappingDaoOneToOne mappingDao = new MappingDaoOneToOne();
        mappingDao.saveLaptop(laptop);

        System.out.println("Just Printing Laptop:" + laptop);

        Student student = new Student();
        student.setStudentName("Sagar Prajapati");
        student.setStudentClass("first");

        student.setLaptop(laptop);
        mappingDao.saveStudent(student);

        System.out.println("Just Printing Student:" + student);

        Student student1 = mappingDao.getStudentById(1);
        System.out.println(student1);
    }
}
