package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(Vacancy vacancy){
        jobAgency.sendOffer(vacancy);
    }
}
