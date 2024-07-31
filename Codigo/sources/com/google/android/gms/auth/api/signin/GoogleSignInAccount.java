package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import la.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: y */
    public static la.f f9235y = i.d();

    /* renamed from: a */
    final int f9236a;

    /* renamed from: b */
    private String f9237b;

    /* renamed from: c */
    private String f9238c;

    /* renamed from: d */
    private String f9239d;

    /* renamed from: e */
    private String f9240e;

    /* renamed from: f */
    private Uri f9241f;

    /* renamed from: r */
    private String f9242r;

    /* renamed from: s */
    private long f9243s;

    /* renamed from: t */
    private String f9244t;

    /* renamed from: u */
    List f9245u;

    /* renamed from: v */
    private String f9246v;

    /* renamed from: w */
    private String f9247w;

    /* renamed from: x */
    private Set f9248x = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f9236a = i10;
        this.f9237b = str;
        this.f9238c = str2;
        this.f9239d = str3;
        this.f9240e = str4;
        this.f9241f = uri;
        this.f9242r = str5;
        this.f9243s = j10;
        this.f9244t = str6;
        this.f9245u = list;
        this.f9246v = str7;
        this.f9247w = str8;
    }

    public static GoogleSignInAccount C1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), s.f(str7), new ArrayList((Collection) s.j(set)), str5, str6);
    }

    public static GoogleSignInAccount D1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount C1 = C1(jSONObject.optString(FacebookMediationAdapter.KEY_ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(Constants.EMAIL) ? jSONObject.optString(Constants.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        C1.f9242r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return C1;
    }

    public String A1() {
        return this.f9242r;
    }

    public boolean B1() {
        return f9235y.a() / 1000 >= this.f9243s + (-300);
    }

    public final String E1() {
        return this.f9244t;
    }

    public final String F1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (x1() != null) {
                jSONObject.put(FacebookMediationAdapter.KEY_ID, x1());
            }
            if (y1() != null) {
                jSONObject.put("tokenId", y1());
            }
            if (r() != null) {
                jSONObject.put(Constants.EMAIL, r());
            }
            if (R() != null) {
                jSONObject.put("displayName", R());
            }
            if (v1() != null) {
                jSONObject.put("givenName", v1());
            }
            if (u1() != null) {
                jSONObject.put("familyName", u1());
            }
            Uri v02 = v0();
            if (v02 != null) {
                jSONObject.put("photoUrl", v02.toString());
            }
            if (A1() != null) {
                jSONObject.put("serverAuthCode", A1());
            }
            jSONObject.put("expirationTime", this.f9243s);
            jSONObject.put("obfuscatedIdentifier", this.f9244t);
            JSONArray jSONArray = new JSONArray();
            List list = this.f9245u;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, y9.c.f31816a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.u1());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String R() {
        return this.f9240e;
    }

    public Account c1() {
        String str = this.f9239d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f9244t.equals(this.f9244t) && googleSignInAccount.z1().equals(z1());
    }

    public int hashCode() {
        return ((this.f9244t.hashCode() + 527) * 31) + z1().hashCode();
    }

    public String r() {
        return this.f9239d;
    }

    public String u1() {
        return this.f9247w;
    }

    public Uri v0() {
        return this.f9241f;
    }

    public String v1() {
        return this.f9246v;
    }

    public Set<Scope> w1() {
        return new HashSet(this.f9245u);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9236a);
        ea.c.G(parcel, 2, x1(), false);
        ea.c.G(parcel, 3, y1(), false);
        ea.c.G(parcel, 4, r(), false);
        ea.c.G(parcel, 5, R(), false);
        ea.c.E(parcel, 6, v0(), i10, false);
        ea.c.G(parcel, 7, A1(), false);
        ea.c.z(parcel, 8, this.f9243s);
        ea.c.G(parcel, 9, this.f9244t, false);
        ea.c.K(parcel, 10, this.f9245u, false);
        ea.c.G(parcel, 11, v1(), false);
        ea.c.G(parcel, 12, u1(), false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f9237b;
    }

    public String y1() {
        return this.f9238c;
    }

    public Set<Scope> z1() {
        HashSet hashSet = new HashSet(this.f9245u);
        hashSet.addAll(this.f9248x);
        return hashSet;
    }
}
