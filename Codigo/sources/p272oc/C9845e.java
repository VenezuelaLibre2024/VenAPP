package p272oc;

import com.google.firebase.auth.AbstractC6135w;

/* renamed from: oc.e */
/* loaded from: classes.dex */
public final class C9845e extends AbstractC6135w {

    /* renamed from: a */
    private String f24303a;

    /* renamed from: b */
    private String f24304b;

    /* renamed from: c */
    private boolean f24305c = false;

    /* renamed from: d */
    private boolean f24306d = false;

    @Override // com.google.firebase.auth.AbstractC6135w
    /* renamed from: a */
    public final void mo16614a(boolean z10) {
        this.f24306d = z10;
    }

    @Override // com.google.firebase.auth.AbstractC6135w
    /* renamed from: b */
    public final void mo16615b(boolean z10) {
        this.f24305c = z10;
    }

    @Override // com.google.firebase.auth.AbstractC6135w
    /* renamed from: c */
    public final void mo16616c(String str, String str2) {
        this.f24303a = str;
        this.f24304b = str2;
    }

    /* renamed from: d */
    public final String m29523d() {
        return this.f24303a;
    }

    /* renamed from: e */
    public final String m29524e() {
        return this.f24304b;
    }

    /* renamed from: f */
    public final boolean m29525f() {
        return this.f24306d;
    }

    /* renamed from: g */
    public final boolean m29526g() {
        return (this.f24303a == null || this.f24304b == null) ? false : true;
    }

    /* renamed from: h */
    public final boolean m29527h() {
        return this.f24305c;
    }
}
