package te;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final re.a f26876b = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final xe.c f26877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(xe.c cVar) {
        this.f26877a = cVar;
    }

    private boolean g() {
        re.a aVar;
        String str;
        xe.c cVar = this.f26877a;
        if (cVar == null) {
            aVar = f26876b;
            str = "ApplicationInfo is null";
        } else if (!cVar.n0()) {
            aVar = f26876b;
            str = "GoogleAppId is null";
        } else if (!this.f26877a.l0()) {
            aVar = f26876b;
            str = "AppInstanceId is null";
        } else if (!this.f26877a.m0()) {
            aVar = f26876b;
            str = "ApplicationProcessState is null";
        } else {
            if (!this.f26877a.k0()) {
                return true;
            }
            if (!this.f26877a.h0().g0()) {
                aVar = f26876b;
                str = "AndroidAppInfo.packageName is null";
            } else {
                if (this.f26877a.h0().h0()) {
                    return true;
                }
                aVar = f26876b;
                str = "AndroidAppInfo.sdkVersion is null";
            }
        }
        aVar.j(str);
        return false;
    }

    @Override // te.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f26876b.j("ApplicationInfo is invalid");
        return false;
    }
}
