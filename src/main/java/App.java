import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JsonDataSource;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.export.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class App {
    public static String rawJsonData = "[{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "},\n" +
            "{ \n" +
            "    \"name\" : \"MutantEvilToast\", \n" +
            "    \"organizationId\" : \"d8291278-afdc-4a66-800f-ed9e960ca9f6\",\n" +
            "    \"lastName\" : \"Last Name\", \n" +
            "    \"age\" : \"15\"\n" +
            "}]";

    public static void main(String[] args) throws JRException {
        try {
            generateReport();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generateReport() throws JRException, IOException {
        List<String> columns = getColumnNames(rawJsonData);

        JasperDesign jasperDesign = createDesign(columns);
        JasperReport jasperReport = JasperCompileManager
                .compileReport(jasperDesign);
        JRDataSource jrDataSource = prepareDataSource();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);
        printXlS(jasperPrint);
        printCSV(jasperPrint);
        printPDF(jasperPrint);
    }

    /**
     * Здесь нам нужно развернуть данные, полученные из хранимой процедуры в
     * список объектов с нужным количеством полей. В качестве примера мы просто
     * создадим тестовые данные.
     * 
     * @return JRDataSource.
     */
    private static void printXlS(JasperPrint jasperPrint){
        try (FileOutputStream fileOutputStream = new FileOutputStream("dynamicReport.xls")) {
            JRXlsExporter xlsExporter = new JRXlsExporter();
            xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(
                    fileOutputStream));
            SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
            configuration.setOnePagePerSheet(false);
            xlsExporter.setConfiguration(configuration);
            xlsExporter.exportReport();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (JRException e){
            e.printStackTrace();
        }
    }
    private static void printCSV (JasperPrint jasperPrint){
        try (FileOutputStream fileOutputStream2 = new FileOutputStream("dynamicReport1.csv")) {
            JRCsvExporter jrCsvExporter = new JRCsvExporter();
            jrCsvExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            jrCsvExporter.setExporterOutput(new WriterExporterOutput(
            ) {
                @Override
                public String getEncoding() {
                    return " ";
                }

                @Override
                public Writer getWriter() {
                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter("dynamicReport1.csv");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return fileWriter;
                }

                @Override
                public void close() {

                }
            });
            SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
            configuration.setOnePagePerSheet(false);

            jrCsvExporter.exportReport();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (JRException e){
            e.printStackTrace();
        }

    }
    private static void printPDF(JasperPrint jasperPrint){
        try (FileOutputStream fileOutputStream1 = new FileOutputStream("dynamicReport1.pdf")) {
            JRPdfExporter pdfExporter = new JRPdfExporter();
            pdfExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            pdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(
                    fileOutputStream1));
            SimplePdfReportConfiguration configuration = new SimplePdfReportConfiguration();
            //configuration.setOnePagePerSheet(false);
            pdfExporter.setConfiguration(configuration);
            pdfExporter.exportReport();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (JRException e){
            e.printStackTrace();
        }
    }
    private static JRDataSource prepareDataSource() throws JRException {
        ByteArrayInputStream jsonDataStream = new ByteArrayInputStream(rawJsonData.getBytes());
        JsonDataSource dataSources = new JsonDataSource(jsonDataStream);
        return dataSources;
    }

    private static List<String>  getColumnNames(String rawJsonData) throws JsonProcessingException {
        List<Map<String, Object>> list = Arrays.asList(new ObjectMapper().readValue(rawJsonData, Map[].class));
        List<String> result = new ArrayList<String>();

        if(list.size() > 0)
        {
            for (Map.Entry<String, Object> entry : list.get(0).entrySet()) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static JasperDesign createDesign(List<String> columns) throws JRException, IOException {
        // Эквивалентно StaticText в JasperStudio
        JRDesignStaticText staticText = null;

        // Эквивалентно TextField в JasperStudio
        JRDesignTextField textField = null;

        // Band. Details, Summary, Title и другие.
        JRDesignBand band = null;

        // Вычисляемое выражение. Для записи значений в JRDesignTextField.
        JRDesignExpression expression = null;

        // Для добавления полей в отчёт.
        JRDesignField field = null;

        // Рамка вокруг ячейки.
        JRLineBox lineBox = null;

        // Вычисляемое значение. Можно подсчитать, например сумму.
        JRDesignVariable variable = null;

        int x;
        int y;
        final int ROW_HEIGHT = 31;
        final int COLUMN_WIDTH = 100;

        JasperDesign jasperDesign = new JasperDesign();
        jasperDesign.setName("dynamicColumns");
        jasperDesign.setPageWidth(800);
        jasperDesign.setPageHeight(900);
        jasperDesign.setColumnWidth(COLUMN_WIDTH);
        jasperDesign.setColumnSpacing(45);
        jasperDesign.setLeftMargin(40);
        jasperDesign.setRightMargin(40);
        jasperDesign.setTopMargin(40);
        jasperDesign.setBottomMargin(40);
        jasperDesign.setIgnorePagination(true);
        jasperDesign.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);

        JRDesignStyle normalStyle = new JRDesignStyle();
        normalStyle.setName("normal");
        normalStyle.setDefault(true);
        normalStyle.setFontName("DejaVu Sans");
        normalStyle.setFontSize(8.5f);
        lineBox = normalStyle.getLineBox();
        lineBox.getTopPen().setLineWidth(1f);
        lineBox.getRightPen().setLineWidth(1f);
        lineBox.getBottomPen().setLineWidth(1f);
        lineBox.getLeftPen().setLineWidth(1f);
        jasperDesign.addStyle(normalStyle);

        JRDesignStyle headerStyle = new JRDesignStyle();
        headerStyle.setName("header");
        headerStyle.setDefault(true);
        headerStyle.setFontName("DejaVu Sans");
        headerStyle.setFontSize(8.5f);
        headerStyle.setBold(true);
        lineBox = headerStyle.getLineBox();
        lineBox.getTopPen().setLineWidth(1f);
        lineBox.getRightPen().setLineWidth(1f);
        lineBox.getBottomPen().setLineWidth(1f);
        lineBox.getLeftPen().setLineWidth(1f);
        jasperDesign.addStyle(headerStyle);

        // Поля отчёта.
        for(int i = 0; i < columns.size(); i ++) {
            field = new JRDesignField();
            field.setName(columns.get(i));
            field.setValueClass(String.class);
            jasperDesign.addField(field);
        }

        // Title band
        band = new JRDesignBand();
        // добавляем нужные элементы в band.
        // Можно добавлять JRDesignTextField-ы и JRDesignStaticField-ы,
        // картинки и всё, что угодно. Мы пропустим для простоты.
        jasperDesign.setTitle(band);

        // Заголовки колонок.
        x = 0;
        y = 0;
        band = new JRDesignBand();
        band.setHeight(ROW_HEIGHT);

        for(int i = 0; i < columns.size(); i ++) {
            staticText = new JRDesignStaticText();
            staticText.setX(x);
            staticText.setY(y);
            // ширина
            staticText.setWidth(COLUMN_WIDTH);
            staticText.setHeight(ROW_HEIGHT);
            staticText.setStyle(headerStyle);
            staticText.setText(columns.get(i));
            band.addElement(staticText);
            x += staticText.getWidth();
        }

        jasperDesign.setColumnHeader(band);

        // Detail band (данные)
        band = new JRDesignBand();
        band.setHeight(ROW_HEIGHT);
        x = 0;
        y = 0;

        for(int i = 0; i < columns.size(); i ++) {
            textField = new JRDesignTextField();
            textField.setX(x);
            textField.setY(y);
            // ширина
            textField.setWidth(COLUMN_WIDTH);
            textField.setHeight(ROW_HEIGHT);
            expression = new JRDesignExpression();
            // селектор
            expression.setText("$F{" + columns.get(i) + "}");
            textField.setExpression(expression);
            textField.setStyle(normalStyle);
            band.addElement(textField);
            x += textField.getWidth();
        }

        // DetailsBand добавляется немного странно, да...
        ((JRDesignSection) jasperDesign.getDetailSection()).addBand(band);

        return jasperDesign;
    }
}