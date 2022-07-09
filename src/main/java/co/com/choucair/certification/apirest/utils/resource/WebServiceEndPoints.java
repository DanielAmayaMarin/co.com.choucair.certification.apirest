package co.com.choucair.certification.apirest.utils.resource;

import co.com.choucair.certification.apirest.utils.resource.constants.Endpoints;

public enum WebServiceEndPoints {

    URL(Endpoints.URL_USERS);

    private final String url;

    WebServiceEndPoints(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}
