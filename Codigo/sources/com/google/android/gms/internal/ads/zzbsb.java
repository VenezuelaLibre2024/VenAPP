package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbsb implements zzbrn {
    private final zzbrp zza;
    private final zzbrq zzb;
    private final zzbrj zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsb(zzbrj zzbrjVar, String str, zzbrq zzbrqVar, zzbrp zzbrpVar) {
        this.zzc = zzbrjVar;
        this.zzd = str;
        this.zzb = zzbrqVar;
        this.zza = zzbrpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzbsb zzbsbVar, zzbrd zzbrdVar, zzbrk zzbrkVar, Object obj, zzceu zzceuVar) {
        try {
            t.r();
            String uuid = UUID.randomUUID().toString();
            zzbnf.zzo.zzc(uuid, new zzbsa(zzbsbVar, zzbrdVar, zzceuVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzbsbVar.zzb.zzb(obj));
            zzbrkVar.zzl(zzbsbVar.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzceuVar.zzd(e10);
                zzcec.zzh("Unable to invokeJavascript", e10);
            } finally {
                zzbrdVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final com.google.common.util.concurrent.f zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final com.google.common.util.concurrent.f zzb(Object obj) {
        zzceu zzceuVar = new zzceu();
        zzbrd zzb = this.zzc.zzb(null);
        u1.a("callJs > getEngine: Promise created");
        zzb.zzi(new zzbry(this, zzb, obj, zzceuVar), new zzbrz(this, zzceuVar, zzb));
        return zzceuVar;
    }
}
