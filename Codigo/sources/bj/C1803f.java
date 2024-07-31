package bj;

import bj.C1802e;
import io.grpc.internal.C8827a1;
import io.grpc.internal.C8840d2;
import io.grpc.internal.InterfaceC8868k2;
import java.util.List;
import java.util.Map;
import vi.AbstractC11939p0;
import vi.AbstractC11941q0;
import vi.AbstractC11957y0;
import vi.C11915g1;
import vi.C11943r0;

/* renamed from: bj.f */
/* loaded from: classes3.dex */
public final class C1803f extends AbstractC11941q0 {
    @Override // vi.AbstractC11939p0.c
    /* renamed from: a */
    public AbstractC11939p0 mo9648a(AbstractC11939p0.d dVar) {
        return new C1802e(dVar, InterfaceC8868k2.f20692a);
    }

    @Override // vi.AbstractC11941q0
    /* renamed from: b */
    public String mo9649b() {
        return "outlier_detection_experimental";
    }

    @Override // vi.AbstractC11941q0
    /* renamed from: c */
    public int mo9650c() {
        return 5;
    }

    @Override // vi.AbstractC11941q0
    /* renamed from: d */
    public boolean mo9651d() {
        return true;
    }

    @Override // vi.AbstractC11941q0
    /* renamed from: e */
    public AbstractC11957y0.c mo9652e(Map<String, ?> map) {
        Long m25268l = C8827a1.m25268l(map, "interval");
        Long m25268l2 = C8827a1.m25268l(map, "baseEjectionTime");
        Long m25268l3 = C8827a1.m25268l(map, "maxEjectionTime");
        Integer m25265i = C8827a1.m25265i(map, "maxEjectionPercentage");
        C1802e.g.a aVar = new C1802e.g.a();
        if (m25268l != null) {
            aVar.m9619e(m25268l);
        }
        if (m25268l2 != null) {
            aVar.m9616b(m25268l2);
        }
        if (m25268l3 != null) {
            aVar.m9621g(m25268l3);
        }
        if (m25265i != null) {
            aVar.m9620f(m25265i);
        }
        Map<String, ?> m25266j = C8827a1.m25266j(map, "successRateEjection");
        if (m25266j != null) {
            C1802e.g.c.a aVar2 = new C1802e.g.c.a();
            Integer m25265i2 = C8827a1.m25265i(m25266j, "stdevFactor");
            Integer m25265i3 = C8827a1.m25265i(m25266j, "enforcementPercentage");
            Integer m25265i4 = C8827a1.m25265i(m25266j, "minimumHosts");
            Integer m25265i5 = C8827a1.m25265i(m25266j, "requestVolume");
            if (m25265i2 != null) {
                aVar2.m9632e(m25265i2);
            }
            if (m25265i3 != null) {
                aVar2.m9629b(m25265i3);
            }
            if (m25265i4 != null) {
                aVar2.m9630c(m25265i4);
            }
            if (m25265i5 != null) {
                aVar2.m9631d(m25265i5);
            }
            aVar.m9622h(aVar2.m9628a());
        }
        Map<String, ?> m25266j2 = C8827a1.m25266j(map, "failurePercentageEjection");
        if (m25266j2 != null) {
            C1802e.g.b.a aVar3 = new C1802e.g.b.a();
            Integer m25265i6 = C8827a1.m25265i(m25266j2, "threshold");
            Integer m25265i7 = C8827a1.m25265i(m25266j2, "enforcementPercentage");
            Integer m25265i8 = C8827a1.m25265i(m25266j2, "minimumHosts");
            Integer m25265i9 = C8827a1.m25265i(m25266j2, "requestVolume");
            if (m25265i6 != null) {
                aVar3.m9627e(m25265i6);
            }
            if (m25265i7 != null) {
                aVar3.m9624b(m25265i7);
            }
            if (m25265i8 != null) {
                aVar3.m9625c(m25265i8);
            }
            if (m25265i9 != null) {
                aVar3.m9626d(m25265i9);
            }
            aVar.m9618d(aVar3.m9623a());
        }
        List<C8840d2.a> m25390A = C8840d2.m25390A(C8827a1.m25262f(map, "childPolicy"));
        if (m25390A == null || m25390A.isEmpty()) {
            return AbstractC11957y0.c.m38372b(C11915g1.f31548t.m38147r("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC11957y0.c m25415y = C8840d2.m25415y(m25390A, C11943r0.m38255b());
        if (m25415y.m38374d() != null) {
            return m25415y;
        }
        aVar.m9617c((C8840d2.b) m25415y.m38373c());
        return AbstractC11957y0.c.m38371a(aVar.m9615a());
    }
}
