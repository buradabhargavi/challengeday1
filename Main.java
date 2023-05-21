import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[]args){
        productservice service=new productservice();
        service.addProduct(new product( "acer",  "laptop" , "brown table",2023 ));
        service.addProduct(new product( "asus",  "laptop" , "Black table",2022 ));
        service.addProduct(new product( "hp",  "laptop" , "Black table Desk",2021 ));
        service.addProduct(new product( "realme",  "phone" , "on Black table",2023 ));
        service.addProduct(new product( "poco m2",  "phone" , "white table",2023 ));
        service.addProduct(new product( "poco f1",  "phone" , "white racks",2023 ));
        service.addProduct(new product( "nokia",  "phone" , "brown racks",2021 ));
        service.addProduct(new product( "boat",  "Ear Phones" , "inside bag",2021 ));
        service.addProduct(new product( "wildcraft",  "Bag" , "black table",2023 ));
        service.addProduct(new product( "dell",  "laptop" , "brown table",2020 ));
        service.addProduct(new product( "classmate",  "Note Book" , "brown racks",2024 ));
        service.addProduct(new product( "samsung",  "phone" , "black",2023 ));
         List<product> things = service.getAllProducts();
        for(product thing:things){
            System.out.println(things);
        }
        System.out.println(".................................................................");
        System.out.println(".................................................................");
        System.out.println("particular product");
        service.getParticularProduct("laptop");
         System.out.println(".................................................................");
         System.out.println(".................................................................");
         System.out.println("particular text");
         List <product> prods=service.getProductWithText("black");
         for(product p:prods){
            System.out.println(p);
        } 
        System.out.println(".................................................................");
        System.out.println(".................................................................");
        System.out.println("particular place");
        List <product> belongings =service.getProductWithPlace("brown table");
         for(product b:belongings){
            System.out.println(b);
        }


        System.out.println(".................................................................");
        System.out.println(".................................................................");
        System.out.println("products out of warranty");
        List <product> expired =service.getExpiredProduct();
         for(product e:expired){
            System.out.println(e);
        }
        }   
    
}
