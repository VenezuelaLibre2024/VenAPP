package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: classes.dex */
public class v0 extends e2.g {

    /* renamed from: a, reason: collision with root package name */
    private ScriptHandlerBoundaryInterface f5632a;

    private v0(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f5632a = scriptHandlerBoundaryInterface;
    }

    public static v0 b(InvocationHandler invocationHandler) {
        return new v0((ScriptHandlerBoundaryInterface) hm.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // e2.g
    public void a() {
        this.f5632a.remove();
    }
}
