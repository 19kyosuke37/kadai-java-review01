
public class Review01 {

    public static void main(String[] args) {
        int price = 1700;
        int tax = getTax(price);
        int noTax = getNoTax(tax,price);
        
        System.out.println(price+"円の商品の税込価格は"+tax+"円（消費税は"+noTax+"円）です。");
    }
    
    public static int getTax(int price) {
        int result = price + (price/10);
        return result;
        
    }
    public static int getNoTax(int tax,int price) {
        int result = tax - price;
        return result;
    }
    

}
