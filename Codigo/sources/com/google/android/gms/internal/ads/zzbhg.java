package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbhg extends m9.b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhg(zzbhh zzbhhVar, String str) {
        this.zza = str;
        this.zzb = zzbhhVar;
    }

    @Override // m9.b
    public final void onFailure(String str) {
        androidx.browser.customtabs.i iVar;
        zzcec.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbhh zzbhhVar = this.zzb;
            iVar = zzbhhVar.zzd;
            iVar.j(zzbhhVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e10) {
            zzcec.zzh("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // m9.b
    public final void onSuccess(m9.a aVar) {
        androidx.browser.customtabs.i iVar;
        String b10 = aVar.b();
        try {
            zzbhh zzbhhVar = this.zzb;
            iVar = zzbhhVar.zzd;
            iVar.j(zzbhhVar.zzd(this.zza, b10).toString(), null);
        } catch (JSONException e10) {
            zzcec.zzh("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
