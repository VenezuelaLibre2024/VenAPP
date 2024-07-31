package al;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ck.n;
import ck.o;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f493a;
    private static volatile Choreographer choreographer;

    static {
        Object b10;
        byte b11 = 0;
        byte b12 = 0;
        try {
            n.a aVar = n.f7126b;
            b10 = n.b(new d(a(Looper.getMainLooper(), true), b12 == true ? 1 : 0, 2, b11 == true ? 1 : 0));
        } catch (Throwable th2) {
            n.a aVar2 = n.f7126b;
            b10 = n.b(o.a(th2));
        }
        f493a = (e) (n.f(b10) ? null : b10);
    }

    public static final Handler a(Looper looper, boolean z10) {
        Object newInstance;
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            kotlin.jvm.internal.n.c(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
