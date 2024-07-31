package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* loaded from: classes2.dex */
public final class zzafq extends AbstractC7138a {
    public static final Parcelable.Creator<zzafq> CREATOR = new zzaft();
    private final String zza;
    private final String zzb;
    private final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.zza, false);
        C7140c.m21200G(parcel, 2, this.zzb, false);
        C7140c.m21200G(parcel, 3, this.zzc, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
