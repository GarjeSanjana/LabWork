//Q.1)WAP to search given student name is available in the list of student name using String array.
package April23TUE.example;

public class SearchStudName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating String array called studName
		String[] studName = { "Sanjana", "Susmita", "Shraddha", "Kanal", "Sushmita" };
        boolean found = false;
        int index = 0;
        String searchStudName="Kanal";			
        for (int i = 0; i <studName.length; i++) 
        {
        	if(searchStudName.equals(studName[i])) 
        	{
        		index = i; 
        		found = true; 
        		break;
        	}
        }
        if(found)
        	System.out.println(searchStudName +" found at the index "+index);
        else
        	System.out.println(searchStudName +" not found in the array");
	}

}
