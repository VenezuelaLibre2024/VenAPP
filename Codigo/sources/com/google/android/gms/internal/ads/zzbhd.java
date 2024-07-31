package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbhd {
    private androidx.browser.customtabs.i zza;
    private androidx.browser.customtabs.c zzb;
    private androidx.browser.customtabs.e zzc;
    private zzbhb zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhhv.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.i zza() {
        androidx.browser.customtabs.c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.f(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhhv.zza(activity)) != null) {
            zzhhw zzhhwVar = new zzhhw(this);
            this.zzc = zzhhwVar;
            androidx.browser.customtabs.c.a(activity, zza, zzhhwVar);
        }
    }

    public final void zzc(androidx.browser.customtabs.c cVar) {
        this.zzb = cVar;
        cVar.h(0L);
        zzbhb zzbhbVar = this.zzd;
        if (zzbhbVar != null) {
            zzbhbVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbhb zzbhbVar) {
        this.zzd = zzbhbVar;
    }

    public final void zzf(Activity activity) {
        androidx.browser.customtabs.e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
