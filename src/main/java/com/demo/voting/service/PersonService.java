package com.demo.voting.service;

import com.demo.voting.dto.request.CreatePersonRequestDTO;
import com.demo.voting.dto.response.CreatePersonResponseDTO;

public interface PersonService {

    CreatePersonResponseDTO CreatePerson(CreatePersonRequestDTO createPersonRequestDTO);
}
