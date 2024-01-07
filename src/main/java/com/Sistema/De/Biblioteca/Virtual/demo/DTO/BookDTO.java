package com.Sistema.De.Biblioteca.Virtual.demo.DTO;

import java.math.BigDecimal;

public record BookDTO (String Title, String ReleaseBook, int Estoque, String Autor, String Image, String Type, String Preface, String Pages, BigDecimal Cost){
}
