package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m2 extends oc.o0<i> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f11733a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11734b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11735c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f11735c = firebaseAuth;
        this.f11733a = str;
        this.f11734b = str2;
    }

    @Override // oc.o0
    public final Task<i> c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        zb.g gVar;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f11733a;
            sb2 = new StringBuilder("Creating user with ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f11733a;
            sb2 = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaaiVar = this.f11735c.f11609e;
        gVar = this.f11735c.f11605a;
        String str5 = this.f11733a;
        String str6 = this.f11734b;
        str3 = this.f11735c.f11615k;
        return zzaaiVar.zza(gVar, str5, str6, str3, str, new FirebaseAuth.c());
    }
}
