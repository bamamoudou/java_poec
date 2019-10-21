import java.util.Scanner;

public class FirstJava {
	     public static void main(String[] args) {
	    	 
		 Scanner scanner = new Scanner(System.in);
		 
		triangle(scanner);
		SecondJava.somme100();
		divisiblePar3(scanner);
		System.out.println("le resultat est " +puissance(scanner));
	
		 scanner.close();
    }
	     
	    
	     
	     public static void divisiblePar3(Scanner scanner)
	 	{
	 		System.out.print("Entrez un entier:");
	 		int n=scanner.nextInt();
	 		if (n%3==0)
	 		{
	 			System.out.println(n+" est divisible par 3");
	 		}
	 		else
	 			System.out.println(n+" n'est pas divisible par 3");
	 	}
	     
	    public static float puissance(Scanner scanner) {
	    	
	    	float x, result;
	    	int n;
	    	System.out.println("Entrez la valeur de x: ");
	    	x = scanner.nextFloat();
	    	System.out.println("Entrez la puissance");
	    	n = scanner.nextInt();
	    	result = 1;
	    	for (int i = 0; i < n; i++) {
	    		result = result*x;
	    		
	    		/*
	    		 * equivalent while
	    		 * int i = 0;
	    		 * while(i<n){
	    		 * result = result*x;
	    		 * i++
	    		 * 
	    		 * }
	    		 * */
	    		
			}
	    	
	    	return result;
			
	    			
	    	
	    }
	    
	    public static void triangle(Scanner scanner) {
	    	int nbr,i,j;
	    	System.out.println("Entrez la taille du triangle");
	    	nbr = scanner.nextInt();
	    	for(i=1; i<= nbr; i++) {
	    		for(j=0; j < i; j++) {
	    			System.out.print("X");
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	    
	    
}
