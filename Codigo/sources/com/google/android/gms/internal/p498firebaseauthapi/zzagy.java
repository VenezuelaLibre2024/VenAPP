package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagy implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzagy() {
    }

    public static zzagy zza(String str, String str2, boolean z10) {
        zzagy zzagyVar = new zzagy();
        zzagyVar.zzb = C5276s.m13320f(str);
        zzagyVar.zzc = C5276s.m13320f(str2);
        zzagyVar.zzf = z10;
        return zzagyVar;
    }

    public static zzagy zzb(String str, String str2, boolean z10) {
        zzagy zzagyVar = new zzagy();
        zzagyVar.zza = C5276s.m13320f(str);
        zzagyVar.zzd = C5276s.m13320f(str2);
        zzagyVar.zzf = z10;
        return zzagyVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            str = "code";
            str2 = this.zzc;
        } else {
            jSONObject.put("phoneNumber", this.zza);
            str = "temporaryProof";
            str2 = this.zzd;
        }
        jSONObject.put(str, str2);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put(Constants.ID_TOKEN, str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
