import java.util.ArrayList;

public class PriceCalculation {

	public void toDisplay(ArrayList<Vegetable> s) {
		
		for(int i=0;i<s.size();i++) {
			
			System.out.println(s.get(i).getVegName());
			System.out.println(s.get(i).getRequiredQty());
			System.out.println(s.get(i).getPricePerKg());
		}
	}
}
