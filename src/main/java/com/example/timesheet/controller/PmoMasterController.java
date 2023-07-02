package com.example.timesheet.controller;

import com.example.timesheet.model.request.AddPmoMaterRequest;
import com.example.timesheet.model.response.PmoMasterResponse;
import com.example.timesheet.service.PmoMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/v1/pmo")
public class PmoMasterController {

    @Autowired
    private PmoMasterService pmoMasterService;

    @GetMapping("/getPmoAll")
    public List<PmoMasterResponse> getPmoAll() {
        log.info("..:: [bay] getPmoAll ::..");
        List<PmoMasterResponse> listPmo = pmoMasterService.getPmoAll();
        return listPmo;
    }

    @PostMapping(value = "/savePmo" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> savePmo(@RequestBody AddPmoMaterRequest request) {
        log.info("..:: [bay] savePmoAll ::..");
        return ResponseEntity.ok(this.pmoMasterService.savePmo(request));
    }

    @GetMapping("/error")
    public String error(){
        String error = "error2";
        return error;
    }

}
