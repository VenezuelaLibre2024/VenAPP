package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 extends oc.o0<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f11776a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ e f11777b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11778c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p2(FirebaseAuth firebaseAuth, String str, e eVar) {
        this.f11778c = firebaseAuth;
        this.f11776a = str;
        this.f11777b = eVar;
    }

    @Override // oc.o0
    public final Task<Void> c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        zb.g gVar;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f11776a;
            sb2 = new StringBuilder("Password reset request ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f11776a;
            sb2 = new StringBuilder("Got reCAPTCHA token for password reset of email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaaiVar = this.f11778c.f11609e;
        gVar = this.f11778c.f11605a;
        String str5 = this.f11776a;
        e eVar = this.f11777b;
        str3 = this.f11778c.f11615k;
        return zzaaiVar.zza(gVar, str5, eVar, str3, str);
    }
}
