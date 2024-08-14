// Membuat inheritance atau pewarisan (kemampuan untuk menurunkan sebuah class ke class lain)
class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is " + this.name);
    }

    //Saat membuat super constructor di parent(class), maka turunannya hrus dibuatkan constructorny juga (super constructor)
    Manager(String name) {
        this.name = name;
    }

    /* Default constructor -> Maka turunannya tidak wajib dibuatkn constructornya (super constructor)
    Manager(string name) {
        this.name = name;
    }
    */
}

// Bisa membuat inheritance di dalam satu file atau di file terpisah
/*class ViecePresident extends Manager {

}*/
