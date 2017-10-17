package EntidadesComponentes;

import java.util.List;

import interfaces.AchievementStorage;

public class Points extends Achievement {
	int valor;

	public Points(String name,int valor) {
		super(name);
		this.valor = valor;
	}

	@Override
	public String getNome() {
		
		return super.getNome();
	}

	public void setValor(Integer valor){
		
		this.valor = valor;
		
	}
	
	public int getValor() {
		
		return valor;
	}

	@Override
	public void addd(String user,AchievementStorage memo) {
	 
	
		Usuario b = memo.getUser(user);
		
		if(b!=null){
	
			if(!memo.possuiEssaConquista(this.getNome(), user)){
				b.addConquista(this);
				}else{
						
					
						Achievement c = b.getConquista(this.getNome());
						
					
						((Points) c).setValor(this.getValor()+((Points) c).getValor());
				
				}
			
				}else{	
				
			Usuario l = new Usuario(user);
			
			l.addConquista(this);
			((MemoryAchievementStorage) memo).addUser(l);
			}
		
			
			
	}
		
		

		
	
	private void soma(Achievement q) {
		Points j = (Points) q;
		
		j.setValor(j.getValor()+this.getValor());
		this.valor = j.getValor();
	
	}

	@Override
	public String toString() {
		return "Points [nome="+this.name+"valor=" + valor +"]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + valor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Points other = (Points) obj;
		if (valor != other.valor)
			return false;
		return true;
	}


	

}
