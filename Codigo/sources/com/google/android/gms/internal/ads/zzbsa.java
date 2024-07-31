package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbsa implements zzbnu {
    final /* synthetic */ zzbsb zza;
    private final zzbrd zzb;
    private final zzceu zzc;

    public zzbsa(zzbsb zzbsbVar, zzbrd zzbrdVar, zzceu zzceuVar) {
        this.zza = zzbsbVar;
        this.zzb = zzbrdVar;
        this.zzc = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbrm());
            } else {
                this.zzc.zzd(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zzb();
            throw th2;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        zzbrp zzbrpVar;
        try {
            try {
                zzceu zzceuVar = this.zzc;
                zzbrpVar = this.zza.zza;
                zzceuVar.zzc(zzbrpVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
