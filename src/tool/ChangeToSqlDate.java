package tool;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.sql.Date;

public class ChangeToSqlDate extends DefaultTypeConverter {

    @Override
    public Object convertValue(Object value, Class toType) {

        if (value == null || toType != Date.class) return false;
        if (value instanceof String[]) {
            String before = ((String[]) (value))[0];

            try {
                return Date.valueOf(before);
            } catch (Exception se) {
                se.printStackTrace();
                return false;
            }

        }

        return false;
    }

}