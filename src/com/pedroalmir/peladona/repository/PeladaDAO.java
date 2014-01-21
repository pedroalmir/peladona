/**
 * 
 */
package com.pedroalmir.peladona.repository;

import com.pedroalmir.peladona.model.Pelada;

/**
 * @author Pedro Almir
 *
 */
public class PeladaDAO extends GenericDAO<Pelada>{
	/**
	 * Default constructor
	 */
	public PeladaDAO() {
		super.setEntityClass(Pelada.class);
	}
}
