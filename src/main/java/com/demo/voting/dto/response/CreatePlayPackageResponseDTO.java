package com.demo.voting.dto.response;

import com.demo.voting.model.Strategy;
import lombok.Data;

@Data
public class CreatePlayPackageResponseDTO {

    private int playPackageId;

    private Strategy strategy;
}
