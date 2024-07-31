package p089el;

import p124gk.InterfaceC7587f;

/* renamed from: el.i */
/* loaded from: classes3.dex */
public final class C7224i extends RuntimeException {

    /* renamed from: a */
    private final transient InterfaceC7587f f16195a;

    public C7224i(InterfaceC7587f interfaceC7587f) {
        this.f16195a = interfaceC7587f;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f16195a.toString();
    }
}
