package ru.gb.api.manufacturer.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.api.manufacturer.dto.ManufacturerDto;

import java.util.List;

public interface ManufacturerGateway {

    @GetMapping
    List<ManufacturerDto> getManufacturerList();

    @GetMapping("/{manufacturerId}")
    ResponseEntity<? extends ManufacturerDto> getManufacturer(@PathVariable("manufacturerId") Long id);

    @PostMapping
    ResponseEntity<? extends ManufacturerDto> handlePost(@Validated @RequestBody ManufacturerDto manufacturerDto);

    @PutMapping("/{manufacturerId}")
    ResponseEntity<? extends ManufacturerDto> handleUpdate(@PathVariable("manufacturerId") Long id,
                                          @Validated @RequestBody ManufacturerDto manufacturerDto);

    @DeleteMapping("/{manufacturerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteById(@PathVariable("manufacturerId") Long id);
}