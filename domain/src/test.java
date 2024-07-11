public class YourApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Creating an extended library configuration.
        AppMetricaConfig config = AppMetricaConfig.newConfigBuilder(API_KEY).build();
        // Initializing the AppMetrica SDK.
        AppMetrica.activate(this, config);
    }
}
