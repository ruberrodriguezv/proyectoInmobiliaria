/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.session;

import com.inmobiliaria.entities.Cocina;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruber
 */
@Stateless
public class CocinaFacade extends AbstractFacade<Cocina> {
    @PersistenceContext(unitName = "proyectoInmobiliariaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CocinaFacade() {
        super(Cocina.class);
    }
    
}
