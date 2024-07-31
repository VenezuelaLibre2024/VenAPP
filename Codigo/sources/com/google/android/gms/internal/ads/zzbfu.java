package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzbfu {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbfu(int i10, String str, Object obj, zzbft zzbftVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        a0.a().zzd(this);
    }

    public static zzbfu zzf(int i10, String str, float f10) {
        return new zzbfr(1, str, Float.valueOf(f10));
    }

    public static zzbfu zzg(int i10, String str, int i11) {
        return new zzbfp(1, str, Integer.valueOf(i11));
    }

    public static zzbfu zzh(int i10, String str, long j10) {
        return new zzbfq(1, str, Long.valueOf(j10));
    }

    public static zzbfu zzi(int i10, String str, Boolean bool) {
        return new zzbfo(i10, str, bool);
    }

    public static zzbfu zzj(int i10, String str, String str2) {
        return new zzbfs(1, str, str2);
    }

    public static zzbfu zzk(int i10, String str) {
        zzbfu zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        a0.a().zzc(zzj);
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return a0.c().zza(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
