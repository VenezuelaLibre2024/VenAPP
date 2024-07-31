package el;

/* loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient gk.f f14772a;

    public i(gk.f fVar) {
        this.f14772a = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f14772a.toString();
    }
}
