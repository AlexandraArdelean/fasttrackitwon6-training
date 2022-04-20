package main.ro.fasttrackitwon6.homework.lab9.exercise1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(150, "toaster","french toaster", 1);
        Product product1 = new Electronics(1500, "perie rotativa Dyson", "perie rotativa", 1,
                "produse par", 30, 10, 0, 10);

        Product fridge = new Fridge(2000, " Bosch", "fridge",1,
                "electro", 60, 50, 160, 35.5, 4 );

        Fridge fridge2= new Fridge(2500, " Arctic", "fridge",
                1, "elecro",
                50, 50, 170, 35.9, 5);

        Electronics washingMachine = new Electronics(2500, "Beko", "washing machine", 1,
                "electro", 30, 20, 60, 50);

        Cosmetics foundation = new Cosmetics(200, "foundation", "Huda Beauty foundation",
                1, "sand nude", 30);

        Product powder = new Cosmetics(300, "baking powder", "Huda Beauty baking powder", 1,
                "sand", 30);
        print(product);
        print(product1);
        print(fridge);
        print(fridge2);
        print(washingMachine);
        print(foundation);
        print(powder);





    }
    private static void print(Product product){
        System.out.println("Product: " + product.getName() + " description: " + product.getDescription() +
                " price: " + product.getPrice()+ " quantity: " + product.getQuantity());
    }
}
