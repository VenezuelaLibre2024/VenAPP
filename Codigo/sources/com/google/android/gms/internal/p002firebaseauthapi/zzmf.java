package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
final class zzmf implements zzcd {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzmf(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.zzb = str;
        Context applicationContext = context.getApplicationContext();
        this.zza = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(zzua zzuaVar) {
        if (!this.zza.putString(this.zzb, zzxj.zza(zzuaVar.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(zzvg zzvgVar) {
        if (!this.zza.putString(this.zzb, zzxj.zza(zzvgVar.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
