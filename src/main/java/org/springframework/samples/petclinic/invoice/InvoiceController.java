package org.springframework.samples.petclinic.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InvoiceController {

	private final InvoiceService invoiceService;

	@Autowired
	public InvoiceController(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@GetMapping("/invoices")
	public String showInvoices(Model model) {
		List<Invoice> invoices = invoiceService.getAllInvoices();
		model.addAttribute("invoices", invoices);
		return "invoice";
	}
}


