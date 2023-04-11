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
         /**
         Sets policy number 
         @param polnum
         
         */
         
         public void setPolicyNum(int polnum)
         {
            policyNumber = polnum;
            
         }
         
          /**
         Sets provider name
         @param provName
         
         */
         
         
         public void setProviderName(String provName)
         {
         
            providerName = provName;
         
         }
         
          /**
         Sets policy holder's first name
         @param firstName
         
         */
         
         
         public void setHolderFirstName(String firstName)
         {
            holderFirstName = firstName;
         }
         
          /**
         Sets policy holder's last name
         @param lastName
         
         */
         
         
         public void setHolderLastName(String lastName)
         {
            holderLastName = lastName;
         }
         
          /**
         Sets policy holder's age
         @param age
         
         */
         
         
         public void setHolderAge(int age)
         {
            holderAge = age;
         }
         
          /**
         Sets smoker status 
         @param smoke
         
         */
         
         
         public void setSmokingStatus(String smoke)
         {
            smokingStatus = smoke;
         }
         
          /**
         Sets policy holder's height 
         @param height
         
         */
         
         
         public void setHolderHeight(double height)
         {
            holderHeight = height;
         }
         
          /**
         Sets policy holder's weight
         @param weight
         
         */
         
         
         public void setHolderWeight(double weight)
         {
            holderWeight = weight;
         }
         
         /////////////GETTERS//////////////////
         
          /**
         Gets and returns policy number 
         @return policyNumber
         
         */
         
         
         public int getPolicyNumber()
         {
            return policyNumber;
         }
         
          /**
         Gets and returns the provider name 
         @return providerName
         
         */
         
         public String getProviderName()
         {
            return providerName;
         }
         
          /**
         Gets and returns policy holder's frist name
         @return holderFirstName
         
         */
         
         public String getHolderFirstName()
         {
            return holderFirstName;
         }
         
          /**
         Gets and returns policy holder's last name
         @return holderLastName
         
         */
         
         public String getHolderLastName()
         {
            return holderLastName;
         }
         
          /**
         Gets and returns policy holder's age
         @return holderAge
         
         */
         
         public int getHolderAge()
         {
            return holderAge;
         }
         
          /**
         Gets and returns smoker status 
         @return smokingStatus
         
         */
         
         public String getSmokingStatus()
         {
            return smokingStatus;
         }
         
          /**
         Gets and returns policy holder's height
         @return holderHeight
         
         */
         
         public double getHolderHeight()
         {
            return holderHeight;
         }
         
          /**
         Gets and returns policy holder's weight
         @return holderWeight
         
         */
         
         public double getHolderWeight()
         {
            return holderWeight;
         }
         
         ///////////////////////method that returns BMI//////////////////
         
          /**
         Gets and returns policy holder's BMI
         @return BMI
         
         */
         
         public double getBMI()
         {
            double BMI = (holderWeight * 703) / (holderHeight * holderHeight);
            return BMI;
            
         }  
         
         /////////////////////method that returns price of insurance//////////////////////
         
          /**
         Gets and returns the insurance price 
         @return insurancePrice
         
         */
         
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