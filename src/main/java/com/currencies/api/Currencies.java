package com.currencies.api;

import com.model.TarihDate;
import com.tags.Tags;
import java.net.MalformedURLException;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Path(Tags.ROOT_PATH)
public class Currencies {

    @GET
    @Path(Tags.TODAY)
    @Produces(MediaType.APPLICATION_JSON)
    public TarihDate getCurrencies() throws JAXBException, MalformedURLException {
        return (TarihDate) JAXBContext.newInstance(TarihDate.class).createUnmarshaller().unmarshal(new URL(""));
    }
    
     @GET
    @Path(Tags.DAY)
    @Produces(MediaType.APPLICATION_JSON)
    public TarihDate getCurrenciesBySpecificDate(@QueryParam(Tags.YEAR_MONTH) String yearMonth, @QueryParam(Tags.DATE) String date) throws JAXBException, MalformedURLException {
        return (TarihDate) JAXBContext.newInstance(TarihDate.class).createUnmarshaller().unmarshal(new URL("" + yearMonth + "/" + date + ".xml"));
    }
}
