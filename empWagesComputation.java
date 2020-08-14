/*
public class EmpPresentOrAbsent{
        public static void main(String[] args){
                //Constant
                int IS_PRESENT=1;
                int randomCheck=(int)(Math.floor(Math.random()*10)%2);
                System.out.println(randomCheck);
                if(IS_PRESENT == randomCheck){
                        System.out.println("Employee is Present");
                }else{
                        System.out.println("Employee is Absent");
                }
        }

}
*/

/*
public class EmpFullTimeWage{
        public static void main(String[] args){
                //Constant
                int IS_FULL_TIME=1;
                int EMP_HOUR=0;
                int EMP_WAGES=0;

                //Variables
                int emp_rate_per_hour=20;

                int randomCheck=(int)(Math.random()*10)%2;
                System.out.println(randomCheck);
                if(IS_FULL_TIME == randomCheck){
                        EMP_HOUR=8;
                }else{
                        EMP_HOUR=0;
                }
                EMP_WAGES=EMP_HOUR*emp_rate_per_hour;
                System.out.print("Employee wages: "+EMP_WAGES);
        }

}
*/
/*
public class EmpPartTimeWages{
        public static void main(String[] args){
                //Constant
                int IS_FULL_TIME=1;
                int IS_PART_TIME=2;
                int EMP_HOUR=0;
                int EMP_WAGES=0;

                //Variables
                int emp_rate_per_hour=20;

                int randomCheck=(int)(Math.random()*10)%3;
                System.out.println(randomCheck);
                if(IS_FULL_TIME == randomCheck){
                        EMP_HOUR=8;
                }else if(IS_PART_TIME == 2 ){
                        EMP_HOUR=4;
                }
                EMP_WAGES=EMP_HOUR*emp_rate_per_hour;
                System.out.print("Employee wages: "+EMP_WAGES);
        }

}
*/
/*
public class EmpWagesSwitchCase{

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
*/
/*
public class EmpWagesForLoop20Day{

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
*/

public class EmpWagesWhileLoopReachMaxHour20Day{

        //Constant
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUMBER_OF_WORKINGDAYS=20;

        public static void main(String[] args){
                EmpWagesWhileLoopReachMaxHour20Day whileLoop=new EmpWagesWhileLoopReachMaxHour20Day();
                whileLoop.calculate20DayWage();
        }
        public void calculate20DayWage()
        {
                int emp_Hour;
                int emp_Wages;
                int totalEmpWages=0;
                int maximum_Hours=50;
                int total_Hours=0;
                int total_Working_Days=0;

                while( total_Hours<=maximum_Hours  && total_Working_Days<=NUMBER_OF_WORKINGDAYS )
                {
                        total_Working_Days++;
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
                total_Hours=total_Hours+emp_Hour;
                }
                totalEmpWages=total_Hours*EMP_RATE_PER_HOUR;
                System.out.println("Total Hours : "+total_Hours);
                System.out.println("Total Wages : " +totalEmpWages);
        }
}
