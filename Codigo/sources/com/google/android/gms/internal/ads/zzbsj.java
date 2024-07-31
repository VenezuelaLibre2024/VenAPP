package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.t;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbsj implements zzgdu {
    private final zzbrp zza;
    private final zzbrq zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final com.google.common.util.concurrent.f zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsj(com.google.common.util.concurrent.f fVar, String str, zzbrq zzbrqVar, zzbrp zzbrpVar) {
        this.zzd = fVar;
        this.zzb = zzbrqVar;
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final com.google.common.util.concurrent.f zza(Object obj) {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.f zzb(final Object obj) {
        return zzgen.zzn(this.zzd, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzbsh
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj2) {
                return zzbsj.this.zzc(obj, (zzbrk) obj2);
            }
        }, zzcep.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(Object obj, zzbrk zzbrkVar) {
        zzceu zzceuVar = new zzceu();
        t.r();
        String uuid = UUID.randomUUID().toString();
        zzbnf.zzo.zzc(uuid, new zzbsi(this, zzceuVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbrkVar.zzl(this.zzc, jSONObject);
        return zzceuVar;
    }
}
