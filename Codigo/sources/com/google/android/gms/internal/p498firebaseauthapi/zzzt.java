package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
final class zzzt implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzt(zzzu zzzuVar, zzadk zzadkVar, zzafn zzafnVar) {
        this.zzc = zzzuVar;
        this.zza = zzadkVar;
        this.zzb = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        List<zzafc> zza = zzafdVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zza(this.zzb, zza.get(0));
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
