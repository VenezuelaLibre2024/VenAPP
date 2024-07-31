package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.coroutines.jvm.internal.i */
/* loaded from: classes3.dex */
public final class C9303i {

    /* renamed from: a */
    public static final C9303i f22556a = new C9303i();

    /* renamed from: b */
    private static final a f22557b = new a(null, null, null);

    /* renamed from: c */
    private static a f22558c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f22559a;

        /* renamed from: b */
        public final Method f22560b;

        /* renamed from: c */
        public final Method f22561c;

        public a(Method method, Method method2, Method method3) {
            this.f22559a = method;
            this.f22560b = method2;
            this.f22561c = method3;
        }
    }

    private C9303i() {
    }

    /* renamed from: a */
    private final a m27754a(AbstractC9295a abstractC9295a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC9295a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC9295a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f22558c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f22557b;
            f22558c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m27755b(AbstractC9295a continuation) {
        C9322n.m27781e(continuation, "continuation");
        a aVar = f22558c;
        if (aVar == null) {
            aVar = m27754a(continuation);
        }
        if (aVar == f22557b) {
            return null;
        }
        Method method = aVar.f22559a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f22560b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f22561c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
