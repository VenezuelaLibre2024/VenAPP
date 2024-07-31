package p494zk;

import ck.C2037v;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9322n;
import p089el.C7215d0;
import p089el.C7231l0;
import p110fl.C7373a;
import p110fl.C7374b;
import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7585d;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: zk.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13071j {
    /* renamed from: a */
    public static final <T> InterfaceC13104r0<T> m43215a(InterfaceC13076k0 interfaceC13076k0, InterfaceC7587f interfaceC7587f, EnumC13084m0 enumC13084m0, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        InterfaceC7587f m43167e = C13060g0.m43167e(interfaceC13076k0, interfaceC7587f);
        C13108s0 c13058f2 = enumC13084m0.m43238i() ? new C13058f2(m43167e, interfaceC10002p) : new C13108s0(m43167e, true);
        ((AbstractC13032a) c13058f2).m43032Q0(enumC13084m0, c13058f2, interfaceC10002p);
        return (InterfaceC13104r0<T>) c13058f2;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13104r0 m43216b(InterfaceC13076k0 interfaceC13076k0, InterfaceC7587f interfaceC7587f, EnumC13084m0 enumC13084m0, InterfaceC10002p interfaceC10002p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7587f = C7588g.f17931a;
        }
        if ((i10 & 2) != 0) {
            enumC13084m0 = EnumC13084m0.DEFAULT;
        }
        return C13063h.m43185a(interfaceC13076k0, interfaceC7587f, enumC13084m0, interfaceC10002p);
    }

    /* renamed from: c */
    public static final InterfaceC13125w1 m43217c(InterfaceC13076k0 interfaceC13076k0, InterfaceC7587f interfaceC7587f, EnumC13084m0 enumC13084m0, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p) {
        InterfaceC7587f m43167e = C13060g0.m43167e(interfaceC13076k0, interfaceC7587f);
        AbstractC13032a c13062g2 = enumC13084m0.m43238i() ? new C13062g2(m43167e, interfaceC10002p) : new C13094o2(m43167e, true);
        c13062g2.m43032Q0(enumC13084m0, c13062g2, interfaceC10002p);
        return c13062g2;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC13125w1 m43218d(InterfaceC13076k0 interfaceC13076k0, InterfaceC7587f interfaceC7587f, EnumC13084m0 enumC13084m0, InterfaceC10002p interfaceC10002p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7587f = C7588g.f17931a;
        }
        if ((i10 & 2) != 0) {
            enumC13084m0 = EnumC13084m0.DEFAULT;
        }
        return C13063h.m43187c(interfaceC13076k0, interfaceC7587f, enumC13084m0, interfaceC10002p);
    }

    /* renamed from: e */
    public static final <T> Object m43219e(InterfaceC7587f interfaceC7587f, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, Continuation<? super T> continuation) {
        Object m43311R0;
        Object m23655c;
        InterfaceC7587f context = continuation.getContext();
        InterfaceC7587f m43166d = C13060g0.m43166d(context, interfaceC7587f);
        C13035a2.m43049h(m43166d);
        if (m43166d == context) {
            C7215d0 c7215d0 = new C7215d0(m43166d, continuation);
            m43311R0 = C7374b.m22245b(c7215d0, c7215d0, interfaceC10002p);
        } else {
            InterfaceC7585d.b bVar = InterfaceC7585d.f17928n;
            if (C9322n.m27777a(m43166d.mo20647b(bVar), context.mo20647b(bVar))) {
                C13138z2 c13138z2 = new C13138z2(m43166d, continuation);
                InterfaceC7587f context2 = c13138z2.getContext();
                Object m21612c = C7231l0.m21612c(context2, null);
                try {
                    Object m22245b = C7374b.m22245b(c13138z2, c13138z2, interfaceC10002p);
                    C7231l0.m21610a(context2, m21612c);
                    m43311R0 = m22245b;
                } catch (Throwable th2) {
                    C7231l0.m21610a(context2, m21612c);
                    throw th2;
                }
            } else {
                C13124w0 c13124w0 = new C13124w0(m43166d, continuation);
                C7373a.m22243d(interfaceC10002p, c13124w0, c13124w0, null, 4, null);
                m43311R0 = c13124w0.m43311R0();
            }
        }
        m23655c = C7752d.m23655c();
        if (m43311R0 == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m43311R0;
    }
}
