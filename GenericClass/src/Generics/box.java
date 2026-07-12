package Generics;

public class box <T>{
    T value;
    public box() {
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    public T setValue(T value){
        this.value = value;
        return value;
    }
}
