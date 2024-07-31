package al;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p124gk.AbstractC7582a;
import p124gk.InterfaceC7587f;
import p494zk.InterfaceC13068i0;

/* renamed from: al.b */
/* loaded from: classes3.dex */
public final class C0132b extends AbstractC7582a implements InterfaceC13068i0 {
    private volatile Object _preHandler;

    public C0132b() {
        super(InterfaceC13068i0.f35453p);
        this._preHandler = this;
    }

    /* renamed from: D0 */
    private final Method m620D0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p494zk.InterfaceC13068i0
    /* renamed from: e */
    public void mo621e(InterfaceC7587f interfaceC7587f, Throwable th2) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method m620D0 = m620D0();
            Object invoke = m620D0 != null ? m620D0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
