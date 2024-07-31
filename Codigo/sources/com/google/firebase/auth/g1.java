package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 extends oc.o0<i> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f11686a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a0 f11687b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j f11688c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11689d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(FirebaseAuth firebaseAuth, boolean z10, a0 a0Var, j jVar) {
        this.f11689d = firebaseAuth;
        this.f11686a = z10;
        this.f11687b = a0Var;
        this.f11688c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // oc.o0
    public final Task<i> c(String str) {
        zzaai zzaaiVar;
        zb.g gVar;
        zzaai zzaaiVar2;
        zb.g gVar2;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (this.f11686a) {
            zzaaiVar2 = this.f11689d.f11609e;
            gVar2 = this.f11689d.f11605a;
            return zzaaiVar2.zzb(gVar2, (a0) com.google.android.gms.common.internal.s.j(this.f11687b), this.f11688c, str, (oc.d1) new FirebaseAuth.d());
        }
        zzaaiVar = this.f11689d.f11609e;
        gVar = this.f11689d.f11605a;
        return zzaaiVar.zza(gVar, this.f11688c, str, (oc.i1) new FirebaseAuth.c());
    }
}
