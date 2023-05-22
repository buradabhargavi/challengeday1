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
        return things.stream()
        .filter(p->p.getName().equals(name))
        .findFirst()
        .orElse(null);
        }
        

   public List<product>  getProductWithText(String text){
    String str = text.toLowerCase();
        return things.stream()
    .filter(p->p.getName().toLowerCase().contains(str)||
               p.getType().toLowerCase().contains(str) ||
               p.getPlace().toLowerCase().contains(str) )
     .toList();  
   
        
   }
   public List<product>  getProductWithPlace(String place){
    String str = place.toLowerCase();
       
           return things.stream()
                .filter(b -> b.getPlace().equals(place))
                .toList();
}
                
 
  
public List<product>  getExpiredProduct(){
   Year curyear = Year.now();
    int yearValue = curyear.getValue();
    return things.stream()
    .filter(e -> e.getWarrenty() < yearValue)
    .toList();
}
}









