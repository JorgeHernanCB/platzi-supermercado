package com.platzi.supermercado.web.controller;

import com.platzi.supermercado.domain.service.ProductoService;
import com.platzi.supermercado.persistence.entity.Producto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Tag(name = "ProductosController", description = "Servicio que afectan a la tabla Productos")
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Operation(summary = "Devuelve todos los productos registrados en la tabla Productos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funciono sin problemas",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Producto.class)) }) })
    @GetMapping("/getAll")
    public ResponseEntity<List<Producto>> getAll(){
        return new ResponseEntity<>(productoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtiene Un producto por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encontro el producto",
                    content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Producto.class)) }),
            @ApiResponse(responseCode = "400", description = "ID de producto invalido", content = @Content),
            @ApiResponse(responseCode = "404", description = "No se encontro el producto", content = @Content) })
    public ResponseEntity<Producto> getProducto(@Parameter(description = "ID del producto a consultar") @PathVariable("id") Long idProducto){
        return productoService.getProducto(idProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/categoria/{id}")
    @Operation(summary = "Productos por categoria", description  = "Retorna los productos de una misma categoria")
    @ApiResponses({ @ApiResponse( responseCode = ""+ HttpServletResponse.SC_OK, description = "OK",
                                  content = { @Content(mediaType = "application/json",
                                     schema = @Schema(implementation = Producto.class)) }),
            @ApiResponse(responseCode = ""+ HttpServletResponse.SC_INTERNAL_SERVER_ERROR, description = "Error interno del servidor", content = @Content),
            @ApiResponse(responseCode = ""+ HttpServletResponse.SC_UNAUTHORIZED, description = "UNAUTHORIZED", content = @Content),
            @ApiResponse(responseCode = ""+ HttpServletResponse.SC_FORBIDDEN, description = "FORBIDDEN", content = @Content),
            @ApiResponse(responseCode = ""+ HttpServletResponse.SC_NOT_FOUND, description = "Elemento no encontrado", content = @Content) })
    public List<Producto> getByCategoria(@Parameter(description = "ID del categoria a consultar") @PathVariable("id") long idCategoria){
        return productoService.getByCategoria(idCategoria);
    }

    @GetMapping("/categoriaSQL/{id}")
    public List<Producto> ProductosPorCategoria(@PathVariable("id") long idCategoria){
        return productoService.ProductosPorCategoria(idCategoria);
    }

}
