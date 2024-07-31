package oc;

/* loaded from: classes.dex */
public final class e extends com.google.firebase.auth.w {

    /* renamed from: a, reason: collision with root package name */
    private String f22370a;

    /* renamed from: b, reason: collision with root package name */
    private String f22371b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22372c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22373d = false;

    @Override // com.google.firebase.auth.w
    public final void a(boolean z10) {
        this.f22373d = z10;
    }

    @Override // com.google.firebase.auth.w
    public final void b(boolean z10) {
        this.f22372c = z10;
    }

    @Override // com.google.firebase.auth.w
    public final void c(String str, String str2) {
        this.f22370a = str;
        this.f22371b = str2;
    }

    public final String d() {
        return this.f22370a;
    }

    public final String e() {
        return this.f22371b;
    }

    public final boolean f() {
        return this.f22373d;
    }

    public final boolean g() {
        return (this.f22370a == null || this.f22371b == null) ? false : true;
    }

    public final boolean h() {
        return this.f22372c;
    }
}
