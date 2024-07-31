package vi;

/* loaded from: classes3.dex */
public class i1 extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: a, reason: collision with root package name */
    private final g1 f29131a;

    /* renamed from: b, reason: collision with root package name */
    private final w0 f29132b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29133c;

    public i1(g1 g1Var) {
        this(g1Var, null);
    }

    public i1(g1 g1Var, w0 w0Var) {
        this(g1Var, w0Var, true);
    }

    i1(g1 g1Var, w0 w0Var, boolean z10) {
        super(g1.h(g1Var), g1Var.m());
        this.f29131a = g1Var;
        this.f29132b = w0Var;
        this.f29133c = z10;
        fillInStackTrace();
    }

    public final g1 a() {
        return this.f29131a;
    }

    public final w0 b() {
        return this.f29132b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f29133c ? super.fillInStackTrace() : this;
    }
}
