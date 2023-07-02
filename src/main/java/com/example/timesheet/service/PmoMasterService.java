package com.example.timesheet.service;

import com.example.timesheet.entity.PmoMasterEntity;
import com.example.timesheet.exceptionhandler.ApiException;
import com.example.timesheet.model.error.ErrorCodes;
import com.example.timesheet.model.request.AddPmoMaterRequest;
import com.example.timesheet.model.response.PmoMasterResponse;
import com.example.timesheet.repository.*;
import com.example.timesheet.util.Common;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class PmoMasterService {

    private static final Logger log = LoggerFactory.getLogger(PmoMasterService.class);
    private final Common common;

    @Autowired
    public PmoMasterRepository pmoMasterRepository;

    public PmoMasterService(Common common) {
        this.common = common;
    }


    public List<PmoMasterResponse> getPmoAll(){
        log.info("..:: [bay] getPmoAll Start ::..");
        List<PmoMasterResponse> list = new ArrayList();
        PmoMasterResponse pmoMasterResponse = new PmoMasterResponse();
        try {
            List<PmoMasterEntity> results = pmoMasterRepository.findAll();
            for (PmoMasterEntity result: results) {
                pmoMasterResponse.setId(common.checkEmpty(result.getApiId()) ? result.getApiId() : "");
                pmoMasterResponse.setApplicationCode(common.checkEmpty(result.getApplicationCode()) ? result.getApplicationCode() : "");
                pmoMasterResponse.setApplicationKey(common.checkEmpty(result.getApplicationKey()) ? result.getApplicationKey() : "");
                pmoMasterResponse.setActiveFlg(common.checkEmpty(result.getActiveFlg()) ? result.getActiveFlg() : "");
                pmoMasterResponse.setCreateBy(common.checkEmpty(result.getCreateBy()) ? result.getCreateBy() : "");
                pmoMasterResponse.setCreateDate(common.checkEmpty(result.getCreateDate()) ? result.getCreateDate().toString() : "");
                pmoMasterResponse.setUpdateBy(common.checkEmpty(result.getUpdateBy()) ? result.getUpdateBy() : "");
                pmoMasterResponse.setUpdateDate(common.checkEmpty(result.getUpdateDate()) ? result.getUpdateDate().toString() : "");
                list.add(pmoMasterResponse);
            }
//            List<Object[]> results = pmoMasterRepository.getapplicationCode();
//            for (Object[] result: results) {
//                pmoMasterResponse.setId(common.checkEmpty(result[0]) ? result[0].toString() : "");
//                pmoMasterResponse.setApplicationCode(common.checkEmpty(result[1]) ? result[1].toString() : "");
//                pmoMasterResponse.setApplicationKey(common.checkEmpty(result[2]) ? result[2].toString() : "");
//                pmoMasterResponse.setActiveFlg(common.checkEmpty(result[3]) ? result[3].toString() : "");
//                pmoMasterResponse.setCreateBy(common.checkEmpty(result[4]) ? result[4].toString() : "");
//                pmoMasterResponse.setCreateDate(common.checkEmpty(result[5]) ? result[5].toString() : "");
//                pmoMasterResponse.setUpdateBy(common.checkEmpty(result[6]) ? result[6].toString() : "");
//                pmoMasterResponse.setUpdateDate(common.checkEmpty(result[7]) ? result[7].toString() : "");
//                list.add(pmoMasterResponse);
//            }
        } catch (Exception e){
            log.error("..:: [bay] getPmoAll Error ::.." , e);
            throw new ApiException(ErrorCodes.ER0001,e.getMessage());
        }
        return list;
    }

    public Boolean savePmo(AddPmoMaterRequest request){
        boolean result = false;
        PmoMasterEntity pmoMasterEntity = new PmoMasterEntity();
        try {
            pmoMasterEntity.setApiId(request.getApiId());
            pmoMasterEntity.setApplicationCode(request.getApplicationCode());
            pmoMasterEntity.setApplicationKey(request.getApplicationKey());
            pmoMasterEntity.setActiveFlg("Y");
            pmoMasterEntity.setCreateBy("11140688");
            pmoMasterEntity.setCreateDate(new Timestamp(System.currentTimeMillis()));
            pmoMasterEntity.setUpdateBy("11140688");
            pmoMasterEntity.setUpdateDate(new Timestamp(System.currentTimeMillis()));
            this.pmoMasterRepository.save(pmoMasterEntity);
            log.info("Add Pmo");
            result = true;
        } catch (Exception e) {
            log.error("error");
        }
        return result;
    }
}
