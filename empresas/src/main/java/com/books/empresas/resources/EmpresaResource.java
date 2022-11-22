/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.books.empresas.resources;

import com.books.control.ControlEmpresas;
import com.books.model.ModelEmpresa;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author muril
 */
@Path("getEmpresas")
public class EmpresaResource {
    
    ControlEmpresas controlEmpresas = new ControlEmpresas();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ModelEmpresa> getEmpresa(){
        return controlEmpresas.retornaEmpresas();
    }
}
