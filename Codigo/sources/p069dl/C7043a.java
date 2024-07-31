package p069dl;

import cl.InterfaceC2040c;
import java.util.concurrent.CancellationException;

/* renamed from: dl.a */
/* loaded from: classes3.dex */
public final class C7043a extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC2040c<?> f15604a;

    public C7043a(InterfaceC2040c<?> interfaceC2040c) {
        super("Flow was aborted, no more elements needed");
        this.f15604a = interfaceC2040c;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
