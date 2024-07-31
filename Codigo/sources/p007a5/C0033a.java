package p007a5;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p434x4.C12275b;
import p434x4.C12276c;

/* renamed from: a5.a */
/* loaded from: classes.dex */
public final class C0033a {

    /* renamed from: a */
    public static final C0033a f64a = new C0033a();

    /* renamed from: b */
    private static final Set<Object> f65b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private static boolean f66c;

    /* renamed from: a5.a$a */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f67a;

        a(Throwable th2) {
            this.f67a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    throw new RuntimeException(this.f67a);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        }
    }

    private C0033a() {
    }

    /* renamed from: a */
    public static final void m104a() {
        f66c = true;
    }

    /* renamed from: b */
    public static final void m105b(Throwable th2, Object o10) {
        C9322n.m27781e(o10, "o");
        if (f66c) {
            f65b.add(o10);
            if (C7799e0.m23864p()) {
                C12275b.m39521c(th2);
                C12276c.a aVar = C12276c.a.f32906a;
                C12276c.a.m39533b(th2, C12276c.c.CrashShield).m39531g();
            }
            m108e(th2);
        }
    }

    /* renamed from: c */
    public static final boolean m106c() {
        return false;
    }

    /* renamed from: d */
    public static final boolean m107d(Object o10) {
        C9322n.m27781e(o10, "o");
        return f65b.contains(o10);
    }

    /* renamed from: e */
    public static final void m108e(Throwable th2) {
        if (m106c()) {
            new Handler(Looper.getMainLooper()).post(new a(th2));
        }
    }
}
