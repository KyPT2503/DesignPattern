package designPattern.creational.builder;

public class Person {
    private String id;
    private String name;
    private String age;
    private String career;
    private String gender;

    public Person() {
    }

    public Person withId(String id) {
        this.id = id;
        return this;
    }

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    public Person withAge(String age) {
        this.age = age;
        return this;
    }

    public Person withCareer(String career) {
        this.career = career;
        return this;
    }

    public Person withGender(String gender) {
        this.gender = gender;
        return this;
    }
    public Person build(){
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", career='" + career + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
