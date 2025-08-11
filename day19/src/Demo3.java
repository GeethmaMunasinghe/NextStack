class Animal{
    void sound(){
        System.out.println("Animal sound.");
    }
}
class Cat extends Animal{

}
class Dog extends Animal{

}
class Dataset<T extends Animal> {
    Object [] bucket=new Object[10];
    int count=0;
    Dataset(T t){
        bucket[count++]=t;
    }

}
public class Demo3 {
    public static void main(String[] args) {
       // Dataset<Dog> d=new Dataset<>(new Cat());//error
        Dataset<Cat> d=new Dataset<>(new Cat());
        Dataset<Dog> c=new Dataset<>(new Dog());
    }
}
