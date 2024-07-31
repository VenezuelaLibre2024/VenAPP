package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.w1 */
/* loaded from: classes3.dex */
public final class C8909w1 implements InterfaceC8839d1 {

    /* renamed from: b */
    private static final Logger f20935b = Logger.getLogger(C8909w1.class.getName());

    /* renamed from: c */
    private static final Constructor<?> f20936c;

    /* renamed from: d */
    private static final Method f20937d;

    /* renamed from: e */
    private static final Method f20938e;

    /* renamed from: f */
    private static final RuntimeException f20939f;

    /* renamed from: g */
    private static final Object[] f20940g;

    /* renamed from: a */
    private final Object f20941a;

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
            f20935b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            if (th == null) {
            }
            f20936c = null;
            f20937d = null;
            f20938e = null;
            runtimeException = new RuntimeException(th);
            f20939f = runtimeException;
            f20940g = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            f20936c = null;
            f20937d = null;
            f20938e = null;
            runtimeException = new RuntimeException(th);
        } else {
            f20936c = constructor;
            f20937d = method;
            f20938e = method2;
        }
        f20939f = runtimeException;
        f20940g = new Object[]{1L};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8909w1() {
        RuntimeException runtimeException = f20939f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f20941a = f20936c.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m25877a() {
        return f20939f == null;
    }

    @Override // io.grpc.internal.InterfaceC8839d1
    public void add(long j10) {
        try {
            f20937d.invoke(this.f20941a, j10 == 1 ? f20940g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
