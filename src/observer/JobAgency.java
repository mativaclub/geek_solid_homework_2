package observer;

import java.util.*;

public class JobAgency implements Publisher{

    private final Map<Vacancy.VacancyType, List<Observer>> observers = new HashMap<>();

    public void sendOffer(Vacancy vacancy) {
        Vacancy.VacancyType vacancyType = vacancy.getVacancyType();
        List<Observer> observerList = observers.get(vacancyType);
        for (Observer observer : observerList){
            observer.receiveOffer(vacancy.getCompanyName(), vacancy.getSalary());
        }
    }

    @Override
    public void registerObserver(Observer observer, Vacancy.VacancyType vacancyType) {
        if (observers.containsKey(vacancyType)) {
            List<Observer> observerList = observers.get(vacancyType);
            observerList.add(observer);
        } else {
            List<Observer> list = new ArrayList<>();
            list.add(observer);
            observers.put(vacancyType, list);
        }

    }


    @Override
    public void removeObserver(Observer observer, Vacancy.VacancyType vacancyType) {
        if (observers.containsKey(vacancyType)) {
            observers.get(vacancyType).remove(observer);
        }
    }
}

