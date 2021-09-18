
package mytaxi.ClienteBL;

/**
 *
 * @author Charlie22
 */
public class InformeMensualBL {
    
    String id_informe_mensual;
    String fecha_inicio;
    String fecha_fin;
    Float monto_facturado;
    String numero_viajes;
    String detalles;
    String cedula_conductor;

    public String getId_informe_mensual() {
        return id_informe_mensual;
    }

    public void setId_informe_mensual(String id_informe_mensual) {
        this.id_informe_mensual = id_informe_mensual;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Float getMonto_facturado() {
        return monto_facturado;
    }

    public void setMonto_facturado(Float monto_facturado) {
        this.monto_facturado = monto_facturado;
    }

    public String getNumero_viajes() {
        return numero_viajes;
    }

    public void setNumero_viajes(String numero_viajes) {
        this.numero_viajes = numero_viajes;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getCedula_conductor() {
        return cedula_conductor;
    }

    public void setCedula_conductor(String cedula_conductor) {
        this.cedula_conductor = cedula_conductor;
    }
    
    
    
}
