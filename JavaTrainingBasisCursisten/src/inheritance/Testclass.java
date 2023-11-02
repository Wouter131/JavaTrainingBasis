package inheritance;

public class Testclass {

    public static void main(String[] args) {


        Employee e = new Employee();

        Manager m = new Manager();

        Programmer p = new Programmer();

        JavaSpecialist j = new JavaSpecialist();

        // e ziet name, address, phoneNumber, experience

        //m ziet  name, address, phoneNumber, experience + teamsize + reportProjectStatus

        //p ziet  name, address, phoneNumber, experience + programmingLanguages + writeCode

        //j ziet  name, address, phoneNumber, experience, programmingLanguages, writeCode +  ocaCertified + debugJavaCode



    }



}
