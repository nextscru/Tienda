package modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {

 private Long id;
 private String name;
 private String document;
 private String phone;
 private String address;
 private List<Empleado> empleados = new ArrayList<>();
 private List<Transaccion> transacciones = new ArrayList<>();
 private Date createdAt;
 private Date updatedAt;

 public Empresa(){

 }

 public Empresa(Long id, String name, String document, String phone, String address, List<Empleado> empleados, List<Transaccion> transacciones, Date createdAt, Date updatedAt) {
  this.id = id;
  this.name = name;
  this.document = document;
  this.phone = phone;
  this.address = address;
  this.empleados = empleados;
  this.transacciones = transacciones;
  this.createdAt = createdAt;
  this.updatedAt = updatedAt;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDocument() {
  return document;
 }

 public void setDocument(String document) {
  this.document = document;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public List<Empleado> getEmpleados() {
  return empleados;
 }

 public void setEmpleados(List<Empleado> empleados) {
  this.empleados = empleados;
 }

 public List<Transaccion> getTransacciones() {
  return transacciones;
 }

 public void setTransacciones(List<Transaccion> transacciones) {
  this.transacciones = transacciones;
 }

 public Date getCreatedAt() {
  return createdAt;
 }

 public void setCreatedAt(Date createdAt) {
  this.createdAt = createdAt;
 }

 public Date getUpdatedAt() {
  return updatedAt;
 }

 public void setUpdatedAt(Date updatedAt) {
  this.updatedAt = updatedAt;
 }

 @Override
 public String toString() {
  return "Empresa{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", document='" + document + '\'' +
          ", phone='" + phone + '\'' +
          ", address='" + address + '\'' +
          ", empleados=" + empleados +
          ", transacciones=" + transacciones +
          ", createdAt=" + createdAt +
          ", updatedAt=" + updatedAt +
          '}';
 }
}
