package observer;

import java.util.ArrayList;
import java.util.List;

public class Middle implements Observer{

    private String name;
    private int salary;

    public Middle(String name){
        this.name = name;
        this.salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Средний специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Средний %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
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
