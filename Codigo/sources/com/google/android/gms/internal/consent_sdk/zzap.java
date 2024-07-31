package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import cb.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzap {
    static final zzde zza = zzde.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final c.EnumC0119c zzb() {
        return c.EnumC0119c.valueOf(this.zzc.getString("privacy_options_requirement_status", c.EnumC0119c.UNKNOWN.name()));
    }

    public final Map zzc() {
        String valueOf;
        String str;
        String str2;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzde.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap hashMap = new HashMap();
        for (String str3 : stringSet) {
            Application application = this.zzb;
            zzcm zza2 = zzco.zza(application, str3);
            if (zza2 == null) {
                valueOf = String.valueOf(str3);
                str = "Fetching request info: failed for key: ";
            } else {
                Object obj = application.getSharedPreferences(zza2.zza, 0).getAll().get(zza2.zzb);
                if (obj == null) {
                    valueOf = String.valueOf(str3);
                    str = "Stored info not exists: ";
                } else {
                    if (obj instanceof Boolean) {
                        str2 = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str2 = obj.toString();
                    } else if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        valueOf = String.valueOf(str3);
                        str = "Failed to fetch stored info: ";
                    }
                    hashMap.put(str3, str2);
                }
            }
            Log.d("UserMessagingPlatform", str.concat(valueOf));
        }
        return hashMap;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        zzco.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int i10) {
        this.zzc.edit().putInt("consent_status", i10).apply();
    }

    public final void zzh(c.EnumC0119c enumC0119c) {
        this.zzc.edit().putString("privacy_options_requirement_status", enumC0119c.name()).apply();
    }

    public final void zzi(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).apply();
    }
}
