package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p272oc.AbstractC9876o0;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.m2 */
/* loaded from: classes.dex */
public final class C6098m2 extends AbstractC9876o0<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ String f12948a;

    /* renamed from: b */
    private final /* synthetic */ String f12949b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12950c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6098m2(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f12950c = firebaseAuth;
        this.f12948a = str;
        this.f12949b = str2;
    }

    @Override // p272oc.AbstractC9876o0
    /* renamed from: c */
    public final Task<InterfaceC6076i> mo16525c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        C12867g c12867g;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f12948a;
            sb2 = new StringBuilder("Creating user with ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f12948a;
            sb2 = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaaiVar = this.f12950c.f12824e;
        c12867g = this.f12950c.f12820a;
        String str5 = this.f12948a;
        String str6 = this.f12949b;
        str3 = this.f12950c.f12830k;
        return zzaaiVar.zza(c12867g, str5, str6, str3, str, new FirebaseAuth.C6042c());
    }
}
