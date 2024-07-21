package basic.java.programs;

class Theater {
public static void main(String args[]){
Theater raja = new Theater();
int balance = raja.bookTicket(200);
System.out.println("After booking ticket " + balance);
} 
int bookTicket(int balance){
int ticket_price = 120;
balance = balance - ticket_price;
return balance;
}
}