package superThis;

public class Manager extends Employee {
    //Dit is de extended/sub/derived/child class van Employee
    String naamClass = "Manager";

    int teamSize;

    void reportProjectStatus(){

    }

    String getNaamClass(){
        return this.naamClass;
    }
}
