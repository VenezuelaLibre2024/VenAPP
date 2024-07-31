package am;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: am.j */
/* loaded from: classes3.dex */
public final class C0146j {

    /* renamed from: d */
    public static final a f577d = new a(null);

    /* renamed from: a */
    private final Method f578a;

    /* renamed from: b */
    private final Method f579b;

    /* renamed from: c */
    private final Method f580c;

    /* renamed from: am.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C0146j m658a() {
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
            return new C0146j(method, method3, method2);
        }
    }

    public C0146j(Method method, Method method2, Method method3) {
        this.f578a = method;
        this.f579b = method2;
        this.f580c = method3;
    }

    /* renamed from: a */
    public final Object m656a(String closer) {
        C9322n.m27781e(closer, "closer");
        Method method = this.f578a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f579b;
                C9322n.m27778b(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m657b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f580c;
            C9322n.m27778b(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
