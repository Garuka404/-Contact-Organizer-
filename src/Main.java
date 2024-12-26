import java.util.Scanner;
import java.util.*;
public class Main {
    public static String[] CId=new String[0];
    public static String[] CName=new String[0];
    public static String[] CComnanyname=new String[0];
    public static String[] CPhoneNumber=new String[0];
    public static long[] CSalary =new long[0];
    public static String[] Cdate=new String[0];
    public static String [] tempName=new String[0];
    public static  long [] tempid=new long[0];
    public static long[] tempSalary =new long[0];
    public static int home(){
        Scanner scan=new Scanner(System.in);
        int option;
        char c=' ',s=' ';
        do{
            System.out.println("\n\n\t/$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$$");
            System.out.println("\t|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
            System.out.println("\t /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
            System.out.println("\t| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
            System.out.println("\t| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
            System.out.println("\t| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
            System.out.println("\t| $$| $$      | $$  | $$ /$$$$$$|$$$$$$$$ | $$ \\  $$| $$$$$$$/");
            System.out.println("\t|__/|__/      |__/  |__/|______/|_______/ |__/  \\__/|_______/");
            System.out.println("\n\n");

            System.out.println("======================================================================");
            System.out.println("\n\t[01] ADD Contacts"+
                    "\n\n\t[02] UPDATE Contacts"+
                    "\n\n\t[03] DELETE Contacts"+
                    "\n\n\t[04] SEARCH Contacts"+
                    "\n\n\t[05] LIST Contacts"+
                    "\n\n\t[06] EXIT Contacts");
            do{
                c=' ';
                System.out.print("\n\nEnter an option to continue -> ");
                option=scan.nextInt();
                if(option<0 || option>7){
                    System.out.println("\nInvail option number try Again!!!!!!!!!!!!");
                    c='Y';
                }
                else{

                }
            }while(c=='Y');

        }while(s=='Y');

        return option;
    }
    public static String[] Slen(String[] val){
        String[] temp=new String[val.length+1];                                      //contact page
        for(int k=0;k<val.length;k++){
            temp[k]=val[k];
        }
        val=temp;
        return val;
    }
    public static long[] Ilen(long[] num){
        long[] temp=new long[num.length+1];                                      //contact page
        for(int k=0;k<num.length;k++){
            temp[k]=num[k];
        }
        num=temp;
        return num;
    }

    public static void contact(){
        Scanner scan=new Scanner(System.in);

        System.out.println("\n\n+---------------------------------------------------+");
        System.out.println("|            ADD Contact to the list                |");
        System.out.println("+---------------------------------------------------+");
        char s= ' ';
        do{
            s= ' ';
            CId=Slen(CId);
            int x=0000+CId.length;
            CId[CId.length-1]= "C000"+x;
            System.out.println("\n\n cid "+CId[CId.length-1]);
            System.out.println("=======");

            System.out.print("\n Name             :");
            String name=scan.next();

            CName= Slen(CName);
            CName[CName.length-1]=name;
            char c=' ';
            do{
                c=' ';
                System.out.print("\n Phone Number     :");
                String number=scan.next();

                if(number.length()!=10 ||number.charAt(0)-48!=0){

                    System.out.println("\n\tInvalid phone number");
                    System.out.print("\n\nDo you want to add phone number again(Y/N):");
                    c=scan.next().charAt(0);
                }
                else{
                    CPhoneNumber=Slen(CPhoneNumber);
                    CPhoneNumber[CPhoneNumber.length-1]=number;
                }
            }while(c=='Y');

            System.out.print(" Company Name     :");
            String coname=scan.next();
            CComnanyname=Slen(CComnanyname);
            CComnanyname[ CComnanyname.length-1]=coname;
            do{
                c=' ';
                System.out.print(" Salary           :");
                long salary=scan.nextLong();
                if(salary>0){
                    CSalary=Ilen(CSalary);
                    CSalary[CSalary.length-1]=salary;
                }
                else{
                    System.out.println("\n\tInvalid Salary");
                    System.out.print("\n\nDo you want to add Salary again(Y/N):");
                    c=scan.next().charAt(0);
                }
            }while(c=='Y');

            System.out.print(" B'Day(YYYY-MM-DD): ");
            String date=scan.next();

            Cdate= Slen(Cdate);
            Cdate[Cdate.length-1]=date;

            System.out.println("\nContact has been added successfully...");
            // System.out.println("Name is "+CName[0]);
            //  System.out.println("PhoneNumber is "+CPhoneNumber[0]);

            System.out.print("\n\nDo you want to add another Contact(Y/N):");
            s=scan.next().charAt(0);
        }while(s=='Y');

        Main2();
    }
    public static void Search(){
        Scanner scan=new Scanner(System.in);

        System.out.println("+---------------------------------------------------+");
        System.out.println("|                   UPDATE Contact                  |");
        System.out.println("+---------------------------------------------------+");
        char s= ' ';

        System.out.print("Search Contact by Name or Phone Number - ");
        String search=scan.next();

        int count=0,index=0;
        for(int i=0;i<CName.length;i++){
            count=0;
            String num=CName[i];
            if(search.length()==num.length()){
                for(int j=0;j<num.length();j++){
                    char n=search.charAt(j);
                    char m=num.charAt(j);
                    // System.out.println(n+" "+m);
                    if(n==m){
                        count++;

                    }
                    if(count==search.length()){
                        index=i;
                    }
                }
                // System.out.println("count "+count);
                if(count==search.length()){
                    //  System.out.print("\nfound"+search);

                    System.out.println("\tContact ID        : "+CId[index]);
                    System.out.println("\tName              : "+CName[index]);
                    System.out.println("\tPhone Number      : "+CPhoneNumber[index]);
                    System.out.println("\tCompany Name      : "+CComnanyname[index]);
                    System.out.println("\tSalary            : "+CSalary[index]);
                    System.out.println("\tB'Day(YYYY-MM-DD) : "+Cdate[index]);

                    do{
                        System.out.print("\n\nwhat do you want to update...");
                        System.out.println("\n\n\t[01] Name"
                                +"\n\t[02] Phone Number"
                                +"\n\t[03] Company Name"
                                +"\n\t[04] Salary ");
                        System.out.print("Enter an option to continue ->");
                        int op=scan.nextInt();
                        System.out.println("\n\n");
                        if(op>0 && op<5){
                            switch(op){
                                case 1:
                                    System.out.println("Update Name");
                                    System.out.println("==============");
                                    System.out.println("Input new name - ");
                                    String name1=scan.next();
                                    CName[index]=name1;
                                    break;
                                case 2:
                                    System.out.println("Update Phone Number");
                                    System.out.println("==============");
                                    System.out.println("Input new Phone Number - ");
                                    String phone1=scan.next();
                                    CPhoneNumber[index]=phone1;
                                    break;
                                case 3:
                                    System.out.println("Update Company Name");
                                    System.out.println("==============");
                                    System.out.println("Input new Company Name - ");
                                    String company1=scan.next();
                                    CComnanyname[index]=company1;
                                    break;
                                case 4:
                                    System.out.println("Update Salary");
                                    System.out.println("==============");
                                    System.out.println("Input new Salary - ");
                                    int salary1=scan.nextInt();
                                    CSalary[index]=salary1;
                                    break;
                            }

                            System.out.println("\tContact has been updte succesfully...");
                            break;
                        }
                        System.out.print("\n\nDo you want to add another Contact(Y/N):");
                        s=scan.next().charAt(0);

                    }while(s=='Y');


                }else{
                    System.out.println("Invalid  Name or Phone Number !!!!!!!! ");
                }

            }
        }


        Main2();

    }
    public static String[] SDlen(String[] val,int index){
        String[] temp=new String[val.length-1];                                      //contact page
        for(int k=0;k<val.length;k++){
            if(index==k){
                continue;
            }
            else{
                temp[k]=val[k];

            }

        }
        val=temp;
        return val;
    }
    public static long[] IDlen(long[] num,int index){
        long[] temp=new long[num.length-1];                                      //contact page
        for(int k=0;k<num.length;k++){
            if(index==k){
                continue;
            }
            else{
                temp[k]=num[k];

            }
        }
        num=temp;
        return num;
    }
    public static void delete(){
        Scanner scan=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                   DELETE Contact                  |");
        System.out.println("+---------------------------------------------------+");

        System.out.println("\n\n");
        int index = find();
        System.out.print("\n\nDo you want to delete this Contact(Y/N): ");
        char d=scan.next().charAt(0);
        if(d=='Y'){
            CName=SDlen(CName,index);
            CId=SDlen(CId,index);
            CPhoneNumber=SDlen(CPhoneNumber,index);
            CComnanyname=SDlen(CComnanyname,index);
            CSalary=IDlen(CSalary,index);
            Cdate=SDlen(Cdate,index);

        }
        Main2();
    }
    public static int find(){
        Scanner scan=new Scanner(System.in);
        char s= ' ';

        System.out.print("Search Contact by Name or Phone Number - ");
        String search=scan.next();

        int count=0,index=0;
        for(int i=0;i<CName.length;i++){
            count=0;
            String num=CName[i];
            if(search.length()==num.length()){
                for(int j=0;j<num.length();j++){
                    char n=search.charAt(j);
                    char m=num.charAt(j);
                    // System.out.println(n+" "+m);
                    if(n==m){
                        count++;

                    }
                    if(count==search.length()){
                        index=i;
                    }
                }
                // System.out.println("count "+count);
                if(count==search.length()){
                    //  System.out.print("\nfound"+search);

                    System.out.println("\tContact ID        : "+CId[index]);
                    System.out.println("\tName              : "+CName[index]);
                    System.out.println("\tPhone Number      : "+CPhoneNumber[index]);
                    System.out.println("\tCompany Name      : "+CComnanyname[index]);
                    System.out.println("\tSalary            : "+CSalary[index]);
                    System.out.println("\tB'Day(YYYY-MM-DD) : "+Cdate[index]);
                    break;
                }
                else{
                    System.out.println("\n\t No contact found for "+search+"...");
                }
            }
            else{
                if(i==CName.length-1){
                    System.out.println("\n\t No contact found for "+search+"...");
                }
            }
        }

        return index;


    }
    public static void find2(){
        Scanner scan=new Scanner(System.in);
        char s= ' ';

        System.out.print("Search Contact by Name or Phone Number - ");
        String search=scan.next();

        int count=0,index=0;
        for(int i=0;i<CName.length;i++){
            count=0;
            String num=CName[i];
            if(search.length()==num.length()){
                for(int j=0;j<num.length();j++){
                    char n=search.charAt(j);
                    char m=num.charAt(j);
                    // System.out.println(n+" "+m);
                    if(n==m){
                        count++;

                    }
                    if(count==search.length()){
                        index=i;
                    }
                }
                // System.out.println("count "+count);
                if(count==search.length()){
                    //  System.out.print("\nfound"+search);

                    System.out.println("\tContact ID        : "+CId[index]);
                    System.out.println("\tName              : "+CName[index]);
                    System.out.println("\tPhone Number      : "+CPhoneNumber[index]);
                    System.out.println("\tCompany Name      : "+CComnanyname[index]);
                    System.out.println("\tSalary            : "+CSalary[index]);
                    System.out.println("\tB'Day(YYYY-MM-DD) : "+Cdate[index]);
                    break;
                }
                else{
                    if(i==CName.length-1){
                        System.out.println("\n\t No contact found for "+search+"...");
                    }
                }
            }
            else{
                if(i==CName.length-1){
                    System.out.println("\n\t No contact found for "+search+"...");
                }

            }
        }


        Main2();

    }


    public static void sort(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+---------------------------------------------------+");
        System.out.println("|                   SORT Contact                    |");
        System.out.println("+---------------------------------------------------+");


        System.out.println("\n\t[01] Sorting by Name"+
                "\n\n\t[02] Sorting by Salary"+
                "\n\n\t[03] Sorting by Birthday");

        System.out.print("Enter an option to continue ->");
        int opn=scan.nextInt();
        System.out.println("\n\n");

        switch(opn){
            case 1:
                Sname();
                break;
            case 2:
                Ssalary();
                break;


        }


    }
    public static void  sortName(){

        for(int i=0;i<CName.length;i++){
            tempName=Slen(tempName);
            tempName[tempName.length-1]=CName[i];
            tempid=Ilen(tempid);
            tempid[tempid.length-1]=i;
        }

        for(int x=0;x<CName.length;x++){

            for(int i=1;i<CName.length-x;i++){
                if (tempName[i-1].compareTo(tempName[i]) > 0) {

                    String temp = tempName[i-1];
                    tempName[i-1] = tempName[i];
                    tempName[i] = temp;
                    long temp2=tempid[i-1];
                    tempid[i-1]=tempid[i];
                    tempid[i]=temp2;

                }

            }


        }

    }
    public static void  sortSalary(){

        for(int i=0;i<CName.length;i++){
            tempSalary =Ilen(tempSalary );
            tempSalary[tempSalary.length-1]=CSalary[i];
            tempid=Ilen(tempid);
            tempid[tempid.length-1]=i;
        }

        for(int x=0;x<CName.length;x++){

            for(int i=1;i<CName.length-x;i++){
                if (tempSalary [i-1]>(tempSalary [i])) {

                    long temp = tempSalary [i-1];
                    tempSalary [i-1] = tempSalary [i];
                    tempSalary [i] = temp;
                    long temp2=tempid[i-1];
                    tempid[i-1]=tempid[i];
                    tempid[i]=temp2;

                }

            }


        }

    }
    public static void Sname(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+---------------------------------------------------+");
        System.out.println("|                 List Contact by Name              |");
        System.out.println("+---------------------------------------------------+");
        sortName();
        System.out.println("\n\n+--------------------------------------------------------------------------------------------------+");
        System.out.println("|   Contact ID   |    Name    |    Phone Number    |    Company      |   Salary    |    Birthday   |");
        System.out.println("+--------------------------------------------------------------------------------------------------+");



        for(int i=0;i<tempid.length;i++){

            long x=tempid[i];
            int y=(int)x;


            System.out.printf(
                    "| %-14s | %-10s | %-17s | %-14s  | %11.2f  | %-13s |%n",
                    CId[y], CName[y], CPhoneNumber[y], CComnanyname[y],(double) CSalary[y], Cdate[y]
            );

        }
        System.out.println("+--------------------------------------------------------------------------------------------------+");


        tempName=new String[0];
        tempid=new long[0];

        Main2();
    }
    public static void Ssalary(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n+---------------------------------------------------+");
        System.out.println("|                 List Contact by Name              |");
        System.out.println("+---------------------------------------------------+");
        sortSalary();
        System.out.println("\n\n+--------------------------------------------------------------------------------------------------+");
        System.out.println("|   Contact ID   |    Name    |    Phone Number    |    Company      |   Salary    |    Birthday   |");
        System.out.println("+--------------------------------------------------------------------------------------------------+");



        for(int i=0;i<tempid.length;i++){

            long x=tempid[i];
            int y=(int)x;


            System.out.printf(
                    "| %-14s | %-10s | %-17s | %-14s  | %11.2f  | %-13s |%n",
                    CId[y], CName[y], CPhoneNumber[y], CComnanyname[y],(double) CSalary[y], Cdate[y]
            );

        }
        System.out.println("+--------------------------------------------------------------------------------------------------+");


        tempSalary=new long[0];
        tempid=new long[0];

        Main2();
    }

    public static void Main2(){

        int op=home();
        switch(op){
            case 1:
                contact();
                break;

            case 2:
                Search();
                break;
            case 3:
                delete();
                break;
            case 4:
                find2();
                break;
            case 5:
                sort();
                break;
            case 6:
                break;
        }

    }
    public static void main (String[] args) {


        System.out.println();
        Main2();



    }
}
