package br.com.brunadelmouro.mongooperations.domain.enums;

public enum CampoEnum {
    ID("id"),
    ANO_CRIACAO("anoCriacao"),
    NOME("nome");

    CampoEnum(final String campo) {
        this.campo = campo;
    }

    private String campo;

    public String getCampo() {
        return campo;
    }

    public void setCampo(final String campo) {
        this.campo = campo;
    }
}
