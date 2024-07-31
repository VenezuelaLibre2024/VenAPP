package o4;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    private static l f22232h;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f22234a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f22235b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f22236c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f22237d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f22238e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f22239f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f22231g = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicBoolean f22233i = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final void a() {
            Class<?> a10 = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a11 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a10 == null || a11 == null) {
                return;
            }
            Method d10 = m.d(a10, "newBuilder", new Class[0]);
            Method d11 = m.d(a11, "setType", String.class);
            Method d12 = m.d(a11, "setSkusList", List.class);
            Method d13 = m.d(a11, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null) {
                return;
            }
            l.c(new l(a10, a11, d10, d11, d12, d13));
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }
    }

    public l(Class<?> skuDetailsParamsClazz, Class<?> builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        n.e(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        n.e(builderClazz, "builderClazz");
        n.e(newBuilderMethod, "newBuilderMethod");
        n.e(setTypeMethod, "setTypeMethod");
        n.e(setSkusListMethod, "setSkusListMethod");
        n.e(buildMethod, "buildMethod");
        this.f22234a = skuDetailsParamsClazz;
        this.f22235b = builderClazz;
        this.f22236c = newBuilderMethod;
        this.f22237d = setTypeMethod;
        this.f22238e = setSkusListMethod;
        this.f22239f = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (a5.a.d(l.class)) {
            return null;
        }
        try {
            return f22233i;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (a5.a.d(l.class)) {
            return null;
        }
        try {
            return f22232h;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (a5.a.d(l.class)) {
            return;
        }
        try {
            f22232h = lVar;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
        }
    }

    public final Object d(String str, List<String> list) {
        Object e10;
        Object e11;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.f22240a;
            Object e12 = m.e(this.f22234a, this.f22236c, null, new Object[0]);
            if (e12 != null && (e10 = m.e(this.f22235b, this.f22237d, e12, str)) != null && (e11 = m.e(this.f22235b, this.f22238e, e10, list)) != null) {
                return m.e(this.f22235b, this.f22239f, e11, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final Class<?> e() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return this.f22234a;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }
}
