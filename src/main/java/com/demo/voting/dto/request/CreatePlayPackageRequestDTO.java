package com.demo.voting.dto.request;

import com.demo.voting.model.Strategy;
import lombok.Data;

@Data
public class CreatePlayPackageRequestDTO {

    private Strategy strategy;
}
