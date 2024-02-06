package com.lasvillas.gateservice.controller;

import com.lasvillas.gateservice.service.GateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gates")
@AllArgsConstructor
public class GateController {
    public final GateService gateService;

    @GetMapping("main/{action}")
    public @ResponseBody String openGate(@PathVariable(name="action") String action) {
        return gateService.openMainGate(action);
    }
}
