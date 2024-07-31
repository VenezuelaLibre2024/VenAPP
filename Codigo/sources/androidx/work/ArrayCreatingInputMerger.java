package androidx.work;

import androidx.work.b;
import f2.g;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends g {
    private final Object c(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newArray, 0, length);
        Array.set(newArray, length, obj2);
        n.d(newArray, "newArray");
        return newArray;
    }

    private final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        n.b(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newArray, 0, length);
        System.arraycopy(obj2, 0, newArray, length, length2);
        n.d(newArray, "newArray");
        return newArray;
    }

    private final Object e(Object obj, Class<?> cls) {
        Object newArray = Array.newInstance(cls, 1);
        Array.set(newArray, 0, obj);
        n.d(newArray, "newArray");
        return newArray;
    }

    @Override // f2.g
    public b b(List<b> inputs) {
        n.e(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator<b> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> j10 = it.next().j();
            n.d(j10, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : j10.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                n.d(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (n.a(cls2, cls)) {
                        n.d(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!n.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                n.d(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        aVar.d(hashMap);
        b a10 = aVar.a();
        n.d(a10, "output.build()");
        return a10;
    }
}
