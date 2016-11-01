/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.una.zisc.consultas;

import br.una.zisc.dao.Alerta;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Marcos Benevides
 */
@Path("/consultaalerta/{cidade}/{bairro}")
public class ConsultaAlerta {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getAlerta(
            @PathParam("cidade") String cidade,
            @PathParam("bairro") String bairro) {

        Consultas con = new Consultas();
        Gson gson = new Gson();
        
        List<Alerta> lista = con.buscaAlerta(cidade, bairro);
        List<String> listaJson = null;
        
        for (int i = 0; i < lista.size(); i++) {
            listaJson.add(gson.toJson(lista.get(i)));
        }
        
        return listaJson;
    }

}