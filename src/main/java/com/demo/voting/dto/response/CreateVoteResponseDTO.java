package com.demo.voting.dto.response;

import com.demo.voting.model.Person;
import com.demo.voting.model.PlayPackage;
import lombok.Data;

@Data
public class CreateVoteResponseDTO {

    private int voteId;

    private Person person;

    private PlayPackage playPackage;

}
