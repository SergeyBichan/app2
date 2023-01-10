package ru.intervale.app2.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class Person{
    private Integer id_number;
    private Type type;

}
