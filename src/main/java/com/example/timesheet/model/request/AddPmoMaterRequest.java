package com.example.timesheet.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AddPmoMaterRequest {

    private String apiId;
    private String applicationCode;
    private String applicationKey;
}
