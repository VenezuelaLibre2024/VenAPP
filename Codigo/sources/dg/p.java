package dg;

/* loaded from: classes2.dex */
public abstract class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static boolean f14146a;

    /* renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f14147b;

    static {
        f14146a = System.getProperty("surefire.test.class.path") != null;
        f14147b = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Throwable th2) {
        super(th2);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
