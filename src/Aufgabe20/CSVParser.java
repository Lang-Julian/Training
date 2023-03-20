package Aufgabe20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CSVParser<T> {

    private final Class<T> clazz;

    public CSVParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public boolean isParseable(T obj) {
        return obj != null && obj.getClass().isAnnotationPresent(CSVEntity.class);
    }

    public List<T> parse(Reader reader) throws CSVParseException {
        try {
            List<T> result = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            boolean firstLine = true;
            String[] fieldNames = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                if (firstLine) {
                    firstLine = false;
                    fieldNames = values;
                    continue;
                }
                T obj = clazz.newInstance();
                for (int i = 0; i < fieldNames.length; i++) {
                    String fieldName = fieldNames[i];
                    try {
                        Field field = clazz.getDeclaredField(fieldName);
                        if (!field.isAnnotationPresent(CSVField.class)) {
                            continue;
                        }
                        field.setAccessible(true);

                        String value = values[i];
                        Class<?> fieldType = field.getType();
                        if (fieldType.equals(String.class)) {
                            field.set(obj, value);
                        } else if (fieldType.equals(int.class) || fieldType.equals(Integer.class)) {
                            field.set(obj, Integer.parseInt(value));
                        } else if (fieldType.equals(double.class) || fieldType.equals(Double.class)) {
                            field.set(obj, Double.parseDouble(value));
                        } else if (fieldType.equals(float.class) || fieldType.equals(Float.class)) {
                            field.set(obj, Float.parseFloat(value));
                        } else if (fieldType.equals(boolean.class) || fieldType.equals(Boolean.class)) {
                            field.set(obj, Boolean.parseBoolean(value));
                        } else {
                            throw new CSVParseException("Unsupported field type: " + fieldType.getName());
                        }
                    } catch (NoSuchFieldException e) {
                        // Ignore fields that are not annotated with @CSVField
                    }
                }
                result.add(obj);
            }
            return result;
        } catch (InstantiationException | IllegalAccessException | IOException | SecurityException | IllegalArgumentException e) {
            throw new CSVParseException(e);
        }
    }

}
