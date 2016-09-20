package aula01;

public class Pessoa {
	
	private String name;
	private String cardNumb;
	private Data birthday;
	
	public Pessoa(String name, String cardNumb, Data birthday){
		this.name = name;
		this.cardNumb = cardNumb;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}

	public String getCardNumb() {
		return cardNumb;
	}

	public Data getBirthday() {
		return birthday;
	}

}
