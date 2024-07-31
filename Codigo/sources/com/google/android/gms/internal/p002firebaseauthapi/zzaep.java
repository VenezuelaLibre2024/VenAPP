package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.f;
import com.google.firebase.auth.j;
import ga.a;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaep implements zzacp {
    private static final String zza = "zzaep";
    private static final a zzb = new a(zzaep.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaep(j jVar, String str, String str2) {
        this.zzc = s.f(jVar.zzc());
        this.zzd = s.f(jVar.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        f c10 = f.c(this.zzd);
        String a10 = c10 != null ? c10.a() : null;
        String d10 = c10 != null ? c10.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.EMAIL, this.zzc);
        if (a10 != null) {
            jSONObject.put("oobCode", a10);
        }
        if (d10 != null) {
            jSONObject.put("tenantId", d10);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put(Constants.ID_TOKEN, str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzahc.zza(jSONObject, "captchaResp", str2);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
