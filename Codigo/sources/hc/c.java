package hc;

/* loaded from: classes.dex */
public final class c extends ec.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16656a;

    /* renamed from: b, reason: collision with root package name */
    private final zb.m f16657b;

    private c(String str, zb.m mVar) {
        com.google.android.gms.common.internal.s.f(str);
        this.f16656a = str;
        this.f16657b = mVar;
    }

    public static c c(ec.c cVar) {
        com.google.android.gms.common.internal.s.j(cVar);
        return new c(cVar.b(), null);
    }

    public static c d(zb.m mVar) {
        return new c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (zb.m) com.google.android.gms.common.internal.s.j(mVar));
    }

    @Override // ec.d
    public Exception a() {
        return this.f16657b;
    }

    @Override // ec.d
    public String b() {
        return this.f16656a;
    }
}
