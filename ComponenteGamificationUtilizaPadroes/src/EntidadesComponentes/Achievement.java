package EntidadesComponentes;

public class Achievement {
	String name;

	public Achievement(String name) {
	
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Achievement other = (Achievement) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getNome() {
		
		return name;
	}

	public Integer getValor() {
		
		return null;
	}

	@Override
	public String toString() {
		return "Achievement [name=" + name + ", hashCode()=" + hashCode() + ", getNome()=" + getNome() + ", getValor()="
				+ getValor() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	

}
