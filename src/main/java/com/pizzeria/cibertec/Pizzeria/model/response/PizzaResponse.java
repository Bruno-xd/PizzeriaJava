package com.pizzeria.cibertec.Pizzeria.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PizzaResponse {
    private Boolean respuesta;
    private String mensaje;
}
