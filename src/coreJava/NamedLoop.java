package coreJava;

public class NamedLoop {

	public static void main(String[] args) {
		
		Loop1:
		for(int i=0; i<10; i++)
        {
            //  inner loop to handle number of columns values changing acc. to outer loop  
            for(int j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
            break Loop1;
        }
	}

}
