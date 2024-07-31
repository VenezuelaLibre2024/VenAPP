package vi;

/* renamed from: vi.i1 */
/* loaded from: classes3.dex */
public class C11921i1 extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: a */
    private final C11915g1 f31566a;

    /* renamed from: b */
    private final C11953w0 f31567b;

    /* renamed from: c */
    private final boolean f31568c;

    public C11921i1(C11915g1 c11915g1) {
        this(c11915g1, null);
    }

    public C11921i1(C11915g1 c11915g1, C11953w0 c11953w0) {
        this(c11915g1, c11953w0, true);
    }

    C11921i1(C11915g1 c11915g1, C11953w0 c11953w0, boolean z10) {
        super(C11915g1.m38133h(c11915g1), c11915g1.m38142m());
        this.f31566a = c11915g1;
        this.f31567b = c11953w0;
        this.f31568c = z10;
        fillInStackTrace();
    }

    /* renamed from: a */
    public final C11915g1 m38167a() {
        return this.f31566a;
    }

    /* renamed from: b */
    public final C11953w0 m38168b() {
        return this.f31567b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f31568c ? super.fillInStackTrace() : this;
    }
}
