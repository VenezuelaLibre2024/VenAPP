package p152i4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7031r;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7821p0;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public final class C7787a implements Parcelable {

    /* renamed from: A */
    private static final EnumC7804h f18551A;
    public static final Parcelable.Creator<C7787a> CREATOR;

    /* renamed from: w */
    public static final c f18552w = new c(null);

    /* renamed from: x */
    private static final Date f18553x;

    /* renamed from: y */
    private static final Date f18554y;

    /* renamed from: z */
    private static final Date f18555z;

    /* renamed from: a */
    private final Date f18556a;

    /* renamed from: b */
    private final Set<String> f18557b;

    /* renamed from: c */
    private final Set<String> f18558c;

    /* renamed from: d */
    private final Set<String> f18559d;

    /* renamed from: e */
    private final String f18560e;

    /* renamed from: f */
    private final EnumC7804h f18561f;

    /* renamed from: r */
    private final Date f18562r;

    /* renamed from: s */
    private final String f18563s;

    /* renamed from: t */
    private final String f18564t;

    /* renamed from: u */
    private final Date f18565u;

    /* renamed from: v */
    private final String f18566v;

    /* renamed from: i4.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m23774a(C7824r c7824r);

        /* renamed from: b */
        void m23775b(C7787a c7787a);
    }

    /* renamed from: i4.a$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C7787a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7787a createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C7787a(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7787a[] newArray(int i10) {
            return new C7787a[i10];
        }
    }

    /* renamed from: i4.a$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C7787a m23778a(C7787a current) {
            C9322n.m27781e(current, "current");
            return new C7787a(current.m23770m(), current.m23761c(), current.m23771n(), current.m23768k(), current.m23763f(), current.m23764g(), current.m23769l(), new Date(), new Date(), current.m23762e(), null, RecognitionOptions.UPC_E, null);
        }

        /* renamed from: b */
        public final C7787a m23779b(JSONObject jsonObject) {
            C9322n.m27781e(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new C7824r("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString(Constants.TOKEN);
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            C9322n.m27780d(string, "jsonObject.getString(SOURCE_KEY)");
            EnumC7804h valueOf = EnumC7804h.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            C9322n.m27780d(token, "token");
            C9322n.m27780d(applicationId, "applicationId");
            C9322n.m27780d(userId, "userId");
            C4634n0 c4634n0 = C4634n0.f8760a;
            C9322n.m27780d(permissionsArray, "permissionsArray");
            List<String> m11308h0 = C4634n0.m11308h0(permissionsArray);
            C9322n.m27780d(declinedPermissionsArray, "declinedPermissionsArray");
            return new C7787a(token, applicationId, userId, m11308h0, C4634n0.m11308h0(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : C4634n0.m11308h0(optJSONArray), valueOf, date, date2, date3, optString);
        }

        /* renamed from: c */
        public final C7787a m23780c(Bundle bundle) {
            String string;
            C9322n.m27781e(bundle, "bundle");
            List<String> m23783f = m23783f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> m23783f2 = m23783f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> m23783f3 = m23783f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C7821p0.a aVar = C7821p0.f18745c;
            String m24076a = aVar.m24076a(bundle);
            if (C4634n0.m11300d0(m24076a)) {
                m24076a = C7799e0.m23861m();
            }
            String str = m24076a;
            String m24080f = aVar.m24080f(bundle);
            if (m24080f == null) {
                return null;
            }
            JSONObject m11303f = C4634n0.m11303f(m24080f);
            if (m11303f == null) {
                string = null;
            } else {
                try {
                    string = m11303f.getString(FacebookMediationAdapter.KEY_ID);
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new C7787a(m24080f, str, string, m23783f, m23783f2, m23783f3, aVar.m24079e(bundle), aVar.m24077c(bundle), aVar.m24078d(bundle), null, null, RecognitionOptions.UPC_E, null);
        }

        /* renamed from: d */
        public final void m23781d() {
            C7787a m23894i = C7802g.f18633f.m23903e().m23894i();
            if (m23894i != null) {
                m23785h(m23778a(m23894i));
            }
        }

        /* renamed from: e */
        public final C7787a m23782e() {
            return C7802g.f18633f.m23903e().m23894i();
        }

        /* renamed from: f */
        public final List<String> m23783f(Bundle bundle, String str) {
            List<String> m20582j;
            C9322n.m27781e(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C9322n.m27780d(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        /* renamed from: g */
        public final boolean m23784g() {
            C7787a m23894i = C7802g.f18633f.m23903e().m23894i();
            return (m23894i == null || m23894i.m23772o()) ? false : true;
        }

        /* renamed from: h */
        public final void m23785h(C7787a c7787a) {
            C7802g.f18633f.m23903e().m23897r(c7787a);
        }
    }

    /* renamed from: i4.a$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18567a;

        static {
            int[] iArr = new int[EnumC7804h.valuesCustom().length];
            iArr[EnumC7804h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC7804h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[EnumC7804h.WEB_VIEW.ordinal()] = 3;
            f18567a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f18553x = date;
        f18554y = date;
        f18555z = new Date();
        f18551A = EnumC7804h.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public C7787a(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        this.f18556a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C9322n.m27780d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f18557b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C9322n.m27780d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f18558c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C9322n.m27780d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f18559d = unmodifiableSet3;
        this.f18560e = C4636o0.m11360k(parcel.readString(), Constants.TOKEN);
        String readString = parcel.readString();
        this.f18561f = readString != null ? EnumC7804h.valueOf(readString) : f18551A;
        this.f18562r = new Date(parcel.readLong());
        this.f18563s = C4636o0.m11360k(parcel.readString(), "applicationId");
        this.f18564t = C4636o0.m11360k(parcel.readString(), io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        this.f18565u = new Date(parcel.readLong());
        this.f18566v = parcel.readString();
    }

    public C7787a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC7804h enumC7804h, Date date, Date date2, Date date3, String str) {
        C9322n.m27781e(accessToken, "accessToken");
        C9322n.m27781e(applicationId, "applicationId");
        C9322n.m27781e(userId, "userId");
        C4636o0.m11356g(accessToken, Constants.ACCESS_TOKEN);
        C4636o0.m11356g(applicationId, "applicationId");
        C4636o0.m11356g(userId, io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        this.f18556a = date == null ? f18554y : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        C9322n.m27780d(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f18557b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        C9322n.m27780d(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f18558c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        C9322n.m27780d(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f18559d = unmodifiableSet3;
        this.f18560e = accessToken;
        this.f18561f = m23758b(enumC7804h == null ? f18551A : enumC7804h, str);
        this.f18562r = date2 == null ? f18555z : date2;
        this.f18563s = applicationId;
        this.f18564t = userId;
        this.f18565u = (date3 == null || date3.getTime() == 0) ? f18554y : date3;
        this.f18566v = str == null ? "facebook" : str;
    }

    public /* synthetic */ C7787a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC7804h enumC7804h, Date date, Date date2, Date date3, String str4, int i10, C9315g c9315g) {
        this(str, str2, str3, collection, collection2, collection3, enumC7804h, date, date2, date3, (i10 & RecognitionOptions.UPC_E) != 0 ? "facebook" : str4);
    }

    /* renamed from: a */
    private final void m23757a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f18557b));
        sb2.append("]");
    }

    /* renamed from: b */
    private final EnumC7804h m23758b(EnumC7804h enumC7804h, String str) {
        if (str == null || !str.equals("instagram")) {
            return enumC7804h;
        }
        int i10 = d.f18567a[enumC7804h.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? enumC7804h : EnumC7804h.INSTAGRAM_WEB_VIEW : EnumC7804h.INSTAGRAM_CUSTOM_CHROME_TAB : EnumC7804h.INSTAGRAM_APPLICATION_WEB;
    }

    /* renamed from: d */
    public static final C7787a m23759d() {
        return f18552w.m23782e();
    }

    /* renamed from: r */
    private final String m23760r() {
        C7799e0 c7799e0 = C7799e0.f18601a;
        return C7799e0.m23835H(EnumC7823q0.INCLUDE_ACCESS_TOKENS) ? this.f18560e : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: c */
    public final String m23761c() {
        return this.f18563s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Date m23762e() {
        return this.f18565u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7787a)) {
            return false;
        }
        C7787a c7787a = (C7787a) obj;
        if (C9322n.m27777a(this.f18556a, c7787a.f18556a) && C9322n.m27777a(this.f18557b, c7787a.f18557b) && C9322n.m27777a(this.f18558c, c7787a.f18558c) && C9322n.m27777a(this.f18559d, c7787a.f18559d) && C9322n.m27777a(this.f18560e, c7787a.f18560e) && this.f18561f == c7787a.f18561f && C9322n.m27777a(this.f18562r, c7787a.f18562r) && C9322n.m27777a(this.f18563s, c7787a.f18563s) && C9322n.m27777a(this.f18564t, c7787a.f18564t) && C9322n.m27777a(this.f18565u, c7787a.f18565u)) {
            String str = this.f18566v;
            String str2 = c7787a.f18566v;
            if (str == null ? str2 == null : C9322n.m27777a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Set<String> m23763f() {
        return this.f18558c;
    }

    /* renamed from: g */
    public final Set<String> m23764g() {
        return this.f18559d;
    }

    /* renamed from: h */
    public final Date m23765h() {
        return this.f18556a;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f18556a.hashCode()) * 31) + this.f18557b.hashCode()) * 31) + this.f18558c.hashCode()) * 31) + this.f18559d.hashCode()) * 31) + this.f18560e.hashCode()) * 31) + this.f18561f.hashCode()) * 31) + this.f18562r.hashCode()) * 31) + this.f18563s.hashCode()) * 31) + this.f18564t.hashCode()) * 31) + this.f18565u.hashCode()) * 31;
        String str = this.f18566v;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final String m23766i() {
        return this.f18566v;
    }

    /* renamed from: j */
    public final Date m23767j() {
        return this.f18562r;
    }

    /* renamed from: k */
    public final Set<String> m23768k() {
        return this.f18557b;
    }

    /* renamed from: l */
    public final EnumC7804h m23769l() {
        return this.f18561f;
    }

    /* renamed from: m */
    public final String m23770m() {
        return this.f18560e;
    }

    /* renamed from: n */
    public final String m23771n() {
        return this.f18564t;
    }

    /* renamed from: o */
    public final boolean m23772o() {
        return new Date().after(this.f18556a);
    }

    /* renamed from: p */
    public final JSONObject m23773p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(Constants.TOKEN, this.f18560e);
        jSONObject.put("expires_at", this.f18556a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f18557b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f18558c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f18559d));
        jSONObject.put("last_refresh", this.f18562r.getTime());
        jSONObject.put("source", this.f18561f.name());
        jSONObject.put("application_id", this.f18563s);
        jSONObject.put("user_id", this.f18564t);
        jSONObject.put("data_access_expiration_time", this.f18565u.getTime());
        String str = this.f18566v;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(m23760r());
        m23757a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeLong(this.f18556a.getTime());
        dest.writeStringList(new ArrayList(this.f18557b));
        dest.writeStringList(new ArrayList(this.f18558c));
        dest.writeStringList(new ArrayList(this.f18559d));
        dest.writeString(this.f18560e);
        dest.writeString(this.f18561f.name());
        dest.writeLong(this.f18562r.getTime());
        dest.writeString(this.f18563s);
        dest.writeString(this.f18564t);
        dest.writeLong(this.f18565u.getTime());
        dest.writeString(this.f18566v);
    }
}
