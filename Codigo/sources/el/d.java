package el;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private static final h0 f14760a = new h0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [el.e] */
    public static final <N extends e<N>> N b(N n10) {
        while (true) {
            Object f10 = n10.f();
            if (f10 == f14760a) {
                return n10;
            }
            ?? r02 = (e) f10;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.j()) {
                return n10;
            }
        }
    }

    public static final <S extends e0<S>> Object c(S s10, long j10, ok.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f14765c >= j10 && !s10.h()) {
                return f0.a(s10);
            }
            Object f10 = s10.f();
            if (f10 == f14760a) {
                return f0.a(f14760a);
            }
            S s11 = (S) ((e) f10);
            if (s11 == null) {
                s11 = pVar.invoke(Long.valueOf(s10.f14765c + 1), s10);
                if (s10.l(s11)) {
                    if (s10.h()) {
                        s10.k();
                    }
                }
            }
            s10 = s11;
        }
    }
}
