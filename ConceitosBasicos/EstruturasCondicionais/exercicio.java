package EstruturasCondicionais;

public class exercicio {
    public static void main(String[] args) {
        double salaryAnual = 25000.00;
        double salary1 = 34712.00;
        double salary2 = 68507.00;
        double salary3 = 109075.00;
        double tax1 = 9.70 / 100;
        double tax2 = 37.35 / 100;
        double tax3 = 49.50 / 100;

        if (salaryAnual < salary1) {
            double taxAmount = salaryAnual * tax1;
            double netsalary = salaryAnual - taxAmount;
            System.out.println("Salário líquido: " + netsalary + " (Imposto: " + taxAmount + ")");
        } else if (salaryAnual < salary2) {
            double taxAmount = salaryAnual * tax2;
            double netsalary = salaryAnual - taxAmount;
            System.out.println("Salário líquido: " + netsalary + " (Imposto: " + taxAmount + ")");
        } else if (salaryAnual < salary3) {
            double taxAmount = salaryAnual * tax3;
            double netsalary = salaryAnual - taxAmount;
            System.out.println("Salário líquido: " + netsalary + " (Imposto: " + taxAmount + ")");
        } else {
            System.out.println("Salário acima do limite de imposto.");
        }
    }
}

