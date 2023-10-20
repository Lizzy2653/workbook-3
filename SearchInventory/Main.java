public class Main {
    public static void main (String[] args) {

        System.out.printlf("Hello and welcome!");


            ArrayList<product> inventory= getInventory();
            System.out.println(Inventory);

            for (Product p:Inventory) {
                System.out.println(p.getIn()+" "p.getName());

            }

    public static ArrayList<product>getInventory(){
        ArrayList<Product> products= new ArrayList<>();
        products.add(new Product( 3, "charger", 3.00));
        products.add(new Product( 3, "cable", 6.00));
        products.add(new Product( 3, "wire", 9.00));
        products.add(new Product( 3, "cord", 12.00));
        return products;
    }

    public static ArrayList<product> readInventory() {
            ArrayList<product> products = new ArrayList<>();
            try {
            FileReader fileReader = new FieReader(fileName"products.csv"):
            BufferedReader = new BufferedReader(FileReader);
            String input= null;
            while (input =bufferedReader.readLine())=null){
               string[] fields = input.split
                }

            } catch (FileNotFoundException ) {
                throw new RuntimeException();
            }catch (IDException){
                throw new RuntimeException()
            }
        return products;

    }
}
