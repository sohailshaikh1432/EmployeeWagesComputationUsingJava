public class empWagesComputation{
        public static void main(String[] args){
                //Constant
                int IS_PRESENT=1;
                int randomCheck=(int)(Math.floor(Math.random()*10)%2);
                System.out.println(randomCheck);
                if(IS_PRESENT == randomCheck)
                        System.out.println("Employee is Present");
                else
                        System.out.println("Employee is Absent");
        }
}

