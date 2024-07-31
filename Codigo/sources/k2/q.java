package k2;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f20211a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.b f20212b;

    public q(String workSpecId, androidx.work.b progress) {
        kotlin.jvm.internal.n.e(workSpecId, "workSpecId");
        kotlin.jvm.internal.n.e(progress, "progress");
        this.f20211a = workSpecId;
        this.f20212b = progress;
    }

    public final androidx.work.b a() {
        return this.f20212b;
    }

    public final String b() {
        return this.f20211a;
    }
}
