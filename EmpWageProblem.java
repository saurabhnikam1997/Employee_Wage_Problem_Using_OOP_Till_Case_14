

public class EmpWageProblem {

	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HRS_PER_MONTH;
	private int TOTAL_EMP_WAGE;



        public EmpWageProblem(String company,int EMP_RATE_PER_HOUR,
					int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_PER_MONTH = MAX_HRS_PER_MONTH;
	}

	public void computeEmpWage() {

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
		TOTAL_EMP_WAGE = TOTAL_EMP_HOURS * EMP_RATE_PER_HOUR;

	}
	public String toString() {
		return "Total Employee Wage FOr Company: " +company+ " is: " + TOTAL_EMP_WAGE;
	}

	public static void main(String[] args) {
		EmpWageProblem dMart = new EmpWageProblem("DMart", 20, 20, 100);
		EmpWageProblem reliance = new EmpWageProblem("Reliance", 40, 20, 100);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
