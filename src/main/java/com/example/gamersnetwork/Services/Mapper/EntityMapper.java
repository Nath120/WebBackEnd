package com.example.gamersnetwork.Services.Mapper;

public interface EntityMapper <T,D>{
    D entitytoDto(T t);
}

