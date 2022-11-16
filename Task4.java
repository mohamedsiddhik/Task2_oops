//2. Create an abstract parent class with abstract methods and create a child class that extends parent class.
// Override the parent abstract method using child class object.

abstract class Mobile{
    void voicecall(){

        System.out.println("You can make voice call");
    }
    abstract void  camera();
    abstract void screensize();
    abstract  void Ram();
}

class RedMI extends  Mobile{

    @Override
    void camera() {
        System.out.println("48MP Camera");
    }

    @Override
    void screensize() {
        System.out.println("6.6 inch");
    }

    @Override
    void Ram() {
        System.out.println("8GB RAM");
    }
}

class  RealMI extends  Mobile{

    @Override
    void camera() {
        System.out.println("50MP Camera");
    }

    @Override
    void screensize() {
        System.out.println("6.6 Inch");
    }

    @Override
    void Ram() {
        System.out.println("6 GB RAM");
    }

    void Battery(){
        System.out.println("5000mAh Battery");
    }
}


public  class Task4{
    public static void main(String args[]) {

        RedMI M11 = new RedMI();
        M11.voicecall();
        M11.camera();
        M11.screensize();
        M11.Ram();
        System.out.println("-------------------------------");
        RealMI i9 =new  RealMI();
//        i9.voicecall();
        i9.camera();
        i9.screensize();
        i9.Ram();
        i9.Battery();




    }
}