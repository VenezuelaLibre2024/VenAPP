package v9;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private String f28734a;

    private k() {
    }

    public static final k c(l lVar) {
        String b10 = lVar.b();
        k kVar = new k();
        if (b10 != null) {
            kVar.f28734a = com.google.android.gms.common.internal.s.f(b10);
        }
        return kVar;
    }

    public final k a(String str) {
        this.f28734a = com.google.android.gms.common.internal.s.f(str);
        return this;
    }

    public final l b() {
        return new l(this.f28734a);
    }
}
