import java.util.*;
import java.util.Objects;
class Contact{

    String CId;
    String CName;
    String  CComnanyname;
    String CPhoneNumber;
    long CSalary;
    String Cdate;

    Contact(String CId,String CName,String  CComnanyname,String CPhoneNumber,long CSalary, String Cdate){
        this.CId=CId;
        this.CName=CName;
        this.CComnanyname=CComnanyname;
        this.CPhoneNumber=CPhoneNumber;
        this.CSalary=CSalary;
        this.Cdate=Cdate;
    }

}

class iFriends02{
    public static Contact[] con=new Contact[0];
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
    public static void contact(){
        Scanner scan=new Scanner(System.in);
        int count=0;
        String name="";
        String number="";
        String coname="";
        long salary=0;

        System.out.println("\n\n+---------------------------------------------------+");
        System.out.println("|            ADD Contact to the list                |");
        System.out.println("+---------------------------------------------------+");
        char s= ' ';
        do{
            s= ' ';

            System.out.println("\n\n cid "+ ++count);
            System.out.println("=======");

            System.out.print("\n Name             :");
            name=scan.next();


            char c=' ';
            do{
                c=' ';
                System.out.print("\n Phone Number     :");
                number=scan.next();

                if(number.length()!=10 ||number.charAt(0)-48!=0){

                    System.out.println("\n\tInvalid phone number");
                    System.out.print("\n\nDo you want to add phone number again(Y/N):");
                    c=scan.next().charAt(0);
                }
                else{
                    boolean Tname=true;
                }
            }while(c=='Y');

            System.out.print(" Company Name     :");
            coname=scan.next();

            do{
                c=' ';
                System.out.print(" Salary           :");
                salary=scan.nextLong();
                if(salary>0){
                    boolean Tsalary=true;
                }
                else{
                    System.out.println("\n\tInvalid Salary");
                    System.out.print("\n\nDo you want to add Salary again(Y/N):");
                    c=scan.next().charAt(0);
                }
            }while(c=='Y');

            System.out.print(" B'Day(YYYY-MM-DD): ");
            String date=scan.next();

            Contact setContact=new Contact(" "+count,name,number,coname,salary,date);
            Contact [] tempContact=new Contact[con.length+1];
            for(int i=0;i<con.length;i++){
                tempContact[i]=con[i];
            }
            con=tempContact;
            con[con.length-1]=setContact;

            System.out.println("\nContact has been added successfully...");

            System.out.print("\n\nDo you want to add another Contact(Y/N):");
            s=scan.next().charAt(0);
        }while(s=='Y');

        Main2();
    }
    public static void update(){
        Scanner scan=new Scanner(System.in);

        System.out.println("+---------------------------------------------------+");
        System.out.println("|                   UPDATE Contact                  |");
        System.out.println("+---------------------------------------------------+");
        char s= ' ';

        System.out.print("Search Contact by Name or Phone Number - ");
        String search=scan.next();

        boolean count= false; int index=0;
        for(int i=0;i<con.length;i++){
            if(con[i].CName.equalsIgnoreCase(search)| con[i].CPhoneNumber.equals(search)){
                index=i;
                count= true;

            }

            if(count){


                System.out.println("\tContact ID        : "+con[index].CId);
                System.out.println("\tName              : "+con[index].CName);
                System.out.println("\tPhone Number      : "+con[index].CPhoneNumber);
                System.out.println("\tCompany Name      : "+con[index].CComnanyname);
                System.out.println("\tSalary            : "+con[index].CSalary);
                System.out.println("\tB'Day(YYYY-MM-DD) : "+con[index].Cdate);

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
                                con[index]. CName=name1;
                                break;
                            case 2:
                                System.out.println("Update Phone Number");
                                System.out.println("==============");
                                System.out.println("Input new Phone Number - ");
                                String phone1=scan.next();
                                con[index]. CPhoneNumber=phone1;
                                break;
                            case 3:
                                System.out.println("Update Company Name");
                                System.out.println("==============");
                                System.out.println("Input new Company Name - ");
                                String company1=scan.next();
                                con[index].CComnanyname=company1;
                                break;
                            case 4:
                                System.out.println("Update Salary");
                                System.out.println("==============");
                                System.out.println("Input new Salary - ");
                                int salary1=scan.nextInt();
                                con[index]. CSalary=salary1;
                                break;
                        }

                        System.out.println("\tContact has been updte succesfully...");
                        break;
                    }
                    System.out.print("\n\nDo you want to Update  another Contact(Y/N):");
                    s=scan.next().charAt(0);

                }while(s=='Y');


            }else{
                System.out.println("Invalid  Name or Phone Number !!!!!!!! ");
            }



        }

        Main2();

    }
    public static int find(){
        Scanner scan=new Scanner(System.in);
        char s= ' ';

        System.out.print("Search Contact by Name or Phone Number - ");
        String search=scan.next();


        boolean count= false; int index=0;
        for(int i=0;i<con.length;i++){
            if(con[i].CName.equalsIgnoreCase(search)| con[i].CPhoneNumber.equals(search)){
                index=i;
                count= true;

            }

            if(count){
                System.out.println("\tContact ID        : "+con[index].CId);
                System.out.println("\tName              : "+con[index].CName);
                System.out.println("\tPhone Number      : "+con[index].CPhoneNumber);
                System.out.println("\tCompany Name      : "+con[index].CComnanyname);
                System.out.println("\tSalary            : "+con[index].CSalary);
                System.out.println("\tB'Day(YYYY-MM-DD) : "+con[index].Cdate);
                break;
            }
            else{
                if(i==con.length-1){
                    System.out.println("\n\t No contact found for "+search+"...");
                }

            }
        }




        return index;


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
            Contact[]  deleteContact=new Contact[con.length-1];
            for(int i=0;i<con.length;i++){
                if(index != i){
                    deleteContact[i]=con[i];
                }

            }
            con=deleteContact;
        }
        Main2();
    }
    public static void  sortName(){

        for(int x=0;x<con.length;x++){

            for(int i=1;i<con.length-x;i++){
                if (con[i-1].CName.compareTo(con[i].CName) > 0) {
                    Contact temp=con[i-1];
                    con[i-1]=con[i];
                    con[i]=temp;

                }

            }
        }

    }
    public static void  sortSalary(){

        for(int x=0;x<con.length;x++){

            for(int i=1;i<con.length-x;i++){
                if (con[i-1].CSalary > con[i].CSalary) {
                    Contact temp=con[i-1];
                    con[i-1]=con[i];
                    con[i]=temp;


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



        for(int i=0;i<con.length;i++){



            System.out.printf(
                    "| %-14s | %-10s | %-17s | %-14s  | %-11d  | %-13s |%n",
                    con[i].CId, con[i]. CName, con[i]. CPhoneNumber,  con[i].CComnanyname, con[i].CSalary,  con[i].Cdate
            );

        }
        System.out.println("+--------------------------------------------------------------------------------------------------+");




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



        for(int i=0;i<con.length;i++){



            System.out.printf(
                    "| %-14s | %-10s | %-17s | %-14s  | %-11d  | %-13s |%n",
                    con[i].CId, con[i]. CName, con[i]. CPhoneNumber,  con[i].CComnanyname, con[i].CSalary,  con[i].Cdate
            );

        }
        System.out.println("+--------------------------------------------------------------------------------------------------+");




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
    public static void Main2(){

        int op=home();
        switch(op){
            case 1:
                contact();
                break;

            case 2:
                update();
                break;
            case 3:
                delete();
                break;
            case 4:
                find();
                Main2();
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
