package interfaces;
import org.courierdost.TestUtils.AndroidBaseTest;
import org.courierdost.TestUtils.IOSBaseTest;
import org.courierdost.pageObjects.android.*;
import org.courierdost.pageObjects.ios.AlertViews;
import org.courierdost.pageObjects.ios.HomePage;
import org.courierdost.utils.*;


public interface ClassObjects {
AndroidBaseTest apkBase = new AndroidBaseTest();
IOSBaseTest iosBase = new IOSBaseTest();
FormPage formPageObj = new FormPage(null); 
HomePage homePageObj = new HomePage(null);
AlertViews alertViewsObj = new AlertViews(null);
AndroidActions apkActions = new AndroidActions(null);
IOSActions iosActions = new IOSActions(null);
}
