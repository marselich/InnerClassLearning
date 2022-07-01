package ru.sinergy.anonymousinner;

public class SecurityMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}
