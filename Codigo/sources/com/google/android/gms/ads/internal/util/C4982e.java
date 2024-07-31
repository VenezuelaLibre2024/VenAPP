package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzfue;
import com.google.android.gms.internal.ads.zzfuf;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.internal.util.e */
/* loaded from: classes.dex */
public final class C4982e {
    /* renamed from: a */
    public static Bundle m12625a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return m12626b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle m12626b(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C4982e.m12626b(android.content.Context, java.lang.String):android.os.Bundle");
    }

    /* renamed from: c */
    public static void m12627c(Context context) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzgj)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfue zzj = zzfue.zzj(context);
            zzfuf zzi = zzfuf.zzi(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzcP)).booleanValue()) {
                zzi.zzk();
            }
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzcQ)).booleanValue()) {
                zzi.zzl();
            }
        } catch (IOException e10) {
            C4965t.m12580q().zzw(e10, "clearStorageOnIdlessMode");
        }
    }
}
