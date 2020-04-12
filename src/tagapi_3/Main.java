package tagapi_3;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        tagapi_3.API_Interface API = new tagapi_3.API_Interface();
        API.downloadVersionManifest();
        for (Object object : API.getInstallableVersionsList()) {
            System.out.println(object);
        }
        API.downloadMinecraft("1.12.2", false);
    API.runMinecraft("jevo", "1.12.2", Boolean.FALSE, Boolean.TRUE);
    }
}
