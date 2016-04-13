package com.pubnub.chatterbox.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
public class ChatterBoxRoom {

    private String roomName;
    private String roomTitle;
    private String roomID;
    private boolean active;
}