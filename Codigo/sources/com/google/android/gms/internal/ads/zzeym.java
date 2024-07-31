package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import c9.a;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeym implements zzexp {
    private final a.C0117a zza;
    private final String zzb;
    private final zzfub zzc;

    public zzeym(a.C0117a c0117a, String str, zzfub zzfubVar) {
        this.zza = c0117a;
        this.zzb = str;
        this.zzc = zzfubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject f10 = y0.f((JSONObject) obj, "pii");
            a.C0117a c0117a = this.zza;
            if (c0117a == null || TextUtils.isEmpty(c0117a.a())) {
                String str = this.zzb;
                if (str != null) {
                    f10.put("pdid", str);
                    f10.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            f10.put("rdid", this.zza.a());
            f10.put("is_lat", this.zza.b());
            f10.put("idtype", "adid");
            zzfub zzfubVar = this.zzc;
            if (zzfubVar.zzc()) {
                f10.put("paidv1_id_android_3p", zzfubVar.zzb());
                f10.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e10) {
            u1.b("Failed putting Ad ID.", e10);
        }
    }
}
