import java.util.ArrayList;
import java.util.List;
import java.time.Year;
import java.util.stream.Stream;
public class productservice {
    List <product> things= new ArrayList<>();

    public void addProduct(product p){
        things.add(p);
    }
    public List<product> getAllProducts(){
         return things; 
    }
    public product getParticularProduct(String name){
        for(product p:things){
            if(p.getName().equals(name)){
                return p;
            }
        }
            return null;
        

    }

   public List<product>  getProductWithText(String text){
    String str = text.toLowerCase();
        List <product> prods = new ArrayList<>();
        for(product p: things){
            String name=p.getName().toLowerCase();
            String type=p.getType().toLowerCase();
            String place=p.getPlace().toLowerCase();
         if(name.contains(text) || type.contains(text) ||place.contains(text)){
            prods.add(p);
         }
         
        }
        return prods;
        
   }
   public List<product>  getProductWithPlace(String place){
    String str = place.toLowerCase();
        List <product> belongings = new ArrayList<>();
        
            
            for(product b:things){
                if(b.getPlace().equals(place)){
                    belongings.add(b);
                }
 
   }
   return belongings;
}
public List<product>  getExpiredProduct(){
    List <product> expired = new ArrayList<>();
    Year curyear = Year.now();
    int yearValue = curyear.getValue();
    for(product e:things){
        if(e.getWarrenty()<yearValue){
            expired.add(e);
        }
}
return expired;
}
}









