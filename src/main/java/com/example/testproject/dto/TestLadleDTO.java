package com.example.testproject.dto;

import com.example.testproject.entity.Ladle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestLadleDTO {

    private String name;
    private Ladle ladle;
}
