package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p272oc.AbstractC9876o0;
import p272oc.InterfaceC9844d1;
import p272oc.InterfaceC9859i1;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.g1 */
/* loaded from: classes.dex */
public final class C6070g1 extends AbstractC9876o0<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ boolean f12901a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC6045a0 f12902b;

    /* renamed from: c */
    private final /* synthetic */ C6083j f12903c;

    /* renamed from: d */
    private final /* synthetic */ FirebaseAuth f12904d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6070g1(FirebaseAuth firebaseAuth, boolean z10, AbstractC6045a0 abstractC6045a0, C6083j c6083j) {
        this.f12904d = firebaseAuth;
        this.f12901a = z10;
        this.f12902b = abstractC6045a0;
        this.f12903c = c6083j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // p272oc.AbstractC9876o0
    /* renamed from: c */
    public final Task<InterfaceC6076i> mo16525c(String str) {
        zzaai zzaaiVar;
        C12867g c12867g;
        zzaai zzaaiVar2;
        C12867g c12867g2;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (this.f12901a) {
            zzaaiVar2 = this.f12904d.f12824e;
            c12867g2 = this.f12904d.f12820a;
            return zzaaiVar2.zzb(c12867g2, (AbstractC6045a0) C5276s.m13324j(this.f12902b), this.f12903c, str, (InterfaceC9844d1) new FirebaseAuth.C6043d());
        }
        zzaaiVar = this.f12904d.f12824e;
        c12867g = this.f12904d.f12820a;
        return zzaaiVar.zza(c12867g, this.f12903c, str, (InterfaceC9859i1) new FirebaseAuth.C6042c());
    }
}
