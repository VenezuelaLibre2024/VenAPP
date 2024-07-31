package h6;

/* loaded from: classes.dex */
public final class l {
    public static void a(f6.f<?> fVar, f6.d dVar) {
        if (!(fVar instanceof s)) {
            l6.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
        } else {
            u.c().e().u(((s) fVar).d().f(dVar), 1);
        }
    }
}
