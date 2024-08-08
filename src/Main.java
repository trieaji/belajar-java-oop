//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // contoh cara membuat object (materi oop)

        var person1 = new Person("Sakonji", "Tokyo"); //cara 1

//      person1.country = "Indonesia"; //Tidak bisa ditampilkan karena tipe variable final
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //cara akses method
        person1.sayHello("Giyuu");

        Person person2 = new Person("Tanjiro"); //cara 2
        System.out.println(person2.name);

        Person person3;
        person3 = new Person("Yuji", "Hiroshima"); //cara 3
        person3.sayHello("Sugeng");
    }
}