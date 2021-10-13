package DuoTai;

import SuperTest.Account;

/**
 * @Author Jason
 * @Date 2021/09/06
 * @Describe:
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest=new AnimalTest();
        Animal animalTest1=new Dog();
        Animal animalTest2=new Animal();
        Dog dog= (Dog) animalTest1;
        dog.run();
        animalTest1.eat();
        System.out.println(dog);
        System.out.println(animalTest1);
        System.out.println(animalTest);
//        animalTest.func(new Dog());
//        animalTest.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
    public void shout( ){
        System.out.println("动物大叫");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃饭");
    }

    @Override
    public void shout() {
        System.out.println("狗在叫哦啊");
    }

    public void run(){
        System.out.println("狗在跑");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃饭");
    }

    @Override
    public void shout() {
        System.out.println("猫在叫哦啊");
    }
}


