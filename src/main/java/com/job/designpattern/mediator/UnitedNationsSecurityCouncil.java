package com.job.designpattern.mediator;

import lombok.Getter;
import lombok.Setter;

public class UnitedNationsSecurityCouncil extends  UnitedNations {

    @Getter
    @Setter
    private USA usa;
    @Getter
    @Setter
    private Iran iran;

    @Override
    public void declare(String message, Country country) {
        if (country instanceof USA){
            iran.getMessage(message);
        }else if(country instanceof Iran){
            usa.getMessage(message);
        }
    }
}
