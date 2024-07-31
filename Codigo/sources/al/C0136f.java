package al;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ck.C2029n;
import ck.C2030o;
import kotlin.jvm.internal.C9322n;

/* renamed from: al.f */
/* loaded from: classes3.dex */
public final class C0136f {

    /* renamed from: a */
    public static final AbstractC0135e f558a;
    private static volatile Choreographer choreographer;

    static {
        Object m10340b;
        byte b10 = 0;
        byte b11 = 0;
        try {
            C2029n.a aVar = C2029n.f8078b;
            m10340b = C2029n.m10340b(new C0134d(m630a(Looper.getMainLooper(), true), b11 == true ? 1 : 0, 2, b10 == true ? 1 : 0));
        } catch (Throwable th2) {
            C2029n.a aVar2 = C2029n.f8078b;
            m10340b = C2029n.m10340b(C2030o.m10348a(th2));
        }
        f558a = (AbstractC0135e) (C2029n.m10344f(m10340b) ? null : m10340b);
    }

    /* renamed from: a */
    public static final Handler m630a(Looper looper, boolean z10) {
        Object newInstance;
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            C9322n.m27779c(newInstance, "null cannot be cast to non-null type android.os.Handler");
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
