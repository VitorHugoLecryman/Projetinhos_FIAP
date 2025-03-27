package br.com.fiap;

public class TV {

    // atributos
    public int volume;
    public int canal;
    // métodos
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
    public void trocarCanal(int CanalAtual ) {
        canal = CanalAtual;
    }
}