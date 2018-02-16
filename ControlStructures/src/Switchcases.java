public class Switchcases {
    public static void main(String[] args)
    {
        int swithvalue=1;
        switch (swithvalue){
            case 1:
                System.out.println("the value is " + swithvalue );
            break;
            case 2:
                System.out.println("The value is wrong");
                break;
            default:
                System.out.println("This is a default condition");


        }
        char alphabet='A';
        switch (alphabet){
            case 'A':
                System.out.println("The alphabet is " + alphabet);
                break;
            case 'B':
                System.out.println("The alphabet is " + alphabet);
                break;
            case 'C':
                System.out.println("The alphabet is " + alphabet);
                break;
            case 'D':
                System.out.println("The alphabet is " + alphabet);
                break;
            case 'E':
                System.out.println("The alphabet is " + alphabet);
                break;
                default:
                    System.out.println("The alphabet is not found");
        }
        String month = "January";
        System.out.println(month.toLowerCase());
        String days = "SUNDAY";
        System.out.println(days.toLowerCase());
        String daysss = "sunday";
        System.out.println(daysss.toUpperCase());
        switch(month){
            case "January":
                System.out.println("This is Jan");
                break;
            case "Feb": case "may":
                System.out.println("This is not jan");
                break;
                default:
                    System.out.println("Not a month");
        }
    }
}
