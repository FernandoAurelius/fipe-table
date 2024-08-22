package br.com.floresdev.fipe_table.services;

public interface IDataConverter {
    <T> T convertData(String json, Class<T> convertedClass);
}
