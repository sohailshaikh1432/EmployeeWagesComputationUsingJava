public class empWagesComputation{

        //Constant
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUMBER_OF_WORKINGDAYS=20;

        public static void main(String[] args){
                EmpWagesSwitchCase empWagesSwitchCase=new EmpWagesSwitchCase();
                empWagesSwitchCase.calculate20DayWage();
        }
        public void calculate20DayWage()
        {
                int emp_Hour;
                int emp_Wages;
                int totalEmpWages=0;
                for ( int day=1; day<=20 ; day++ )
                {
                        int randomCheck=(int)(Math.random()*10)%3;
                switch(randomCheck){
                        case IS_FULL_TIME:
                                emp_Hour=8;
                                break;
                        case IS_PART_TIME:
                                emp_Hour=4;
                                break;
                        default:
                                emp_Hour=0;
                }
                emp_Wages=emp_Hour*EMP_RATE_PER_HOUR;
                totalEmpWages=totalEmpWages+emp_Wages;
                System.out.println("Employee wages: "+emp_Wages);
                }
                System.out.println("Tota lWages : " +totalEmpWages);
        }

}
