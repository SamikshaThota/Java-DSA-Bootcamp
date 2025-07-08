import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //fibonacci series
       int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int temp=a+b;
            a=b;b=temp;
        }

        //Subtract the Product and Sum of Digits of an Integer
        System.out.println("Enter any number: ");
        int num=sc.nextInt();
        int sum=0;
        int product=1;
        while(num!=0){
            int rev=num%10;
            sum+=rev;
            product*=rev;
            num=num/10;
        }
        int result=product-sum;
        System.out.println("the result is " +result);


        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int sum=0;
        while(true){
            System.out.println("enter any number:  ");
            int num1=sc.nextInt();
            if(num>0){
                sum+=num;
            }
            if(num==0){
                break;
            }
        }
        System.out.println("the sum ins: "+sum);


        //Input a number and print all the factors of that number (use loops).
        int num=sc.nextInt();
        for(int i=1;i<=100;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }


        //Take integer inputs till the user enters 0 and print the largest number from all.
        int max=0;
        while(true) {
            System.out.println("enter any number: ");
            int num = sc.nextInt();
            if(num>max){
                max=num;
            }
            if(num==0){
                break;
            }
        }
        System.out.println("Max num: "+max);


//factorial of a number
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);




        //Calculate Electricity Bill
        System.out.println("enter the units: ");
        int units=sc.nextInt();
        double total=0;
        if(units<100){
            total=units*3;
        }
        else if(units>=100 && units<=200){
            total=100*3+(units-100)*5;
        }
        else{
            total=100*3+100*5+(units-200)*7;
        }
        System.out.println("total electricity: "+total);




        //Calculate Average Of N Numbers
        System.out.println("Enter how many numbers you want to calculate");
        int num=sc.nextInt();
        double sum=0;
        for(int i=1;i<=num;i++){
            System.out.println(i+": ");
            double n=sc.nextDouble();
            sum+= n;
        }
        double avg=sum/num;
        System.out.println("average: "+avg);



        //Calculate Discount Of Product
        System.out.println("Enter the original Price: ");
        double original_price=sc.nextDouble();
        System.out.println("enter the percentage of discount: ");
        double discount_percentage=sc.nextDouble();
        double discount_amount=(discount_percentage*original_price)/100;
        double final_price=original_price-discount_amount;
        System.out.println("Final price: "+final_price);



        //Calculate Distance Between Two Points
        System.out.println("enter the value of the x1,x2,y1,y2: ");
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double y2=sc.nextDouble();
        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1,2));
        System.out.printf("the Distance between two points are: %.2f\n",distance);



        //Calculate Commission Percentage
        System.out.println("enter the value of the total sales: ");
        double sales=sc.nextDouble();
        System.out.println("enter the value of commission percentage: ");
        double commission=sc.nextDouble();
        double commission_amount=(commission*sales)/100;
        System.out.println("commission amount: "+commission_amount);


       //power in java
        System.out.println("enter the number: ");
        int a=sc.nextInt();
        System.out.println("enter the value of power: ");
        int b=sc.nextInt();
        double result=Math.pow(a,b);
        System.out.println("power of "+a+": "+result);



        //Calculate Depreciation of Value
        System.out.println("enter the value of cost of asset: ");
        double asset=sc.nextDouble();
        System.out.println("enter the value of salvage: ");
        double salvage=sc.nextDouble();
        System.out.println("enter the value of useful life: ");
        double life=sc.nextDouble();
        double depreciation=(asset-salvage)/life;
        System.out.println("Depreciation per year: "+depreciation);



        //calculate batting average
        System.out.println("enter the total runs: ");
        int runs=sc.nextInt();
        System.out.println("enter the number of times out: ");
        int out=sc.nextInt();
        double avg= (double) runs /out;
        System.out.printf("Batting Average: %.2f\n",avg);


        //calculate CGPA
        System.out.println("enter how many subjects u have: ");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("enter the grade points: ");
            double grade=sc.nextDouble();
            sum+=grade;
        }
        double average=sum/n;
        System.out.printf("CGPA: %.2f\n",average);


        //Compound Interest Java
        System.out.println("enter the principal: ");
        double p=sc.nextDouble();
        System.out.println("enter the rate: ");
        double r=sc.nextDouble();
        System.out.println("enter the time: ");
        double t=sc.nextDouble();
        double a=p*(Math.pow(1+r/100,3));
        double ci=a-p;
        System.out.printf("Compound Interest: %.2f\n",ci);



        //sum of n numbers
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("the sum of n numbers are: ");
        int sum=(n*(n+1))/2;
        System.out.println(sum);


        //armstrong number
        System.out.println("enter any number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            int rev = temp % 10;
            count++;
            temp /= 10;
        }
        temp = n;
        int digits = 0;
        while (temp != 0) {
            int rev = temp % 10;
            digits += (int) Math.pow(rev, count);
            temp /= 10;
        }
        if (digits == n) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }


        //NCR AND NPR
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("enter the value of r: ");
        int r=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        int fact_r=1;
        for(int i=r;i>0;i--){
            fact_r*=i;
        }
        int sub=n-r;
        int fact_sub=1;
        for(int i=sub;i>0;i--){
            fact_sub*=i;
        }
        int ncr=fact/(fact_r*fact_sub);
        System.out.println(ncr);
        int npr=fact/fact_sub;
        System.out.println(npr);


        //reverse a string
        System.out.println("enter a string: ");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
              rev+=s.charAt(i);
        }
        System.out.println(rev);



        //check palindrome number
        System.out.println("enter an number: ");
        int a=sc.nextInt();
        int temp=a;
        int res=0;
        while(temp!=0){
            int rev=temp%10;
            res=res*10+rev;
            temp=temp/10;
        }
        if(res==a){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }

        //Future Investment Value
        System.out.println("enter the principle value: ");
        double p=sc.nextDouble();
        System.out.println("enter the rate value: ");
        double r=sc.nextDouble();
        System.out.println("enter the n value: ");
        double n=sc.nextDouble();
        System.out.println("enter the value of t: ");
        double t=sc.nextDouble();
        double a=p*(Math.pow(1+(r/(n*100.0)),n*t));
        System.out.println(a);


        //hcf of two numbers
        System.out.println("enter the values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);


        //lcm of two numbers
        System.out.println("enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int lcm=(a*b)/x;
        System.out.println(lcm);


        //vowel or consonent
        System.out.println("enter any character: ");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }


        //perfect number
        System.out.println("Enter any number: ");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not Perfect Number");
        }


        //check leap year or not
        System.out.println("enter any year: ");
        int a=sc.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not an Leap year");
        }



        //sum of digits of a number
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);

       // Kunal – Even Days in August
        int days=31;
        int count=0;
        for(int i=1;i<=days;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("the number of days are: "+count);


        //Sum of Negative, Positive Even, and Odd Numbers
        System.out.println("how many number of values you will enter?");
        int a=sc.nextInt();
        int negative=0;
        int positive_even=0;
        int positive_odd=0;
        for(int i=1;i<=a;i++){
            System.out.println("enter the number "+i+": ");
            int num=sc.nextInt();
            if(num<0){
                negative+=num;
            }
            else if(num>0 && num%2==0){
                positive_even+=num;
            }
            else{
                positive_odd+=num;
            }
        }
        System.out.println("Sum of Negative numbers: "+negative);
        System.out.println("sum of Positive even: "+positive_even);
        System.out.println("sum of positive odd: "+positive_odd);

    }
}
