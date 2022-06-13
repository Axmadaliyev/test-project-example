package com.example.testproject.dto;

import com.example.testproject.entity.Nomalum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestWorkDTO {

    private String name;
    private Nomalum nomalum;

}
