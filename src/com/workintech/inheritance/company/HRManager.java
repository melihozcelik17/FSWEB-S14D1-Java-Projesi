package com.workintech.inheritance.company;

public class HRManager extends Employee {
    private JuniorDeveloper [] juniours;
    private MidDeveloper [] mids;
    private SeniorDeveloper [] seniors;

    public HRManager(long id, String name, JuniorDeveloper[] juniours, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniours = juniours;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void addEmployee(int index , JuniorDeveloper developer) {
        try {
            if(juniours [index] == null) {
                juniours[index] = developer;
            }else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }
    public void addEmployee(int index , MidDeveloper developer) {
        try {
            if(mids [index] == null) {
                mids[index] = developer;
            }else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public void addEmployee(int index , SeniorDeveloper developer) {
        try {
            if(seniors [index] == null) {
                seniors[index] = developer;
            }else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniours() {
        return juniours;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + "HrManager begins to work");
    }
}
