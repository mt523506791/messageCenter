package com.xhxd.messagecenter.entity;

import com.xhxd.messagecenter.components.XmlChannel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChannelDto {

    private String id;

    private Boolean openSwitch;

    private String url;

    private String userName;

    private String password;


    public void convert2ChannelDto(XmlChannel xmlChannel){
        this.id = xmlChannel.getId();
        this.openSwitch = xmlChannel.getOpenSwitch();
        this.url = xmlChannel.getUrl();
        this.userName = xmlChannel.getXmlUser().getName();
        this.password = xmlChannel.getXmlUser().getPassword();
    }
}
