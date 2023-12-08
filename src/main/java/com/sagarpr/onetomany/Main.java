package com.sagarpr.onetomany;

public class Main {

    public static void main(String[] args){

        MappingDaoOneToMany mappingDao = new MappingDaoOneToMany();

        Department department = new Department();
        department.setDepartmentName("Computer Scienence");
        mappingDao.saveDepartment(department);
        System.out.println("Just Printing department" + department);

        Professor professor = new Professor();
        professor.setName("Vijaya Saradhi");
        professor.setExperience(10);
        professor.setDepartment(department);
        mappingDao.saveProfessor(professor);

        System.out.println("Just Printing Professor" + professor);

        System.out.println("Fetching object again");

        Professor professor1 = mappingDao.getProfessorById(1);
        System.out.println(professor1);

        Department department1 = mappingDao.getDepartmentById(1);
        System.out.println(department1);

    }
}
