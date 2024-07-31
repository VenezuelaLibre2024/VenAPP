package p272oc;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.a1 */
/* loaded from: classes.dex */
public final class C9833a1 implements ComponentCallbacks2C5119c.a {

    /* renamed from: a */
    private final /* synthetic */ C9903x0 f24275a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9833a1(C9903x0 c9903x0) {
        this.f24275a = c9903x0;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c.a
    /* renamed from: a */
    public final void mo13016a(boolean z10) {
        boolean m29612e;
        C9887s c9887s;
        if (z10) {
            this.f24275a.f24413c = true;
            this.f24275a.m29614b();
            return;
        }
        this.f24275a.f24413c = false;
        m29612e = this.f24275a.m29612e();
        if (m29612e) {
            c9887s = this.f24275a.f24412b;
            c9887s.m29591c();
        }
    }
}
