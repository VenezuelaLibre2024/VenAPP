package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import p272oc.AbstractC9876o0;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.p2 */
/* loaded from: classes.dex */
public final class C6110p2 extends AbstractC9876o0<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f12991a;

    /* renamed from: b */
    private final /* synthetic */ C6060e f12992b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12993c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6110p2(FirebaseAuth firebaseAuth, String str, C6060e c6060e) {
        this.f12993c = firebaseAuth;
        this.f12991a = str;
        this.f12992b = c6060e;
    }

    @Override // p272oc.AbstractC9876o0
    /* renamed from: c */
    public final Task<Void> mo16525c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        C12867g c12867g;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f12991a;
            sb2 = new StringBuilder("Password reset request ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f12991a;
            sb2 = new StringBuilder("Got reCAPTCHA token for password reset of email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaaiVar = this.f12993c.f12824e;
        c12867g = this.f12993c.f12820a;
        String str5 = this.f12991a;
        C6060e c6060e = this.f12992b;
        str3 = this.f12993c.f12830k;
        return zzaaiVar.zza(c12867g, str5, c6060e, str3, str);
    }
}
