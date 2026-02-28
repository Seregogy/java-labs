interface Converter {
    float convert(float tempCelsius);
    String getUnits();
}

class Fahrenheit implements Converter {
    @Override
    public float convert(float tempCelsius) { return tempCelsius * 1.8f + 32f; }

    @Override
    public String getUnits() { return "F"; }
}

class Kelvin implements Converter {
    @Override
    public float convert(float tempCelsius) { return tempCelsius + 279.15f; }

    @Override
    public String getUnits() { return "K"; }
}

class ConverterDemo {
    float value;

    public ConverterDemo(float value) {
        this.value = value;
    }

    public void convert(Converter converter) {
        System.out.printf("Результат %s %.2f%n", converter.getUnits(), converter.convert(value));
    }
}
