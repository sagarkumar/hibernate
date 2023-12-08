package com.sagarpr.lifecycle;

public class Main {

    public static void main(String[] args){
        Computer computer = new Computer();
        computer.setComputerName("HP");
        computer.setComputerPrice("100");

        ComputerMappingDao computerMappingDao = new ComputerMappingDao();
        computerMappingDao.saveComputer(computer);

        System.out.println(computer);
    }
}
