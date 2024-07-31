package dl;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient cl.c<?> f14246a;

    public a(cl.c<?> cVar) {
        super("Flow was aborted, no more elements needed");
        this.f14246a = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
