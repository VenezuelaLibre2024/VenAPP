package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p272oc.AbstractC9876o0;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.f1 */
/* loaded from: classes.dex */
public final class C6066f1 extends AbstractC9876o0<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ String f12895a;

    /* renamed from: b */
    private final /* synthetic */ boolean f12896b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC6045a0 f12897c;

    /* renamed from: d */
    private final /* synthetic */ String f12898d;

    /* renamed from: e */
    private final /* synthetic */ String f12899e;

    /* renamed from: f */
    private final /* synthetic */ FirebaseAuth f12900f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6066f1(FirebaseAuth firebaseAuth, String str, boolean z10, AbstractC6045a0 abstractC6045a0, String str2, String str3) {
        this.f12900f = firebaseAuth;
        this.f12895a = str;
        this.f12896b = z10;
        this.f12897c = abstractC6045a0;
        this.f12898d = str2;
        this.f12899e = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // p272oc.AbstractC9876o0
    /* renamed from: c */
    public final Task<InterfaceC6076i> mo16525c(String str) {
        String str2;
        StringBuilder sb2;
        zzaai zzaaiVar;
        C12867g c12867g;
        zzaai zzaaiVar2;
        C12867g c12867g2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f12895a;
            sb2 = new StringBuilder("Logging in as ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f12895a;
            sb2 = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        if (this.f12896b) {
            zzaaiVar2 = this.f12900f.f12824e;
            c12867g2 = this.f12900f.f12820a;
            return zzaaiVar2.zzb(c12867g2, (AbstractC6045a0) C5276s.m13324j(this.f12897c), this.f12895a, this.f12898d, this.f12899e, str, new FirebaseAuth.C6043d());
        }
        zzaaiVar = this.f12900f.f12824e;
        c12867g = this.f12900f.f12820a;
        return zzaaiVar.zzb(c12867g, this.f12895a, this.f12898d, this.f12899e, str, new FirebaseAuth.C6042c());
    }
}
