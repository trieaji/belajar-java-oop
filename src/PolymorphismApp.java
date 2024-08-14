// Mengakses Polymorphism
public class PolymorphismApp {
    public static void main(String[] args) {
        //Perubahan bentuk, dari satu bentuk ke bentuk yg lain (Polymorphism)
        Employee employee = new Employee("Yorichii");
        employee.sayHello("Michikatsu");

        employee = new Manager("Akaza");
        employee.sayHello("Douma");

        employee = new ViecePresident("Muzan");
        employee.sayHello("Kagaya");


        //Kode method untuk Polymorphism
        sayHello(new Employee("Ueda"));
        sayHello(new Manager("Kamado"));
        sayHello(new ViecePresident("Inosuke"));

    }
        static void sayHello(Employee employee) {
            //Cara melakukan pengecekan data dan konversi tipe data
            if(employee instanceof ViecePresident) {
                ViecePresident viecePresident = (ViecePresident) employee;
                System.out.println("Hello " + viecePresident.name);
            } else if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Hello " + manager.name);
            } else {
                System.out.println("Hello " + employee.name);
            }
        }
}
