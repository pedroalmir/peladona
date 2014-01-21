package com.pedroalmir.peladona.repository;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.pedroalmir.peladona.model.Pelada;

/**
 * Service for Objectify that allows:
 * 
 * Register models -
 * Recover ObjectifyFactory
 * Recover Objectify Object
 *
 */
public class OfyService {

	/**
	 * Before run application make sure that you have registered
	 * All the models that extends GenericEntity here
	 * Same as following...
	 */
	static {
		factory().register(Pelada.class);
	}
	
	/**
	 * Recover Objectify object which talks to Datastore low-lvl api
	 * import static this object...
	 * import static com.easyteam.killline.common.service.OfyService.ofy;
	 * 
	 * To help you, press (Ctrl/Command)+3 and type 'favorites'
	 * And add this import to auto import ofy()
	 * 
	 * @return objetify
	 */
	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}
	
	/**
	 * 
	 * @return objectifyFactory
	 */
	public static ObjectifyFactory factory() {
		return ObjectifyService.factory();
	}
	
}
