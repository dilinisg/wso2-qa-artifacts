package com.virtusa.isq.vtaf.runtime.pages;

/**
 *  Class APIPublisherBrowse implements corresponding UI page
 *  UI objects in the page are stored in the class.
 */

public enum APIPublisherBrowse {

        btn_Lifecycle("//a[@id='lifecyclesLink']"), ele_ddState("//select[@id='editStatus']"), lnk_Edit("link=Edit"), ele_lblPrototype("//h4[text()='Prototype']"), btn_SavePrototype("//button[@id='savePrototypeBtn']"), btn_DeployAsPrototype("//button[@id='prototyped_api']"), btn_OkDeployAsPrototype("//button[text()='OK']"), ele_lblManagedAPI("//h4[text()='Managed API']"), btn_SaveManagedAPI("//button[@id='saveBtn']"), btn_NextManage("//button[@id='go_to_manage']"), tf_ProductionEndPoint("css=input[id=\"jsonform-0-elt-production_endpoints\"]"), tf_SandBoxEndPoint("css=input[id=\"jsonform-0-elt-sandbox_endpoints\"]"), ele_ddTierAvilability("//label[contains(text(),'Tier Availability:')]/following::button"), chk_Unlimited("//label[contains(text(),'Unlimited')]"), chk_Gold("//label[contains(text(),'Gold')]"), chk_Silver("//label[contains(text(),'Silver')]"), chk_Bronze("//label[contains(text(),'Bronze')]"), btn_SaveManageAPI("//button[@id='save_api']"), btn_Add("//button[@id='add_resource']"), tf_UrlPattern("//input[@id='resource_url_pattern']"), chk_verbMethod("//input[@class='http_verb_select' and @value='<verb>']"), img_deleteIcon("//a[@data-operation='<param_verbmethodPost>' and @data-path-name='/<param_UrlPattern>']"), ele_lblVerbMethod("//td/span[contains(text(),'<verb>')]/../../td[2]/a[contains(text(),'<urlPattern>')]"), btn_Yes("//a[@class='btn btn btn-primary']"), ele_lblpopupError("//span[contains(text(),'Resource already exist for URL Pattern')]"), btn_Ok("//a[text()='OK']"), btn_Save("//button[@id='saveBtn']"), ele_ddVisibility("//select[@id='visibility']"), btn_SaveAndPublish("//a[contains(text(),'Save & Publish')]"), btn_Close("//div[@class=\"modal-header\"]/button[@class=\"close\"]"), ele_lblGeneralDetails("//legend[contains(text(),'General Details')]"), btn_NextImplement("//a[@id='go_to_implement']"), ele_ddEndpointType("//select[@id='endpoint_type']"), tf_productionEndpoint("//div/label[contains(text(),'Production Endpoint:')]/../div/div/input"), tf_sandboxEndpoint("//div/label[contains(text(),'Sandbox Endpoint:')]/../div/div/input"), tf_prototypeEndpoint("//div/label[contains(text(),'Prototype Endpoint:')]/../div/div/input"), btn_test("//input[@id='prototype_endpoint']/../button"), ele_lblInvalid("//span[contains(text(),'Invalid')]"), ele_lblValid("//span[contains(text(),'Valid')]"), lnk_ShowmoreOption("//a[contains(text(),'Show More Options')]"), ele_ddEndpointSecurityScheme("//label[contains(text(),'Endpoint Security Scheme:')]/../div/select"), ele_lbl_credentialErrorMessege("xpath=(//label[contains(text(),'This field is required.')])[1]"), tf_endpointUserName("//input[@id='epUsername']"), tf_endPointPassword("//input[@id='epPassword']"), btn_testProductionEndpoint("//input[@id='jsonform-0-elt-production_endpoints']/../button[2]"), btn_testSandBoxEndPoint("//input[@id='jsonform-0-elt-sandbox_endpoints']/../button[2]"), ele_lblSandboxEndpointValid("//span[text()='Valid']"), btn_Subscribe("//button[@id='subscribe-button']"), btn_deleteAPI("//a[contains(text(),'<APIName>')]/../button"), ele_lblAPIdeleteError("//h3[contains(text(),'API Publisher - Error')]"), lnk_Overview("//a[@id='viewLink']"), ele_lblVersionAndUser("//a[contains(text(),'<param_APIName>')]/../div[contains(text(),'<param_version>')]/a[contains(text(),'<param_creater>')]/../../a"), ele_lblUsers("//div[contains(text(),'<param_version>')]/../div[2]/a/span[contains(text(),'<param_users>')]"), ele_lblAPIStatus("//div[contains(text(),'1.0.1')]/../p[contains(text(),'<param_status>')]"), lnk_DuplicateAPI("xpath=(//a[contains(text(),'<param_APIName>')])[2]"), btn_Manage("//span[text()='Manage']"), ele_lblPopupPublisherError("//h3[contains(text(),'API Publisher - Error')]"), lnk_ChangeIcon("link=Change Icon"), btn_BrowseImage("//input[@id='apiThumb']"), ele_lblInvalidImageError("//label[@class='error']"), btn_Save1("//button[contains(text(),'Save')]"), chk_ActiveUnlimited("//li[@class='active']//input[@value='Unlimited']"), chk_ActiveGold("//li[@class='active']//input[@value='Gold']"), chk_ActiveSilver("//li[@class='active']//input[@value='Silver']"), chk_ActiveBronze("//li[@class='active']//input[@value='Bronze']"), ele_lblThisFieldisRequired("//label[contains(text(),'This field is required.')]"), tf_VisibilityToRole("//input[@id='roles']"), btn_No("//div[@id=\"messageModal\"]/div[@class=\"modal-footer\"]/a[@class=\"btn btn\"]"), lnk_ApiNameWithVersion("//a[contains(text(),'<param_APIName>')]/../div[contains(text(),'<param_APIVersion>')]/../a[contains(text(),'<param_APIName>')]"), ele_lblMore("//label[@id='more']"), lnk_ResourceLevelType("//span[contains(text(),'<param_verbMethod>')]/../../td[4]/a"), ele_ddResourseLevelType("//select[@class='input-medium']"), btn_right("//button[@class='btn btn-primary editable-submit']"), ele_lblResourceLevelType("//a[contains(text(),'<param_verbType>')]/../../td[1]/span[contains(text(),'<param_ResourceLevelType>')]"), btn_GoToOverview("//a[contains(text(),'Go to Overview')]"), ele_lblResourceLevelType1("//span[contains(text(),'<param_verbType>')]/../../td/a[contains(text(),'<param_ResourceLevelType>')]"), lnk_APIName("xpath=(//a[contains(text(),'<param_APIName>')])[1]"), ele_lblAPILifeCycleStatus("//div[contains(text(),'<param_version>')]/../p[contains(text(),'<param_status>')]"), ele_ddSubscription("//select[@id='subscriptions']"), tf_Tenantname("//input[@id='tenants']"), ele_lblEndpoints("//legend[text()='Endpoints']"), ele_lblAPIManagePopupSuccess("//label[contains(text(),'You have successfully published your API')]"), lnk_APINameMultiple("xpath=//a[contains(text(),'<param_APIName>')]");

    private String searchPath;
  
    /**
    *  Page APIPublisherBrowse.
    */
    private APIPublisherBrowse(final String psearchPath) {
        this.searchPath = psearchPath;
    }
    
    /**
     *  Get search path.
     * @param searchPath search path.
     */
    public final String getSearchPath() {
        return searchPath;
    }
}