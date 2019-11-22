package tool.fastjson.filter;

import com.alibaba.fastjson.serializer.PropertyFilter;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.proxy.HibernateProxy;

public class SimpleFilter implements PropertyFilter {
    @Override
    public boolean apply(Object object, String name, Object value) {
        if (value instanceof HibernateProxy) {//hibernate代理对象
            return false;

        } else if (value instanceof PersistentCollection) {//实体关联集合一对多等
            PersistentCollection collection = (PersistentCollection) value;
            if (!collection.wasInitialized()) {
                return false;
            }
            Object val = collection.getValue();
            if (val == null) {
                return false;
            }
        }
        return true;
    }
}
