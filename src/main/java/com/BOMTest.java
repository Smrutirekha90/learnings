package com;

import java.io.*;

public class BOMTest {

    static  String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:sh=\"http://wsi.nat.bt.com/2005/06/StandardHeader/\">\n" +
            "\t<SOAP-ENV:Body>\n" +
            "\t\t<createTaskRequest xsi:schemaLocation=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30\" xmlns=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30\" xmlns:S14=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Activities\" xmlns:S31=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Agreements\" xmlns:S57=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/BaseTypes\" xmlns:S44=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/CoreClasses/Specifications\" xmlns:S32=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/HR\" xmlns:S48=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Incidents\" xmlns:S37=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Interaction\" xmlns:S53=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/MTOSI\" xmlns:S23=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/MTOSI/Enums\" xmlns:S47=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/MTOSI/Structs\" xmlns:S41=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/OperationalAnalysis\" xmlns:S15=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Parties\" xmlns:S45=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Parties/PartyRoles/Customer\" xmlns:S3=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Places\" xmlns:S59=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTaelfDoaiNdicatorsk/2008/06/30/CCM/AmendTaskRequest/Portfolio\" xmlns:S12=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Resources\" xmlns:S21=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Scheduling\" xmlns:S40=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Services\" xmlns:S18=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskRequest/Users\" xmlns:S5=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/AmendTaskResponse/Activities\" xmlns:S42=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CancelTaskRequest/Activities\" xmlns:S38=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CancelTaskRequest/CoreClasses/Specifications\" xmlns:S26=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CancelTaskRequest/Incidents\" xmlns:S61=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CancelTaskRequest/Portfolio\" xmlns:S43=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CancelTaskResponse/Activities\" xmlns:S2=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Activities\" xmlns:S52=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Agreements\" xmlns:S10=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/BaseTypes\" xmlns:S51=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/CoreClasses/Specifications\" xmlns:S33=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/HR\" xmlns:S4=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Incidents\" xmlns:S9=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Interaction\" xmlns:S35=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/MTOSI\" xmlns:S29=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/MTOSI/Enums\" xmlns:S56=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/MTOSI/Structs\" xmlns:S28=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/OperationalAnalysis\" xmlns:S24=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Parties\" xmlns:S7=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Parties/PartyRoles/Customer\" xmlns:S54=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Places\" xmlns:S22=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Portfolio\" xmlns:S30=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Resources\" xmlns:S13=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Scheduling\" xmlns:S11=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Services\" xmlns:S17=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskRequest/Users\" xmlns:S20=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskResponse/Activities\" xmlns:S46=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskResponse/HR\" xmlns:S25=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/CreateTaskResponse/Parties\" xmlns:S60=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Activities\" xmlns:S62=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/BaseTypes\" xmlns:S8=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/CoreClasses/Specifications\" xmlns:S27=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/HR\" xmlns:S19=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Incidents\" xmlns:S55=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/MTOSI\" xmlns:S34=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/MTOSI/Enums\" xmlns:S16=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/MTOSI/Structs\" xmlns:S36=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Parties\" xmlns:S49=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Places\" xmlns:S6=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Portfolio\" xmlns:S58=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Resources\" xmlns:S39=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationRequest/Services\" xmlns:S50=\"http://capabilities.nat.bt.com/xsd/ManageEngineeringTask/2008/06/30/CCM/UpdateTaskNotificationResponse/Activities\" xmlns:ns1=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" xmlns:header=\"http://wsi.nat.bt.com/2005/06/StandardHeader/\">\n" +
            "\t\t\t<sh:standardHeader>\n" +
            "\t\t\t\t<sh:e2e>\n" +
            "\t\t\t\t\t<sh:E2EDATA>E2E.graphID=1,E2E.from=ORESB,E2E.to=METask,E2E.compTxnID=3p68cleelb,E2E.busProcID=AF-AI-1817799,E2E.busProcType=ManageEngineeringTask,E2E.busTxnSeq=3p68cldc94,E2E.threadID=3p68clef3q,E2E.busTxnSys=ORESB,E2E.busTxnHdr=PCK002069,E2E.busProcOriginator=ORESB,E2E.busTxnUsr=oesbba09,E2E.busTxnLoc=UNKNOWN,E2E.threadID.2=APP10639:3p68cldc4e:3p68clef3q,E2E.threadID.1=:</sh:E2EDATA>\n" +
            "\t\t\t\t</sh:e2e>\n" +
            "\t\t\t\t<sh:serviceState>\n" +
            "\t\t\t\t\t<sh:stateCode>OK</sh:stateCode>\n" +
            "\t\t\t\t</sh:serviceState>\n" +
            "\t\t\t\t<sh:serviceAddressing>\n" +
            "\t\t\t\t\t<sh:from>http://ccm.intra.bt.com/autofix</sh:from>\n" +
            "\t\t\t\t\t<sh:to>\n" +
            "\t\t\t\t\t\t<sh:address>http://ccm.intra.bt.com/METsk</sh:address>\n" +
            "\n" +
            "\t\t\t\t\t</sh:to>\n" +
            "\t\t\t\t\t<sh:replyTo>\n" +
            "\t\t\t\t\t\t<sh:address>http://ccm.intra.bt.com/autofix</sh:address>\n" +
            "\t\t\t\t\t\t<sh:contextItemList>\n" +
            "\t\t\t\t\t\t\t<sh:contextItem contextId=\"http://ccm.intra.bt.com/autofix\" contextName=\"instanceId\">C7</sh:contextItem>\n" +
            "\t\t\t\t\t\t\t<sh:contextItem contextId=\"http://ccm.intra.bt.com/autofix\" contextName=\"taskIdentifier\">AF-AI-1817799</sh:contextItem>\n" +
            "\t\t\t\t\t\t\t<sh:contextItem contextId=\"http://ccm.intra.bt.com/autofix\" contextName=\"procInstObjId\">AF-WM-1817797</sh:contextItem>\n" +
            "\t\t\t\t\t\t\t<sh:contextItem contextId=\"http://ccm.intra.bt.com/autofix\" contextName=\"serviceType\">SOGEAR</sh:contextItem>\n" +
            "\t\t\t\t\t\t\t<sh:contextItem contextId=\"http://ccm.intra.bt.com/autofix\" contextName=\"rqstInstObjId\"/>\n" +
            "\n" +
            "\t\t\t\t\t\t</sh:contextItemList>\n" +
            "\t\t\t\t\t</sh:replyTo>\n" +
            "\t\t\t\t\t<sh:messageId>AF-WM-1817797</sh:messageId>\n" +
            "\t\t\t\t\t<sh:serviceName>http://capabilities.nat.bt.com/ManageEngineeringTask</sh:serviceName>\n" +
            "\t\t\t\t\t<sh:action>http://capabilities.intra.bt.com/ManageEngineeringTask#CreateTaskRequest</sh:action>\n" +
            "\t\t\t\t</sh:serviceAddressing>\n" +
            "\t\t\t\t<sh:serviceSpecification>\n" +
            "\t\t\t\t\t<sh:payloadFormat>XML</sh:payloadFormat>\n" +
            "\t\t\t\t\t<sh:version>1.0</sh:version>\n" +
            "\t\t\t\t\t<sh:revision>0</sh:revision>\n" +
            "\t\t\t\t</sh:serviceSpecification>\n" +
            "\t\t\t</sh:standardHeader>\n" +
            "\n" +
            "\t\t\t<task>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:secondaryCommitmentLatestFinish>18/11/2016 23:59:59</S2:secondaryCommitmentLatestFinish>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:responseIndicator>SH02</S2:responseIndicator>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:cpName>TAG CP2</S2:cpName>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:workLocationQualifier>C</S2:workLocationQualifier>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:jIN>\n" +
            "\t\t\t\t\t<S2:name>TASKIDENTIFIER</S2:name>\n" +
            "\t\t\t\t\t<S2:value>AF-AI-1817799</S2:value>\n" +
            "\t\t\t\t</S2:jIN>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:associateTask>\n" +
            "\t\t\t\t\t<S2:name>DUMMYTASKID</S2:name>\n" +
            "\t\t\t\t\t<S2:value>000004336</S2:value>\n" +
            "\t\t\t\t</S2:associateTask>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:associateTask>\n" +
            "\t\t\t\t\t<S2:name>CPFAULTREFERENCE</S2:name>\n" +
            "\t\t\t\t\t<S2:value>sogea_vvdds</S2:value>\n" +
            "\t\t\t\t</S2:associateTask>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:associateTask>\n" +
            "\t\t\t\t\t<S2:name>ORFAULTREFERENCE</S2:name>\n" +
            "\t\t\t\t\t<S2:value>1-98663581018</S2:value>\n" +
            "\t\t\t\t</S2:associateTask>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:associateTask>\n" +
            "\t\t\t\t\t<S2:name>NEOARID</S2:name>\n" +
            "\t\t\t\t\t<S2:value>AF-AR-1817790</S2:value>\n" +
            "\t\t\t\t</S2:associateTask>\n" +
            "\n" +
            "\t\t\t\t<S2:taskCategory>\n" +
            "\t\t\t\t\t<S2:name>ASSURANCE</S2:name>\n" +
            "\t\t\t\t</S2:taskCategory>\n" +
            "\n" +
            "\t\t\t\t<S2:problem>\n" +
            "\n" +
            "\t\t\t\t\t<S4:problemReportCode>CPB</S4:problemReportCode>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S4:mainproblemLocation>CA</S4:mainproblemLocation>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S4:problemCategory>\n" +
            "\t\t\t\t\t\t<S4:productType>SOGEAR</S4:productType>\n" +
            "\t\t\t\t\t</S4:problemCategory>\n" +
            "\t\t\t\t\t<S4:fault>\n" +
            "\n" +
            "\t\t\t\t\t\t<S4:dateTimeRaised>18/11/2016 07:57:53</S4:dateTimeRaised>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t</S4:fault>\n" +
            "\t\t\t\t</S2:problem>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:careLevel>\n" +
            "\n" +
            "\t\t\t\t\t<S52:name>2</S52:name>\n" +
            "\n" +
            "\t\t\t\t</S2:careLevel>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskNote>\n" +
            "\t\t\t\t\t<S2:name>ACCESS</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[test]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskNote>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskNote>\n" +
            "\t\t\t\t\t<S2:name>TECHNICAL</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[Downstream Speed should be greater than 40Mbit/s;Upstream Speed should be greater than 40Mbit/s;\n" +
            "TR Description by CP: test\n" +
            "null]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskNote>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskNote>\n" +
            "\t\t\t\t\t<S2:name>HAZARD</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[test ]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskNote>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskNote>\n" +
            "\t\t\t\t\t<S2:name>GENERAL</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[test Fault Reported By:SANTOSH GAIKWAD Tie Cable:\n" +
            "End User Disconnected: End User Name: test \n" +
            "End User Tel:9856325478\n" +
            "Reference: 33FAD38FR\n" +
            "TCD History\n" +
            " CP Technician contact details for Co-op: Date Time:  Contact Name:  Telephone Number:  Location:  Email :  Notes : ]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskNote>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskNote>\n" +
            "\t\t\t\t\t<S2:name>TASK</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[Fault report is identified as Early Life Failure (ELF)]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskNote>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskRole>\n" +
            "\t\t\t\t\t<S2:name>LOB</S2:name>\n" +
            "\t\t\t\t\t<S2:value>Openreach</S2:value>\n" +
            "\t\t\t\t</S2:taskRole>\n" +
            "\n" +
            "\t\t\t\t<S2:taskRole>\n" +
            "\t\t\t\t\t<S2:name>RETAILERID</S2:name>\n" +
            "\t\t\t\t\t<S2:value>DMA</S2:value>\n" +
            "\t\t\t\t</S2:taskRole>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskRole>\n" +
            "\t\t\t\t\t<S2:name>RETAILERNAME</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[DUMMY1]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskRole>\n" +
            "\n" +
            "\t\t\t\t<S2:appointment>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S13:appointmentSlot>\n" +
            "\n" +
            "\t\t\t\t\t\t<S13:startDate>18/11/2016 08:00:00</S13:startDate>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t<S13:value>AM</S13:value>\n" +
            "\n" +
            "\t\t\t\t\t</S13:appointmentSlot>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S13:party>\n" +
            "\t\t\t\t\t\t<S24:contactDetails>\n" +
            "\t\t\t\t\t\t\t<S24:person>\n" +
            "\t\t\t\t\t\t\t\t<S24:personName>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<S24:forename>\n" +
            "\t\t\t\t\t\t\t\t\t\t<![CDATA[SANTOSH]]>\n" +
            "\t\t\t\t\t\t\t\t\t</S24:forename>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<S24:surname>\n" +
            "\t\t\t\t\t\t\t\t\t\t<![CDATA[GAIKWAD]]>\n" +
            "\t\t\t\t\t\t\t\t\t</S24:surname>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t</S24:personName>\n" +
            "\t\t\t\t\t\t\t</S24:person>\n" +
            "\n" +
            "\t\t\t\t\t\t\t<S24:phoneNumber>\n" +
            "\t\t\t\t\t\t\t\t<S24:phoneNumber>+4407845123265</S24:phoneNumber>\n" +
            "\t\t\t\t\t\t\t</S24:phoneNumber>\n" +
            "\n" +
            "\t\t\t\t\t\t</S24:contactDetails>\n" +
            "\t\t\t\t\t</S13:party>\n" +
            "\t\t\t\t</S2:appointment>\n" +
            "\t\t\t\t<S2:managedElement>\n" +
            "\n" +
            "\t\t\t\t\t<S35:equipmentHolder>\n" +
            "\t\t\t\t\t\t<S35:location>\n" +
            "\t\t\t\t\t\t\t<S54:accessFor24hr>false</S54:accessFor24hr>\n" +
            "\n" +
            "\t\t\t\t\t\t\t<S54:addressIdentifier>\n" +
            "\t\t\t\t\t\t\t\t<S54:name>NAD_KEY</S54:name>\n" +
            "\t\t\t\t\t\t\t\t<S54:value>A00992939442</S54:value>\n" +
            "\t\t\t\t\t\t\t</S54:addressIdentifier>\n" +
            "\n" +
            "\t\t\t\t\t\t</S35:location>\n" +
            "\t\t\t\t\t</S35:equipmentHolder>\n" +
            "\t\t\t\t</S2:managedElement>\n" +
            "\t\t\t\t<S2:testInstance>\n" +
            "\n" +
            "\t\t\t\t\t<S28:testInstanceIdentifier>\n" +
            "\t\t\t\t\t\t<S28:name>TESTID</S28:name>\n" +
            "\t\t\t\t\t\t<S28:value>1526834041</S28:value>\n" +
            "\n" +
            "\t\t\t\t\t</S28:testInstanceIdentifier>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S28:testPerformer>\n" +
            "\t\t\t\t\t\t<S28:tarrId>or_nga_apl10429baapp01</S28:tarrId>\n" +
            "\n" +
            "\t\t\t\t\t</S28:testPerformer>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t</S2:testInstance>\n" +
            "\t\t\t\t<S2:siteContact>\n" +
            "\n" +
            "\t\t\t\t\t<S7:customerSite>\n" +
            "\t\t\t\t\t\t<S7:customerContact>\n" +
            "\t\t\t\t\t\t\t<S7:contactDetails>\n" +
            "\t\t\t\t\t\t\t\t<S24:person>\n" +
            "\t\t\t\t\t\t\t\t\t<S24:personName>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t<S24:forename>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<![CDATA[test]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t</S24:forename>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t</S24:personName>\n" +
            "\t\t\t\t\t\t\t\t</S24:person>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t<S24:phoneNumber>\n" +
            "\t\t\t\t\t\t\t\t\t<S24:phoneNumber>9856325478</S24:phoneNumber>\n" +
            "\t\t\t\t\t\t\t\t</S24:phoneNumber>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t<S24:mobilePhoneNumber>\n" +
            "\t\t\t\t\t\t\t\t\t<S24:mobileNumber>7845215478</S24:mobileNumber>\n" +
            "\t\t\t\t\t\t\t\t</S24:mobilePhoneNumber>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t<S24:address>\n" +
            "\t\t\t\t\t\t\t\t\t<S54:welshPostalAddress>\n" +
            "\t\t\t\t\t\t\t\t\t\t<S54:uKPostalAddress>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<S54:thoroughfareNumber>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<![CDATA[79417]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</S54:thoroughfareNumber>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<S54:thoroughfareName>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<![CDATA[Edmonton Street]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</S54:thoroughfareName>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<S54:postTown>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<![CDATA[Rington]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</S54:postTown>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<S54:county>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<![CDATA[Ringshire]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</S54:county>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<S54:postCode>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<![CDATA[RG1 1EB]]>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</S54:postCode>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t</S54:uKPostalAddress>\n" +
            "\t\t\t\t\t\t\t\t\t</S54:welshPostalAddress>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t</S24:address>\n" +
            "\t\t\t\t\t\t\t</S7:contactDetails>\n" +
            "\t\t\t\t\t\t</S7:customerContact>\n" +
            "\n" +
            "\t\t\t\t\t</S7:customerSite>\n" +
            "\t\t\t\t</S2:siteContact>\n" +
            "\t\t\t\t<S2:locationReferenceData>\n" +
            "\n" +
            "\t\t\t\t\t<S54:exchangeGroupCode>EDM</S54:exchangeGroupCode>\n" +
            "\n" +
            "\t\t\t\t</S2:locationReferenceData>\n" +
            "\t\t\t\t<S2:productInstance>\n" +
            "\t\t\t\t\t<S22:productSpecification>\n" +
            "\n" +
            "\t\t\t\t\t\t<S22:serviceSpecification>\n" +
            "\t\t\t\t\t\t\t<S11:id>SGEA00857788</S11:id>\n" +
            "\t\t\t\t\t\t</S22:serviceSpecification>\n" +
            "\n" +
            "\t\t\t\t\t\t<S22:productSpecIdentification>\n" +
            "\t\t\t\t\t\t\t<S22:id>IDS</S22:id>\n" +
            "\t\t\t\t\t\t</S22:productSpecIdentification>\n" +
            "\n" +
            "\t\t\t\t\t</S22:productSpecification>\n" +
            "\t\t\t\t</S2:productInstance>\n" +
            "\n" +
            "\t\t\t\t<S2:serviceInstance>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S11:definitelyAffectedFlag>true</S11:definitelyAffectedFlag>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t</S2:serviceInstance>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>JOBTYPEID</S2:name>\n" +
            "\t\t\t\t\t<S2:value>R1CASGEA</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>CSSDBID</S2:name>\n" +
            "\t\t\t\t\t<S2:value>ES</S2:value>\n" +
            "\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>CUSTOMERPRODUCTQUANTITY</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[1]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>CUSTOMERPRODUCTSHORTDESCRIPTION</S2:name>\n" +
            "\t\t\t\t\t<S2:value>Exchange Line + NTE</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>CUSTOMERPRODUCTGROUP</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[ELS]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>PROPOSEDIND</S2:name>\n" +
            "\t\t\t\t\t<S2:value>E</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>EQPANDLLFDETAILS</S2:name>\n" +
            "\t\t\t\t\t<S2:value>\n" +
            "\t\t\t\t\t\t<![CDATA[FC]]>\n" +
            "\t\t\t\t\t</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>TECHNOLOGYTYPE</S2:name>\n" +
            "\t\t\t\t\t<S2:value>VDSL</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>RangeBBottomDownstreamDataBandwidth</S2:name>\n" +
            "\t\t\t\t\t<S2:value>40Mbit/s</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>RangeBBottomUpstreamDataBandwidth</S2:name>\n" +
            "\t\t\t\t\t<S2:value>40Mbit/s</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>DOWNSTREAMDATABANDWIDTH</S2:name>\n" +
            "\t\t\t\t\t<S2:value>40Mbit/s</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharacteristic>\n" +
            "\t\t\t\t\t<S2:name>UPSTREAMDATABANDWIDTH</S2:name>\n" +
            "\t\t\t\t\t<S2:value>2Mbit/s</S2:value>\n" +
            "\t\t\t\t</S2:taskCharacteristic>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskInstallation>\n" +
            "\t\t\t\t\t<S2:id>FBES0001043</S2:id>\n" +
            "\t\t\t\t</S2:taskInstallation>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t<S2:taskCharge>\n" +
            "\t\t\t\t\t<S2:personInformedOnCharges>Y</S2:personInformedOnCharges>\n" +
            "\n" +
            "\t\t\t\t\t<S2:taskChargeCharacteristic>\n" +
            "\t\t\t\t\t\t<S2:name>AUTHORISATIONBANDHOURS</S2:name>\n" +
            "\t\t\t\t\t\t<S2:value>0000</S2:value>\n" +
            "\t\t\t\t\t</S2:taskChargeCharacteristic>\n" +
            "\t\t\t\t\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t<S2:taskChargeCharacteristic>\n" +
            "\t\t\t\t\t\t<S2:name>BANDINGREVISIONALLOWED</S2:name>\n" +
            "\t\t\t\t\t\t<S2:value>true</S2:value>\n" +
            "\t\t\t\t\t</S2:taskChargeCharacteristic>\n" +
            "\n" +
            "\n" +
            "\t\t\t\t</S2:taskCharge>\n" +
            "\t\t\t\t<S2:provisionfaultfulfilmentDate>18/11/2016 00:00:00</S2:provisionfaultfulfilmentDate>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t</task>\n" +
            "\t\t</createTaskRequest>\n" +
            "\t</SOAP-ENV:Body>\n" +
            "</SOAP-ENV:Envelope>";
    public static final String UTF8_BOM = "\uFEFF";

    private static String removeUTF8BOM(String s) {
        if (s.startsWith(UTF8_BOM)) {
            s = s.substring(1);
            System.out.println("BOM Present");
        }
        return s;
    }
   public static void main(String[] args) throws IOException {
       String withOutBOM = removeUTF8BOM(xml);
       System.out.println("Without BOM :: "+withOutBOM);

   }
}
