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
