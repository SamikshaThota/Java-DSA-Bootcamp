public class IfIfElseLadder{
    public static void main(String[] args) {
        //if-else
        int salary=25000;
        if(salary>10000){
            salary+=1000;
        }
        else{
            salary+=100;
        }
        System.out.println(salary);


        //if-else-if
        int money=27500;
        if(money>10000 && money<20000){
            money+=1000;
        }
        else if(money>20000){
            money+=2000;
        }
        else{
            money+=100;
        }
        System.out.println(money);
    }
}
