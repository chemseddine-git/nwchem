public class Bond{

    public double value, force, charge;
    public String type1, type2;
    public int source;
    boolean redefining, redefined;

    public Bond(String card, int isource){
	source=isource;
	type1=card.substring(0,2);
	type2=card.substring(6,8);
	value=Double.valueOf(card.substring(12,21)).doubleValue();
	force=Double.valueOf(card.substring(21,33)).doubleValue();
	charge=0.0;
	if(card.length()>33) { 
	    if(card.charAt(39)=='.') charge=Double.valueOf(card.substring(33,45)).doubleValue();
	};
	redefining=false; redefined=false;
    }

}
