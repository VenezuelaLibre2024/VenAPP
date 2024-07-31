package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i2 implements OnCompleteListener<oc.g1> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p0 f11694a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11695b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11696c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f11696c = firebaseAuth;
        this.f11694a = p0Var;
        this.f11695b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<oc.g1> task) {
        String c10;
        String a10;
        q0.b a02;
        zzaai zzaaiVar;
        String str;
        zzaai zzaaiVar2;
        String str2;
        if (task.isSuccessful()) {
            c10 = task.getResult().c();
            a10 = task.getResult().a();
        } else {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception != null && oc.d0.f(exception)) {
                FirebaseAuth.j0((zb.m) exception, this.f11694a, this.f11695b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                c10 = null;
                a10 = null;
            }
        }
        long longValue = this.f11694a.h().longValue();
        a02 = this.f11696c.a0(this.f11694a.i(), this.f11694a.f());
        if (TextUtils.isEmpty(c10)) {
            a02 = this.f11696c.Z(this.f11694a, a02);
        }
        q0.b bVar = a02;
        oc.o oVar = (oc.o) com.google.android.gms.common.internal.s.j(this.f11694a.d());
        if (oVar.zzd()) {
            zzaaiVar2 = this.f11696c.f11609e;
            String str4 = (String) com.google.android.gms.common.internal.s.j(this.f11694a.i());
            str2 = this.f11696c.f11613i;
            zzaaiVar2.zza(oVar, str4, str2, longValue, this.f11694a.e() != null, this.f11694a.l(), c10, a10, this.f11696c.H0(), bVar, this.f11694a.j(), this.f11694a.a());
            return;
        }
        zzaaiVar = this.f11696c.f11609e;
        t0 t0Var = (t0) com.google.android.gms.common.internal.s.j(this.f11694a.g());
        str = this.f11696c.f11613i;
        zzaaiVar.zza(oVar, t0Var, str, longValue, this.f11694a.e() != null, this.f11694a.l(), c10, a10, this.f11696c.H0(), bVar, this.f11694a.j(), this.f11694a.a());
    }
}
