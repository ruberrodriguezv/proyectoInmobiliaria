/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.session;

import com.inmobiliaria.entities.TiempoConstruido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruber
 */
@Stateless
public class TiempoConstruidoFacade extends AbstractFacade<TiempoConstruido> {
    @PersistenceContext(unitName = "proyectoInmobiliariaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiempoConstruidoFacade() {
        super(TiempoConstruido.class);
    }
    
}
