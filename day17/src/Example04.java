class Animal{

}
class Dog extends Animal{

}
class Cat extends Dog{


}
class Zoo{
    public boolean isExist(){
        return true;
    }
    public Cat getCat(){
        return null;
    }
    public Animal getAnimal(){
        return null;
    }
}
class Zoo2 extends Zoo{
    @Override
    public boolean isExist() {
        return true;
    }

    @Override
    public Cat getCat() {
        return null;
    }
    public Dog getAnimal(){//co-varient
        return null;
    }
}
public class Example04 {
}
