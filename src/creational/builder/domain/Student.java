package creational.builder.domain;

public class Student {

    private String name;
    private String university;

    private int age;

    public Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }


    public static class Builder {
        private final String name;
        private final String university;

        private int age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return this.name + "; " + this.university + "; " + this.age;
    }

}
