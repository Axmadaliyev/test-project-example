package com.example.testproject.dto;

import com.example.testproject.entity.Proba;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestProbaDTO {

    private String name;
    private Proba proba;

}
