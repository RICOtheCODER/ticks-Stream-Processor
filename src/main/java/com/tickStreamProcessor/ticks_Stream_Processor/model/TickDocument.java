package com.tickStreamProcessor.ticks_Stream_Processor.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TickDocument {
    private String exchange;
    private String instrument;
    private String type;
    private double price;
    private double size;
    private String tickID;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Instant timestamp;
}


