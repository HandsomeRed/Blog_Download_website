package tool.fastjson.filter;

import com.alibaba.fastjson.serializer.PropertyFilter;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.proxy.HibernateProxy;

public class SimpleFilter implements PropertyFilter {
    @Override
    public boolean apply(Object object, String name, Object value) {
        if (value instanceof HibernateProxy) {//hibernate�������
            return false;

        } else if (value instanceof PersistentCollection) {//ʵ���������һ�Զ��
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
