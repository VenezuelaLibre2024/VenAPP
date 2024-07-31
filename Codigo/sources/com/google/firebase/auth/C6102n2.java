package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p272oc.AbstractC9876o0;
import p272oc.InterfaceC9844d1;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.n2 */
/* loaded from: classes.dex */
public final class C6102n2 extends AbstractC9876o0<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ AbstractC6045a0 f12959a;

    /* renamed from: b */
    private final /* synthetic */ C6083j f12960b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6102n2(FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0, C6083j c6083j) {
        this.f12961c = firebaseAuth;
        this.f12959a = abstractC6045a0;
        this.f12960b = c6083j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // p272oc.AbstractC9876o0
    /* renamed from: c */
    public final Task<InterfaceC6076i> mo16525c(String str) {
        zzaai zzaaiVar;
        C12867g c12867g;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        zzaaiVar = this.f12961c.f12824e;
        c12867g = this.f12961c.f12820a;
        return zzaaiVar.zza(c12867g, this.f12959a, (AbstractC6072h) this.f12960b, str, (InterfaceC9844d1) new FirebaseAuth.C6043d());
    }
}
