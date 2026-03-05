package br.com.fiap.model;

public class ControlePs4 {

    private String cor;
    private String corLed;
    private final int capacidadeTotalMah = 1000;
    private int cargaAtualMah;
    private boolean conectado;

    public ControlePs4(String cor, String corLed, int cargaInicial) {
        this.setCor(cor);
        this.setCorLed(corLed);
        this.cargaAtualMah = cargaInicial;
        this.conectado = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.equalsIgnoreCase("Rosa")) {
            this.cor = cor;
        } else {
            System.out.println("[ERRO DE FÁBRICA] Cor 'Rosa' não é permitida para este modelo de controle.");
        }
    }

    public String getCorLed() {
        return corLed;
    }

    public void setCorLed(String corLed) {
        this.trocarCorLed(corLed);
    }

    public int getCapacidadeTotalMah() {
        return capacidadeTotalMah;
    }

    public int getCargaAtualMah() {
        return cargaAtualMah;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void trocarCorLed(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.corLed = novaCor;
        } else {
            System.out.println("[ERRO] A cor do LED não pode ser vazia.");
        }
    }

    public void carregar(int tempoEmMinutos) {
        if (tempoEmMinutos > 0) {
            int cargaAdicional = tempoEmMinutos * 10;
            this.cargaAtualMah += cargaAdicional;
            if (this.cargaAtualMah > this.capacidadeTotalMah) {
                this.cargaAtualMah = this.capacidadeTotalMah;
            }
            System.out.println("Controle carregado. Carga atual: " + this.cargaAtualMah + "mAh");
        } else {
            System.out.println("[ERRO] O tempo de carga deve ser maior que zero.");
        }
    }

    public void vibrar(int intensidade) {
        if (this.cargaAtualMah >= 50) {
            int consumo = intensidade * 5;
            this.cargaAtualMah -= consumo;
            System.out.println("Controle vibrando na intensidade " + intensidade + ". Bateria restante: " + this.cargaAtualMah + "mAh");
        } else {
            System.out.println("[AVISO] Bateria fraca! Não é possível vibrar.");
        }
    }

    public void conectarAoConsole(String nomeDoConsole) {
        if (!this.conectado) {
            this.conectado = true;
            System.out.println("Controle conectado ao console: " + nomeDoConsole);
        } else {
            System.out.println("[AVISO] O controle já está conectado.");
        }
    }

    public void exibirStatus() {
        System.out.println("--------------------------");
        System.out.println("Status via Getters:");
        System.out.println("Cor: " + getCor() + " | Cor do LED: " + getCorLed());
        System.out.println("Bateria: " + getCargaAtualMah() + "/" + getCapacidadeTotalMah() + "mAh");
        System.out.println("Conectado: " + (isConectado() ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }
}
