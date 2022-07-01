package ru.sinergy.anonymousinner;

public class GeneralIndicatorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");
    }
}
