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
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}