package model;

public class Manager extends Dipendente {

	private Integer livello;

	public Integer getLivello() {
		return livello;
	}

	public void setLivello(Integer livello) {
		this.livello = livello;
	}
	
	@Override
	public void saluto() {
		System.out.println("Sono un manager e me la canto e suono da solo! >:D");
	}
	
	@Override
	public String toString() {
		return super.toString()+","+livello;
	}
	
	
}
