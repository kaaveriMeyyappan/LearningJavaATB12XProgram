package oops;

public class car2 {
    String name;
    int year;

    car2(){
        name = "Unknowncar";
        year = 0;
        System.out.println("DC");
}
car2(String model_name,int year_created){
        this.name = model_name;
        this.year = year_created;
    System.out.println("new model");
    }
}