package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.n1 */
/* loaded from: classes.dex */
public class C0650n1 extends C0620f2 {
    private C0650n1(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: g */
    public static C0650n1 m3203g() {
        return new C0650n1(new ArrayMap());
    }

    /* renamed from: h */
    public static C0650n1 m3204h(C0620f2 c0620f2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c0620f2.m3072e()) {
            arrayMap.put(str, c0620f2.m3071d(str));
        }
        return new C0650n1(arrayMap);
    }

    /* renamed from: f */
    public void m3205f(C0620f2 c0620f2) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f2811a;
        if (map2 == null || (map = c0620f2.f2811a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* renamed from: i */
    public void m3206i(String str, Object obj) {
        this.f2811a.put(str, obj);
    }
}
