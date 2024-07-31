package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.f2 */
/* loaded from: classes.dex */
public class C0620f2 {

    /* renamed from: b */
    private static final C0620f2 f2810b = new C0620f2(new ArrayMap());

    /* renamed from: a */
    protected final Map<String, Object> f2811a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0620f2(Map<String, Object> map) {
        this.f2811a = map;
    }

    /* renamed from: a */
    public static C0620f2 m3068a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new C0620f2(arrayMap);
    }

    /* renamed from: b */
    public static C0620f2 m3069b() {
        return f2810b;
    }

    /* renamed from: c */
    public static C0620f2 m3070c(C0620f2 c0620f2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c0620f2.m3072e()) {
            arrayMap.put(str, c0620f2.m3071d(str));
        }
        return new C0620f2(arrayMap);
    }

    /* renamed from: d */
    public Object m3071d(String str) {
        return this.f2811a.get(str);
    }

    /* renamed from: e */
    public Set<String> m3072e() {
        return this.f2811a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
