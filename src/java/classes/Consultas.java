/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import br.una.zisc.dao.*;
import br.una.zisc.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mikef
 */
public class Consultas {

    @SuppressWarnings("unchecked")
    public Usuario buscaUsuario() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Usuario> lista = (List<Usuario>) s.createQuery("from Usuario u where u.nome ='maria'").list();
        System.err.println(lista.get(0).toString());
        s.getTransaction().commit();
        return lista.get(0);
    }

    @SuppressWarnings("unchecked")
    public String usuarioValido() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String resultado = "false";

        List<Usuario> lista = (List<Usuario>) s.createQuery("from Usuario u where u.email ='marcos@teste.com.br'").list();
        s.getTransaction().commit();

        if (!lista.isEmpty()) {
            resultado = "true";
        }

        return resultado;
    }

    @SuppressWarnings("unchecked")
    public Seguranca requisicaoLogin(String email) {
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        
        Query q = s.createQuery("from Seguranca seg where seg.usuario.email = :email");
        q.setParameter("email", email);
        List<Seguranca> lista = (List<Seguranca>) q.list();
        System.err.println(lista.get(0).toString());
        s.getTransaction().commit();

        return lista.get(0);
    }
}
