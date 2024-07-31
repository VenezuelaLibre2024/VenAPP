package i4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.n0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i4.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f17095a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17096b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17097c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17098d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17099e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f17100f;

    /* renamed from: r, reason: collision with root package name */
    private final Uri f17101r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f17093s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    private static final String f17094t = s0.class.getSimpleName();
    public static final Parcelable.Creator<s0> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<s0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new s0(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0[] newArray(int i10) {
            return new s0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a implements n0.a {
            a() {
            }

            @Override // com.facebook.internal.n0.a
            public void a(r rVar) {
                Log.e(s0.f17094t, kotlin.jvm.internal.n.k("Got unexpected exception: ", rVar));
            }

            @Override // com.facebook.internal.n0.a
            public void b(JSONObject jSONObject) {
                String optString = jSONObject == null ? null : jSONObject.optString(FacebookMediationAdapter.KEY_ID);
                if (optString == null) {
                    Log.w(s0.f17094t, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                s0.f17093s.c(new s0(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            a.c cVar = i4.a.f16899w;
            i4.a e10 = cVar.e();
            if (e10 == null) {
                return;
            }
            if (!cVar.g()) {
                c(null);
            } else {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.H(e10.m(), new a());
            }
        }

        public final s0 b() {
            return u0.f17122d.a().c();
        }

        public final void c(s0 s0Var) {
            u0.f17122d.a().f(s0Var);
        }
    }

    private s0(Parcel parcel) {
        this.f17095a = parcel.readString();
        this.f17096b = parcel.readString();
        this.f17097c = parcel.readString();
        this.f17098d = parcel.readString();
        this.f17099e = parcel.readString();
        String readString = parcel.readString();
        this.f17100f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f17101r = readString2 != null ? Uri.parse(readString2) : null;
    }

    public /* synthetic */ s0(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public s0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.o0.k(str, FacebookMediationAdapter.KEY_ID);
        this.f17095a = str;
        this.f17096b = str2;
        this.f17097c = str3;
        this.f17098d = str4;
        this.f17099e = str5;
        this.f17100f = uri;
        this.f17101r = uri2;
    }

    public s0(JSONObject jsonObject) {
        kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
        this.f17095a = jsonObject.optString(FacebookMediationAdapter.KEY_ID, null);
        this.f17096b = jsonObject.optString("first_name", null);
        this.f17097c = jsonObject.optString("middle_name", null);
        this.f17098d = jsonObject.optString("last_name", null);
        this.f17099e = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f17100f = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f17101r = optString2 != null ? Uri.parse(optString2) : null;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.f17095a);
            jSONObject.put("first_name", this.f17096b);
            jSONObject.put("middle_name", this.f17097c);
            jSONObject.put("last_name", this.f17098d);
            jSONObject.put("name", this.f17099e);
            Uri uri = this.f17100f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f17101r;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        String str5 = this.f17095a;
        return ((str5 == null && ((s0) obj).f17095a == null) || kotlin.jvm.internal.n.a(str5, ((s0) obj).f17095a)) && (((str = this.f17096b) == null && ((s0) obj).f17096b == null) || kotlin.jvm.internal.n.a(str, ((s0) obj).f17096b)) && ((((str2 = this.f17097c) == null && ((s0) obj).f17097c == null) || kotlin.jvm.internal.n.a(str2, ((s0) obj).f17097c)) && ((((str3 = this.f17098d) == null && ((s0) obj).f17098d == null) || kotlin.jvm.internal.n.a(str3, ((s0) obj).f17098d)) && ((((str4 = this.f17099e) == null && ((s0) obj).f17099e == null) || kotlin.jvm.internal.n.a(str4, ((s0) obj).f17099e)) && ((((uri = this.f17100f) == null && ((s0) obj).f17100f == null) || kotlin.jvm.internal.n.a(uri, ((s0) obj).f17100f)) && (((uri2 = this.f17101r) == null && ((s0) obj).f17101r == null) || kotlin.jvm.internal.n.a(uri2, ((s0) obj).f17101r))))));
    }

    public int hashCode() {
        String str = this.f17095a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f17096b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f17097c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f17098d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f17099e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f17100f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f17101r;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeString(this.f17095a);
        dest.writeString(this.f17096b);
        dest.writeString(this.f17097c);
        dest.writeString(this.f17098d);
        dest.writeString(this.f17099e);
        Uri uri = this.f17100f;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f17101r;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }
}
