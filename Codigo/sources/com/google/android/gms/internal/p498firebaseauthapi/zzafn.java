package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import la.C9464i;
import la.C9475t;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* loaded from: classes2.dex */
public class zzafn extends AbstractC7138a implements zzacs<zzafn> {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    private static final String zza = "zzafn";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzafn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzafn(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafn(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public static zzafn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafn zzafnVar = new zzafn();
            zzafnVar.zzb = jSONObject.optString("refresh_token", null);
            zzafnVar.zzc = jSONObject.optString("access_token", null);
            zzafnVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafnVar.zze = jSONObject.optString("token_type", null);
            zzafnVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafnVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxw(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacs
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzafn zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C9475t.m28179a(jSONObject.optString("refresh_token"));
            this.zzc = C9475t.m28179a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = C9475t.m28179a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.zzb, false);
        C7140c.m21200G(parcel, 3, this.zzc, false);
        C7140c.m21195B(parcel, 4, Long.valueOf(zza()), false);
        C7140c.m21200G(parcel, 5, this.zze, false);
        C7140c.m21195B(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        this.zzb = C5276s.m13320f(str);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxw(e10);
        }
    }

    public final boolean zzg() {
        return C9464i.m28142d().mo28130a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }
}