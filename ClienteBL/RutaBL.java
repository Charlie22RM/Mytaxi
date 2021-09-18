/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytaxi.ClienteBL;

/**
 *
 * @author Charlie22
 */
public class RutaBL {
    
    String id_ruta;
    String nombre;
    String numero_paradas_intermedias;
    String id_localidad;

    public String getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(String id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_paradas_intermedias() {
        return numero_paradas_intermedias;
    }

    public void setNumero_paradas_intermedias(String numero_paradas_intermedias) {
        this.numero_paradas_intermedias = numero_paradas_intermedias;
    }

    public String getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(String id_localidad) {
        this.id_localidad = id_localidad;
    }
    
    
    
}
