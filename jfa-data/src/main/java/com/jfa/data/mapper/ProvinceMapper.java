/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.data.mapper;

import com.jfa.data.entity.Province;

import java.util.List;

public interface ProvinceMapper {

    List<Province> findByCountryId();
}
