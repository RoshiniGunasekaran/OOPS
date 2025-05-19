class Person{
    String name;
    private int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    void setage(int age){
        this.age=age;
    }
    
    int getage(){
        return age;
    }
    
    void display(){
        System.out.println("The Name of the Person :" + this.name);
        System.out.println("The Age of the Person :" + age);
        
    }
}

class Q2{
    public static void main(String args[]){
        Person p=new Person("Rose",20);
        p.display();
        System.out.println(p.getage());
        p.setage(30);
        
        p.display();
        
        System.out.println(p.getage());
    }
}
