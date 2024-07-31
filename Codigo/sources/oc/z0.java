package oc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class z0 implements com.google.firebase.auth.z0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22499b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22500c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22501d;

    /* renamed from: e, reason: collision with root package name */
    private final long f22502e;

    /* renamed from: f, reason: collision with root package name */
    private String f22503f;

    /* renamed from: g, reason: collision with root package name */
    private FirebaseAuth f22504g;

    public z0(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.s.g(str3, "sessionInfo cannot be empty.");
        com.google.android.gms.common.internal.s.k(firebaseAuth, "firebaseAuth cannot be null.");
        this.f22498a = com.google.android.gms.common.internal.s.g(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f22499b = com.google.android.gms.common.internal.s.g(str2, "hashAlgorithm cannot be empty.");
        this.f22500c = i10;
        this.f22501d = i11;
        this.f22502e = j10;
        this.f22503f = str3;
        this.f22504g = firebaseAuth;
    }

    private final void j(String str) {
        this.f22504g.i().m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.z0
    public final String a() {
        return this.f22499b;
    }

    @Override // com.google.firebase.auth.z0
    public final int b() {
        return this.f22500c;
    }

    @Override // com.google.firebase.auth.z0
    public final String c() {
        return this.f22503f;
    }

    @Override // com.google.firebase.auth.z0
    public final String d() {
        return this.f22498a;
    }

    @Override // com.google.firebase.auth.z0
    public final String e(String str, String str2) {
        com.google.android.gms.common.internal.s.g(str, "accountName cannot be empty.");
        com.google.android.gms.common.internal.s.g(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f22498a, str2, this.f22499b, Integer.valueOf(this.f22500c));
    }

    @Override // com.google.firebase.auth.z0
    public final String f() {
        return e(com.google.android.gms.common.internal.s.g(((com.google.firebase.auth.a0) com.google.android.gms.common.internal.s.k(this.f22504g.j(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).r(), "Email cannot be empty, since verified email is required to use MFA."), this.f22504g.i().q());
    }

    @Override // com.google.firebase.auth.z0
    public final long g() {
        return this.f22502e;
    }

    @Override // com.google.firebase.auth.z0
    public final int h() {
        return this.f22501d;
    }

    @Override // com.google.firebase.auth.z0
    public final void i(String str) {
        com.google.android.gms.common.internal.s.g(str, "qrCodeUrl cannot be empty.");
        try {
            j(str);
        } catch (ActivityNotFoundException unused) {
            j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }
}
