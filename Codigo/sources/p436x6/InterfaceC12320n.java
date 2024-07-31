package p436x6;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p414w6.InterfaceC12077b;
import p436x6.InterfaceC12329u;

/* renamed from: x6.n */
/* loaded from: classes.dex */
public interface InterfaceC12320n {

    /* renamed from: x6.n$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: a */
        public final int f33062a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f33062a = i10;
        }
    }

    /* renamed from: b */
    static void m39850b(InterfaceC12320n interfaceC12320n, InterfaceC12320n interfaceC12320n2) {
        if (interfaceC12320n == interfaceC12320n2) {
            return;
        }
        if (interfaceC12320n2 != null) {
            interfaceC12320n2.mo39703g(null);
        }
        if (interfaceC12320n != null) {
            interfaceC12320n.mo39700d(null);
        }
    }

    /* renamed from: a */
    a mo39698a();

    /* renamed from: c */
    UUID mo39699c();

    /* renamed from: d */
    void mo39700d(InterfaceC12329u.a aVar);

    /* renamed from: e */
    default boolean mo39701e() {
        return false;
    }

    /* renamed from: f */
    InterfaceC12077b mo39702f();

    /* renamed from: g */
    void mo39703g(InterfaceC12329u.a aVar);

    int getState();

    /* renamed from: h */
    Map<String, String> mo39704h();

    /* renamed from: i */
    boolean mo39705i(String str);
}
