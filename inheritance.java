    class Animal {
      void tail() {
            System.out.println("Animal has a tail");
        }
    }
    class Dog extends Animal {
        @Override void tail() {
            System.out.println("Dog has a tail");
        }
    }   
    class Cat extends Animal {
    @Override void tail() {
            System.out.println("Cat has a tail");
        }
    }
    public class inheritance {
        public static void main(String[] args) {
            Dog dog = new Dog();
             dog.tail(); 
             Cat cat = new Cat();
              cat.tail(); 
        }
    }