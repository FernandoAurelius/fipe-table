package br.com.floresdev.fipe_table.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertData(String json, Class<T> convertedClass) {
        try {
            return mapper.readValue(json, convertedClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
