package bj;

import bj.e;
import io.grpc.internal.a1;
import io.grpc.internal.d2;
import io.grpc.internal.k2;
import java.util.List;
import java.util.Map;
import vi.g1;
import vi.p0;
import vi.q0;
import vi.r0;
import vi.y0;

/* loaded from: classes3.dex */
public final class f extends q0 {
    @Override // vi.p0.c
    public p0 a(p0.d dVar) {
        return new e(dVar, k2.f18945a);
    }

    @Override // vi.q0
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // vi.q0
    public int c() {
        return 5;
    }

    @Override // vi.q0
    public boolean d() {
        return true;
    }

    @Override // vi.q0
    public y0.c e(Map<String, ?> map) {
        Long l10 = a1.l(map, "interval");
        Long l11 = a1.l(map, "baseEjectionTime");
        Long l12 = a1.l(map, "maxEjectionTime");
        Integer i10 = a1.i(map, "maxEjectionPercentage");
        e.g.a aVar = new e.g.a();
        if (l10 != null) {
            aVar.e(l10);
        }
        if (l11 != null) {
            aVar.b(l11);
        }
        if (l12 != null) {
            aVar.g(l12);
        }
        if (i10 != null) {
            aVar.f(i10);
        }
        Map<String, ?> j10 = a1.j(map, "successRateEjection");
        if (j10 != null) {
            e.g.c.a aVar2 = new e.g.c.a();
            Integer i11 = a1.i(j10, "stdevFactor");
            Integer i12 = a1.i(j10, "enforcementPercentage");
            Integer i13 = a1.i(j10, "minimumHosts");
            Integer i14 = a1.i(j10, "requestVolume");
            if (i11 != null) {
                aVar2.e(i11);
            }
            if (i12 != null) {
                aVar2.b(i12);
            }
            if (i13 != null) {
                aVar2.c(i13);
            }
            if (i14 != null) {
                aVar2.d(i14);
            }
            aVar.h(aVar2.a());
        }
        Map<String, ?> j11 = a1.j(map, "failurePercentageEjection");
        if (j11 != null) {
            e.g.b.a aVar3 = new e.g.b.a();
            Integer i15 = a1.i(j11, "threshold");
            Integer i16 = a1.i(j11, "enforcementPercentage");
            Integer i17 = a1.i(j11, "minimumHosts");
            Integer i18 = a1.i(j11, "requestVolume");
            if (i15 != null) {
                aVar3.e(i15);
            }
            if (i16 != null) {
                aVar3.b(i16);
            }
            if (i17 != null) {
                aVar3.c(i17);
            }
            if (i18 != null) {
                aVar3.d(i18);
            }
            aVar.d(aVar3.a());
        }
        List<d2.a> A = d2.A(a1.f(map, "childPolicy"));
        if (A == null || A.isEmpty()) {
            return y0.c.b(g1.f29114t.r("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        y0.c y10 = d2.y(A, r0.b());
        if (y10.d() != null) {
            return y10;
        }
        aVar.c((d2.b) y10.c());
        return y0.c.a(aVar.a());
    }
}
