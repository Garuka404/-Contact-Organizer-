import java.util.Scanner;

public class Main {

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

            System.out.println("name "+Arrays.toString(CName));
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}