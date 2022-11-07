import java.util.ArrayList;

public class Collections {

	public static void main(String []args) {
		
		
		ArrayList<Vegetable>vege=new ArrayList<Vegetable>();
		Vegetable v[]=new Vegetable[args.length/3];
		int j=0;
		for(int i=0;i<args.length;i+=3) {
		
			v[j]=new Vegetable();
			v[j].setVegName(args[i]);
			v[j].setRequiredQty(Double.parseDouble(args[i+1]));
			v[j].setPricePerKg(Double.parseDouble(args[i+2]));
			
			
			
			vege.add(v[j]);
			j++;
	}
		
		PriceCalculation p=new PriceCalculation();
		
		p.toDisplay(vege);
		
		
	}
}
