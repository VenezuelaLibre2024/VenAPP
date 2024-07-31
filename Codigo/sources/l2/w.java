package l2;

/* loaded from: classes.dex */
public class w implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final String f20876d = f2.j.i("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.e0 f20877a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.v f20878b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20879c;

    public w(androidx.work.impl.e0 e0Var, androidx.work.impl.v vVar, boolean z10) {
        this.f20877a = e0Var;
        this.f20878b = vVar;
        this.f20879c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean t10 = this.f20879c ? this.f20877a.o().t(this.f20878b) : this.f20877a.o().u(this.f20878b);
        f2.j.e().a(f20876d, "StopWorkRunnable for " + this.f20878b.a().b() + "; Processor.stopWork = " + t10);
    }
}
