package i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    private final Map<String, Integer> A;
    private final Map<String, String> B;
    private final Map<String, String> C;
    private final String D;
    private final String E;

    /* renamed from: a */
    private final String f17038a;

    /* renamed from: b */
    private final String f17039b;

    /* renamed from: c */
    private final String f17040c;

    /* renamed from: d */
    private final String f17041d;

    /* renamed from: e */
    private final long f17042e;

    /* renamed from: f */
    private final long f17043f;

    /* renamed from: r */
    private final String f17044r;

    /* renamed from: s */
    private final String f17045s;

    /* renamed from: t */
    private final String f17046t;

    /* renamed from: u */
    private final String f17047u;

    /* renamed from: v */
    private final String f17048v;

    /* renamed from: w */
    private final String f17049w;

    /* renamed from: x */
    private final String f17050x;

    /* renamed from: y */
    private final Set<String> f17051y;

    /* renamed from: z */
    private final String f17052z;
    public static final b F = new b(null);
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String name) {
            kotlin.jvm.internal.n.e(jSONObject, "<this>");
            kotlin.jvm.internal.n.e(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    public k(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
        this.f17038a = com.facebook.internal.o0.k(parcel.readString(), "jti");
        this.f17039b = com.facebook.internal.o0.k(parcel.readString(), "iss");
        this.f17040c = com.facebook.internal.o0.k(parcel.readString(), "aud");
        this.f17041d = com.facebook.internal.o0.k(parcel.readString(), "nonce");
        this.f17042e = parcel.readLong();
        this.f17043f = parcel.readLong();
        this.f17044r = com.facebook.internal.o0.k(parcel.readString(), "sub");
        this.f17045s = parcel.readString();
        this.f17046t = parcel.readString();
        this.f17047u = parcel.readString();
        this.f17048v = parcel.readString();
        this.f17049w = parcel.readString();
        this.f17050x = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f17051y = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f17052z = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(kotlin.jvm.internal.m.f20753a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.A = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        HashMap readHashMap2 = parcel.readHashMap(a0Var.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.B = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(a0Var.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.C = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.D = parcel.readString();
        this.E = parcel.readString();
    }

    public k(String encodedClaims, String expectedNonce) {
        kotlin.jvm.internal.n.e(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.n.e(expectedNonce, "expectedNonce");
        com.facebook.internal.o0.g(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.n.d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, xk.d.f31393b));
        if (!a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        kotlin.jvm.internal.n.d(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f17038a = string;
        String string2 = jSONObject.getString("iss");
        kotlin.jvm.internal.n.d(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f17039b = string2;
        String string3 = jSONObject.getString("aud");
        kotlin.jvm.internal.n.d(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f17040c = string3;
        String string4 = jSONObject.getString("nonce");
        kotlin.jvm.internal.n.d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f17041d = string4;
        this.f17042e = jSONObject.getLong("exp");
        this.f17043f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        kotlin.jvm.internal.n.d(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f17044r = string5;
        b bVar = F;
        this.f17045s = bVar.a(jSONObject, "name");
        this.f17046t = bVar.a(jSONObject, "given_name");
        this.f17047u = bVar.a(jSONObject, "middle_name");
        this.f17048v = bVar.a(jSONObject, "family_name");
        this.f17049w = bVar.a(jSONObject, Constants.EMAIL);
        this.f17050x = bVar.a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        this.f17051y = optJSONArray == null ? null : Collections.unmodifiableSet(com.facebook.internal.n0.g0(optJSONArray));
        this.f17052z = bVar.a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        this.A = optJSONObject == null ? null : Collections.unmodifiableMap(com.facebook.internal.n0.o(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.B = optJSONObject2 == null ? null : Collections.unmodifiableMap(com.facebook.internal.n0.p(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        this.C = optJSONObject3 != null ? Collections.unmodifiableMap(com.facebook.internal.n0.p(optJSONObject3)) : null;
        this.D = bVar.a(jSONObject, "user_gender");
        this.E = bVar.a(jSONObject, "user_link");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (kotlin.jvm.internal.n.a(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r9 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r9.optString(r2)
            kotlin.jvm.internal.n.d(r3, r2)
            int r2 = r3.length()
            r3 = 1
            if (r2 != 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r9.optString(r0)     // Catch: java.net.MalformedURLException -> Lda
            kotlin.jvm.internal.n.d(r2, r0)     // Catch: java.net.MalformedURLException -> Lda
            int r0 = r2.length()     // Catch: java.net.MalformedURLException -> Lda
            if (r0 != 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 != 0) goto Lda
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lda
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r4 = "facebook.com"
            boolean r0 = kotlin.jvm.internal.n.a(r0, r4)     // Catch: java.net.MalformedURLException -> Lda
            if (r0 != 0) goto L52
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lda
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = kotlin.jvm.internal.n.a(r0, r2)     // Catch: java.net.MalformedURLException -> Lda
            if (r0 != 0) goto L52
            goto Lda
        L52:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.n.d(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L63
            r0 = r3
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto Lda
            java.lang.String r0 = i4.e0.m()
            boolean r0 = kotlin.jvm.internal.n.a(r2, r0)
            if (r0 != 0) goto L72
            goto Lda
        L72:
            java.util.Date r0 = new java.util.Date
            java.lang.String r2 = "exp"
            long r4 = r9.optLong(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2
            long r4 = r4 * r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L8d
            return r1
        L8d:
            java.lang.String r0 = "iat"
            long r4 = r9.optLong(r0)
            java.util.Date r0 = new java.util.Date
            long r4 = r4 * r6
            r6 = 600000(0x927c0, double:2.964394E-318)
            long r4 = r4 + r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto La9
            return r1
        La9:
            java.lang.String r0 = "sub"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.n.d(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto Lba
            r0 = r3
            goto Lbb
        Lba:
            r0 = r1
        Lbb:
            if (r0 == 0) goto Lbe
            return r1
        Lbe:
            java.lang.String r0 = "nonce"
            java.lang.String r9 = r9.optString(r0)
            kotlin.jvm.internal.n.d(r9, r0)
            int r0 = r9.length()
            if (r0 != 0) goto Lcf
            r0 = r3
            goto Ld0
        Lcf:
            r0 = r1
        Ld0:
            if (r0 != 0) goto Lda
            boolean r9 = kotlin.jvm.internal.n.a(r9, r10)
            if (r9 != 0) goto Ld9
            goto Lda
        Ld9:
            return r3
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.k.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f17038a);
        jSONObject.put("iss", this.f17039b);
        jSONObject.put("aud", this.f17040c);
        jSONObject.put("nonce", this.f17041d);
        jSONObject.put("exp", this.f17042e);
        jSONObject.put("iat", this.f17043f);
        String str = this.f17044r;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f17045s;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f17046t;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f17047u;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f17048v;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f17049w;
        if (str6 != null) {
            jSONObject.put(Constants.EMAIL, str6);
        }
        String str7 = this.f17050x;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f17051y != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f17051y));
        }
        String str8 = this.f17052z;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.A != null) {
            jSONObject.put("user_age_range", new JSONObject(this.A));
        }
        if (this.B != null) {
            jSONObject.put("user_hometown", new JSONObject(this.B));
        }
        if (this.C != null) {
            jSONObject.put("user_location", new JSONObject(this.C));
        }
        String str9 = this.D;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.E;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.n.a(this.f17038a, kVar.f17038a) && kotlin.jvm.internal.n.a(this.f17039b, kVar.f17039b) && kotlin.jvm.internal.n.a(this.f17040c, kVar.f17040c) && kotlin.jvm.internal.n.a(this.f17041d, kVar.f17041d) && this.f17042e == kVar.f17042e && this.f17043f == kVar.f17043f && kotlin.jvm.internal.n.a(this.f17044r, kVar.f17044r) && kotlin.jvm.internal.n.a(this.f17045s, kVar.f17045s) && kotlin.jvm.internal.n.a(this.f17046t, kVar.f17046t) && kotlin.jvm.internal.n.a(this.f17047u, kVar.f17047u) && kotlin.jvm.internal.n.a(this.f17048v, kVar.f17048v) && kotlin.jvm.internal.n.a(this.f17049w, kVar.f17049w) && kotlin.jvm.internal.n.a(this.f17050x, kVar.f17050x) && kotlin.jvm.internal.n.a(this.f17051y, kVar.f17051y) && kotlin.jvm.internal.n.a(this.f17052z, kVar.f17052z) && kotlin.jvm.internal.n.a(this.A, kVar.A) && kotlin.jvm.internal.n.a(this.B, kVar.B) && kotlin.jvm.internal.n.a(this.C, kVar.C) && kotlin.jvm.internal.n.a(this.D, kVar.D) && kotlin.jvm.internal.n.a(this.E, kVar.E);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f17038a.hashCode()) * 31) + this.f17039b.hashCode()) * 31) + this.f17040c.hashCode()) * 31) + this.f17041d.hashCode()) * 31) + Long.hashCode(this.f17042e)) * 31) + Long.hashCode(this.f17043f)) * 31) + this.f17044r.hashCode()) * 31;
        String str = this.f17045s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17046t;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17047u;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17048v;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17049w;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17050x;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f17051y;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f17052z;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.A;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.B;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.C;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.D;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.E;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = b().toString();
        kotlin.jvm.internal.n.d(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeString(this.f17038a);
        dest.writeString(this.f17039b);
        dest.writeString(this.f17040c);
        dest.writeString(this.f17041d);
        dest.writeLong(this.f17042e);
        dest.writeLong(this.f17043f);
        dest.writeString(this.f17044r);
        dest.writeString(this.f17045s);
        dest.writeString(this.f17046t);
        dest.writeString(this.f17047u);
        dest.writeString(this.f17048v);
        dest.writeString(this.f17049w);
        dest.writeString(this.f17050x);
        dest.writeStringList(this.f17051y == null ? null : new ArrayList(this.f17051y));
        dest.writeString(this.f17052z);
        dest.writeMap(this.A);
        dest.writeMap(this.B);
        dest.writeMap(this.C);
        dest.writeString(this.D);
        dest.writeString(this.E);
    }
}
