package episode44_mousehover;

import java.util.ArrayList;
import java.util.List;

public class Row {
	
	    int Id;
	    String FirstName;
	    String LastName;
	    String Status;
	    String EffectiveDate;
	    String TermDate;

	    // Constructor
	    public Row(int id, String firstName, String lastName, String status, String effectiveDate, String termDate) {
	        this.Id = id;
	        this.FirstName = firstName;
	        this.LastName = lastName;
	        this.Status = status;
	        this.EffectiveDate = effectiveDate;
	        this.TermDate = termDate;}
	        
	        public static void main(String[] args) {
		        // Assuming you have a list of rows
		        List<Row> rows = new ArrayList<>();
		        // Populate the list with your data

		        // Example data
		        rows.add(new Row(1, "abc", "tyg", "Approved", "", ""));
		        rows.add(new Row(2, "asd", "awe", "Inprogress", "", ""));
		        rows.add(new Row(3, "qwe", "rtg", "Approved", "", ""));
		        rows.add(new Row(4, "rty", "wdv", "Pending", "", ""));
		        rows.add(new Row(5, "thj", "ikj", "Approved", "", ""));

		        // Print only the rows with "Approved" status
		        for (Row row : rows) {
		            if (row.Status.equals("Approved")) {
		                System.out.println("ID: " + row.Id + ", Name: " + row.FirstName + " " + row.LastName + ", Status: " + row.Status);
		            }
		        }
	    
	}

	
	}

