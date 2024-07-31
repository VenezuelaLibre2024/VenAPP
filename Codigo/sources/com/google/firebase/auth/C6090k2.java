package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.firebase.auth.C6112q0;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.k2 */
/* loaded from: classes.dex */
public final class C6090k2 extends C6112q0.b {

    /* renamed from: a */
    private final /* synthetic */ C6108p0 f12938a;

    /* renamed from: b */
    private final /* synthetic */ C6112q0.b f12939b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6090k2(FirebaseAuth firebaseAuth, C6108p0 c6108p0, C6112q0.b bVar) {
        this.f12940c = firebaseAuth;
        this.f12938a = c6108p0;
        this.f12939b = bVar;
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f12939b.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeSent(String str, C6112q0.a aVar) {
        this.f12939b.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationCompleted(C6104o0 c6104o0) {
        this.f12939b.onVerificationCompleted(c6104o0);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationFailed(C12873m c12873m) {
        if (zzacf.zza(c12873m)) {
            this.f12938a.m16583b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f12938a.m16590i());
            FirebaseAuth.m16351g0(this.f12938a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f12938a.m16590i() + ", error - " + c12873m.getMessage());
        this.f12939b.onVerificationFailed(c12873m);
    }
}
