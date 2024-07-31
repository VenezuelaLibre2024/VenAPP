package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzaai;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C6112q0;
import p272oc.AbstractC9853g1;
import p272oc.C9843d0;
import p272oc.C9875o;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.i2 */
/* loaded from: classes.dex */
public final class C6079i2 implements OnCompleteListener<AbstractC9853g1> {

    /* renamed from: a */
    private final /* synthetic */ C6108p0 f12909a;

    /* renamed from: b */
    private final /* synthetic */ String f12910b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12911c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6079i2(FirebaseAuth firebaseAuth, C6108p0 c6108p0, String str) {
        this.f12911c = firebaseAuth;
        this.f12909a = c6108p0;
        this.f12910b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<AbstractC9853g1> task) {
        String mo29538c;
        String mo29536a;
        C6112q0.b m16347a0;
        zzaai zzaaiVar;
        String str;
        zzaai zzaaiVar2;
        String str2;
        if (task.isSuccessful()) {
            mo29538c = task.getResult().mo29538c();
            mo29536a = task.getResult().mo29536a();
        } else {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception != null && C9843d0.m29519f(exception)) {
                FirebaseAuth.m16352j0((C12873m) exception, this.f12909a, this.f12910b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                mo29538c = null;
                mo29536a = null;
            }
        }
        long longValue = this.f12909a.m16589h().longValue();
        m16347a0 = this.f12911c.m16347a0(this.f12909a.m16590i(), this.f12909a.m16587f());
        if (TextUtils.isEmpty(mo29538c)) {
            m16347a0 = this.f12911c.m16384Z(this.f12909a, m16347a0);
        }
        C6112q0.b bVar = m16347a0;
        C9875o c9875o = (C9875o) C5276s.m13324j(this.f12909a.m16585d());
        if (c9875o.zzd()) {
            zzaaiVar2 = this.f12911c.f12824e;
            String str4 = (String) C5276s.m13324j(this.f12909a.m16590i());
            str2 = this.f12911c.f12828i;
            zzaaiVar2.zza(c9875o, str4, str2, longValue, this.f12909a.m16586e() != null, this.f12909a.m16593l(), mo29538c, mo29536a, this.f12911c.m16370H0(), bVar, this.f12909a.m16591j(), this.f12909a.m16582a());
            return;
        }
        zzaaiVar = this.f12911c.f12824e;
        C6124t0 c6124t0 = (C6124t0) C5276s.m13324j(this.f12909a.m16588g());
        str = this.f12911c.f12828i;
        zzaaiVar.zza(c9875o, c6124t0, str, longValue, this.f12909a.m16586e() != null, this.f12909a.m16593l(), mo29538c, mo29536a, this.f12911c.m16370H0(), bVar, this.f12909a.m16591j(), this.f12909a.m16582a());
    }
}
