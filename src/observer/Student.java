package observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student implements Observer{

    private String name;
    private int salary;

    public Student(String name){
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    List<Publisher> listOfPublications = new ArrayList<>();

    public void registrationPublisher(Publisher publisher) {
        listOfPublications.add(publisher);
    }

    public void removePublisher(Publisher publisher) {
        listOfPublications.add(publisher);
    }

}
