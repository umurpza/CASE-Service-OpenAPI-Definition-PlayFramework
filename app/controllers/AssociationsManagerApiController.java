package controllers;

import apimodels.CFAssociationSetType;
import apimodels.CFAssociationType;
import apimodels.ImsxStatusInfoType;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
public class AssociationsManagerApiController extends Controller {
    private final AssociationsManagerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AssociationsManagerApiController(Config configuration, AssociationsManagerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCFAssociation(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFAssociationHttp(request, sourcedId);
    }

    @ApiAction
    public Result getCFItemAssociations(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFItemAssociationsHttp(request, sourcedId);
    }

}
