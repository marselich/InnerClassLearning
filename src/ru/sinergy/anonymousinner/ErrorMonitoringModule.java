package ru.sinergy.anonymousinner;

public class ErrorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг ошибок стартовал!");
    }
}
