package vi;

import java.util.concurrent.TimeoutException;
import vi.g1;

/* loaded from: classes3.dex */
public final class s {
    public static g1 a(r rVar) {
        eb.o.p(rVar, "context must not be null");
        if (!rVar.h()) {
            return null;
        }
        Throwable c10 = rVar.c();
        if (c10 == null) {
            return g1.f29101g.r("io.grpc.Context was cancelled without error");
        }
        if (c10 instanceof TimeoutException) {
            return g1.f29104j.r(c10.getMessage()).q(c10);
        }
        g1 l10 = g1.l(c10);
        return (g1.b.UNKNOWN.equals(l10.n()) && l10.m() == c10) ? g1.f29101g.r("Context cancelled").q(c10) : l10.q(c10);
    }
}
