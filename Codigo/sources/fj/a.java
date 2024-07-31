package fj;

import android.os.Handler;
import android.os.Looper;
import dj.r;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private static final r f15246a = ej.a.d(new CallableC0252a());

    /* renamed from: fj.a$a */
    /* loaded from: classes3.dex */
    static class CallableC0252a implements Callable<r> {
        CallableC0252a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public r call() {
            return b.f15247a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        static final r f15247a = new fj.b(new Handler(Looper.getMainLooper()));
    }

    public static r a() {
        return ej.a.e(f15246a);
    }
}
