package br.com.fiap;

public class ArCondicionado {
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
