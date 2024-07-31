package dg;

/* loaded from: classes2.dex */
public final class h extends p {

    /* renamed from: c, reason: collision with root package name */
    private static final h f14132c;

    static {
        h hVar = new h();
        f14132c = hVar;
        hVar.setStackTrace(p.f14147b);
    }

    private h() {
    }

    private h(Throwable th2) {
        super(th2);
    }

    public static h a() {
        return p.f14146a ? new h() : f14132c;
    }

    public static h b(Throwable th2) {
        return p.f14146a ? new h(th2) : f14132c;
    }
}
