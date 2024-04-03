package observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     *
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Vacancy vacancyJava = new Vacancy(Vacancy.VacancyType.Java_Developer, "Google", 100000);
        Vacancy vacancyQA = new Vacancy(Vacancy.VacancyType.QA, "Yandex", 80000);


        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Middle middle1 = new Middle("Middle #1");
        Middle middle2 = new Middle("Middle #2");

        jobAgency.registerObserver(student1, Vacancy.VacancyType.Java_Developer);
        jobAgency.registerObserver(master1, Vacancy.VacancyType.Java_Developer);
        jobAgency.registerObserver(master2, Vacancy.VacancyType.QA);
        jobAgency.registerObserver(middle1, Vacancy.VacancyType.Administrator);
        jobAgency.registerObserver(middle2, Vacancy.VacancyType.Data_Science);
        jobAgency.removeObserver(middle1, Vacancy.VacancyType.Administrator);


        google.needEmployee(vacancyJava);
        yandex.needEmployee(vacancyQA);

    }
}
