package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.f;

/* loaded from: classes2.dex */
public final class zzgg implements zzgb {
    private static zzgg zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgg() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzgg(Context context) {
        this.zzb = context;
        zzgi zzgiVar = new zzgi(this, null);
        this.zzc = zzgiVar;
        context.getContentResolver().registerContentObserver(zzfr.zza, true, zzgiVar);
    }

    public static zzgg zza(Context context) {
        zzgg zzggVar;
        synchronized (zzgg.class) {
            if (zza == null) {
                zza = f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgg(context) : new zzgg();
            }
            zzggVar = zza;
        }
        return zzggVar;
    }

    public static synchronized void zza() {
        Context context;
        synchronized (zzgg.class) {
            zzgg zzggVar = zza;
            if (zzggVar != null && (context = zzggVar.zzb) != null && zzggVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    /* renamed from: zzc */
    public final String zza(String str) {
        Context context = this.zzb;
        if (context != null && !zzfw.zza(context)) {
            try {
                return (String) zzge.zza(new zzgd() { // from class: com.google.android.gms.internal.measurement.zzgf
                    private /* synthetic */ String zzb;

                    public /* synthetic */ zzgf(String str2) {
                        r2 = str2;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzgd
                    public final Object zza() {
                        return zzgg.this.zzb(r2);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str2, e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzb(String str) {
        return zzfr.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
