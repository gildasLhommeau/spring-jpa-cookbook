package org.cookbook.webservice;

import lombok.AllArgsConstructor;
import org.cookbook.model.MyData;
import org.cookbook.services.MyDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/my-data")
public class MyDataController {

    MyDataService myDataService;

    @GetMapping
    List<MyData> list(){

        return myDataService.listMyData();

    }

}
