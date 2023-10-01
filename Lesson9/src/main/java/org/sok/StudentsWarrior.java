import java.util.*;

public class StudentsWarrior {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        double averageAgeOfMen = calculateAverageAgeOfMen(students);
        System.out.println("Средний возраст мужчин: " + averageAgeOfMen);

        List<Student> potentialWarrior = findPotentialWarrior(students);
        System.out.println("Студенты мужского пола, которым грозит повестка: ");
        for (Student student : potentialWarrior) {
            System.out.println(student);
        }
    }

    public static double calculateAverageAgeOfMen(List<Student> students) {
        double sumAgeOfMen = 0;
        int countMen = 0;

        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sumAgeOfMen += student.getAge();
                countMen++;
            }
        }

        if (countMen == 0) {
            return 0;
        }

        return sumAgeOfMen / countMen;
    }

    public static List<Student> findPotentialWarrior(List<Student> students) {
        List<Student> potentialWarrior = new ArrayList<>();

        for (Student student : students) {
            if (student.getGender() == Gender.MAN && student.getAge() >= 18 && student.getAge() <= 27) {
                potentialWarrior.add(student);
            }
        }

        return potentialWarrior;
    }

    enum Gender {
        MAN,
        WOMAN
    }

    public static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString () {
            return "{" +
                    "name=' " + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if(!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }


        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}