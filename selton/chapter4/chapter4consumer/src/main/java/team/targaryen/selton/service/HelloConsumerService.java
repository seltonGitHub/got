package team.targaryen.selton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public String transferOuterService(String name) {
        return restTemplate.getForObject("http://client-hi/hi?name="+name, String.class);
    }
}
