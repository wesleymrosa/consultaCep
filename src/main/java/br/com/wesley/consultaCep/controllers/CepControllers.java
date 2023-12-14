package br.com.wesley.consultaCep.controllers;

import br.com.wesley.consultaCep.modelDTO.CepDTO;
import br.com.wesley.consultaCep.service.ServiceCepDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cep")
public class CepControllers {
    @Autowired
    private ServiceCepDTO service;

    @GetMapping(value = "/consulta/{cep}")
    public ResponseEntity<CepDTO> consultaCep (@PathVariable(value = "cep") String cep){
        CepDTO cepDTO = service.consultaCep(cep);
        return new ResponseEntity<CepDTO>(cepDTO, HttpStatus.OK);
    }
}
