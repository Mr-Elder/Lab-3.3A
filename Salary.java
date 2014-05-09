import java.text.NumberFormat;

public class Salary
{
   public static void main (String[] args)
   {
       double currentSalary = 0; // employee's current  salary
       double raise = 0;       // amount of the raise
       double newSalary = 0;      // new salary for the employee
       String rating = "";         // performance ratin
       String builder = "";
       boolean readyToContinue = true;

       currentSalary = GetInfo.getDouble("Enter the current salary: ");

       // Compute the raise using if ...
		while(readyToContinue){
		rating = GetInfo.getString("Enter the performance rating (Excellent, Good, or Poor): ");
		
		if(rating.equalsIgnoreCase("excellent"))
			raise = .06;
		else if(rating.equalsIgnoreCase("good"))
			raise = .04;
		else if(rating.equalsIgnoreCase("poor"))
			raise = .015;
		
		if(raise == .06 || raise == .04 || raise == .015)
			readyToContinue = false;
		}
  		
  		raise *= currentSalary;

       newSalary = currentSalary + raise;

       // Print the results
       NumberFormat money = NumberFormat.getCurrencyInstance();

       builder+=("Current Salary:       " + money.format(currentSalary));
       builder+=("\nAmount of your raise: " + money.format(raise));
       builder+=("\nYour new salary:      " + money.format(newSalary));
       GetInfo.showMessage(builder);
    }
}
