package p272oc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6146z0;

/* renamed from: oc.z0 */
/* loaded from: classes.dex */
public final class C9909z0 implements InterfaceC6146z0 {

    /* renamed from: a */
    private final String f24431a;

    /* renamed from: b */
    private final String f24432b;

    /* renamed from: c */
    private final int f24433c;

    /* renamed from: d */
    private final int f24434d;

    /* renamed from: e */
    private final long f24435e;

    /* renamed from: f */
    private String f24436f;

    /* renamed from: g */
    private FirebaseAuth f24437g;

    public C9909z0(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        C5276s.m13321g(str3, "sessionInfo cannot be empty.");
        C5276s.m13325k(firebaseAuth, "firebaseAuth cannot be null.");
        this.f24431a = C5276s.m13321g(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f24432b = C5276s.m13321g(str2, "hashAlgorithm cannot be empty.");
        this.f24433c = i10;
        this.f24434d = i11;
        this.f24435e = j10;
        this.f24436f = str3;
        this.f24437g = firebaseAuth;
    }

    /* renamed from: j */
    private final void m29624j(String str) {
        this.f24437g.m16396i().m42630m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: a */
    public final String mo16630a() {
        return this.f24432b;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: b */
    public final int mo16631b() {
        return this.f24433c;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: c */
    public final String mo16632c() {
        return this.f24436f;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: d */
    public final String mo16633d() {
        return this.f24431a;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: e */
    public final String mo16634e(String str, String str2) {
        C5276s.m13321g(str, "accountName cannot be empty.");
        C5276s.m13321g(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f24431a, str2, this.f24432b, Integer.valueOf(this.f24433c));
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: f */
    public final String mo16635f() {
        return mo16634e(C5276s.m13321g(((AbstractC6045a0) C5276s.m13325k(this.f24437g.m16398j(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).mo16455r(), "Email cannot be empty, since verified email is required to use MFA."), this.f24437g.m16396i().m42631q());
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: g */
    public final long mo16636g() {
        return this.f24435e;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: h */
    public final int mo16637h() {
        return this.f24434d;
    }

    @Override // com.google.firebase.auth.InterfaceC6146z0
    /* renamed from: i */
    public final void mo16638i(String str) {
        C5276s.m13321g(str, "qrCodeUrl cannot be empty.");
        try {
            m29624j(str);
        } catch (ActivityNotFoundException unused) {
            m29624j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }
}
