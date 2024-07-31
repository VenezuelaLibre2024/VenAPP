package io.grpc.internal;

import io.grpc.internal.y1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vi.c;
import vi.e0;
import vi.g1;
import vi.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f18902a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f18903b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, b> f18904c;

    /* renamed from: d, reason: collision with root package name */
    private final y1.c0 f18905d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f18906e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, ?> f18907f;

    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: g, reason: collision with root package name */
        static final c.C0470c<b> f18908g = c.C0470c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a, reason: collision with root package name */
        final Long f18909a;

        /* renamed from: b, reason: collision with root package name */
        final Boolean f18910b;

        /* renamed from: c, reason: collision with root package name */
        final Integer f18911c;

        /* renamed from: d, reason: collision with root package name */
        final Integer f18912d;

        /* renamed from: e, reason: collision with root package name */
        final z1 f18913e;

        /* renamed from: f, reason: collision with root package name */
        final s0 f18914f;

        b(Map<String, ?> map, boolean z10, int i10, int i11) {
            this.f18909a = d2.w(map);
            this.f18910b = d2.x(map);
            Integer l10 = d2.l(map);
            this.f18911c = l10;
            if (l10 != null) {
                eb.o.k(l10.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l10);
            }
            Integer k10 = d2.k(map);
            this.f18912d = k10;
            if (k10 != null) {
                eb.o.k(k10.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", k10);
            }
            Map<String, ?> r10 = z10 ? d2.r(map) : null;
            this.f18913e = r10 == null ? null : b(r10, i10);
            Map<String, ?> d10 = z10 ? d2.d(map) : null;
            this.f18914f = d10 != null ? a(d10, i11) : null;
        }

        private static s0 a(Map<String, ?> map, int i10) {
            int intValue = ((Integer) eb.o.p(d2.h(map), "maxAttempts cannot be empty")).intValue();
            eb.o.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) eb.o.p(d2.c(map), "hedgingDelay cannot be empty")).longValue();
            eb.o.j(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new s0(min, longValue, d2.p(map));
        }

        private static z1 b(Map<String, ?> map, int i10) {
            int intValue = ((Integer) eb.o.p(d2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z10 = true;
            eb.o.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) eb.o.p(d2.e(map), "initialBackoff cannot be empty")).longValue();
            eb.o.j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) eb.o.p(d2.j(map), "maxBackoff cannot be empty")).longValue();
            eb.o.j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) eb.o.p(d2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            eb.o.k(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q10 = d2.q(map);
            eb.o.k(q10 == null || q10.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q10);
            Set<g1.b> s10 = d2.s(map);
            if (q10 == null && s10.isEmpty()) {
                z10 = false;
            }
            eb.o.e(z10, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new z1(min, longValue, longValue2, doubleValue, q10, s10);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return eb.k.a(this.f18909a, bVar.f18909a) && eb.k.a(this.f18910b, bVar.f18910b) && eb.k.a(this.f18911c, bVar.f18911c) && eb.k.a(this.f18912d, bVar.f18912d) && eb.k.a(this.f18913e, bVar.f18913e) && eb.k.a(this.f18914f, bVar.f18914f);
        }

        public int hashCode() {
            return eb.k.b(this.f18909a, this.f18910b, this.f18911c, this.f18912d, this.f18913e, this.f18914f);
        }

        public String toString() {
            return eb.i.c(this).d("timeoutNanos", this.f18909a).d("waitForReady", this.f18910b).d("maxInboundMessageSize", this.f18911c).d("maxOutboundMessageSize", this.f18912d).d("retryPolicy", this.f18913e).d("hedgingPolicy", this.f18914f).toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends vi.e0 {

        /* renamed from: b, reason: collision with root package name */
        final i1 f18915b;

        private c(i1 i1Var) {
            this.f18915b = i1Var;
        }

        @Override // vi.e0
        public e0.b a(p0.f fVar) {
            return e0.b.d().b(this.f18915b).a();
        }
    }

    i1(b bVar, Map<String, b> map, Map<String, b> map2, y1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f18902a = bVar;
        this.f18903b = Collections.unmodifiableMap(new HashMap(map));
        this.f18904c = Collections.unmodifiableMap(new HashMap(map2));
        this.f18905d = c0Var;
        this.f18906e = obj;
        this.f18907f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i1 a() {
        return new i1(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i1 b(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        y1.c0 v10 = z10 ? d2.v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b10 = d2.b(map);
        List<Map<String, ?>> m10 = d2.m(map);
        if (m10 == null) {
            return new i1(null, hashMap, hashMap2, v10, obj, b10);
        }
        b bVar = null;
        for (Map<String, ?> map2 : m10) {
            b bVar2 = new b(map2, z10, i10, i11);
            List<Map<String, ?>> o10 = d2.o(map2);
            if (o10 != null && !o10.isEmpty()) {
                for (Map<String, ?> map3 : o10) {
                    String t10 = d2.t(map3);
                    String n10 = d2.n(map3);
                    if (eb.u.b(t10)) {
                        eb.o.k(eb.u.b(n10), "missing service name for method %s", n10);
                        eb.o.k(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (eb.u.b(n10)) {
                        eb.o.k(!hashMap2.containsKey(t10), "Duplicate service %s", t10);
                        hashMap2.put(t10, bVar2);
                    } else {
                        String b11 = vi.x0.b(t10, n10);
                        eb.o.k(!hashMap.containsKey(b11), "Duplicate method name %s", b11);
                        hashMap.put(b11, bVar2);
                    }
                }
            }
        }
        return new i1(bVar, hashMap, hashMap2, v10, obj, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vi.e0 c() {
        if (this.f18904c.isEmpty() && this.f18903b.isEmpty() && this.f18902a == null) {
            return null;
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, ?> d() {
        return this.f18907f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object e() {
        return this.f18906e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return eb.k.a(this.f18902a, i1Var.f18902a) && eb.k.a(this.f18903b, i1Var.f18903b) && eb.k.a(this.f18904c, i1Var.f18904c) && eb.k.a(this.f18905d, i1Var.f18905d) && eb.k.a(this.f18906e, i1Var.f18906e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f(vi.x0<?, ?> x0Var) {
        b bVar = this.f18903b.get(x0Var.c());
        if (bVar == null) {
            bVar = this.f18904c.get(x0Var.d());
        }
        return bVar == null ? this.f18902a : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1.c0 g() {
        return this.f18905d;
    }

    public int hashCode() {
        return eb.k.b(this.f18902a, this.f18903b, this.f18904c, this.f18905d, this.f18906e);
    }

    public String toString() {
        return eb.i.c(this).d("defaultMethodConfig", this.f18902a).d("serviceMethodMap", this.f18903b).d("serviceMap", this.f18904c).d("retryThrottling", this.f18905d).d("loadBalancingConfig", this.f18906e).toString();
    }
}
