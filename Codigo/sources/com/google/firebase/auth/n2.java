package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n2 extends oc.o0<i> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f11744a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ j f11745b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11746c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(FirebaseAuth firebaseAuth, a0 a0Var, j jVar) {
        this.f11746c = firebaseAuth;
        this.f11744a = a0Var;
        this.f11745b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // oc.o0
    public final Task<i> c(String str) {
        zzaai zzaaiVar;
        zb.g gVar;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        zzaaiVar = this.f11746c.f11609e;
        gVar = this.f11746c.f11605a;
        return zzaaiVar.zza(gVar, this.f11744a, (h) this.f11745b, str, (oc.d1) new FirebaseAuth.d());
    }
}
