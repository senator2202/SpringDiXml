package com.kharitonov.di;

public class MainWindow {
    private MainWindow() {}

    private static class MainWindowHolder {
        static final MainWindow INSTANCE = new MainWindow();
    }

    public static MainWindow getInstance() {
        return MainWindowHolder.INSTANCE;
    }

    public void show() {
        System.out.println("show main window");
    }

    public void openConnection() {
        System.out.println("connection opened");
    }

    private void closeConnection() {
        System.out.println("connection closed");
    }
}
