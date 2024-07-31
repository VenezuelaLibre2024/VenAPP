package am;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final a f512d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Method f513a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f514b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f515c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final j a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new j(method, method3, method2);
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f513a = method;
        this.f514b = method2;
        this.f515c = method3;
    }

    public final Object a(String closer) {
        kotlin.jvm.internal.n.e(closer, "closer");
        Method method = this.f513a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f514b;
                kotlin.jvm.internal.n.b(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f515c;
            kotlin.jvm.internal.n.b(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
