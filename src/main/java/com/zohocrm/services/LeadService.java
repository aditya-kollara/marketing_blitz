package com.zohocrm.services;

import org.hibernate.mapping.List;

import com.zohocrm.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);

	public java.util.List<Lead> getAllLeads();

}
