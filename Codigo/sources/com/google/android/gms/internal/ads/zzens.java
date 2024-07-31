package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzens implements zzeip {
    private final zzeow zza;
    private final zzdua zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzens(zzeow zzeowVar, zzdua zzduaVar) {
        this.zza = zzeowVar;
        this.zzb = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final zzeiq zza(String str, JSONObject jSONObject) {
        zzbus zzbusVar;
        if (((Boolean) a0.c().zza(zzbgc.zzbE)).booleanValue()) {
            try {
                zzbusVar = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                zzcec.zzh("Coundn't create RTB adapter: ", e10);
                zzbusVar = null;
            }
        } else {
            zzbusVar = this.zza.zza(str);
        }
        if (zzbusVar == null) {
            return null;
        }
        return new zzeiq(zzbusVar, new zzekj(), str);
    }
}
