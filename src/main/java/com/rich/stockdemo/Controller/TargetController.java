package com.rich.stockdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rich.stockdemo.Model.TargetDTO;
import com.rich.stockdemo.Service.TargetService;


@Controller
public class TargetController {
    @Autowired private TargetService targetService;

    @ResponseBody
    @RequestMapping("/getTagetDatas")
    public List<TargetDTO> getTagetDatas(String marketDt) {
        return targetService.getTagetDatas(marketDt);
    }
}
