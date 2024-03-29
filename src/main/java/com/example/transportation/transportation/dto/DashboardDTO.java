package com.example.transportation.transportation.dto;

import com.example.transportation.transportation.models.Evtol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDTO {
    Integer loadedEvtols;
    Integer availableEvtolsCount;
    Integer totalEvtols;
    Integer totalDeliveries;
}
