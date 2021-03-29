package entregable3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tarea {


    private String tarea;
    private Date date = new Date();
    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private boolean pendiente;

    public tarea(String tarea, Date fecha, boolean pendiente) {
        this.tarea = tarea;
        this.date = fecha;
        this.pendiente = pendiente;

    }

    public boolean GetPendiente() {
        return pendiente;
    }

    public String GetTarea() {
        return tarea;
    }

    public String GetTiempo() {
        return dateFormat.format(date);
    }

    public void SetTarea(String tarea) {
        this.tarea = tarea;
    }

    public void SetTiempo(Date nuevahora) {
        this.date = nuevahora;
    }

    public void SetPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

    public String toString() {
        return tarea + "_" + dateFormat.format(date) + "_" + pendiente;
    }
}

