public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }
    public void coding(){
        System.out.println(getName()+"Пишет код");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
