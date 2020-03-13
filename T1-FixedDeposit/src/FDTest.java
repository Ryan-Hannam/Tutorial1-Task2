/**
 *
 * @author RyanHannam
 */

import java.util.Scanner;
public class FDTest {
    public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		FixedDeposit fixedDeposit = new FixedDeposit();
                
                for (int a = 0; a < 3; a++)
                {
                    System.out.println("Please enter the initial deposit amount:");
                    double tempDeposit = input.nextDouble();
                    fixedDeposit.setInitAmount(tempDeposit);
                    System.out.println("Please enter the period in years amount:");
                    double tempPeriod = input.nextDouble();
                    fixedDeposit.setPeriod(tempPeriod);
                }
                
                System.out.println(fixedDeposit.toString());
                

	} // end main
}
