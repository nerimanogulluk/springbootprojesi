package com.neri.springbootprojesi.service;

import org.springframework.stereotype.Component;

/* Bu gösterim ile PrintService beaninin bir Spring beani olduğunu söylemiş olmaktayız.
*/
@Component
public interface PrintService {
    public String printHello(String name);
}
