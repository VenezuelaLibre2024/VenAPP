package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzccj {
    static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = indexOf + 1;
        return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
    }

    public static String zzb(Uri uri, Context context) {
        String zza;
        if (t.p().zzp(context) && (zza = t.p().zza(context)) != null) {
            String str = (String) a0.c().zza(zzbgc.zzae);
            String uri2 = uri.toString();
            if (((Boolean) a0.c().zza(zzbgc.zzad)).booleanValue() && uri2.contains(str)) {
                t.p().zzj(context, zza);
                return zzd(uri2, context).replace(str, zza);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return uri2;
            }
            String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
            t.p().zzj(context, zza);
            return uri3;
        }
        return uri.toString();
    }

    public static String zzc(String str, Context context, boolean z10) {
        String zza;
        if ((((Boolean) a0.c().zza(zzbgc.zzal)).booleanValue() && !z10) || !t.p().zzp(context) || TextUtils.isEmpty(str) || (zza = t.p().zza(context)) == null) {
            return str;
        }
        String str2 = (String) a0.c().zza(zzbgc.zzae);
        if (((Boolean) a0.c().zza(zzbgc.zzad)).booleanValue() && str.contains(str2)) {
            if (t.r().K(str)) {
                t.p().zzj(context, zza);
                return zzd(str, context).replace(str2, zza);
            }
            if (!t.r().L(str)) {
                return str;
            }
            t.p().zzk(context, zza);
            return zzd(str, context).replace(str2, zza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (t.r().K(str)) {
            t.p().zzj(context, zza);
            return zza(zzd(str, context), "fbs_aeid", zza).toString();
        }
        if (!t.r().L(str)) {
            return str;
        }
        t.p().zzk(context, zza);
        return zza(zzd(str, context), "fbs_aeid", zza).toString();
    }

    private static String zzd(String str, Context context) {
        String zzd = t.p().zzd(context);
        String zzb = t.p().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzd)) {
            str = zza(str, "gmp_app_id", zzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzb)) ? str : zza(str, "fbs_aiid", zzb).toString();
    }
}
