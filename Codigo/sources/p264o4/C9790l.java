package p264o4;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: o4.l */
/* loaded from: classes.dex */
public final class C9790l {

    /* renamed from: h */
    private static C9790l f24165h;

    /* renamed from: a */
    private final Class<?> f24167a;

    /* renamed from: b */
    private final Class<?> f24168b;

    /* renamed from: c */
    private final Method f24169c;

    /* renamed from: d */
    private final Method f24170d;

    /* renamed from: e */
    private final Method f24171e;

    /* renamed from: f */
    private final Method f24172f;

    /* renamed from: g */
    public static final a f24164g = new a(null);

    /* renamed from: i */
    private static final AtomicBoolean f24166i = new AtomicBoolean(false);

    /* renamed from: o4.l$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final void m29417a() {
            Class<?> m29419a = C9791m.m29419a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> m29419a2 = C9791m.m29419a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (m29419a == null || m29419a2 == null) {
                return;
            }
            Method m29422d = C9791m.m29422d(m29419a, "newBuilder", new Class[0]);
            Method m29422d2 = C9791m.m29422d(m29419a2, "setType", String.class);
            Method m29422d3 = C9791m.m29422d(m29419a2, "setSkusList", List.class);
            Method m29422d4 = C9791m.m29422d(m29419a2, "build", new Class[0]);
            if (m29422d == null || m29422d2 == null || m29422d3 == null || m29422d4 == null) {
                return;
            }
            C9790l.m29414c(new C9790l(m29419a, m29419a2, m29422d, m29422d2, m29422d3, m29422d4));
        }

        /* renamed from: b */
        public final C9790l m29418b() {
            if (C9790l.m29412a().get()) {
                return C9790l.m29413b();
            }
            m29417a();
            C9790l.m29412a().set(true);
            return C9790l.m29413b();
        }
    }

    public C9790l(Class<?> skuDetailsParamsClazz, Class<?> builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        C9322n.m27781e(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        C9322n.m27781e(builderClazz, "builderClazz");
        C9322n.m27781e(newBuilderMethod, "newBuilderMethod");
        C9322n.m27781e(setTypeMethod, "setTypeMethod");
        C9322n.m27781e(setSkusListMethod, "setSkusListMethod");
        C9322n.m27781e(buildMethod, "buildMethod");
        this.f24167a = skuDetailsParamsClazz;
        this.f24168b = builderClazz;
        this.f24169c = newBuilderMethod;
        this.f24170d = setTypeMethod;
        this.f24171e = setSkusListMethod;
        this.f24172f = buildMethod;
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicBoolean m29412a() {
        if (C0033a.m107d(C9790l.class)) {
            return null;
        }
        try {
            return f24166i;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9790l.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C9790l m29413b() {
        if (C0033a.m107d(C9790l.class)) {
            return null;
        }
        try {
            return f24165h;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9790l.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m29414c(C9790l c9790l) {
        if (C0033a.m107d(C9790l.class)) {
            return;
        }
        try {
            f24165h = c9790l;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9790l.class);
        }
    }

    /* renamed from: d */
    public final Object m29415d(String str, List<String> list) {
        Object m29423e;
        Object m29423e2;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9791m c9791m = C9791m.f24173a;
            Object m29423e3 = C9791m.m29423e(this.f24167a, this.f24169c, null, new Object[0]);
            if (m29423e3 != null && (m29423e = C9791m.m29423e(this.f24168b, this.f24170d, m29423e3, str)) != null && (m29423e2 = C9791m.m29423e(this.f24168b, this.f24171e, m29423e, list)) != null) {
                return C9791m.m29423e(this.f24168b, this.f24172f, m29423e2, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    public final Class<?> m29416e() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return this.f24167a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
