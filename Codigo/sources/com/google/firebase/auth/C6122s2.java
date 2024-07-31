package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagj;
import com.google.android.gms.internal.p498firebaseauthapi.zzagp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p272oc.C9909z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.s2 */
/* loaded from: classes.dex */
public final class C6122s2 implements Continuation<zzagj, Task<InterfaceC6146z0>> {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth f12998a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6122s2(FirebaseAuth firebaseAuth) {
        this.f12998a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<InterfaceC6146z0> then(Task<zzagj> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) C5276s.m13324j(task.getException()));
        }
        zzagj result = task.getResult();
        if (result instanceof zzagp) {
            zzagp zzagpVar = (zzagp) result;
            return Tasks.forResult(new C9909z0(C5276s.m13320f(zzagpVar.zzf()), C5276s.m13320f(zzagpVar.zze()), zzagpVar.zzc(), zzagpVar.zzb(), zzagpVar.zzd(), C5276s.m13320f(zzagpVar.zza()), this.f12998a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
