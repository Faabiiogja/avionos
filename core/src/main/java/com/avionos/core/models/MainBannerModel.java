
package com.avionos.core.models;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;


import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class MainBannerModel {


    @ValueMapValue
    private String text;

    @ValueMapValue
    private String title;

    @PostConstruct
    protected void init() {
            
    }

    public String getTitle() {
        return StringUtils.isNotBlank(title) ? title : "Default Value here!";
    }
    public String getText() {
        return StringUtils.isNotBlank(this.text) ? this.text.toUpperCase() : null;
    }
}
