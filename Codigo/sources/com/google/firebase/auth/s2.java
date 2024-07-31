package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzagj;
import com.google.android.gms.internal.p002firebaseauthapi.zzagp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s2 implements Continuation<zzagj, Task<z0>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11783a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(FirebaseAuth firebaseAuth) {
        this.f11783a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<z0> then(Task<zzagj> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) com.google.android.gms.common.internal.s.j(task.getException()));
        }
        zzagj result = task.getResult();
        if (result instanceof zzagp) {
            zzagp zzagpVar = (zzagp) result;
            return Tasks.forResult(new oc.z0(com.google.android.gms.common.internal.s.f(zzagpVar.zzf()), com.google.android.gms.common.internal.s.f(zzagpVar.zze()), zzagpVar.zzc(), zzagpVar.zzb(), zzagpVar.zzd(), com.google.android.gms.common.internal.s.f(zzagpVar.zza()), this.f11783a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
