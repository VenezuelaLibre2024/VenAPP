package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class w1 implements d1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f19188b = Logger.getLogger(w1.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f19189c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f19190d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f19191e;

    /* renamed from: f, reason: collision with root package name */
    private static final RuntimeException f19192f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f19193g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f19194a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        RuntimeException runtimeException = null;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i10];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i10++;
                }
            }
            th = null;
        } catch (Throwable th4) {
            th = th4;
            f19188b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            if (th == null) {
            }
            f19189c = null;
            f19190d = null;
            f19191e = null;
            runtimeException = new RuntimeException(th);
            f19192f = runtimeException;
            f19193g = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            f19189c = null;
            f19190d = null;
            f19191e = null;
            runtimeException = new RuntimeException(th);
        } else {
            f19189c = constructor;
            f19190d = method;
            f19191e = method2;
        }
        f19192f = runtimeException;
        f19193g = new Object[]{1L};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1() {
        RuntimeException runtimeException = f19192f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f19194a = f19189c.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f19192f == null;
    }

    @Override // io.grpc.internal.d1
    public void add(long j10) {
        try {
            f19190d.invoke(this.f19194a, j10 == 1 ? f19193g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
