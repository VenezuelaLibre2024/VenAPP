package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6064f;
import com.google.firebase.auth.C6083j;
import ga.C7533a;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaep implements zzacp {
    private static final String zza = "zzaep";
    private static final C7533a zzb = new C7533a(zzaep.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaep(C6083j c6083j, String str, String str2) {
        this.zzc = C5276s.m13320f(c6083j.zzc());
        this.zzd = C5276s.m13320f(c6083j.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        C6064f m16519c = C6064f.m16519c(this.zzd);
        String m16521a = m16519c != null ? m16519c.m16521a() : null;
        String m16523d = m16519c != null ? m16519c.m16523d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.EMAIL, this.zzc);
        if (m16521a != null) {
            jSONObject.put("oobCode", m16521a);
        }
        if (m16523d != null) {
            jSONObject.put("tenantId", m16523d);
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
