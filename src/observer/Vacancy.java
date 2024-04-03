package observer;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    private final VacancyType vacancyType;
    private final String companyName;
    private final int salary;


    public Vacancy(VacancyType vacancyType, String companyName, int salary) {
        this.vacancyType = vacancyType;
        this.companyName = companyName;
        this.salary = salary;
    }

    public enum VacancyType {
        Java_Developer,
        QA,
        Data_Science,
        Administrator

    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }
}
