package p367te;

import p444xe.C12470c;
import re.C10696a;

/* renamed from: te.a */
/* loaded from: classes.dex */
public class C11247a extends AbstractC11251e {

    /* renamed from: b */
    private static final C10696a f29172b = C10696a.m32565e();

    /* renamed from: a */
    private final C12470c f29173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11247a(C12470c c12470c) {
        this.f29173a = c12470c;
    }

    /* renamed from: g */
    private boolean m35133g() {
        C10696a c10696a;
        String str;
        C12470c c12470c = this.f29173a;
        if (c12470c == null) {
            c10696a = f29172b;
            str = "ApplicationInfo is null";
        } else if (!c12470c.m40528n0()) {
            c10696a = f29172b;
            str = "GoogleAppId is null";
        } else if (!this.f29173a.m40526l0()) {
            c10696a = f29172b;
            str = "AppInstanceId is null";
        } else if (!this.f29173a.m40527m0()) {
            c10696a = f29172b;
            str = "ApplicationProcessState is null";
        } else {
            if (!this.f29173a.m40525k0()) {
                return true;
            }
            if (!this.f29173a.m40524h0().m40497g0()) {
                c10696a = f29172b;
                str = "AndroidAppInfo.packageName is null";
            } else {
                if (this.f29173a.m40524h0().m40498h0()) {
                    return true;
                }
                c10696a = f29172b;
                str = "AndroidAppInfo.sdkVersion is null";
            }
        }
        c10696a.m32574j(str);
        return false;
    }

    @Override // p367te.AbstractC11251e
    /* renamed from: c */
    public boolean mo35134c() {
        if (m35133g()) {
            return true;
        }
        f29172b.m32574j("ApplicationInfo is invalid");
        return false;
    }
}
