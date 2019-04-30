import java.io.*;
import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        double w;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter your weight in kg  = "); w = user.nextDouble();
        String infile = "sugar.txt";
	String outfile = "out.txt";
        try
        {
            PrintWriter write;
            try (Scanner scan = new Scanner(new File(infile))) {
                write = new PrintWriter(outfile);
                write.printf("%10s %16s %16s\r\n","Fruit","Sugar (g)","Sugar (oz)");
                write.printf("============================================\r\n");
                while (scan.hasNext())
                {
                    String fruit	  = scan.next();
                    double sugar = scan.nextDouble();
                    sugar = sugar*w*10;
                    
                    double sugaroz = sugar*0.035;
                    write.printf("%10s %16.2f %16.2f \r\n", fruit, sugar, sugaroz);
	  }     System.out.printf("Output is printed to the file output.txt \r\n");
            }
	  write.close();
	}
	catch(Exception e) {
	  System.err.println("An error occurs. End program.");
	}
    }   
}
