package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.g1;
import vi.y0;

/* loaded from: classes3.dex */
public final class d2 {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f18681a;

        /* renamed from: b */
        private final Map<String, ?> f18682b;

        public a(String str, Map<String, ?> map) {
            this.f18681a = (String) eb.o.p(str, "policyName");
            this.f18682b = (Map) eb.o.p(map, "rawConfigValue");
        }

        public String a() {
            return this.f18681a;
        }

        public Map<String, ?> b() {
            return this.f18682b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18681a.equals(aVar.f18681a) && this.f18682b.equals(aVar.f18682b);
        }

        public int hashCode() {
            return eb.k.b(this.f18681a, this.f18682b);
        }

        public String toString() {
            return eb.i.c(this).d("policyName", this.f18681a).d("rawConfigValue", this.f18682b).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        final vi.q0 f18683a;

        /* renamed from: b */
        final Object f18684b;

        public b(vi.q0 q0Var, Object obj) {
            this.f18683a = (vi.q0) eb.o.p(q0Var, "provider");
            this.f18684b = obj;
        }

        public Object a() {
            return this.f18684b;
        }

        public vi.q0 b() {
            return this.f18683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return eb.k.a(this.f18683a, bVar.f18683a) && eb.k.a(this.f18684b, bVar.f18684b);
        }

        public int hashCode() {
            return eb.k.b(this.f18683a, this.f18684b);
        }

        public String toString() {
            return eb.i.c(this).d("provider", this.f18683a).d("config", this.f18684b).toString();
        }
    }

    private d2() {
    }

    public static List<a> A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Double a(Map<String, ?> map) {
        return a1.h(map, "backoffMultiplier");
    }

    public static Map<String, ?> b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return a1.j(map, "healthCheckConfig");
    }

    public static Long c(Map<String, ?> map) {
        return a1.l(map, "hedgingDelay");
    }

    public static Map<String, ?> d(Map<String, ?> map) {
        return a1.j(map, "hedgingPolicy");
    }

    public static Long e(Map<String, ?> map) {
        return a1.l(map, "initialBackoff");
    }

    private static Set<g1.b> f(Map<String, ?> map, String str) {
        List<?> e10 = a1.e(map, str);
        if (e10 == null) {
            return null;
        }
        return u(e10);
    }

    public static List<Map<String, ?>> g(Map<String, ?> map) {
        String k10;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(a1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k10 = a1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k10.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Integer h(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    public static Integer i(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    public static Long j(Map<String, ?> map) {
        return a1.l(map, "maxBackoff");
    }

    public static Integer k(Map<String, ?> map) {
        return a1.i(map, "maxRequestMessageBytes");
    }

    public static Integer l(Map<String, ?> map) {
        return a1.i(map, "maxResponseMessageBytes");
    }

    public static List<Map<String, ?>> m(Map<String, ?> map) {
        return a1.f(map, "methodConfig");
    }

    public static String n(Map<String, ?> map) {
        return a1.k(map, Constants.METHOD);
    }

    public static List<Map<String, ?>> o(Map<String, ?> map) {
        return a1.f(map, "name");
    }

    public static Set<g1.b> p(Map<String, ?> map) {
        Set<g1.b> f10 = f(map, "nonFatalStatusCodes");
        if (f10 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(g1.b.class));
        }
        eb.a0.a(!f10.contains(g1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f10;
    }

    public static Long q(Map<String, ?> map) {
        return a1.l(map, "perAttemptRecvTimeout");
    }

    public static Map<String, ?> r(Map<String, ?> map) {
        return a1.j(map, "retryPolicy");
    }

    public static Set<g1.b> s(Map<String, ?> map) {
        Set<g1.b> f10 = f(map, "retryableStatusCodes");
        eb.a0.a(f10 != null, "%s is required in retry policy", "retryableStatusCodes");
        eb.a0.a(true ^ f10.contains(g1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f10;
    }

    public static String t(Map<String, ?> map) {
        return a1.k(map, "service");
    }

    private static Set<g1.b> u(List<?> list) {
        g1.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(g1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                eb.a0.a(((double) intValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                valueOf = vi.g1.i(intValue).n();
                eb.a0.a(valueOf.i() == d10.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new eb.b0("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = g1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new eb.b0("Status code " + obj + " is not valid", e10);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static y1.c0 v(Map<String, ?> map) {
        Map<String, ?> j10;
        if (map == null || (j10 = a1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = a1.h(j10, "maxTokens").floatValue();
        float floatValue2 = a1.h(j10, "tokenRatio").floatValue();
        eb.o.v(floatValue > 0.0f, "maxToken should be greater than zero");
        eb.o.v(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new y1.c0(floatValue, floatValue2);
    }

    public static Long w(Map<String, ?> map) {
        return a1.l(map, "timeout");
    }

    public static Boolean x(Map<String, ?> map) {
        return a1.d(map, "waitForReady");
    }

    public static y0.c y(List<a> list, vi.r0 r0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String a10 = aVar.a();
            vi.q0 d10 = r0Var.d(a10);
            if (d10 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(d2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                y0.c e10 = d10.e(aVar.b());
                return e10.d() != null ? e10 : y0.c.a(new b(d10, e10.c()));
            }
            arrayList.add(a10);
        }
        return y0.c.b(vi.g1.f29102h.r("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, a1.j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
