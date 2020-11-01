

class EmpWageProblem {

	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        public static int computeEmpWage(String company,int EMP_RATE_PER_HOUR,
					int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH) {
                //Welcome Message//
                System.out.println("Welcome TO Employee Wage Computation Program");


                int EMP_HOURS = 0;
		int TOTAL_EMP_HOURS = 0;
		int TOTAL_WORKING_DAYS = 0;

		while (TOTAL_EMP_HOURS <= MAX_HRS_PER_MONTH &&
			TOTAL_WORKING_DAYS < NUM_OF_WORKING_DAYS){
			TOTAL_WORKING_DAYS++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		                switch ((int)empCheck){
		                        case IS_PART_TIME:
                	                	EMP_HOURS = 4;
                        	        	break;

         		               	case IS_FULL_TIME:
                        	        	EMP_HOURS = 8;
                                		break;

                        		default:
                        		        EMP_HOURS = 0;

	                        }
				TOTAL_EMP_HOURS += EMP_HOURS;

				System.out.println("\n Day#: " + TOTAL_WORKING_DAYS +
							"EMPLOYEE_HOURS: " + EMP_HOURS);

                }
		int TOTAL_EMP_WAGE = TOTAL_EMP_HOURS * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: " + TOTAL_EMP_WAGE);
		return TOTAL_EMP_WAGE;
	}

	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 20, 100);
		computeEmpWage("Reliance", 40, 20, 100);
	}
}
