package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbga implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzd(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbgh.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbfx
                public final /* synthetic */ SharedPreferences zza;

                public /* synthetic */ zzbfx(SharedPreferences sharedPreferences2) {
                    r1 = sharedPreferences2;
                }

                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object zza() {
                    return r1.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzd(sharedPreferences);
        }
    }

    public final Object zza(zzbfu zzbfuVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbfuVar.zzm();
            }
        }
        if (zzbfuVar.zze() != 2) {
            return (zzbfuVar.zze() == 1 && this.zzh.has(zzbfuVar.zzn())) ? zzbfuVar.zza(this.zzh) : zzbgh.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbfy
                public final /* synthetic */ zzbfu zzb;

                public /* synthetic */ zzbfy(zzbfu zzbfuVar2) {
                    r2 = zzbfuVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object zza() {
                    return zzbga.this.zzb(r2);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbfuVar2.zzm() : zzbfuVar2.zzb(bundle);
    }

    public final /* synthetic */ Object zzb(zzbfu zzbfuVar) {
        return zzbfuVar.zzc(this.zze);
    }

    public final void zzc(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = na.e.a(context).c(this.zzg.getPackageName(), RecognitionOptions.ITF).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                Context d10 = ca.k.d(context2);
                if (d10 != null || context2 == null || (d10 = context2.getApplicationContext()) != null) {
                    context2 = d10;
                }
                if (context2 == null) {
                    return;
                }
                a0.b();
                SharedPreferences zza = zzbfw.zza(context2);
                this.zze = zza;
                if (zza != null) {
                    zza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbis.zzc(new zzbfz(this, this.zze));
                zzd(this.zze);
                this.zzd = true;
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }
}
