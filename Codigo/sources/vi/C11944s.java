package vi;

import java.util.concurrent.TimeoutException;
import p082eb.C7159o;
import vi.C11915g1;

/* renamed from: vi.s */
/* loaded from: classes3.dex */
public final class C11944s {
    /* renamed from: a */
    public static C11915g1 m38261a(C11942r c11942r) {
        C7159o.m21313p(c11942r, "context must not be null");
        if (!c11942r.m38250h()) {
            return null;
        }
        Throwable m38247c = c11942r.m38247c();
        if (m38247c == null) {
            return C11915g1.f31535g.m38147r("io.grpc.Context was cancelled without error");
        }
        if (m38247c instanceof TimeoutException) {
            return C11915g1.f31538j.m38147r(m38247c.getMessage()).m38146q(m38247c);
        }
        C11915g1 m38137l = C11915g1.m38137l(m38247c);
        return (C11915g1.b.UNKNOWN.equals(m38137l.m38143n()) && m38137l.m38142m() == m38247c) ? C11915g1.f31535g.m38147r("Context cancelled").m38146q(m38247c) : m38137l.m38146q(m38247c);
    }
}
