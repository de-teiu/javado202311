package com.example.demo.domain.mapper;

import java.util.HashMap;

public interface PersonMapper {

	HashMap<String, Object> selectPerson(int id);
}
