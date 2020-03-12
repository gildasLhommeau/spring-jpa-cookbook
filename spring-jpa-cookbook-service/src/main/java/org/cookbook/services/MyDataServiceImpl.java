package org.cookbook.services;

import lombok.AllArgsConstructor;
import org.cookbook.dao.MyDataRepository;
import org.cookbook.model.MyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MyDataServiceImpl implements MyDataService {

    @Autowired
    private MyDataRepository myDataRepository;
    public List<MyData> listMyData() {
         return StreamSupport.stream(myDataRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
