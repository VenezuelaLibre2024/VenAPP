package vi;

/* loaded from: classes3.dex */
public class h1 extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: a, reason: collision with root package name */
    private final g1 f29124a;

    /* renamed from: b, reason: collision with root package name */
    private final w0 f29125b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29126c;

    public h1(g1 g1Var) {
        this(g1Var, null);
    }

    public h1(g1 g1Var, w0 w0Var) {
        this(g1Var, w0Var, true);
    }

    h1(g1 g1Var, w0 w0Var, boolean z10) {
        super(g1.h(g1Var), g1Var.m());
        this.f29124a = g1Var;
        this.f29125b = w0Var;
        this.f29126c = z10;
        fillInStackTrace();
    }

    public final g1 a() {
        return this.f29124a;
    }

    public final w0 b() {
        return this.f29125b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f29126c ? super.fillInStackTrace() : this;
    }
}
