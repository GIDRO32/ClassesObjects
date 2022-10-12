
public class Main
{
    public static class Money
    {
        private static float cash;//wallet balance
        private static float card;//credit card balance
        private static String yourCurrency;//dollars, hryvnias etc.
        private static String YourName;
        public Money(float i, String currency, float i2, String name)
        {
            cash = i;
            card = i2;
            yourCurrency = currency;
            YourName = name;
        }
        public static float getMoneySum()
        {
            return cash + card;
        }
        public static void printFullInfo()
        {
            System.out.println("There are " + cash + " " + yourCurrency + " in the wallet owned by " + YourName);
            System.out.println("There are " + card + " " + yourCurrency + " on the card owned by " + YourName);
            System.out.println("You have " + getMoneySum() + " " + yourCurrency + " in total");
        }
    }
    public static void main(String[] args)
    {
        Money sasha = new Money(3.64f, "dollars", 53.36f, "Oleksandr");
        sasha.printFullInfo();
    }
}