package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w1;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzcbt implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final w1 zzc;
    private final zzcch zzd;
    private String zze = "-1";
    private int zzf = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbt(Context context, w1 w1Var, zzcch zzcchVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = w1Var;
        this.zza = context;
        this.zzd = zzcchVar;
    }

    private final void zzb() {
        this.zzc.h(true);
        com.google.android.gms.ads.internal.util.e.c(this.zza);
    }

    private final void zzc(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) a0.c().zza(zzbgc.zzaw)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        this.zzc.h(z10);
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z10;
        if (((Boolean) a0.c().zza(zzbgc.zzay)).booleanValue()) {
            if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i10 != this.zzc.zzb()) {
                    zzb();
                }
                this.zzc.e(i10);
                return;
            }
            if (Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.zzc.zzn(str))) {
                    zzb();
                }
                this.zzc.c(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                z10 = true;
            }
            z10 = -1;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                z10 = false;
            }
            z10 = -1;
        }
        if (!z10) {
            if (string2.equals("-1") || this.zze.equals(string2)) {
                return;
            }
            this.zze = string2;
            zzc(string2, i11);
            return;
        }
        if (!z10) {
            return;
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzaw)).booleanValue() || i11 == -1 || this.zzf == i11) {
            return;
        }
        this.zzf = i11;
        zzc(string2, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        SharedPreferences sharedPreferences;
        String str;
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) a0.c().zza(zzbgc.zzay)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            sharedPreferences = this.zzb;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.zzb;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }
}
