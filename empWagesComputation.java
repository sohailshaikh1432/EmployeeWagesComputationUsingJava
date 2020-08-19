public class empWagesComputation{

        //Constant
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUMBER_OF_WORKINGDAYS=20;

        public static void main(String[] args){
                EmpWagesForLoop20Day forLoop=new EmpWagesForLoop20Day();
                forLoop.calculate20DayWage();
        }
        public void calculate20DayWage()
        {
                //Local Variable
                int emp_Hour;
                int emp_Wages;
                int totalEmpWages=0;
                for (int day=1; day<=NUMBER_OF_WORKINGDAYS; day++ )
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
                        empWage=emp_Hour*EMP_RATE_PER_HOUR;
                        totalEmpWages=totalEmpWages+empWage;
                        System.out.println("Employee Wages : "+empWage);
                }
                System.out.println("Total Wages : " +totalEmpWages);
        }
}
