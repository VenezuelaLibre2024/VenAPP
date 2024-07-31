package p089el;

import p280ok.InterfaceC10002p;

/* renamed from: el.d */
/* loaded from: classes3.dex */
public final class C7214d {

    /* renamed from: a */
    private static final C7223h0 f16183a = new C7223h0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [el.e] */
    /* renamed from: b */
    public static final <N extends AbstractC7216e<N>> N m21548b(N n10) {
        while (true) {
            Object m21556f = n10.m21556f();
            if (m21556f == f16183a) {
                return n10;
            }
            ?? r02 = (AbstractC7216e) m21556f;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.m21562j()) {
                return n10;
            }
        }
    }

    /* renamed from: c */
    public static final <S extends AbstractC7217e0<S>> Object m21549c(S s10, long j10, InterfaceC10002p<? super Long, ? super S, ? extends S> interfaceC10002p) {
        while (true) {
            if (s10.f16188c >= j10 && !s10.mo21560h()) {
                return C7219f0.m21568a(s10);
            }
            Object m21556f = s10.m21556f();
            if (m21556f == f16183a) {
                return C7219f0.m21568a(f16183a);
            }
            S s11 = (S) ((AbstractC7216e) m21556f);
            if (s11 == null) {
                s11 = interfaceC10002p.invoke(Long.valueOf(s10.f16188c + 1), s10);
                if (s10.m21564l(s11)) {
                    if (s10.mo21560h()) {
                        s10.m21563k();
                    }
                }
            }
            s10 = s11;
        }
    }
}
