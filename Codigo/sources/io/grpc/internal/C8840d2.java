package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.AbstractC8915y1;
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
import p082eb.C7144a0;
import p082eb.C7146b0;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11941q0;
import vi.AbstractC11957y0;
import vi.C11915g1;
import vi.C11943r0;

/* renamed from: io.grpc.internal.d2 */
/* loaded from: classes3.dex */
public final class C8840d2 {

    /* renamed from: io.grpc.internal.d2$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f20377a;

        /* renamed from: b */
        private final Map<String, ?> f20378b;

        public a(String str, Map<String, ?> map) {
            this.f20377a = (String) C7159o.m21313p(str, "policyName");
            this.f20378b = (Map) C7159o.m21313p(map, "rawConfigValue");
        }

        /* renamed from: a */
        public String m25417a() {
            return this.f20377a;
        }

        /* renamed from: b */
        public Map<String, ?> m25418b() {
            return this.f20378b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20377a.equals(aVar.f20377a) && this.f20378b.equals(aVar.f20378b);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f20377a, this.f20378b);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("policyName", this.f20377a).m21284d("rawConfigValue", this.f20378b).toString();
        }
    }

    /* renamed from: io.grpc.internal.d2$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        final AbstractC11941q0 f20379a;

        /* renamed from: b */
        final Object f20380b;

        public b(AbstractC11941q0 abstractC11941q0, Object obj) {
            this.f20379a = (AbstractC11941q0) C7159o.m21313p(abstractC11941q0, "provider");
            this.f20380b = obj;
        }

        /* renamed from: a */
        public Object m25419a() {
            return this.f20380b;
        }

        /* renamed from: b */
        public AbstractC11941q0 m25420b() {
            return this.f20379a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return C7155k.m21289a(this.f20379a, bVar.f20379a) && C7155k.m21289a(this.f20380b, bVar.f20380b);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f20379a, this.f20380b);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("provider", this.f20379a).m21284d("config", this.f20380b).toString();
        }
    }

    private C8840d2() {
    }

    /* renamed from: A */
    public static List<a> m25390A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m25416z(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Double m25391a(Map<String, ?> map) {
        return C8827a1.m25264h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    public static Map<String, ?> m25392b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C8827a1.m25266j(map, "healthCheckConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Long m25393c(Map<String, ?> map) {
        return C8827a1.m25268l(map, "hedgingDelay");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Map<String, ?> m25394d(Map<String, ?> map) {
        return C8827a1.m25266j(map, "hedgingPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Long m25395e(Map<String, ?> map) {
        return C8827a1.m25268l(map, "initialBackoff");
    }

    /* renamed from: f */
    private static Set<C11915g1.b> m25396f(Map<String, ?> map, String str) {
        List<?> m25261e = C8827a1.m25261e(map, str);
        if (m25261e == null) {
            return null;
        }
        return m25411u(m25261e);
    }

    /* renamed from: g */
    public static List<Map<String, ?>> m25397g(Map<String, ?> map) {
        String m25267k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C8827a1.m25262f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (m25267k = C8827a1.m25267k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(m25267k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Integer m25398h(Map<String, ?> map) {
        return C8827a1.m25265i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Integer m25399i(Map<String, ?> map) {
        return C8827a1.m25265i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Long m25400j(Map<String, ?> map) {
        return C8827a1.m25268l(map, "maxBackoff");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Integer m25401k(Map<String, ?> map) {
        return C8827a1.m25265i(map, "maxRequestMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Integer m25402l(Map<String, ?> map) {
        return C8827a1.m25265i(map, "maxResponseMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static List<Map<String, ?>> m25403m(Map<String, ?> map) {
        return C8827a1.m25262f(map, "methodConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static String m25404n(Map<String, ?> map) {
        return C8827a1.m25267k(map, Constants.METHOD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static List<Map<String, ?>> m25405o(Map<String, ?> map) {
        return C8827a1.m25262f(map, "name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static Set<C11915g1.b> m25406p(Map<String, ?> map) {
        Set<C11915g1.b> m25396f = m25396f(map, "nonFatalStatusCodes");
        if (m25396f == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C11915g1.b.class));
        }
        C7144a0.m21244a(!m25396f.contains(C11915g1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return m25396f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Long m25407q(Map<String, ?> map) {
        return C8827a1.m25268l(map, "perAttemptRecvTimeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static Map<String, ?> m25408r(Map<String, ?> map) {
        return C8827a1.m25266j(map, "retryPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static Set<C11915g1.b> m25409s(Map<String, ?> map) {
        Set<C11915g1.b> m25396f = m25396f(map, "retryableStatusCodes");
        C7144a0.m21244a(m25396f != null, "%s is required in retry policy", "retryableStatusCodes");
        C7144a0.m21244a(true ^ m25396f.contains(C11915g1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return m25396f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static String m25410t(Map<String, ?> map) {
        return C8827a1.m25267k(map, "service");
    }

    /* renamed from: u */
    private static Set<C11915g1.b> m25411u(List<?> list) {
        C11915g1.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(C11915g1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                C7144a0.m21244a(((double) intValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                valueOf = C11915g1.m38134i(intValue).m38143n();
                C7144a0.m21244a(valueOf.m38151i() == d10.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new C7146b0("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = C11915g1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new C7146b0("Status code " + obj + " is not valid", e10);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC8915y1.c0 m25412v(Map<String, ?> map) {
        Map<String, ?> m25266j;
        if (map == null || (m25266j = C8827a1.m25266j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = C8827a1.m25264h(m25266j, "maxTokens").floatValue();
        float floatValue2 = C8827a1.m25264h(m25266j, "tokenRatio").floatValue();
        C7159o.m21319v(floatValue > 0.0f, "maxToken should be greater than zero");
        C7159o.m21319v(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC8915y1.c0(floatValue, floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static Long m25413w(Map<String, ?> map) {
        return C8827a1.m25268l(map, "timeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static Boolean m25414x(Map<String, ?> map) {
        return C8827a1.m25260d(map, "waitForReady");
    }

    /* renamed from: y */
    public static AbstractC11957y0.c m25415y(List<a> list, C11943r0 c11943r0) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String m25417a = aVar.m25417a();
            AbstractC11941q0 m38258d = c11943r0.m38258d(m25417a);
            if (m38258d != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(C8840d2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC11957y0.c mo9652e = m38258d.mo9652e(aVar.m25418b());
                return mo9652e.m38374d() != null ? mo9652e : AbstractC11957y0.c.m38371a(new b(m38258d, mo9652e.m38373c()));
            }
            arrayList.add(m25417a);
        }
        return AbstractC11957y0.c.m38372b(C11915g1.f31536h.m38147r("None of " + arrayList + " specified by Service Config are available."));
    }

    /* renamed from: z */
    public static a m25416z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, C8827a1.m25266j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
