package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xa.b;
import xa.c;

/* loaded from: classes2.dex */
public final class zzac implements n {
    private Status zza;
    private final b zzb;
    private String zzc;
    private long zzd;
    private byte[] zze;

    public zzac(Status status, b bVar) {
        this.zza = status;
        this.zzb = bVar;
        this.zzc = null;
        if (bVar != null) {
            this.zzc = bVar.x1();
            this.zzd = bVar.v1();
            this.zze = bVar.y1();
        } else if (status.y1()) {
            this.zza = new Status(8);
        }
    }

    public final List<c> getDetectedThreats() {
        ArrayList arrayList = new ArrayList();
        String str = this.zzc;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("matches");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(new c(Integer.parseInt(jSONArray.getJSONObject(i10).getString("threat_type"))));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final long getLastUpdateTimeMs() {
        return this.zzd;
    }

    public final String getMetadata() {
        return this.zzc;
    }

    public final byte[] getState() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
