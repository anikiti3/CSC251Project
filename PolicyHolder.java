public class PolicyHolder {

//fields

   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;


   //constructor
   
   
   public PolicyHolder(String fn, String ln, int age, String smoke, double height, double weight)
   {
      holderFirstName = fn;
      holderLastName = ln;
      holderAge = age;
      smokingStatus = smoke;
      holderHeight = height;
      holderWeight = weight;
   
   }
   
   //SETTERS//
   
   
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

         
         
      
      /////////GETTERS///////////
      
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
         
         //to string method
         
         public String toString()
         {
            return String.format("First Name: " + holderFirstName +
                           "\nLast Name: " + holderLastName + 
                           "\nAge: " + holderAge + 
                           "\nSmoker Status: " + smokingStatus + 
                           "\nHeight: " + holderHeight +
                           "\nWeight: " + holderWeight);
         }


}//end class