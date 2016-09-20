package aula01;

public class Data {
	private int day;
	private int month;
	private int year;
	
	public Data(int day, int month, int year){
		assert validDate();
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
// Um ano é bissexto se for divisível por 4 mas não por 100 ou se for divisível por 4 e por 400
	protected boolean leapYear(int year){
		return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)); 
	}
	
	public boolean validDate(){
		boolean valid = false;
		if(this.year < 0 && ((this.month<1) || (this.month>12))) return false;
		
		if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12){
			valid = !(this.day < 1 || this.day > 31);
		}else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11 ){
			valid = !(this.day < 1 || this.day > 30);
		}else if(this.month == 2){
			if(leapYear(this.year)){
				valid = !(this.day < 1 || this.day > 29);
			}else if(!leapYear(this.year)){
				valid = !(this.day < 1 || this.day > 29);
			}
		}else valid = false;
		return valid;
	}
	
	public boolean dateBigger(Data d){
		if(this.year > d.year) return true;
		else if(this.year < d.year) return false;
		
		if(this.month > d.month) return true;
		else if(this.month < d.month) return false;
		
		if(this.day > d.day) return true;
		else if(this.day < d.day) return false;
		
		return false;
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
