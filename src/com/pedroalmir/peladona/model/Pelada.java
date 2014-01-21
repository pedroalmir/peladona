/**
 * 
 */
package com.pedroalmir.peladona.model;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.pedroalmir.peladona.model.base.GenericEntity;

/**
 * @author Pedro Almir
 *
 */
@Entity
public class Pelada extends GenericEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2068530387422420534L;
	/** Name */
	private String name;
	/** Description */
	private String description;
	
	/** Data e Hora */
	private Date dataHora;
	/** Local */
	private Double latitude;
	private Double longitude;
	/** Minimo de Participantes */
	private Integer min;
	/** Valor total */
	private Double totalMoney;
	
	/**
	 * Default constructor
	 */
	public Pelada() {
		
	}
	
	/**
	 * @param name
	 * @param description
	 * @param min
	 */
	public Pelada(String name, String description, Integer min) {
		super();
		this.name = name;
		this.description = description;
		this.dataHora = new Date();
		this.min = min;
	}
	
	/**
	 * @param name
	 * @param description
	 * @param dataHora
	 * @param latitude
	 * @param longitude
	 * @param min
	 */
	public Pelada(String name, String description, Date dataHora, Double latitude, Double longitude, Integer min) {
		super();
		this.name = name;
		this.description = description;
		this.dataHora = dataHora;
		this.latitude = latitude;
		this.longitude = longitude;
		this.min = min;
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param dataHora
	 * @param latitude
	 * @param longitude
	 * @param min
	 * @param totalMoney
	 */
	public Pelada(Long id, String name, String description, Date dataHora, Double latitude, Double longitude, Integer min,
			Double totalMoney) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dataHora = dataHora;
		this.latitude = latitude;
		this.longitude = longitude;
		this.min = min;
		this.totalMoney = totalMoney;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the dataHora
	 */
	public Date getDataHora() {
		return dataHora;
	}
	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}
	/**
	 * @param min the min to set
	 */
	public void setMin(Integer min) {
		this.min = min;
	}
	/**
	 * @return the totalMoney
	 */
	public Double getTotalMoney() {
		return totalMoney;
	}
	/**
	 * @param totalMoney the totalMoney to set
	 */
	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}
}
