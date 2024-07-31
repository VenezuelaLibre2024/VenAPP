package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 extends oc.o0<i> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f11680a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f11681b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a0 f11682c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f11683d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11684e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11685f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(FirebaseAuth firebaseAuth, String str, boolean z10, a0 a0Var, String str2, String str3) {
        this.f11685f = firebaseAuth;
        this.f11680a = str;
        this.f11681b = z10;
        this.f11682c = a0Var;
        this.f11683d = str2;
        this.f11684e = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // oc.o0
    public final Task<i> c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        zb.g gVar;
        zzaai zzaaiVar2;
        zb.g gVar2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f11680a;
            sb2 = new StringBuilder("Logging in as ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f11680a;
            sb2 = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        if (this.f11681b) {
            zzaaiVar2 = this.f11685f.f11609e;
            gVar2 = this.f11685f.f11605a;
            return zzaaiVar2.zzb(gVar2, (a0) com.google.android.gms.common.internal.s.j(this.f11682c), this.f11680a, this.f11683d, this.f11684e, str, new FirebaseAuth.d());
        }
        zzaaiVar = this.f11685f.f11609e;
        gVar = this.f11685f.f11605a;
        return zzaaiVar.zzb(gVar, this.f11680a, this.f11683d, this.f11684e, str, new FirebaseAuth.c());
    }
}
