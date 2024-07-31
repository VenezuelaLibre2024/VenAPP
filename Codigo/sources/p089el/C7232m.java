package p089el;

import ck.C2029n;
import ck.C2030o;

/* renamed from: el.m */
/* loaded from: classes3.dex */
public final class C7232m {

    /* renamed from: a */
    private static final boolean f16212a;

    static {
        Object m10340b;
        try {
            C2029n.a aVar = C2029n.f8078b;
            m10340b = C2029n.m10340b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C2029n.a aVar2 = C2029n.f8078b;
            m10340b = C2029n.m10340b(C2030o.m10348a(th2));
        }
        f16212a = C2029n.m10345g(m10340b);
    }

    /* renamed from: a */
    public static final boolean m21616a() {
        return f16212a;
    }
}
