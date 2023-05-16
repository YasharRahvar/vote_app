package com.demo.voting.service;

import com.demo.voting.dto.request.CreatePersonRequestDTO;
import com.demo.voting.dto.response.CreatePersonResponseDTO;
import com.demo.voting.mapper.PersonMapper;
import com.demo.voting.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonMapper personMapper;

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonMapper personMapper, PersonRepository personRepository) {
        this.personMapper = personMapper;
        this.personRepository = personRepository;
    }

    @Override
    public CreatePersonResponseDTO CreatePerson(CreatePersonRequestDTO createPersonRequestDTO) {
        return personMapper.personToPersonResponseDTO(personRepository.save(personMapper.createPersonRequestDTOtoPerson(createPersonRequestDTO)));
    }
}