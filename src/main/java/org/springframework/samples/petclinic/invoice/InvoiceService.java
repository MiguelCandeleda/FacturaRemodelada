package org.springframework.samples.petclinic.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {

	List<Invoice> getAllInvoices();

	/*private final InvoiceRepository invoiceRepository;

	@Autowired
	public InvoiceService(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}*/
}
