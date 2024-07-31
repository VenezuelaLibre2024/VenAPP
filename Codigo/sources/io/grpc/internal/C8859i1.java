package io.grpc.internal;

import io.grpc.internal.AbstractC8915y1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;
import p082eb.C7165u;
import vi.AbstractC11908e0;
import vi.AbstractC11939p0;
import vi.C11901c;
import vi.C11915g1;
import vi.C11955x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.i1 */
/* loaded from: classes3.dex */
public final class C8859i1 {

    /* renamed from: a */
    private final b f20645a;

    /* renamed from: b */
    private final Map<String, b> f20646b;

    /* renamed from: c */
    private final Map<String, b> f20647c;

    /* renamed from: d */
    private final AbstractC8915y1.c0 f20648d;

    /* renamed from: e */
    private final Object f20649e;

    /* renamed from: f */
    private final Map<String, ?> f20650f;

    /* renamed from: io.grpc.internal.i1$b */
    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: g */
        static final C11901c.c<b> f20651g = C11901c.c.m38100b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        final Long f20652a;

        /* renamed from: b */
        final Boolean f20653b;

        /* renamed from: c */
        final Integer f20654c;

        /* renamed from: d */
        final Integer f20655d;

        /* renamed from: e */
        final C8918z1 f20656e;

        /* renamed from: f */
        final C8896s0 f20657f;

        b(Map<String, ?> map, boolean z10, int i10, int i11) {
            this.f20652a = C8840d2.m25413w(map);
            this.f20653b = C8840d2.m25414x(map);
            Integer m25402l = C8840d2.m25402l(map);
            this.f20654c = m25402l;
            if (m25402l != null) {
                C7159o.m21308k(m25402l.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", m25402l);
            }
            Integer m25401k = C8840d2.m25401k(map);
            this.f20655d = m25401k;
            if (m25401k != null) {
                C7159o.m21308k(m25401k.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", m25401k);
            }
            Map<String, ?> m25408r = z10 ? C8840d2.m25408r(map) : null;
            this.f20656e = m25408r == null ? null : m25613b(m25408r, i10);
            Map<String, ?> m25394d = z10 ? C8840d2.m25394d(map) : null;
            this.f20657f = m25394d != null ? m25612a(m25394d, i11) : null;
        }

        /* renamed from: a */
        private static C8896s0 m25612a(Map<String, ?> map, int i10) {
            int intValue = ((Integer) C7159o.m21313p(C8840d2.m25398h(map), "maxAttempts cannot be empty")).intValue();
            C7159o.m21305h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) C7159o.m21313p(C8840d2.m25393c(map), "hedgingDelay cannot be empty")).longValue();
            C7159o.m21307j(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new C8896s0(min, longValue, C8840d2.m25406p(map));
        }

        /* renamed from: b */
        private static C8918z1 m25613b(Map<String, ?> map, int i10) {
            int intValue = ((Integer) C7159o.m21313p(C8840d2.m25399i(map), "maxAttempts cannot be empty")).intValue();
            boolean z10 = true;
            C7159o.m21305h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) C7159o.m21313p(C8840d2.m25395e(map), "initialBackoff cannot be empty")).longValue();
            C7159o.m21307j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) C7159o.m21313p(C8840d2.m25400j(map), "maxBackoff cannot be empty")).longValue();
            C7159o.m21307j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) C7159o.m21313p(C8840d2.m25391a(map), "backoffMultiplier cannot be empty")).doubleValue();
            C7159o.m21308k(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long m25407q = C8840d2.m25407q(map);
            C7159o.m21308k(m25407q == null || m25407q.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", m25407q);
            Set<C11915g1.b> m25409s = C8840d2.m25409s(map);
            if (m25407q == null && m25409s.isEmpty()) {
                z10 = false;
            }
            C7159o.m21302e(z10, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C8918z1(min, longValue, longValue2, doubleValue, m25407q, m25409s);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C7155k.m21289a(this.f20652a, bVar.f20652a) && C7155k.m21289a(this.f20653b, bVar.f20653b) && C7155k.m21289a(this.f20654c, bVar.f20654c) && C7155k.m21289a(this.f20655d, bVar.f20655d) && C7155k.m21289a(this.f20656e, bVar.f20656e) && C7155k.m21289a(this.f20657f, bVar.f20657f);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f20652a, this.f20653b, this.f20654c, this.f20655d, this.f20656e, this.f20657f);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("timeoutNanos", this.f20652a).m21284d("waitForReady", this.f20653b).m21284d("maxInboundMessageSize", this.f20654c).m21284d("maxOutboundMessageSize", this.f20655d).m21284d("retryPolicy", this.f20656e).m21284d("hedgingPolicy", this.f20657f).toString();
        }
    }

    /* renamed from: io.grpc.internal.i1$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC11908e0 {

        /* renamed from: b */
        final C8859i1 f20658b;

        private c(C8859i1 c8859i1) {
            this.f20658b = c8859i1;
        }

        @Override // vi.AbstractC11908e0
        /* renamed from: a */
        public AbstractC11908e0.b mo25520a(AbstractC11939p0.f fVar) {
            return AbstractC11908e0.b.m38117d().m38122b(this.f20658b).m38121a();
        }
    }

    C8859i1(b bVar, Map<String, b> map, Map<String, b> map2, AbstractC8915y1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f20645a = bVar;
        this.f20646b = Collections.unmodifiableMap(new HashMap(map));
        this.f20647c = Collections.unmodifiableMap(new HashMap(map2));
        this.f20648d = c0Var;
        this.f20649e = obj;
        this.f20650f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C8859i1 m25605a() {
        return new C8859i1(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C8859i1 m25606b(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        AbstractC8915y1.c0 m25412v = z10 ? C8840d2.m25412v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> m25392b = C8840d2.m25392b(map);
        List<Map<String, ?>> m25403m = C8840d2.m25403m(map);
        if (m25403m == null) {
            return new C8859i1(null, hashMap, hashMap2, m25412v, obj, m25392b);
        }
        b bVar = null;
        for (Map<String, ?> map2 : m25403m) {
            b bVar2 = new b(map2, z10, i10, i11);
            List<Map<String, ?>> m25405o = C8840d2.m25405o(map2);
            if (m25405o != null && !m25405o.isEmpty()) {
                for (Map<String, ?> map3 : m25405o) {
                    String m25410t = C8840d2.m25410t(map3);
                    String m25404n = C8840d2.m25404n(map3);
                    if (C7165u.m21349b(m25410t)) {
                        C7159o.m21308k(C7165u.m21349b(m25404n), "missing service name for method %s", m25404n);
                        C7159o.m21308k(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (C7165u.m21349b(m25404n)) {
                        C7159o.m21308k(!hashMap2.containsKey(m25410t), "Duplicate service %s", m25410t);
                        hashMap2.put(m25410t, bVar2);
                    } else {
                        String m38338b = C11955x0.m38338b(m25410t, m25404n);
                        C7159o.m21308k(!hashMap.containsKey(m38338b), "Duplicate method name %s", m38338b);
                        hashMap.put(m38338b, bVar2);
                    }
                }
            }
        }
        return new C8859i1(bVar, hashMap, hashMap2, m25412v, obj, m25392b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC11908e0 m25607c() {
        if (this.f20647c.isEmpty() && this.f20646b.isEmpty() && this.f20645a == null) {
            return null;
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, ?> m25608d() {
        return this.f20650f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object m25609e() {
        return this.f20649e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8859i1.class != obj.getClass()) {
            return false;
        }
        C8859i1 c8859i1 = (C8859i1) obj;
        return C7155k.m21289a(this.f20645a, c8859i1.f20645a) && C7155k.m21289a(this.f20646b, c8859i1.f20646b) && C7155k.m21289a(this.f20647c, c8859i1.f20647c) && C7155k.m21289a(this.f20648d, c8859i1.f20648d) && C7155k.m21289a(this.f20649e, c8859i1.f20649e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public b m25610f(C11955x0<?, ?> c11955x0) {
        b bVar = this.f20646b.get(c11955x0.m38341c());
        if (bVar == null) {
            bVar = this.f20647c.get(c11955x0.m38342d());
        }
        return bVar == null ? this.f20645a : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC8915y1.c0 m25611g() {
        return this.f20648d;
    }

    public int hashCode() {
        return C7155k.m21290b(this.f20645a, this.f20646b, this.f20647c, this.f20648d, this.f20649e);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("defaultMethodConfig", this.f20645a).m21284d("serviceMethodMap", this.f20646b).m21284d("serviceMap", this.f20647c).m21284d("retryThrottling", this.f20648d).m21284d("loadBalancingConfig", this.f20649e).toString();
    }
}
