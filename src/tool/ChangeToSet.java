package tool;

import com.bd.entity.ResourceKeywordEntity;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.util.HashSet;
import java.util.Set;

public class ChangeToSet extends DefaultTypeConverter {

    private static final String divider = " ";

    @Override
    public Object convertValue(Object value, Class toType) {

        if (value == null || toType != Set.class) return false;

        if (value instanceof String[]) {
            String before = ((String[]) value)[0];
            Set<ResourceKeywordEntity> set = new HashSet<ResourceKeywordEntity>();

            for (String rkstr : before.split(divider)) {
                if (rkstr.equals("")) continue;
                ResourceKeywordEntity re = new ResourceKeywordEntity();
                re.setName(rkstr);
                set.add(re);

                System.out.println("---------------------------------------------------");
                System.out.println(rkstr);
                System.out.println("---------------------------------------------------");
            }
            return (Set) set;
        }

        return true;
    }

}
