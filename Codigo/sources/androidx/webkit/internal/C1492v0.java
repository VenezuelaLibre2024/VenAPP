package androidx.webkit.internal;

import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import p073e2.AbstractC7103g;

/* renamed from: androidx.webkit.internal.v0 */
/* loaded from: classes.dex */
public class C1492v0 extends AbstractC7103g {

    /* renamed from: a */
    private ScriptHandlerBoundaryInterface f6483a;

    private C1492v0(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f6483a = scriptHandlerBoundaryInterface;
    }

    /* renamed from: b */
    public static C1492v0 m8444b(InvocationHandler invocationHandler) {
        return new C1492v0((ScriptHandlerBoundaryInterface) C7757a.m23674a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // p073e2.AbstractC7103g
    /* renamed from: a */
    public void mo8445a() {
        this.f6483a.remove();
    }
}
