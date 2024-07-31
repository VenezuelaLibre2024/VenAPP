package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.t0 */
/* loaded from: classes.dex */
public class C6124t0 extends AbstractC6084j0 {
    public static final Parcelable.Creator<C6124t0> CREATOR = new C6129u1();

    /* renamed from: a */
    private final String f12999a;

    /* renamed from: b */
    private final String f13000b;

    /* renamed from: c */
    private final long f13001c;

    /* renamed from: d */
    private final String f13002d;

    public C6124t0(String str, String str2, long j10, String str3) {
        this.f12999a = C5276s.m13320f(str);
        this.f13000b = str2;
        this.f13001c = j10;
        this.f13002d = C5276s.m13320f(str3);
    }

    /* renamed from: x1 */
    public static C6124t0 m16609x1(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C6124t0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    /* renamed from: E */
    public String m16610E() {
        return this.f13002d;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: R */
    public String mo16552R() {
        return this.f13000b;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: l */
    public String mo16553l() {
        return this.f12999a;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: u1 */
    public long mo16554u1() {
        return this.f13001c;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: v1 */
    public String mo16555v1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: w1 */
    public JSONObject mo16556w1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", Constants.SIGN_IN_METHOD_PHONE);
            jSONObject.putOpt("uid", this.f12999a);
            jSONObject.putOpt("displayName", this.f13000b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f13001c));
            jSONObject.putOpt("phoneNumber", this.f13002d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, mo16553l(), false);
        C7140c.m21200G(parcel, 2, mo16552R(), false);
        C7140c.m21234z(parcel, 3, mo16554u1());
        C7140c.m21200G(parcel, 4, m16610E(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
