package creational.builder.domain;

public class Person {
    private String name;
    private String email;
    private String address;
    private int age;

    public Person (Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
    }

    public static class Builder {

        private final String name;
        private final String email;
        private String address;
        private int age;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return this.name + "; " + this.email + "; " + this.address + "; " + this.age;
    }
}
