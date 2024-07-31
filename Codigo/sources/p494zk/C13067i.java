package p494zk;

import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7585d;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: zk.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13067i {
    /* renamed from: a */
    public static final <T> T m43211a(InterfaceC7587f interfaceC7587f, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        AbstractC13061g1 m43296a;
        C13097p1 c13097p1;
        Thread currentThread = Thread.currentThread();
        InterfaceC7585d interfaceC7585d = (InterfaceC7585d) interfaceC7587f.mo20647b(InterfaceC7585d.f17928n);
        if (interfaceC7585d == null) {
            m43296a = C13110s2.f35479a.m43297b();
            c13097p1 = C13097p1.f35472a;
            interfaceC7587f = interfaceC7587f.mo20646U(m43296a);
        } else {
            AbstractC13061g1 abstractC13061g1 = interfaceC7585d instanceof AbstractC13061g1 ? (AbstractC13061g1) interfaceC7585d : null;
            if (abstractC13061g1 != null) {
                AbstractC13061g1 abstractC13061g12 = abstractC13061g1.m43184q1() ? abstractC13061g1 : null;
                if (abstractC13061g12 != null) {
                    m43296a = abstractC13061g12;
                    c13097p1 = C13097p1.f35472a;
                }
            }
            m43296a = C13110s2.f35479a.m43296a();
            c13097p1 = C13097p1.f35472a;
        }
        C13055f c13055f = new C13055f(C13060g0.m43167e(c13097p1, interfaceC7587f), currentThread, m43296a);
        c13055f.m43032Q0(EnumC13084m0.DEFAULT, c13055f, interfaceC10002p);
        return (T) c13055f.m43159R0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m43212b(InterfaceC7587f interfaceC7587f, InterfaceC10002p interfaceC10002p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7587f = C7588g.f17931a;
        }
        return C13063h.m43189e(interfaceC7587f, interfaceC10002p);
    }
}
