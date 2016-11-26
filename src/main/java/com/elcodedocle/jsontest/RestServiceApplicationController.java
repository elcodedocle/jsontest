package com.elcodedocle.jsontest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceApplicationController{
    @RequestMapping("/apps")
    public List<App> apps(){
    	List<App> list = new ArrayList<>();
    	for (int i=0;i<2;i++){
    		list.add(JsonTest.buildAppInfo("category_"+i, "title_"+i, "description_"+i, "developer_"+i, "packageName_"+i, "http://example.com/iconImageUrl_"+i+".png", "http://example.com/bgImageUrl_"+i+".png"));
    	}
    	return list;
    }
}
