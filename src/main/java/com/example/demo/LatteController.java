package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.DecimalFormat;

public class LatteController {
    @FXML
    private TextField calcPrice;

    @FXML
    private ToggleGroup fromPrice;

    @FXML
    private ToggleGroup toPrice;

    @FXML
    private TextField enteredAmount;

    private double convertUSD(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "CAN" -> result = amount * (1.37709);
            case "MEX" -> result = amount * (16.6391);
            case "CHINA" -> result = amount * (7.23508);
            case "FRANCE" -> result = amount * (.93958);
            case "JAPAN" -> result = amount * (153.273);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    private double convertCAN(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "US" -> result = amount * (.72599);
            case "MEX" -> result = amount * (12.0798);
            case "CHINA" -> result = amount * (5.25256);
            case "FRANCE" -> result = amount * (.68212);
            case "JAPAN" -> result = amount * (111.274);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    private double convertMEX(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "CAN" -> result = amount * (.08272);
            case "US" -> result = amount * (.06007);
            case "CHINA" -> result = amount * (.43461);
            case "FRANCE" -> result = amount * (.05644);
            case "JAPAN" -> result = amount * (9.20704);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    private double convertCHINA(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "CAN" -> result = amount * (.19021);
            case "MEX" -> result = amount * (2.29827);
            case "US" -> result = amount * (.13812);
            case "FRANCE" -> result = amount * (.12978);
            case "JAPAN" -> result = amount * (21.1708);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    private double convertFRANCE(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "CAN" -> result = amount * (1.46533);
            case "MEX" -> result = amount * (17.7053);
            case "CHINA" -> result = amount * (7.69868);
            case "US" -> result = amount * (1.06408);
            case "JAPAN" -> result = amount * (163.071);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    private double convertJAPAN(String countryName) {
        double amount = Double.parseDouble(enteredAmount.getText());
        double result = 0.0;
        switch (countryName) {
            case "CAN" -> result = amount * (.00898);
            case "MEX" -> result = amount * (.10852);
            case "CHINA" -> result = amount * (.04719);
            case "FRANCE" -> result = amount * (.00613);
            case "US" -> result = amount * (.00652);
            default -> result = amount;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result));
    }
    // Method to calculate the price based on selected radio buttons

    @FXML
    protected void onCalcButtonClick() {
        RadioButton fromSelected = (RadioButton) fromPrice.getSelectedToggle();
        RadioButton toSelected = (RadioButton) toPrice.getSelectedToggle();

        double result = 0.0; // Default value

        if (fromSelected != null && toSelected != null && !enteredAmount.getText().isEmpty()) {
            String fromCurrency = fromSelected.getText();
            String toCurrency = toSelected.getText();

            if (fromCurrency.equals("US")) {
                switch (toCurrency) {
                    case "CAN" -> result = convertUSD(toCurrency);
                    case "MEX" -> result = convertUSD(toCurrency);
                    case "CHINA" -> result = convertUSD(toCurrency);
                    case "FRANCE" -> result = convertUSD(toCurrency);
                    case "JAPAN" -> result = convertUSD(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
            if (fromCurrency.equals("CAN")) {
                switch (toCurrency) {
                    case "US" -> result = convertCAN(toCurrency);
                    case "MEX" -> result = convertCAN(toCurrency);
                    case "CHINA" -> result = convertCAN(toCurrency);
                    case "FRANCE" -> result = convertCAN(toCurrency);
                    case "JAPAN" -> result = convertCAN(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
            if (fromCurrency.equals("MEX")) {
                switch (toCurrency) {
                    case "CAN" -> result = convertMEX(toCurrency);
                    case "US" -> result = convertMEX(toCurrency);
                    case "CHINA" -> result = convertMEX(toCurrency);
                    case "FRANCE" -> result = convertMEX(toCurrency);
                    case "JAPAN" -> result = convertMEX(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
            if (fromCurrency.equals("CHINA")) {
                switch (toCurrency) {
                    case "CAN" -> result = convertCHINA(toCurrency);
                    case "MEX" -> result = convertCHINA(toCurrency);
                    case "US" -> result = convertCHINA(toCurrency);
                    case "FRANCE" -> result = convertCHINA(toCurrency);
                    case "JAPAN" -> result = convertCHINA(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
            if (fromCurrency.equals("FRANCE")) {
                switch (toCurrency) {
                    case "CAN" -> result = convertFRANCE(toCurrency);
                    case "MEX" -> result = convertFRANCE(toCurrency);
                    case "CHINA" -> result = convertFRANCE(toCurrency);
                    case "US" -> result = convertFRANCE(toCurrency);
                    case "JAPAN" -> result = convertFRANCE(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
            if (fromCurrency.equals("JAPAN")) {
                switch (toCurrency) {
                    case "CAN" -> result = convertJAPAN(toCurrency);
                    case "MEX" -> result = convertJAPAN(toCurrency);
                    case "CHINA" -> result = convertJAPAN(toCurrency);
                    case "FRANCE" -> result = convertJAPAN(toCurrency);
                    case "US" -> result = convertJAPAN(toCurrency);
                    default -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Warning");
                        alert.setHeaderText("FROM and TO selections are the same.");
                        alert.setContentText("Please change currency selections so they are different.");
                        alert.showAndWait();
                    }
                }
            }
        }
        if (enteredAmount.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Please enter an amount to convert.");
            alert.showAndWait();
        } else {
            calcPrice.setText(String.valueOf(result));
        }

    }

}