package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public class n1 extends f2 {
    private n1(Map<String, Object> map) {
        super(map);
    }

    public static n1 g() {
        return new n1(new ArrayMap());
    }

    public static n1 h(f2 f2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : f2Var.e()) {
            arrayMap.put(str, f2Var.d(str));
        }
        return new n1(arrayMap);
    }

    public void f(f2 f2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f2473a;
        if (map2 == null || (map = f2Var.f2473a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f2473a.put(str, obj);
    }
}
