package org.cookbook.services;

import org.cookbook.model.MyData;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MyDataService {

    List<MyData> listMyData ();
}
