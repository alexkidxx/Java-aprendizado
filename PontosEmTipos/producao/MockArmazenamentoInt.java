
public interface MockArmazenamentoInt {
public void	adicionaPonto(Placar placar, Usuario usuarioPontuante, String tipo, int quantidade);
public int recuperaPonto(Placar placar, Usuario usuarioRequerido, String tipo);
public String  recuperaTodosPontos(Placar placar);
public String recuperaTodosOsPontosDeUmUsuario(Usuario u);

}
