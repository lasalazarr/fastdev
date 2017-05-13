package org.fastdev.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fastdev.domain.Customer;

/**
 * Created by alberto on 5/12/17.
 */
public class CustomerMicroserviceProcessor implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {

        Customer resp = new Customer();
        resp.setStatus("Your customer creation is OK!");
        exchange.getOut().setBody(resp);
    }
}
