package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbsi implements zzbnu {
    final /* synthetic */ zzbsj zza;
    private final zzceu zzb;

    public zzbsi(zzbsj zzbsjVar, zzceu zzceuVar) {
        this.zza = zzbsjVar;
        this.zzb = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbrm());
            } else {
                this.zzb.zzd(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zzb.zzd(e10);
        }
    }
}
