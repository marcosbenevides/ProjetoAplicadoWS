/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import br.una.zisc.dao.*;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Marcos Benevides
 */
public class ConsultaLogin {

    @GET
    @Path("login/{email}/{senha}")
    @Produces(MediaType.APPLICATION_JSON)
    public String login(@PathParam("email") String email,
                        @PathParam("senha") String senha) {
        System.err.println(email.toString() + " " + senha.toString());
        Consultas con = new Consultas();
        Gson gson = new Gson();
        Seguranca usu = con.requisicaoLogin(email);
        if (usu.getPassword().equals(senha)) {
            String json = gson.toJson(usu);
            return json;
        }
        String json = gson.toJson("");
        return json;
    }

}
