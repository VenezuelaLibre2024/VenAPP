package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class zzcag extends ea.a {
    public static final Parcelable.Creator<zzcag> CREATOR = new zzcah();
    public final String zza;
    public final int zzb;

    public zzcag(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public static zzcag zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcag(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcag)) {
            zzcag zzcagVar = (zzcag) obj;
            if (q.b(this.zza, zzcagVar.zza)) {
                if (q.b(Integer.valueOf(this.zzb), Integer.valueOf(zzcagVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, str, false);
        ea.c.u(parcel, 3, this.zzb);
        ea.c.b(parcel, a10);
    }
}
