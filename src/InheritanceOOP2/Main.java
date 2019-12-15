package InheritanceOOP2;

     class Animal {
         private String name;

         public Animal(String name) {
             this.setName(name);
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public void speak() {
             System.out.println("Animal speaking");
         }
     }

     class Bird extends Animal {

         public Bird(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName() + "otuyor");
         }
     }
     class Dog extends Animal{

         public Dog(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName() + "havliyor");
         }
     }

     class Horse extends Animal{

         public Horse(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName() + "kisniyor");
         }
     }
     class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "miyavliyor");
    }
}






         public class Main {

         public static void speakTry(Animal animal){
             animal.speak();
         }
         public static void main(String[] args) {

         Animal animal = new Animal("Animal");
         Bird bird =new Bird("Limon ");
         Dog dog = new Dog("Karabas ");
         Horse horse = new Horse("Sahbatur ");

//         animal.speak();
//         bird.speak();
//         dog.speak();
//         horse.speak();

//     Animal animal1 = new Bird("limon ");
//     animal1.speak();

        speakTry(new Cat("prenses "));



         }



    }


