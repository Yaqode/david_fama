package com.market.fama.persistence.mapper;


import com.market.fama.domain.Inventory;
import com.market.fama.persistence.entity.Inventario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {UsuarioMapper.class, ProductoMapper.class})
public interface InventarioMapper {
    @Mappings({
            @Mapping(source = "idloginventario", target = "inventarioId"),
            @Mapping(source = "cantidadanteriorinventario", target = "cantidadanteriorinventario"),
            @Mapping(source = "cantidadnuevoinventario", target = "cantidadnuevoinventario"),
            @Mapping(source = "fechamovimiento", target = "fechamovimiento"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "producto", target = "product")
    })
    Inventory toInventory(Inventario inventario);
    List<Inventory> toInventory(List<Inventario> inventarios);

    @InheritInverseConfiguration
    Inventario toInventario(Inventory inventory);
}
