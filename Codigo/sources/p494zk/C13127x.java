package p494zk;

import ck.C2029n;

/* renamed from: zk.x */
/* loaded from: classes3.dex */
public final class C13127x {
    /* renamed from: a */
    public static final <T> InterfaceC13119v<T> m43318a(InterfaceC13125w1 interfaceC13125w1) {
        return new C13123w(interfaceC13125w1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13119v m43319b(InterfaceC13125w1 interfaceC13125w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC13125w1 = null;
        }
        return m43318a(interfaceC13125w1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> boolean m43320c(InterfaceC13119v<T> interfaceC13119v, Object obj) {
        Throwable m10342d = C2029n.m10342d(obj);
        return m10342d == null ? interfaceC13119v.mo43306B(obj) : interfaceC13119v.mo43307y(m10342d);
    }
}
