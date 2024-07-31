package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.e2 */
/* loaded from: classes.dex */
public abstract class AbstractC0616e2 {
    /* renamed from: a */
    public static AbstractC0616e2 m3040a(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        return new C0633j(size, map, size2, map2, size3, map3, map4);
    }

    /* renamed from: b */
    public abstract Size mo3041b();

    /* renamed from: c */
    public Size m3042c(int i10) {
        return mo3043d().get(Integer.valueOf(i10));
    }

    /* renamed from: d */
    public abstract Map<Integer, Size> mo3043d();

    /* renamed from: e */
    public abstract Size mo3044e();

    /* renamed from: f */
    public abstract Size mo3045f();

    /* renamed from: g */
    public Size m3046g(int i10) {
        return mo3047h().get(Integer.valueOf(i10));
    }

    /* renamed from: h */
    public abstract Map<Integer, Size> mo3047h();

    /* renamed from: i */
    public Size m3048i(int i10) {
        return mo3049j().get(Integer.valueOf(i10));
    }

    /* renamed from: j */
    public abstract Map<Integer, Size> mo3049j();

    /* renamed from: k */
    public Size m3050k(int i10) {
        return mo3051l().get(Integer.valueOf(i10));
    }

    /* renamed from: l */
    public abstract Map<Integer, Size> mo3051l();
}
