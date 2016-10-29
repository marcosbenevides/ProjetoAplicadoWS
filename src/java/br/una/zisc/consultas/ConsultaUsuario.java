/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.una.zisc.consultas;

import br.una.zisc.dao_.Usuario_;
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mikef
 */
@Path("/usuario")
public class ConsultaUsuario {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String buscausuario() {

        Consultas con = new Consultas();
        Gson gson = new Gson();
        System.err.println("Criado Gson");
        Usuario_ usuario = new Usuario_(con.buscaUsuario().getIdusuario(), con.buscaUsuario().getNome(), con.buscaUsuario().getEmail());
        String json = null;
        try {
            json = gson.toJson(usuario);
        } catch (StackOverflowError e) {
            System.err.print("Erro na porra toda.");
        }
        System.err.println("Criado objeto Json");

        return json;
    }

}
