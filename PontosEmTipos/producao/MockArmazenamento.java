
public class MockArmazenamento implements MockArmazenamentoInt {

	@Override
	public void adicionaPonto(Placar placar, Usuario usuarioPontuante, String tipo, int quantidade) {
		if(placar.usuarios.contains(usuarioPontuante)){			
			Usuario aSerPontuado =	placar.usuarios.get(placar.usuarios.indexOf(usuarioPontuante));
			aSerPontuado.pontua(tipo, quantidade);
			}else{
			placar.usuarios.add(usuarioPontuante);
			usuarioPontuante.pontua(tipo, quantidade);
			}

		
	}

	@Override
	public int recuperaPonto(Placar placar, Usuario usuarioRequerido, String tipo) {
		int pontosDesseTipo = 0;
		for(Usuario u: placar.usuarios){
			if(u.equals(usuarioRequerido))
			 pontosDesseTipo = usuarioRequerido.getPontosPorTipo(tipo);
		}
		
		return pontosDesseTipo;
	}

	@Override
	public String recuperaTodosPontos(Placar placar) {
		String retorno = placar.usuarios.toString();
		return  retorno;
		
	}

	@Override
	public String recuperaTodosOsPontosDeUmUsuario(Usuario u) {
		return u.recuperaTodosPontosDoUsuario();
	}

}
