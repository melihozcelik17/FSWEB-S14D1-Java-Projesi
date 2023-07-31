package com.workintech.inheritance.main;

import com.workintech.inheritance.company.*;

public class CompanyMain {
    public static void main(String [] args) {
        Employee asci = new Employee(6, "Murat" );

        JuniorDeveloper JuniorDeveloper1=new JuniorDeveloper(2,"Baha");
        JuniorDeveloper JuniorDeveloper2=new JuniorDeveloper(3,"Serkan");
        //JuniorDeveloper [] juniors = new JuniorDeveloper[]{JuniorDeveloper1, JuniorDeveloper2};

        MidDeveloper MidDeveloper1=new MidDeveloper(3,"Ahmet");
        MidDeveloper MidDeveloper2=new MidDeveloper(4,"Mehmet");
        //MidDeveloper [] juniors = new MidDeveloper[][]{MidDeveloper1, MidDeveloper2};

        SeniorDeveloper SeniorDeveloper=new SeniorDeveloper(5,"Ayşe");




    }
        HRManager hrManager =new HRManager(1,"Mustafa" ,
                new JuniorDeveloper[3], new MidDeveloper[2] , new SeniorDeveloper[1]);

    }

