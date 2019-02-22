package com.fanling.neptune.controller;

import com.fanling.neptune.config.NeptuneConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {

    @Autowired
    protected NeptuneConfig neptuneConfig;

    @GetMapping(value = {"/", "/index"})
    public String index(ModelMap modelMap) {
        modelMap.put("name", neptuneConfig.getName());
        modelMap.put("version", neptuneConfig.getVersion());
        return "index";
    }
}
