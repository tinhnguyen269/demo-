package com.example.customerprovincemanagement.service;

import com.example.customerprovincemanagement.model.DTO.IProvinceDTO;
import com.example.customerprovincemanagement.model.Province;

public interface IProvinceService extends IGenerateService<Province> {
    Iterable<IProvinceDTO> getAllProvince();
}
