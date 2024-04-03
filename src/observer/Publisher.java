package observer;

public interface Publisher {
    void sendOffer(Vacancy vacancy);

    void registerObserver(Observer observer, Vacancy.VacancyType vacancyType);

    void removeObserver(Observer observer, Vacancy.VacancyType vacancyType);

}
