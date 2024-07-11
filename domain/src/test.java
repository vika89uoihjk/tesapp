public class test extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Creating an extended library configuration.
        AppMetricaConfig config = AppMetricaConfig.newConfigBuilder(4c5bd7fb-525b-42c4-9dfe-031105271680).build();
        // Initializing the AppMetrica SDK.
        AppMetrica.activate(this, config);
    }
}
