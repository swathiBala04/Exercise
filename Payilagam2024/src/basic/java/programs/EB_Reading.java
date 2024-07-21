package basic.java.programs;

class EB_Reading{

public static void main(String args[]){
EB_Reading assessor  = new EB_Reading();
int payment = assessor.reading(120);
assessor.calculate(payment);
}
int reading(int units){
int consumed_units = 1000 - units ;
System.out.println("Unit consumed this month: " + consumed_units);
return consumed_units;
}

void calculate(int consumed_units){
int electric_rate = 10;
int payment = consumed_units * electric_rate;
System.out.println("Payment value = " +payment);
}

}