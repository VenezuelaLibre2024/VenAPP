package i4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.p0;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    private static final h A;
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: w, reason: collision with root package name */
    public static final c f16899w = new c(null);

    /* renamed from: x, reason: collision with root package name */
    private static final Date f16900x;

    /* renamed from: y, reason: collision with root package name */
    private static final Date f16901y;

    /* renamed from: z, reason: collision with root package name */
    private static final Date f16902z;

    /* renamed from: a, reason: collision with root package name */
    private final Date f16903a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f16904b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f16905c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f16906d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16907e;

    /* renamed from: f, reason: collision with root package name */
    private final h f16908f;

    /* renamed from: r, reason: collision with root package name */
    private final Date f16909r;

    /* renamed from: s, reason: collision with root package name */
    private final String f16910s;

    /* renamed from: t, reason: collision with root package name */
    private final String f16911t;

    /* renamed from: u, reason: collision with root package name */
    private final Date f16912u;

    /* renamed from: v, reason: collision with root package name */
    private final String f16913v;

    /* renamed from: i4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0282a {
        void a(r rVar);

        void b(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new a(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(a current) {
            kotlin.jvm.internal.n.e(current, "current");
            return new a(current.m(), current.c(), current.n(), current.k(), current.f(), current.g(), current.l(), new Date(), new Date(), current.e(), null, RecognitionOptions.UPC_E, null);
        }

        public final a b(JSONObject jsonObject) {
            kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new r("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString(Constants.TOKEN);
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            kotlin.jvm.internal.n.d(string, "jsonObject.getString(SOURCE_KEY)");
            h valueOf = h.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            kotlin.jvm.internal.n.d(token, "token");
            kotlin.jvm.internal.n.d(applicationId, "applicationId");
            kotlin.jvm.internal.n.d(userId, "userId");
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            kotlin.jvm.internal.n.d(permissionsArray, "permissionsArray");
            List<String> h02 = com.facebook.internal.n0.h0(permissionsArray);
            kotlin.jvm.internal.n.d(declinedPermissionsArray, "declinedPermissionsArray");
            return new a(token, applicationId, userId, h02, com.facebook.internal.n0.h0(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : com.facebook.internal.n0.h0(optJSONArray), valueOf, date, date2, date3, optString);
        }

        public final a c(Bundle bundle) {
            String string;
            kotlin.jvm.internal.n.e(bundle, "bundle");
            List<String> f10 = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> f11 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> f12 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            p0.a aVar = p0.f17086c;
            String a10 = aVar.a(bundle);
            if (com.facebook.internal.n0.d0(a10)) {
                a10 = e0.m();
            }
            String str = a10;
            String f13 = aVar.f(bundle);
            if (f13 == null) {
                return null;
            }
            JSONObject f14 = com.facebook.internal.n0.f(f13);
            if (f14 == null) {
                string = null;
            } else {
                try {
                    string = f14.getString(FacebookMediationAdapter.KEY_ID);
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new a(f13, str, string, f10, f11, f12, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, RecognitionOptions.UPC_E, null);
        }

        public final void d() {
            a i10 = g.f16980f.e().i();
            if (i10 != null) {
                h(a(i10));
            }
        }

        public final a e() {
            return g.f16980f.e().i();
        }

        public final List<String> f(Bundle bundle, String str) {
            List<String> j10;
            kotlin.jvm.internal.n.e(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                j10 = dk.r.j();
                return j10;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            kotlin.jvm.internal.n.d(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            a i10 = g.f16980f.e().i();
            return (i10 == null || i10.o()) ? false : true;
        }

        public final void h(a aVar) {
            g.f16980f.e().r(aVar);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16914a;

        static {
            int[] iArr = new int[h.valuesCustom().length];
            iArr[h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[h.WEB_VIEW.ordinal()] = 3;
            f16914a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f16900x = date;
        f16901y = date;
        f16902z = new Date();
        A = h.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public a(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
        this.f16903a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f16904b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f16905c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f16906d = unmodifiableSet3;
        this.f16907e = com.facebook.internal.o0.k(parcel.readString(), Constants.TOKEN);
        String readString = parcel.readString();
        this.f16908f = readString != null ? h.valueOf(readString) : A;
        this.f16909r = new Date(parcel.readLong());
        this.f16910s = com.facebook.internal.o0.k(parcel.readString(), "applicationId");
        this.f16911t = com.facebook.internal.o0.k(parcel.readString(), io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        this.f16912u = new Date(parcel.readLong());
        this.f16913v = parcel.readString();
    }

    public a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, h hVar, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        kotlin.jvm.internal.n.e(userId, "userId");
        com.facebook.internal.o0.g(accessToken, Constants.ACCESS_TOKEN);
        com.facebook.internal.o0.g(applicationId, "applicationId");
        com.facebook.internal.o0.g(userId, io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        this.f16903a = date == null ? f16901y : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.n.d(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f16904b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.n.d(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f16905c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.n.d(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f16906d = unmodifiableSet3;
        this.f16907e = accessToken;
        this.f16908f = b(hVar == null ? A : hVar, str);
        this.f16909r = date2 == null ? f16902z : date2;
        this.f16910s = applicationId;
        this.f16911t = userId;
        this.f16912u = (date3 == null || date3.getTime() == 0) ? f16901y : date3;
        this.f16913v = str == null ? "facebook" : str;
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3, String str4, int i10, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3, (i10 & RecognitionOptions.UPC_E) != 0 ? "facebook" : str4);
    }

    private final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f16904b));
        sb2.append("]");
    }

    private final h b(h hVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return hVar;
        }
        int i10 = d.f16914a[hVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? hVar : h.INSTAGRAM_WEB_VIEW : h.INSTAGRAM_CUSTOM_CHROME_TAB : h.INSTAGRAM_APPLICATION_WEB;
    }

    public static final a d() {
        return f16899w.e();
    }

    private final String r() {
        e0 e0Var = e0.f16948a;
        return e0.H(q0.INCLUDE_ACCESS_TOKENS) ? this.f16907e : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f16910s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Date e() {
        return this.f16912u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.n.a(this.f16903a, aVar.f16903a) && kotlin.jvm.internal.n.a(this.f16904b, aVar.f16904b) && kotlin.jvm.internal.n.a(this.f16905c, aVar.f16905c) && kotlin.jvm.internal.n.a(this.f16906d, aVar.f16906d) && kotlin.jvm.internal.n.a(this.f16907e, aVar.f16907e) && this.f16908f == aVar.f16908f && kotlin.jvm.internal.n.a(this.f16909r, aVar.f16909r) && kotlin.jvm.internal.n.a(this.f16910s, aVar.f16910s) && kotlin.jvm.internal.n.a(this.f16911t, aVar.f16911t) && kotlin.jvm.internal.n.a(this.f16912u, aVar.f16912u)) {
            String str = this.f16913v;
            String str2 = aVar.f16913v;
            if (str == null ? str2 == null : kotlin.jvm.internal.n.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final Set<String> f() {
        return this.f16905c;
    }

    public final Set<String> g() {
        return this.f16906d;
    }

    public final Date h() {
        return this.f16903a;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f16903a.hashCode()) * 31) + this.f16904b.hashCode()) * 31) + this.f16905c.hashCode()) * 31) + this.f16906d.hashCode()) * 31) + this.f16907e.hashCode()) * 31) + this.f16908f.hashCode()) * 31) + this.f16909r.hashCode()) * 31) + this.f16910s.hashCode()) * 31) + this.f16911t.hashCode()) * 31) + this.f16912u.hashCode()) * 31;
        String str = this.f16913v;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f16913v;
    }

    public final Date j() {
        return this.f16909r;
    }

    public final Set<String> k() {
        return this.f16904b;
    }

    public final h l() {
        return this.f16908f;
    }

    public final String m() {
        return this.f16907e;
    }

    public final String n() {
        return this.f16911t;
    }

    public final boolean o() {
        return new Date().after(this.f16903a);
    }

    public final JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(Constants.TOKEN, this.f16907e);
        jSONObject.put("expires_at", this.f16903a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f16904b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f16905c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f16906d));
        jSONObject.put("last_refresh", this.f16909r.getTime());
        jSONObject.put("source", this.f16908f.name());
        jSONObject.put("application_id", this.f16910s);
        jSONObject.put("user_id", this.f16911t);
        jSONObject.put("data_access_expiration_time", this.f16912u.getTime());
        String str = this.f16913v;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(r());
        a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeLong(this.f16903a.getTime());
        dest.writeStringList(new ArrayList(this.f16904b));
        dest.writeStringList(new ArrayList(this.f16905c));
        dest.writeStringList(new ArrayList(this.f16906d));
        dest.writeString(this.f16907e);
        dest.writeString(this.f16908f.name());
        dest.writeLong(this.f16909r.getTime());
        dest.writeString(this.f16910s);
        dest.writeString(this.f16911t);
        dest.writeLong(this.f16912u.getTime());
        dest.writeString(this.f16913v);
    }
}
