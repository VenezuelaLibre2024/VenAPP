package com.google.android.gms.internal.ads;

import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzcrp implements zzcqw {
    private final zzcbx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrp(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzcbx] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcqw
    public final void zza(JSONObject jSONObject) {
        this.zza.zzb(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong(Constants.TIMESTAMP));
    }
}
