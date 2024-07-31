package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f20734a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f20735b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f20736c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f20737a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f20738b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f20739c;

        public a(Method method, Method method2, Method method3) {
            this.f20737a = method;
            this.f20738b = method2;
            this.f20739c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20736c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f20735b;
            f20736c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        n.e(continuation, "continuation");
        a aVar = f20736c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f20735b) {
            return null;
        }
        Method method = aVar.f20737a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f20738b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f20739c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
