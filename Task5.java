//4. Write a program which implements Multilevel inheritance
// and check both the child classes can access the methods of super parent class.

class  Grandfather{
    public  void house(){
        System.out.println("3BHK House");
    }
}

class  Father extends  Grandfather{
    public  void land(){
        System.out.println("5 acres of Lands");
    }
}

class  Son extends  Father{
    public void  car(){
        System.out.println("Own Nissan Car");
    }
}

public  class Task5 {
    public  static void main(String args[]){
         Father prabu =new Father();
         prabu.land();
        Son s = new Son();
        s.house();
        s.land();
        s.car();
    }
}