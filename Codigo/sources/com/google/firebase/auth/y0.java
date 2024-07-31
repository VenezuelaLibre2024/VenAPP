package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagr;
import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y0 extends j0 {
    public static final Parcelable.Creator<y0> CREATOR = new w1();

    /* renamed from: a, reason: collision with root package name */
    private final String f11803a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11804b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11805c;

    /* renamed from: d, reason: collision with root package name */
    private final zzagr f11806d;

    public y0(String str, String str2, long j10, zzagr zzagrVar) {
        this.f11803a = com.google.android.gms.common.internal.s.f(str);
        this.f11804b = str2;
        this.f11805c = j10;
        this.f11806d = (zzagr) com.google.android.gms.common.internal.s.k(zzagrVar, "totpInfo cannot be null.");
    }

    public static y0 x1(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new y0(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzagr());
    }

    @Override // com.google.firebase.auth.j0
    public String R() {
        return this.f11804b;
    }

    @Override // com.google.firebase.auth.j0
    public String l() {
        return this.f11803a;
    }

    @Override // com.google.firebase.auth.j0
    public long u1() {
        return this.f11805c;
    }

    @Override // com.google.firebase.auth.j0
    public String v1() {
        return "totp";
    }

    @Override // com.google.firebase.auth.j0
    public JSONObject w1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f11803a);
            jSONObject.putOpt("displayName", this.f11804b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f11805c));
            jSONObject.putOpt("totpInfo", this.f11806d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, l(), false);
        ea.c.G(parcel, 2, R(), false);
        ea.c.z(parcel, 3, u1());
        ea.c.E(parcel, 4, this.f11806d, i10, false);
        ea.c.b(parcel, a10);
    }
}
