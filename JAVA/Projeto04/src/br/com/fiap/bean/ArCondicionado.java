package br.com.fiap.bean;

public class  ArCondicionado {
    public int temp;
    public String modo;

    public void aumentaTemp() {
        temp ++;
    }

    public void diminuirTemp(){
        temp--;
    }

    public void trocarEstacao(String novoModo) {
        modo = novoModo;
    }

}
