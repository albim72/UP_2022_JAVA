package components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Kraków, ul.Złota 4/6 gabinet 67";
    }
    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
