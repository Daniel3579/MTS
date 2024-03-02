package ru.mts.fintech.dto.Pet;


import ru.mts.fintech.dto.AbstractAnimal;

public abstract class Pet extends AbstractAnimal {
    abstract protected String getCare();
}