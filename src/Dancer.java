public class Dancer extends Person{
    private String groupName;

    public Dancer(){}
    public Dancer(String name, int age, String groupName) {
        super(name, age);
        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
    public void dancing(){
        System.out.println(getName() + "Танцует");
    }
}
