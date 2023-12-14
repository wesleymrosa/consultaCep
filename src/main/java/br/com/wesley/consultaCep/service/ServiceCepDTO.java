package br.com.wesley.consultaCep.service;

import br.com.wesley.consultaCep.modelDTO.CepDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ServiceCepDTO {
    public CepDTO consultaCep (String cep){
        return new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", CepDTO.class).getBody();
    }
}
