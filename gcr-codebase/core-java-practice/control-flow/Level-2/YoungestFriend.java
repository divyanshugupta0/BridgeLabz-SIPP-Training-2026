public class YoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = 3;
        System.out.println("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.println("Enter Amar's height: ");
        int amarHeight = sc.nextInt();
        System.out.println("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.println("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.println("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest friend.");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest friend.");
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("Anthony is the youngest friend.");
        } else {
            System.out.println("There is a tie for the youngest friend.");
        }
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("Anthony is the tallest friend.");
        } else {
            System.out.println("There is a tie for the tallest friend.");
        }
    }
}
