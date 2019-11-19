package tool;

import java.lang.reflect.Field;

/*
 * 通过java反射机制，改变old-new 对象值
 * ps: new 某一属性为空不变，new value not null And (old value!=new value or old value is null) change old value
 *           --by 张文
 * */
public class ChangeObject {

    public static Object change(Object newObj, Object oldObj) throws Exception {
        Field[] fields = newObj.getClass().getDeclaredFields();
        for (Field field : fields) {
            String type = field.getType().getSimpleName();
            if (type.equals("int")) {
                field.setAccessible(true);
                if (0 != (int) field.get(newObj)) {
                    field.set(oldObj, field.get(newObj));
                }
            } else if (type.equals("String") || type.equals("date")) {
                field.setAccessible(true);
                if (null != field.get(newObj)) {
                    field.set(oldObj, field.get(newObj));
                }
            }

        }
        return oldObj;
    }


}
