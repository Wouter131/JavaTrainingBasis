package sandboxBasisOefeningen;

public class MethodeVoorbeeld {

    static int telOp(int nr1, int nr2){
        int som = nr1 + nr2;
        return som;
    }

    public static void main(String[] args) {

        int temp = 10;
        int resultaat = telOp(50, temp);
        System.out.println(resultaat);

    }
}
