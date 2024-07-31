package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzafq extends a {
    public static final Parcelable.Creator<zzafq> CREATOR = new zzaft();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafq(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzap<zzafq> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzap.zza(new ArrayList());
        }
        zzao zzg = zzap.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzg.zza(new zzafq(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 1, this.zza, false);
        c.G(parcel, 2, this.zzb, false);
        c.G(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }
}
