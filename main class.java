public class Main {
    public static void main(String[] args) {
		Customer c = new RegularCustomer("Juney", 1000);
		RegularCustomer rc = new RegularCustomer("Jae", 2500);
		SeniorCustomer sc = new SeniorCustomer("Rob", 2000);

		// print bill for regular customer
		System.out.println("Bill for regular customer: " + c.calculateBill());

		// print bill for regular customer
		System.out.println("Bill for regular customer: " + rc.calculateBill());

		// print bill for senior customer
		System.out.println("Bill for senior customer: " + sc.calculateBill());
    }
}
