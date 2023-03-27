public class Policy{


 //DATA FEILDS
   
   int policyNumber;
   String providerName;
   String holderFirstName;
   String holderLastName;
   int holderAge;
   String smokingStatus;
   double holderHeight;
   double holderWeight;
   double insurancePrice;

      //no arg constructor
      
      public Policy()
      {
         policyNumber = 123456789;
         providerName = "Blue Cross Blue Shield";
         holderFirstName = "John";
         holderLastName = "Doe";
         holderAge = 69;
         smokingStatus = "smoker";
         holderHeight = 55;
         holderWeight = 420;
        
      
      }//end no arg const
      
      //constructor
      
      public Policy(int polnum,String provName,String firstName,String lastName,int age,String smoke,double height,double weight)
      {
         policyNumber = polnum;
         providerName = provName;
         holderFirstName = firstName;
         holderLastName = lastName;
         holderAge = age;
         smokingStatus = smoke;
         holderHeight = height;
         holderWeight = weight;
      
      }//end constructor


         //////////////SETTERS////////////////
         
         public void setPolicyNum(int polnum)
         {
            policyNumber = polnum;
            
         }

         public void setProviderName(String provName)
         {
         
            providerName = provName;
         
         }
         
         public void setHolderFirstName(String firstName)
         {
            holderFirstName = firstName;
         }

         public void setHolderLastName(String lastName)
         {
            holderLastName = lastName;
         }
         
         public void setHolderAge(int age)
         {
            holderAge = age;
         }
         
         public void setSmokingStatus(String smoke)
         {
            smokingStatus = smoke;
         }
         
         public void setHolderHeight(double height)
         {
            holderHeight = height;
         }
         
         public void setHolderWeight(double weight)
         {
            holderWeight = weight;
         }
         
         /////////////GETTERS//////////////////
         
         public int getPolicyNumber()
         {
            return policyNumber;
         }
         
         public String getProviderName()
         {
            return providerName;
         }
         
         public String getHolderFirstName()
         {
            return holderFirstName;
         }
         
         public String getHolderLastName()
         {
            return holderLastName;
         }
         
         public int getHolderAge()
         {
            return holderAge;
         }
         
         public String getSmokingStatus()
         {
            return smokingStatus;
         }
         
         public double getHolderHeight()
         {
            return holderHeight;
         }
         
         public double getHolderWeight()
         {
            return holderWeight;
         }
         
         ///////////////////////method that returns BMI//////////////////
         
         public double getBMI()
         {
            double BMI = (holderWeight * 703) / (holderHeight * holderHeight);
            return BMI;
            
         }  
         
         /////////////////////method that returns price of insurance//////////////////////
         
         public double getInsurancePrice()
         {
            double baseFee = 600;
           
            
            if(holderAge > 50)
            {
               insurancePrice = 75 + baseFee;
            }
            else if(smokingStatus == "smoker")
            {
               insurancePrice = 100 + baseFee;
            }
            else if(getBMI() > 35)
            {
               double additionalFee = (getBMI() -35) * 20;
               insurancePrice = baseFee + additionalFee;
               
            }
            return insurancePrice;
            
         }
}//end class