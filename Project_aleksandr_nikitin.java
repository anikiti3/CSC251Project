import java.util.*; 
import java.io.*;
public class Project_aleksandr_nikitin{


   public static void main(String[]args) throws IOException
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
   double insurancePrice; //not used in while loop below
   
      
   //read in data from a text file
   
   //create instance of the file class
   
   File file = new File("PolicyInformation.txt");
   
   //pass a reference to the file object as an arg to the scanner class constructor\
   
   Scanner inputFile = new Scanner(file);
 
   //create an arrayList that will store policy objects
   ArrayList<Policy> policies = new ArrayList<Policy>();
   //use while loop to read file
      
   while(inputFile.hasNext())
   {
      policyNumber = inputFile.nextInt();
      
      providerName = inputFile.nextLine();
      holderFirstName = inputFile.nextLine();
      holderLastName = inputFile.nextLine();
      inputFile.nextLine();
      holderAge = inputFile.nextInt();
      
      smokingStatus = inputFile.nextLine();
      inputFile.nextLine();
      holderHeight = inputFile.nextDouble();
      holderWeight = inputFile.nextDouble();
      
      
      if(inputFile.hasNext())
      {
         
         inputFile.nextLine();
         inputFile.nextLine();
      }

            //instantiate Policy object inside loop for every data set
      Policy pol = new Policy(policyNumber,providerName,holderFirstName,holderLastName,holderAge,smokingStatus,holderHeight,holderWeight);
      //add policy obj to the arrayList
      policies.add(pol);
   }//end while
      
   inputFile.close(); //close the file
   

   //display data
   
   for(int i = 0; i < policies.size(); i++)
   {
      System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
      System.out.println();
      System.out.println("Provider Name: " + policies.get(i).getProviderName());
      System.out.println();
      System.out.println("Policyholder's First Name: " + policies.get(i).getHolderFirstName());
      System.out.println();
      System.out.println("Policyholder's Last Name: " + policies.get(i).getHolderLastName());
      System.out.println();
      System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
      System.out.println();
      System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
      System.out.println();
      System.out.println("Policyholder's Height: " + policies.get(i).getHolderHeight());
      System.out.println();
      System.out.println("Policyholder's Weight: " + policies.get(i).getHolderWeight());
      System.out.println();
      System.out.printf("Policyholder's BMI: $%.2f" , policies.get(i).getBMI());
      System.out.println();
      System.out.printf("Policy Price: $%.2f" , policies.get(i).getInsurancePrice());
      
      
      
   }//end for loop display   
   
   }//end main





}//end class