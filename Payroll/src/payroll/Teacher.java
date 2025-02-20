package payroll;


class Teacher extends Person {

    void compute_netsal() {

        float basic_pay, house_allowance;
        double taxRate= 0.21;

        System.out.println("Enter your Basic Salary: ");
        basic_pay = payroll.nextFloat();

        System.out.println("Enter your House allowance: ");
        house_allowance = payroll.nextFloat();
        
        double gross_pay = basic_pay + house_allowance;
        
        System.out.printf("Gross Pay is = KES %.2f\n", gross_pay);
        
        double tax = gross_pay * taxRate;
        System.out.printf("Tax Deduction is = KES %.2f\n", tax);
        
        double net_salary = gross_pay - tax;
        System.out.printf("Your net salary is = KES %.2f\n", net_salary);
        
    }

}
