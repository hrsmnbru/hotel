package model.bo;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Quarto {
    private int id;
    private Timestamp dataHoraInicio;
    private Timestamp dataHoraFim;
    private String obs;
    private char status;

    public Quarto() {
    }

    public Quarto(int id, Timestamp dataHoraInicio, Timestamp dataHoraFim, String obs, char status) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.obs = obs;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Timestamp dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'C') || (status == 'a') || (status == 'c')) {
                this.status = status;
            } else {
                this.status = 'A';
            }
    }

    @Override
    public String toString() {
        return "ID              = " + this.id + 
               "\nDataHoraInicio  = " + this.dataHoraInicio + 
               "\nDataHoraFim     = " + this.dataHoraFim + 
               "\nObs             = " + this.obs + 
               "\nStatus          = " + this.status;
    }
}
