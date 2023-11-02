package superThis;

public class Programmer extends Employee {
    //Dit is de super/base/parent class van JavaSpecialist
    //Dit is de extended/sub/derived/child class van Employee
    String naamClass = "Programmer";

    String [] programmingLanguages;

    void writeCode(){

    }

    String getNaamClass(){
        return this.naamClass;
    }

}
