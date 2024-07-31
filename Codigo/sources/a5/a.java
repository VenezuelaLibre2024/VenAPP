package a5;

import android.os.Handler;
import android.os.Looper;
import i4.e0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.n;
import x4.b;
import x4.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f64a = new a();

    /* renamed from: b */
    private static final Set<Object> f65b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private static boolean f66c;

    /* renamed from: a5.a$a */
    /* loaded from: classes.dex */
    public static final class RunnableC0003a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f67a;

        RunnableC0003a(Throwable th2) {
            this.f67a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.d(this)) {
                return;
            }
            try {
                if (a.d(this)) {
                    return;
                }
                try {
                    throw new RuntimeException(this.f67a);
                } catch (Throwable th2) {
                    a.b(th2, this);
                }
            } catch (Throwable th3) {
                a.b(th3, this);
            }
        }
    }

    private a() {
    }

    public static final void a() {
        f66c = true;
    }

    public static final void b(Throwable th2, Object o10) {
        n.e(o10, "o");
        if (f66c) {
            f65b.add(o10);
            if (e0.p()) {
                b.c(th2);
                c.a aVar = c.a.f30394a;
                c.a.b(th2, c.EnumC0496c.CrashShield).g();
            }
            e(th2);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object o10) {
        n.e(o10, "o");
        return f65b.contains(o10);
    }

    public static final void e(Throwable th2) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0003a(th2));
        }
    }
}
