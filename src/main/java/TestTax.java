
public class TestTax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Tax t = new Tax();
        NJTax t = new NJTax();

        t.grossIncome=40000;
        t.numberOfDependents=2;
        t.state="NJ";

                double yourTax = t.calcTax();

                double njt =  t.adjustForStudents (yourTax);

        System.out.println("Your tax is" + njt );

    }

}
