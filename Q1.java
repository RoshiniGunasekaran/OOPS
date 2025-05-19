// Create a class Car with attributes like make, model, and year. Write a method that displays this info. Instantiate a car object and call this method.

class Car{
    String name;
    String model;
    int year;
    
    Car(String name, String model, int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    
    public void display(){
        System.out.println("The Name of the car : "+name);
        System.out.println("The Model of the car : "+model);
        System.out.println("The Year  of the car : "+year);
    }
}
class Main{
    public static void main(String args[]){
        Car c=new Car("Rose","Maruthi",2007);
        c.display();
    }
}


class Car{
    String name;
    private String model;
    int year;
    
    Car(String name, String model, int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    //getter
    String getmodel(){
        return model;
    }
}
class Main{
    public static void main(String args[]){
        Car c=new Car("Rose","Maruthi",2007);
        System.out.println(c.name);
        System.out.println(c.getmodel());
        System.out.println(c.year);
        
    }
}




class Car{
    String name;
    private String model;
    int year;
    
    Car(String name, String model, int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    //setter
    public void setmodel(String str){
        model = str;
    }
    
    String getmodel(){
        return model;
    }
}
class Q1{
    public static void main(String args[]){
        Car c=new Car("Rose","Maruthi",2007);
        System.out.println(c.name);
        c.setmodel("TOYOTA");
        System.out.println(c.getmodel());
        System.out.println(c.year);
        
    }
}