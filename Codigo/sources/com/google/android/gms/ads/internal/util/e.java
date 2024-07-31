package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzfue;
import com.google.android.gms.internal.ads.zzfuf;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {
    public static Bundle a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle b(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.e.b(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static void c(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzgj)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfue zzj = zzfue.zzj(context);
            zzfuf zzi = zzfuf.zzi(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzcP)).booleanValue()) {
                zzi.zzk();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzcQ)).booleanValue()) {
                zzi.zzl();
            }
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "clearStorageOnIdlessMode");
        }
    }
}
