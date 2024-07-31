package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzabf extends zzacx<Void, Void> {
    private final zzafz zzy;

    public zzabf(String str, String str2, String str3, String str4) {
        super(15);
        this.zzy = zzafz.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzaey.ACCESS_TOKEN).zza();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "revokeAccessToken";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource<Void> taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        zzb(null);
    }
}
