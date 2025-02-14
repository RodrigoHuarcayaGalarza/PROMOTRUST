package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "contrasenia", nullable = false, length = 40)
    private String contrasenia;

    @Column(name = "apellidos", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "correo", nullable = false, length = 40)
    private String correo;

    @Column(name = "RUC", nullable = false)
    private int RUC;

    public Usuario() {

    }

    public Usuario(int idusuario, String nombre, String contrasenia, String apellidos, int telefono, String correo, int RUC) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.RUC = RUC;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }
}
