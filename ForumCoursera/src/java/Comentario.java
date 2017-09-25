/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex-vostro
 */
class Comentario {

    private String login;
    private String comentario;
    private int id_topico;

    public Comentario() {
    }

    public Comentario(String login, String comentario, int id_topico) {
        this.login = login;
        this.comentario = comentario;
        this.id_topico = id_topico;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId_topico() {
        return id_topico;
    }

    public void setId_topico(int id_topico) {
        this.id_topico = id_topico;
    }

    @Override
    public String toString() {
        return login + ", :" + comentario;
    }

}
