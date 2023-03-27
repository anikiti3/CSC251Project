import java.util.Scanner;
public class Project_aleksandr_nikitin{


   public static void main(String[]args)
   {
   
   
   //declare variables 
   
   int policyNumber;
   String providerName;
   String holderFirstName;
   String holderLastName;
   int holderAge;
   String smokingStatus;
   double holderHeight;
   double holderWeight;
   double insurancePrice;
   Scanner keyboard = new Scanner(System.in);
      
   //prompt and collect user input
   
   System.out.print("Please enter the Policy Number: ");
   policyNumber = keyboard.nextInt();
   keyboard.nextLine();
   System.out.print("Please enter the Provider Name: ");
   providerName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's First Name: ");
   holderFirstName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   holderLastName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Age: ");
   holderAge = keyboard.nextInt();
   keyboard.nextLine();
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   smokingStatus = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Height (in inches): ");
   holderHeight = keyboard.nextDouble();
   
   System.out.print("Please enter the Policyholder's Weight (in pounds): ");
   holderWeight = keyboard.nextDouble();
   
   //instantiate Policy object
   Policy pol = new Policy(policyNumber,providerName,holderFirstName,holderLastName,holderAge,smokingStatus,holderHeight,holderWeight);

   //display data
   
   System.out.println("Policy Number: " + pol.getPolicyNumber());
   System.out.println();
   System.out.println("Provider Name: " + pol.getProviderName());
   System.out.println();
   System.out.println("Policyholder's First Name: " + pol.getHolderFirstName());
   System.out.println();
   System.out.println("Policyholder's Last Name: " + pol.getHolderLastName());
   System.out.println();
   System.out.println("Policyholder's Age: " + pol.getHolderAge());
   System.out.println();
   System.out.println("Policyholder's Smoking Status: " + pol.getSmokingStatus());
   System.out.println();
   System.out.println("Policyholder's Height: " + pol.getHolderHeight());
   System.out.println();
   System.out.println("Policyholder's Weight: " + pol.getHolderWeight());
   System.out.println();
   System.out.printf("Policyholder's BMI: $%.2f" , pol.getBMI());
   System.out.println();
   System.out.printf("Policy Price: $%.2f" , pol.getInsurancePrice());
   
   
   
   }//end main





}//end class