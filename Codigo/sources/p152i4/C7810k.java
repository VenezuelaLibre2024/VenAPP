package p152i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9321m;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p450xk.C12512d;

/* renamed from: i4.k */
/* loaded from: classes.dex */
public final class C7810k implements Parcelable {

    /* renamed from: A */
    private final Map<String, Integer> f18692A;

    /* renamed from: B */
    private final Map<String, String> f18693B;

    /* renamed from: C */
    private final Map<String, String> f18694C;

    /* renamed from: D */
    private final String f18695D;

    /* renamed from: E */
    private final String f18696E;

    /* renamed from: a */
    private final String f18697a;

    /* renamed from: b */
    private final String f18698b;

    /* renamed from: c */
    private final String f18699c;

    /* renamed from: d */
    private final String f18700d;

    /* renamed from: e */
    private final long f18701e;

    /* renamed from: f */
    private final long f18702f;

    /* renamed from: r */
    private final String f18703r;

    /* renamed from: s */
    private final String f18704s;

    /* renamed from: t */
    private final String f18705t;

    /* renamed from: u */
    private final String f18706u;

    /* renamed from: v */
    private final String f18707v;

    /* renamed from: w */
    private final String f18708w;

    /* renamed from: x */
    private final String f18709x;

    /* renamed from: y */
    private final Set<String> f18710y;

    /* renamed from: z */
    private final String f18711z;

    /* renamed from: F */
    public static final b f18691F = new b(null);
    public static final Parcelable.Creator<C7810k> CREATOR = new a();

    /* renamed from: i4.k$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C7810k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7810k createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C7810k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7810k[] newArray(int i10) {
            return new C7810k[i10];
        }
    }

    /* renamed from: i4.k$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final String m24027a(JSONObject jSONObject, String name) {
            C9322n.m27781e(jSONObject, "<this>");
            C9322n.m27781e(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    public C7810k(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        this.f18697a = C4636o0.m11360k(parcel.readString(), "jti");
        this.f18698b = C4636o0.m11360k(parcel.readString(), "iss");
        this.f18699c = C4636o0.m11360k(parcel.readString(), "aud");
        this.f18700d = C4636o0.m11360k(parcel.readString(), "nonce");
        this.f18701e = parcel.readLong();
        this.f18702f = parcel.readLong();
        this.f18703r = C4636o0.m11360k(parcel.readString(), "sub");
        this.f18704s = parcel.readString();
        this.f18705t = parcel.readString();
        this.f18706u = parcel.readString();
        this.f18707v = parcel.readString();
        this.f18708w = parcel.readString();
        this.f18709x = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f18710y = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f18711z = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(C9321m.f22575a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f18692A = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        C9308a0 c9308a0 = C9308a0.f22565a;
        HashMap readHashMap2 = parcel.readHashMap(c9308a0.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f18693B = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(c9308a0.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f18694C = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f18695D = parcel.readString();
        this.f18696E = parcel.readString();
    }

    public C7810k(String encodedClaims, String expectedNonce) {
        C9322n.m27781e(encodedClaims, "encodedClaims");
        C9322n.m27781e(expectedNonce, "expectedNonce");
        C4636o0.m11356g(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        C9322n.m27780d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, C12512d.f33913b));
        if (!m24023a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        C9322n.m27780d(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f18697a = string;
        String string2 = jSONObject.getString("iss");
        C9322n.m27780d(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f18698b = string2;
        String string3 = jSONObject.getString("aud");
        C9322n.m27780d(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f18699c = string3;
        String string4 = jSONObject.getString("nonce");
        C9322n.m27780d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f18700d = string4;
        this.f18701e = jSONObject.getLong("exp");
        this.f18702f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        C9322n.m27780d(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f18703r = string5;
        b bVar = f18691F;
        this.f18704s = bVar.m24027a(jSONObject, "name");
        this.f18705t = bVar.m24027a(jSONObject, "given_name");
        this.f18706u = bVar.m24027a(jSONObject, "middle_name");
        this.f18707v = bVar.m24027a(jSONObject, "family_name");
        this.f18708w = bVar.m24027a(jSONObject, Constants.EMAIL);
        this.f18709x = bVar.m24027a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        this.f18710y = optJSONArray == null ? null : Collections.unmodifiableSet(C4634n0.m11306g0(optJSONArray));
        this.f18711z = bVar.m24027a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        this.f18692A = optJSONObject == null ? null : Collections.unmodifiableMap(C4634n0.m11321o(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.f18693B = optJSONObject2 == null ? null : Collections.unmodifiableMap(C4634n0.m11323p(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        this.f18694C = optJSONObject3 != null ? Collections.unmodifiableMap(C4634n0.m11323p(optJSONObject3)) : null;
        this.f18695D = bVar.m24027a(jSONObject, "user_gender");
        this.f18696E = bVar.m24027a(jSONObject, "user_link");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (kotlin.jvm.internal.C9322n.m27777a(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L50;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m24023a(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r9 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r9.optString(r2)
            kotlin.jvm.internal.C9322n.m27780d(r3, r2)
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
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)     // Catch: java.net.MalformedURLException -> Lda
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
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r0, r4)     // Catch: java.net.MalformedURLException -> Lda
            if (r0 != 0) goto L52
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lda
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lda
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r0, r2)     // Catch: java.net.MalformedURLException -> Lda
            if (r0 != 0) goto L52
            goto Lda
        L52:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L63
            r0 = r3
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto Lda
            java.lang.String r0 = p152i4.C7799e0.m23861m()
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r2, r0)
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
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)
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
            kotlin.jvm.internal.C9322n.m27780d(r9, r0)
            int r0 = r9.length()
            if (r0 != 0) goto Lcf
            r0 = r3
            goto Ld0
        Lcf:
            r0 = r1
        Ld0:
            if (r0 != 0) goto Lda
            boolean r9 = kotlin.jvm.internal.C9322n.m27777a(r9, r10)
            if (r9 != 0) goto Ld9
            goto Lda
        Ld9:
            return r3
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7810k.m24023a(org.json.JSONObject, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final JSONObject m24024b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f18697a);
        jSONObject.put("iss", this.f18698b);
        jSONObject.put("aud", this.f18699c);
        jSONObject.put("nonce", this.f18700d);
        jSONObject.put("exp", this.f18701e);
        jSONObject.put("iat", this.f18702f);
        String str = this.f18703r;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f18704s;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f18705t;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f18706u;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f18707v;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f18708w;
        if (str6 != null) {
            jSONObject.put(Constants.EMAIL, str6);
        }
        String str7 = this.f18709x;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f18710y != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f18710y));
        }
        String str8 = this.f18711z;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f18692A != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f18692A));
        }
        if (this.f18693B != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f18693B));
        }
        if (this.f18694C != null) {
            jSONObject.put("user_location", new JSONObject(this.f18694C));
        }
        String str9 = this.f18695D;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f18696E;
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
        if (!(obj instanceof C7810k)) {
            return false;
        }
        C7810k c7810k = (C7810k) obj;
        return C9322n.m27777a(this.f18697a, c7810k.f18697a) && C9322n.m27777a(this.f18698b, c7810k.f18698b) && C9322n.m27777a(this.f18699c, c7810k.f18699c) && C9322n.m27777a(this.f18700d, c7810k.f18700d) && this.f18701e == c7810k.f18701e && this.f18702f == c7810k.f18702f && C9322n.m27777a(this.f18703r, c7810k.f18703r) && C9322n.m27777a(this.f18704s, c7810k.f18704s) && C9322n.m27777a(this.f18705t, c7810k.f18705t) && C9322n.m27777a(this.f18706u, c7810k.f18706u) && C9322n.m27777a(this.f18707v, c7810k.f18707v) && C9322n.m27777a(this.f18708w, c7810k.f18708w) && C9322n.m27777a(this.f18709x, c7810k.f18709x) && C9322n.m27777a(this.f18710y, c7810k.f18710y) && C9322n.m27777a(this.f18711z, c7810k.f18711z) && C9322n.m27777a(this.f18692A, c7810k.f18692A) && C9322n.m27777a(this.f18693B, c7810k.f18693B) && C9322n.m27777a(this.f18694C, c7810k.f18694C) && C9322n.m27777a(this.f18695D, c7810k.f18695D) && C9322n.m27777a(this.f18696E, c7810k.f18696E);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f18697a.hashCode()) * 31) + this.f18698b.hashCode()) * 31) + this.f18699c.hashCode()) * 31) + this.f18700d.hashCode()) * 31) + Long.hashCode(this.f18701e)) * 31) + Long.hashCode(this.f18702f)) * 31) + this.f18703r.hashCode()) * 31;
        String str = this.f18704s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18705t;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18706u;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18707v;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18708w;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18709x;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f18710y;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f18711z;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f18692A;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f18693B;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f18694C;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f18695D;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18696E;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = m24024b().toString();
        C9322n.m27780d(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeString(this.f18697a);
        dest.writeString(this.f18698b);
        dest.writeString(this.f18699c);
        dest.writeString(this.f18700d);
        dest.writeLong(this.f18701e);
        dest.writeLong(this.f18702f);
        dest.writeString(this.f18703r);
        dest.writeString(this.f18704s);
        dest.writeString(this.f18705t);
        dest.writeString(this.f18706u);
        dest.writeString(this.f18707v);
        dest.writeString(this.f18708w);
        dest.writeString(this.f18709x);
        dest.writeStringList(this.f18710y == null ? null : new ArrayList(this.f18710y));
        dest.writeString(this.f18711z);
        dest.writeMap(this.f18692A);
        dest.writeMap(this.f18693B);
        dest.writeMap(this.f18694C);
        dest.writeString(this.f18695D);
        dest.writeString(this.f18696E);
    }
}
