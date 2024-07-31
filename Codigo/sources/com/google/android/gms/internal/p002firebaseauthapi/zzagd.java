package com.google.android.gms.internal.p002firebaseauthapi;

import la.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagd implements zzacs<zzagd> {
    private static final String zza = "zzagd";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagd zza(String str) {
        try {
            this.zzb = t.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
