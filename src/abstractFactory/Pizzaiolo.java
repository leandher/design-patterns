package abstractFactory;

public class Pizzaiolo {
	private String date;
	private int typeOfDay;

	public Pizzaiolo(String date) {
		super();
		this.date = date;
	}
	
	

    public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getTypeOfDay() {
		return typeOfDay;
	}



	public void setTypeOfDay(int typeOfDay) {
		this.typeOfDay = typeOfDay;
	}



	public void calculateTheDayOfPizzaiolo(){
    	String[] day = date.split("/");
    	if(Integer.parseInt(day[0])%2 == 0 && !(Integer.parseInt(day[0])%7 == 1)){
    		typeOfDay = 1; //calabresa
    	}
    	else if(Integer.parseInt(day[0])%7 == 1){
        		typeOfDay = 3; //nenhuma
        }
    	else if(Integer.parseInt(day[0])%2 == 1 && !(Integer.parseInt(day[0])%7 == 1)){
    		typeOfDay = 2; //presunto
    	} 
    }
	
	
}
