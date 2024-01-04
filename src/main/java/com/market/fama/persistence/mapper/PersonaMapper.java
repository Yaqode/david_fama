package com.market.fama.persistence.mapper;

import com.market.fama.domain.Person;
import com.market.fama.persistence.entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class})
public interface PersonaMapper {
    @Mappings({
            @Mapping(source = "idPersona", target = "personId"),
            @Mapping(source = "nombrePersona", target = "personName"),
            @Mapping(source = "apellidoPaterno", target = "lastName"),
            @Mapping(source = "apellidoMaterno", target = "secondLastName"),
            @Mapping(source = "telefonoPersona", target = "personPhone"),
            @Mapping(source = "usuario", target = "user"),
    })
    Person tPerson(Persona persona);
    List<Person> toPersons(List<Persona> personas);

    @InheritInverseConfiguration
    //@Mapping(target = "submarcas", ignore = true)
    Persona toPersona(Person person);
}