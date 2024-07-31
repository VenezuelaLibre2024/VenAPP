package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzctl implements zzayq {
    private zzcjk zza;
    private final Executor zzb;
    private final zzcsx zzc;
    private final la.f zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcta zzg = new zzcta();

    public zzctl(Executor executor, zzcsx zzcsxVar, la.f fVar) {
        this.zzb = executor;
        this.zzc = zzcsxVar;
        this.zzd = fVar;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzctl.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e10) {
            u1.b("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        boolean z10 = this.zzf ? false : zzaypVar.zzj;
        zzcta zzctaVar = this.zzg;
        zzctaVar.zza = z10;
        zzctaVar.zzd = this.zzd.b();
        this.zzg.zzf = zzaypVar;
        if (this.zze) {
            zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcjk zzcjkVar) {
        this.zza = zzcjkVar;
    }
}
