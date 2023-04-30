package peaksoft;

public class Main {
    /**
     * Задача ServiceImpl'дын ичиндеги методтоду ишке ашыруу керек
     * <p>
     * 1 - метод бул студенти id полясы менен табып и ошол студентин атын и фамилиясын озгортуу
     * 2 - метод бул студенти id полясы менен табып консолго чыгаруу
     * 3 - метод boolean кайтарат эгер биз издеген ат болсо
     * 4 - метод биз берген жаштын санын чыгарат
     * 5 - бул баардык студенттерди чыгаруу
     * <p>
     * Баардык методторду Майн класстан чыкырып иштетуу керек
     *
     * Cтуденттердин обьектилерин Майн класстан тузуп SerivceImpl классынын ичиндеги поляга конструктор аркылуу салсаныз болот
     * <p>
     * 1 - жана 2 методтто Id полясы менен таппай калса анда анда - мындай студент жок деп чыгуусу керек
     * <p>
     * Методтордун атын кайтаруу тибин параметрин озгортууго болбойт
     * <p>
     * *
     */
    public static void main(String[] args) {
        Student [] students = new Student[10];
     students[0] = new Student(1l, "aida", "mamaeva", 2002);
     students[1] = new Student(2l, "leisan", "ismailova", 2017);
     students [2]= new Student(3l, "arsen", "ismailov", 2009);
     Service service = new ServiceImpl(students);
     service.updateStudent(0l,"aidaa", "mamaevaa");
     service.getStudentById(2l);
     service.getAllStudents();
     service.getName("leisan");
     service.getCountAge(6);
    }

}