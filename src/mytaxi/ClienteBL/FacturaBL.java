
package mytaxi.ClienteBL;

import java.sql.Date;

/**
 *
 * @author Charlie22
 */
public class FacturaBL {
    
    String id_factura;
    Float costo_viaje;
    String fecha_emision;
    String detalles;
    String id_viaje;
    String cedula_cliente;

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public Float getCosto_viaje() {
        return costo_viaje;
    }

    public void setCosto_viaje(Float costo_viaje) {
        this.costo_viaje = costo_viaje;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(String id_viaje) {
        this.id_viaje = id_viaje;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }
    
    
    
    
}
