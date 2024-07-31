package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t0 extends j0 {
    public static final Parcelable.Creator<t0> CREATOR = new u1();

    /* renamed from: a, reason: collision with root package name */
    private final String f11784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11785b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11786c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11787d;

    public t0(String str, String str2, long j10, String str3) {
        this.f11784a = com.google.android.gms.common.internal.s.f(str);
        this.f11785b = str2;
        this.f11786c = j10;
        this.f11787d = com.google.android.gms.common.internal.s.f(str3);
    }

    public static t0 x1(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new t0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public String E() {
        return this.f11787d;
    }

    @Override // com.google.firebase.auth.j0
    public String R() {
        return this.f11785b;
    }

    @Override // com.google.firebase.auth.j0
    public String l() {
        return this.f11784a;
    }

    @Override // com.google.firebase.auth.j0
    public long u1() {
        return this.f11786c;
    }

    @Override // com.google.firebase.auth.j0
    public String v1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.j0
    public JSONObject w1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", Constants.SIGN_IN_METHOD_PHONE);
            jSONObject.putOpt("uid", this.f11784a);
            jSONObject.putOpt("displayName", this.f11785b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f11786c));
            jSONObject.putOpt("phoneNumber", this.f11787d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, l(), false);
        ea.c.G(parcel, 2, R(), false);
        ea.c.z(parcel, 3, u1());
        ea.c.G(parcel, 4, E(), false);
        ea.c.b(parcel, a10);
    }
}
