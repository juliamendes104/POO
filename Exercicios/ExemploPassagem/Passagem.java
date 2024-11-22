
package com.mycompany.exemplopassagem;

import java.time.LocalDateTime;

public interface Passagem {
    public abstract String getCodigo();
    public abstract double getPreco();
    public abstract LocalDateTime getDataHora();
    public abstract String getOrigem();
    public abstract String getDestino();
}
