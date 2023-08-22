//program to find number of days for a given month


class Array{
	public static void main(String args[]){
		int month_days[];
		month_days = new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		month_days[7]=31;
		month_days[8]=30;
		month_days[9]=31;
		month_days[10]=30;
		month_days[11]=31;

		System.out.println("ENTER NAME OF MONTH TO FIND OUT NUMBER OF DAYS: \n");
		String month_name = System.console().readLine();
		
		int i = 0;
		String month[];
	       	month = new String[12];
		month[0] = "january";
		month[1] = "february";
		month[2] = "march";
		month[3] = "april";
		month[4] = "may";
		month[5] = "june";
		month[6] = "july";
		month[7] = "august";
		month[8] = "september";
		month[9] = "october";
		month[10] = "november";
		month[11] = "december";
		
		for(i = 0; i<12;i++){
			if(month_name.equals(month[i])){
				System.out.println(month_name+" has "+month_days[i]+" days!!\n");
				break;
			}
		}
	}



}
