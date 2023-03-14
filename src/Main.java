import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Person per1 = new Person("Mike ",23);
     Singer singer1 = new Singer("Jake ",19,"Coldplay");
     Singer singer2 = new Singer("Luca ",22,"PP");
     singer2.learn();
     singer2.eat();
     singer2.walk();
     Dancer dancer1 = new Dancer("Kiki ",24,"l");
     Dancer dancer2 = new Dancer("Rose ",16,"pop");
     dancer2.eat();
     dancer2.learn();
     dancer2.walk();
     Programmer pro1 = new Programmer("Sasha ",27,"Google");
     Programmer pro2 = new Programmer("Polly ",17,"Samsung");
     pro2.eat();
     pro2.learn();
     pro2.walk();
     pro1.coding();
     dancer2.dancing();
     singer2.playGuitar();
     singer2.singing();

     Person[]ludi={singer1,singer2,dancer1,dancer2,pro1,pro2};

     System.out.println("Введите имя ");
     Scanner scan = new Scanner(System.in);
     String imya = scan.nextLine();
     for (Person i:ludi) {
     if(i.getName().contains(imya)){
      System.out.println("хобби: ");
     i.learn();
     i.walk();
     i.eat();
     }
     }


    }
}