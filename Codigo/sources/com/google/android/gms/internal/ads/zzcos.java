package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
final class zzcos implements zzfer {
    private final zzcnc zza;
    private Context zzb;
    private String zzc;
    private z4 zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcos(zzcnc zzcncVar, zzcor zzcorVar) {
        this.zza = zzcncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final /* synthetic */ zzfer zza(z4 z4Var) {
        z4Var.getClass();
        this.zzd = z4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final /* synthetic */ zzfer zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final /* synthetic */ zzfer zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final zzfes zzd() {
        zzhhl.zzc(this.zzb, Context.class);
        zzhhl.zzc(this.zzc, String.class);
        zzhhl.zzc(this.zzd, z4.class);
        return new zzcou(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
