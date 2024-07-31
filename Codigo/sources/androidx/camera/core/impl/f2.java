package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f2 {

    /* renamed from: b, reason: collision with root package name */
    private static final f2 f2472b = new f2(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    protected final Map<String, Object> f2473a;

    /* JADX INFO: Access modifiers changed from: protected */
    public f2(Map<String, Object> map) {
        this.f2473a = map;
    }

    public static f2 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new f2(arrayMap);
    }

    public static f2 b() {
        return f2472b;
    }

    public static f2 c(f2 f2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : f2Var.e()) {
            arrayMap.put(str, f2Var.d(str));
        }
        return new f2(arrayMap);
    }

    public Object d(String str) {
        return this.f2473a.get(str);
    }

    public Set<String> e() {
        return this.f2473a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
