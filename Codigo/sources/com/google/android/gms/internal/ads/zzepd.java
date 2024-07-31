package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzepd extends zzbuu {
    private final String zza;
    private final zzbus zzb;
    private final zzceu zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzepd(String str, zzbus zzbusVar, zzceu zzceuVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzceuVar;
        this.zza = str;
        this.zzb = zzbusVar;
        this.zze = j10;
        try {
            jSONObject.put("adapter_version", zzbusVar.zzf().toString());
            jSONObject.put("sdk_version", zzbusVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzceu zzceuVar) {
        synchronized (zzepd.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) a0.c().zza(zzbgc.zzbA)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzceuVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(String str, int i10) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((Boolean) a0.c().zza(zzbgc.zzbB)).booleanValue()) {
                this.zzd.put("latency", t.b().b() - this.zze);
            }
            if (((Boolean) a0.c().zza(zzbgc.zzbA)).booleanValue()) {
                this.zzd.put("signal_error_code", i10);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) a0.c().zza(zzbgc.zzbA)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final synchronized void zze(String str) {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) a0.c().zza(zzbgc.zzbB)).booleanValue()) {
                this.zzd.put("latency", t.b().b() - this.zze);
            }
            if (((Boolean) a0.c().zza(zzbgc.zzbA)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final synchronized void zzf(String str) {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final synchronized void zzg(c3 c3Var) {
        zzh(c3Var.f8627b, 2);
    }
}
