package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagr;
import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import org.json.JSONException;
import org.json.JSONObject;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.y0 */
/* loaded from: classes.dex */
public class C6143y0 extends AbstractC6084j0 {
    public static final Parcelable.Creator<C6143y0> CREATOR = new C6137w1();

    /* renamed from: a */
    private final String f13018a;

    /* renamed from: b */
    private final String f13019b;

    /* renamed from: c */
    private final long f13020c;

    /* renamed from: d */
    private final zzagr f13021d;

    public C6143y0(String str, String str2, long j10, zzagr zzagrVar) {
        this.f13018a = C5276s.m13320f(str);
        this.f13019b = str2;
        this.f13020c = j10;
        this.f13021d = (zzagr) C5276s.m13325k(zzagrVar, "totpInfo cannot be null.");
    }

    /* renamed from: x1 */
    public static C6143y0 m16629x1(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C6143y0(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzagr());
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: R */
    public String mo16552R() {
        return this.f13019b;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: l */
    public String mo16553l() {
        return this.f13018a;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: u1 */
    public long mo16554u1() {
        return this.f13020c;
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: v1 */
    public String mo16555v1() {
        return "totp";
    }

    @Override // com.google.firebase.auth.AbstractC6084j0
    /* renamed from: w1 */
    public JSONObject mo16556w1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f13018a);
            jSONObject.putOpt("displayName", this.f13019b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f13020c));
            jSONObject.putOpt("totpInfo", this.f13021d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, mo16553l(), false);
        C7140c.m21200G(parcel, 2, mo16552R(), false);
        C7140c.m21234z(parcel, 3, mo16554u1());
        C7140c.m21198E(parcel, 4, this.f13021d, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
