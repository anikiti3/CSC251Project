public class Policy{


 //DATA FEILDS
   
   private int policyNumber;
   private String providerName;
   private PolicyHolder ph; //instance of policyHolder class
   private double insurancePrice;

      
      
      //constructor
      
      public Policy(int polnum,String provName, PolicyHolder holder)
      {
         policyNumber = polnum;
         providerName = provName;
         ph = new PolicyHolder(holder);     //this line breaks program despite having copied syntax from book exactly...
      }//end constructor                     // not sure how to fix


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
         
         public void setPolicyHolder(PolicyHolder polhold)
         {
            ph = new PolicyHolder(polhold);
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
         
         public PolicyHolder getPolicyHolder()
         {
            return new PolicyHolder(ph);
         }
         
         
         
                  /////////////////////method that returns price of insurance//////////////////////
         
          /**
         Gets and returns the insurance price 
         @return insurancePrice
         
         */
         
         public double getInsurancePrice()
         {
            double baseFee = 600;
           
            
            if(ph.getHolderAge() > 50)
            {
               insurancePrice = 75 + baseFee;
            }
            else if(ph.getSmokingStatus() == "smoker")
            {
               insurancePrice = 100 + baseFee;
            }
            else if(ph.getBMI() > 35)
            {
               double additionalFee = (ph.getBMI() -35) * 20;
               insurancePrice = baseFee + additionalFee;
               
            }
            return insurancePrice;
            
         }
         
         //to string method
         
         public String toString()
         {
            return String.format("Policy Number: " + policyNumber + "\nProvider Name: " + providerName +
                                 "\n Policy Holder Info :" + ph.toString());                        
                              
         }
         
}//end class