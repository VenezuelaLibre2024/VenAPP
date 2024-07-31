package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class zzade<ResultT, CallbackT> implements zzacv<ResultT> {
    private final zzacx<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzade(zzacx<ResultT, CallbackT> zzacxVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacxVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacv
    public final void zza(ResultT resultt, Status status) {
        C5276s.m13325k(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzacx<ResultT, CallbackT> zzacxVar = this.zza;
        if (zzacxVar.zzs != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzacxVar.zzc);
            zzacx<ResultT, CallbackT> zzacxVar2 = this.zza;
            taskCompletionSource.setException(zzacf.zza(firebaseAuth, zzacxVar2.zzs, ("reauthenticateWithCredential".equals(zzacxVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC6072h abstractC6072h = zzacxVar.zzp;
        if (abstractC6072h != null) {
            this.zzb.setException(zzacf.zza(status, abstractC6072h, zzacxVar.zzq, zzacxVar.zzr));
        } else {
            this.zzb.setException(zzacf.zza(status));
        }
    }
}
