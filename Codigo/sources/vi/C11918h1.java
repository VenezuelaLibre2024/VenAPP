package vi;

/* renamed from: vi.h1 */
/* loaded from: classes3.dex */
public class C11918h1 extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: a */
    private final C11915g1 f31559a;

    /* renamed from: b */
    private final C11953w0 f31560b;

    /* renamed from: c */
    private final boolean f31561c;

    public C11918h1(C11915g1 c11915g1) {
        this(c11915g1, null);
    }

    public C11918h1(C11915g1 c11915g1, C11953w0 c11953w0) {
        this(c11915g1, c11953w0, true);
    }

    C11918h1(C11915g1 c11915g1, C11953w0 c11953w0, boolean z10) {
        super(C11915g1.m38133h(c11915g1), c11915g1.m38142m());
        this.f31559a = c11915g1;
        this.f31560b = c11953w0;
        this.f31561c = z10;
        fillInStackTrace();
    }

    /* renamed from: a */
    public final C11915g1 m38159a() {
        return this.f31559a;
    }

    /* renamed from: b */
    public final C11953w0 m38160b() {
        return this.f31560b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f31561c ? super.fillInStackTrace() : this;
    }
}
