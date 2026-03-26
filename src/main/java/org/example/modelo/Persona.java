package org.example.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(unique = true)
   private String dni;

   private String nombre;
   private String apellido;
   private LocalDate fechaNacimiento;
   private String email;
   private String telefono;

   public Persona(){}
   public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String email, String telefono){
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.email = email;
       this.telefono = telefono;
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString(){
       return "Persona{" + "Id=" + id +
               ", nombre= " + nombre +
               ", apellido= " + apellido +
               ", email= " + email +
               ", telefono= " + telefono +
               ", fechaNacimiento= " + fechaNacimiento +
               ", dni= " + dni +
                "}";
    }
}

