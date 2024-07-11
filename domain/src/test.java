public class test extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Creating an extended library configuration.
        AppMetricaConfig config = AppMetricaConfig.newConfigBuilder(6aede49e-85f6-4a86-bd17-94346a089ad2).build();
        // Initializing the AppMetrica SDK.
        AppMetrica.activate(this, config);
    }
}
