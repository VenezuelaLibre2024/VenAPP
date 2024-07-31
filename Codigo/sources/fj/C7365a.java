package fj;

import android.os.Handler;
import android.os.Looper;
import dj.AbstractC6993r;
import java.util.concurrent.Callable;
import p087ej.C7197a;

/* renamed from: fj.a */
/* loaded from: classes3.dex */
public final class C7365a {

    /* renamed from: a */
    private static final AbstractC6993r f16669a = C7197a.m21453d(new a());

    /* renamed from: fj.a$a */
    /* loaded from: classes3.dex */
    static class a implements Callable<AbstractC6993r> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6993r call() {
            return b.f16670a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fj.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        static final AbstractC6993r f16670a = new C7366b(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static AbstractC6993r m22232a() {
        return C7197a.m21454e(f16669a);
    }
}
