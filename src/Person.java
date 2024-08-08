class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Membuat constructor, nama custructor harus sama dengan nama class
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    ///// ##### /////

    //Constructor overloading -> constructor yang bisa dibuat lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda
    Person(String paramName){
        this(paramName, null);
    }

    Person(){
    }
    ///// ##### /////

    //Membuat method/function di dlam class atau blueprint nya
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
