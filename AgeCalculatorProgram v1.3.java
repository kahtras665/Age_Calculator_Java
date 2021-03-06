/*  1.January-       31 days
 *  2.February-      28 days  <leap Year=29 days>
 *  3.March-         31 days
 *  4.April-         30 days
 *  5.May-           31 days
 *  6.June-          30 days
 *  7.July-          31 days
 *  8.August-        31 days
 *  9.September-     30 days
 *  10.October-      31 days 
 *  11.November-     30 days
 *  12.December-     31 days */
// v1.3 (improved efficiency of the program by adding certain lines into the code (to check the add-ons, proceed to line 120)
import java.util.Scanner;
class testtime
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= obj.nextLine();
        System.out.println("Hello "+name+", thank your for using our Time Calculator Java program! This program tells you your age and the number of days you have lived.");
        System.out.println("Let's start the process! Follow the instructions and the heads-up messages carefully for the best results! Good Luck!");
        System.out.print("Press any key to start: ");
        String st= obj.nextLine();
        System.out.println("");
        System.out.println("Enter Birth Date");
        System.out.print("Enter Date: ");
        int dateBirth= obj.nextInt();
        System.out.print("Enter Month: ");
        int monthBirth= obj.nextInt();
        System.out.print("Enter Year: ");
        int yearBirth= obj.nextInt();
        if(dateBirth>31)
        {
            System.out.print("Wrong Input! Re-Enter date correctly: ");
            dateBirth= obj.nextInt();
        }
        if(yearBirth%4!=0)
        {
            if(dateBirth>28 && monthBirth==2)
            {
               System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
               dateBirth= obj.nextInt();
            }
        }
        if(yearBirth%4==0)              
        {
            if(dateBirth>29 && monthBirth==2)
            {
                System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                dateBirth= obj.nextInt();
            }
        }
        if(monthBirth>12)
        {
             System.out.print("Wrong Input! Re-Enter month correctly: ");
             monthBirth= obj.nextInt();
        }
        if(yearBirth>2020)
        {
            System.out.print("Wrong Input! Re-Enter year correctly: ");
            yearBirth= obj.nextInt();
        }
        if(monthBirth==4 || monthBirth==6 || monthBirth==9 || monthBirth==11)
        {
            if(dateBirth>30)
            {
                System.out.print("Wrong Input! Re-Enter date correctly: ");
                dateBirth= obj.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Enter Today's Date");
        System.out.print("Enter Date: ");
        int dateCurrent= obj.nextInt();
        System.out.print("Enter Month: ");
        int monthCurrent= obj.nextInt();
        System.out.print("Enter Year: ");
        int yearCurrent= obj.nextInt();
        if(dateCurrent>31)
        {
            System.out.print("Wrong Input! Re-Enter date correctly: ");
            dateCurrent= obj.nextInt();
        }
        if(yearCurrent%4!=0)
        {
            if(dateCurrent>28 && monthCurrent==2)
            {
                System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
                dateCurrent= obj.nextInt();
            }
        }
        if(yearCurrent%4==0)              
        {
            if(dateCurrent>29 && monthCurrent==2)
            {
                System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                dateCurrent= obj.nextInt();
            }
        }
        if(monthCurrent>12)
        {
            System.out.print("Wrong Input! Re-Enter month correctly: ");
            monthCurrent= obj.nextInt();
        }
        if(yearCurrent>2020)
        {
            System.out.print("Wrong Input! Re-Enter year correctly: ");
            yearCurrent= obj.nextInt();
        }
        if(monthCurrent==4 || monthCurrent==6 || monthCurrent==9 || monthCurrent==11)
        {
            if(dateCurrent>30)
            {
                System.out.print("Wrong Input! Re-Enter date correctly: ");
                dateCurrent= obj.nextInt();
            }
        }
        // changes done from v1.2 to v1.3 (added these lines - from line number 121 to 138)
        if(yearBirth>yearCurrent)
        {
            System.out.println("Wrong Input! year of birth cannot be greater than this year.");
            System.out.print("Re-Enter Year of Birth: ");
            yearBirth= obj.nextInt();
        }
        if(yearBirth==yearCurrent && monthBirth==monthCurrent)
            if(dateBirth>dateCurrent)
            {
                System.out.println("Wrong Input! Birth Date cannot be greater than Today's Date.");
                System.out.println("Re-Enter information regarding Birth Date.");
                System.out.print("Enter Date: ");
                dateBirth= obj.nextInt();
                System.out.print("Enter Month: ");
                monthBirth= obj.nextInt();
                System.out.print("Enter Year: ");
                yearBirth= obj.nextInt();
            }
        System.out.println("");
        System.out.println("Your Birthday is: "+dateBirth+"/"+monthBirth+"/"+yearBirth);
        System.out.println("Today's date is: "+dateCurrent+"/"+monthCurrent+"/"+yearCurrent);
        System.out.print("Do you want to make any changes to the any of the dates mentioned above? Y/N: ");
        char chan= obj.next().charAt(0);
        if(chan!='Y' && chan!='y' && chan!='N' && chan!='n')
        {
            System.out.print("Follow the instructions carefully (Re-enter either Y or N): ");
            chan= obj.next().charAt(0);
        }
        if(chan=='Y' || chan=='y')
        {
            System.out.println();
            System.out.println("You chose to make changes to the date.");
            System.out.print("Enter 'B' to make changes to the Birthdate or Enter 'T' to make changes to Today's date or Enter 'A' to make changes to both Birthdate and Today's date: ");
            char chang= obj.next().charAt(0);
            if(chang=='B' || chang=='b')
            {
                System.out.println("");
                System.out.println("Re-Enter Birth Date");
                System.out.print("Enter Date: ");
                dateBirth= obj.nextInt();
                System.out.print("Enter Month: ");
                monthBirth= obj.nextInt();
                System.out.print("Enter Year: ");
                yearBirth= obj.nextInt();
                if(dateBirth>31)
                {
                    System.out.print("Wrong Input! Re-Enter date correctly: ");
                    dateBirth= obj.nextInt();
                }
                if(yearBirth%4!=0)
                {
                    if(dateBirth>28 && monthBirth==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
                        dateBirth= obj.nextInt();
                    }
                }
                if(yearBirth%4==0)             
                {
                    if(dateBirth>29 && monthBirth==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                        dateBirth= obj.nextInt();
                    }
                }   
                if(monthBirth>12)
                {
                    System.out.print("Wrong Input! Re-Enter month correctly: ");
                    monthBirth= obj.nextInt();
                }
                if(yearBirth>2020)
                {
                    System.out.print("Wrong Input! Re-Enter year correctly: ");
                    yearBirth= obj.nextInt();
                }
                if(monthBirth==4 || monthBirth==6 || monthBirth==9 || monthBirth==11)
                {
                    if(dateBirth>30)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly: ");
                        dateBirth= obj.nextInt();
                    }
                }
            }
            if(chang=='T' || chang=='t')
            {
                System.out.println("");
                System.out.println("Re-Enter Today's Date");
                System.out.print("Enter Date: ");
                dateCurrent= obj.nextInt();
                System.out.print("Enter Month: ");
                monthCurrent= obj.nextInt();
                System.out.print("Enter Year: ");
                yearCurrent= obj.nextInt();
                if(dateCurrent>31)
                {
                    System.out.print("Wrong Input! Re-Enter date correctly:");
                    dateCurrent= obj.nextInt();
                }
                if(yearCurrent%4!=0)
                {
                    if(dateCurrent>28 && monthCurrent==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
                            dateCurrent= obj.nextInt();
                    }
                }
                if(yearCurrent%4==0)              
                {
                    if(dateCurrent>29 && monthCurrent==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                        dateCurrent= obj.nextInt();
                    }
                }
                if(monthCurrent>12)
                {
                    System.out.print("Wrong Input! Re-Enter month correctly: ");
                    monthCurrent= obj.nextInt();
                }
                if(yearCurrent>2020)
                {
                    System.out.print("Wrong Input! Re-Enter year correctly: ");
                    yearCurrent= obj.nextInt();
                }
                if(monthCurrent==4 || monthCurrent==6 || monthCurrent==9 || monthCurrent==11)
                {   
                    if(dateCurrent>30)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly: ");
                        dateCurrent= obj.nextInt();
                    }
                }
            }
            if(chang=='A' || chang=='a')
            {
                System.out.println("");
                System.out.println("Re-Enter Birth Date");
                System.out.print("Enter Date: ");
                dateBirth= obj.nextInt();
                System.out.print("Enter Month: ");
                monthBirth= obj.nextInt();
                System.out.print("Enter Year: ");
                yearBirth= obj.nextInt();
                if(dateBirth>31)
                {
                    System.out.print("Wrong Input! Re-Enter date correctly: ");
                    dateBirth= obj.nextInt();
                }
                if(yearBirth%4!=0)
                {
                    if(dateBirth>28 && monthBirth==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
                        dateBirth= obj.nextInt();
                    }
                }
                if(yearBirth%4==0)              
                {
                    if(dateBirth>29 && monthBirth==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                        dateBirth= obj.nextInt();
                    }
                }   
                if(monthBirth>12)
                {
                    System.out.print("Wrong Input! Re-Enter month correctly: ");
                    monthBirth= obj.nextInt();
                }
                if(yearBirth>2020)
                {
                    System.out.print("Wrong Input! Re-Enter year correctly: ");
                    yearBirth= obj.nextInt();
                }
                if(monthBirth==4 || monthBirth==6 || monthBirth==9 || monthBirth==11)
                {
                    if(dateBirth>30)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly: ");
                        dateBirth= obj.nextInt();
                    }
                }
                System.out.println("");
                System.out.println("Re-Enter Today's Date");
                System.out.print("Enter Date: ");
                dateCurrent= obj.nextInt();
                System.out.print("Enter Month: ");
                monthCurrent= obj.nextInt();
                System.out.print("Enter Year: ");
                yearCurrent= obj.nextInt();
                if(dateCurrent>31)
                {
                    System.out.print("Wrong Input! Re-Enter date correctly: ");
                    dateCurrent= obj.nextInt();
                }
                if(yearCurrent%4!=0)
                {
                    if(dateCurrent>28 && monthCurrent==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 28 days in February of a non-leap year: "); 
                            dateCurrent= obj.nextInt();
                    }
                }
                if(yearCurrent%4==0)              
                {
                    if(dateCurrent>29 && monthCurrent==2)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly as there can be only 29 days in February of a leap year: "); 
                        dateCurrent= obj.nextInt();
                    }
                }
                if(monthCurrent>12)
                {
                    System.out.print("Wrong Input! Re-Enter month correctly: ");
                    monthCurrent= obj.nextInt();
                }
                if(yearCurrent>2020)
                {
                    System.out.print("Wrong Input! Re-Enter year correctly: ");
                    yearCurrent= obj.nextInt();
                }
                if(monthCurrent==4 || monthCurrent==6 || monthCurrent==9 || monthCurrent==11)
                {   
                    if(dateCurrent>30)
                    {
                        System.out.print("Wrong Input! Re-Enter date correctly: ");
                        dateCurrent= obj.nextInt();
                    }
                }
            }
        }
        /*int jan= 31;
        int feb= 28;
        int mar= 31;
        int apr= 30 , aprl= 29;
        int may= 31;
        int jun= 30;
        int jul= 31;
        int aug= 31;
        int sep= 30;
        int oct= 31;
        int nov= 30;
        int dec= 31;*/
        int tnod= 0;
        for(int i=yearBirth; i<=yearCurrent; i++)
        {
            int nod= 0;
            if(i==yearBirth && yearBirth%4!=0)
            {
                if(monthBirth==1)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==2)
                {
                    nod= nod + (28-dateBirth);
                    nod= nod + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==3)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==4)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==5)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==6)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==7)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==8)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 30 + 31;
                }
                if(monthBirth==9)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 30 + 31;
                }
                if(monthBirth==10)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31;
                }
                if(monthBirth==11)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31;
                }
                if(monthBirth==12)
                {
                    nod= nod + (31-dateBirth);
                }
            }
            if(i==yearBirth && yearBirth%4==0)
            {
                if(monthBirth==1)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==2)
                {
                    nod= nod + (29-dateBirth);
                    nod= nod + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==3)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==4)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==5)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==6)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==7)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 31 + 30 + 31 + 30 + 31;
                }
                if(monthBirth==8)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31 + 30 + 31;
                }
                if(monthBirth==9)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31 + 30 + 31;
                }
                if(monthBirth==10)
                {
                    nod= nod + (31-dateBirth);
                    nod= nod + 30 + 31;
                }
                if(monthBirth==11)
                {
                    nod= nod + (30-dateBirth);
                    nod= nod + 31;
                }
                if(monthBirth==12)
                {
                    nod= nod + (31-dateBirth);
                }
            }
            if(i!=yearBirth && i!=yearCurrent)
            {
                if(i%4!=0)
                    nod= 365;
                if(i%4==0)
                    nod= 366;
            }
            if(i==yearCurrent && yearCurrent%4!=0)
            {
               if(monthCurrent==1)
                   nod= nod + dateCurrent;
               if(monthCurrent==2)
                   nod= nod + 31 + dateCurrent;
               if(monthBirth==3)
                   nod= nod + 31 + 28 + dateCurrent;
               if(monthCurrent==4)
                   nod= nod + 31 + 28 + 31 + dateCurrent;
               if(monthCurrent==5)
                   nod= nod + 31 + 28 + 31 + 30 + dateCurrent;
               if(monthCurrent==6)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==7)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + dateCurrent;   
               if(monthCurrent==8)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==9)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dateCurrent;
               if(monthCurrent==10)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dateCurrent;
               if(monthCurrent==11)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==12)
                   nod= nod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dateCurrent;
            }
            if(i==yearCurrent && yearCurrent%4==0)
            {
               if(monthCurrent==1)
                   nod= nod + dateCurrent;
               if(monthCurrent==2)
                   nod= nod + 31 + dateCurrent;
               if(monthCurrent==3)
                   nod= nod + 31 + 29 + dateCurrent;
               if(monthCurrent==4)
                   nod= nod + 31 + 29 + 31 + dateCurrent;
               if(monthCurrent==5)
                   nod= nod + 31 + 29 + 31 + 30 + dateCurrent;
               if(monthCurrent==6)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==7)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + dateCurrent;   
               if(monthCurrent==8)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==9)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + dateCurrent;
               if(monthCurrent==10)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dateCurrent;
               if(monthCurrent==11)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dateCurrent;
               if(monthCurrent==12)
                   nod= nod + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dateCurrent;
            }
            tnod= tnod + nod;
        }
        System.out.println("");
        System.out.print("Do you want to know, the number of days you have been living on Earth? Y/N: ");
        char fin= obj.next().charAt(0);
        if(fin!='Y' && fin!='y' && fin!='N' && fin!='n')
        {
            System.out.print("Follow the instructions carefully (Re-enter either Y or N): ");
            fin= obj.next().charAt(0);
        }
        if(fin=='Y' || fin=='y')
            System.out.println("So, you have been living on earth since "+tnod+" days.");
        if(fin=='N' || fin=='n')
            System.out.println("Ok then :(  I thought you were excited to know!");
        double ye= tnod/365;
        int year= (int)ye;
        double m1= tnod/30.41;
        int m2= (int)m1;
        int month= m2-(year*12);
        /*double w= (tnod/7)-(((year*365)/7) + ((month*30.41)/7))+0.1; //finding out week is not accurate.
        int week= (int)w;*/
        /*double d= tnod - ((year*365) + (month*30.41 + 0.1)) +(w*7);
        int day= (int)d;*/
        /*double w= (tnod/7)-((year*365)/7 + (month*30.417)/7);
        double w1= w+0.11;
        int week= (int)w1;*/
        System.out.println("");
        System.out.print("Do you want to know your age? Y/N: ");
        char fin1= obj.next().charAt(0);
        if(fin1!='y' && fin1!='Y' && fin1!='N' && fin1!='n')
        {
            System.out.print("Follow the instructions carefully (Re-enter either Y or N): ");
            fin1= obj.next().charAt(0);
        }
        if(fin1=='y' || fin1=='Y')
            System.out.println("You are "+year+" years and "+month+" months old "+name+".");
        if(fin1=='N' || fin1=='n')
            System.out.println("Ok then :( ");
        System.out.println("");
        System.out.print("Wanna know the developer's name? Y/N: ");
        char ans= obj.next().charAt(0);
        if(ans!='Y' && ans!='y' && ans!='N' && ans!='n')
        {
            System.out.print("Follow the instructions carefully (Re-enter either Y or N): ");
            ans= obj.next().charAt(0);
        }
        if (ans=='Y' || ans=='y')
          System.out.println("----Sarthak Sanay----");
        if (ans=='N' || ans=='n')
          System.out.println("I thought you were too keen to know who developed such a cool program :(");
        System.out.println("");
        System.out.println("<Process Finished>");
    }
}