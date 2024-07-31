package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.y0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbp extends ea.a {
    public static final Parcelable.Creator<zzcbp> CREATOR = new zzcbq();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzcbp(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = list;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzcbp zza(JSONObject jSONObject) {
        return new zzcbp(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), y0.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), y0.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, str, false);
        ea.c.G(parcel, 3, this.zzb, false);
        ea.c.g(parcel, 4, this.zzc);
        ea.c.g(parcel, 5, this.zzd);
        ea.c.I(parcel, 6, this.zze, false);
        ea.c.g(parcel, 7, this.zzf);
        ea.c.g(parcel, 8, this.zzg);
        ea.c.I(parcel, 9, this.zzh, false);
        ea.c.b(parcel, a10);
    }
}
