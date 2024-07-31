package p152i4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7787a;

/* renamed from: i4.s0 */
/* loaded from: classes.dex */
public final class C7827s0 implements Parcelable {

    /* renamed from: a */
    private final String f18754a;

    /* renamed from: b */
    private final String f18755b;

    /* renamed from: c */
    private final String f18756c;

    /* renamed from: d */
    private final String f18757d;

    /* renamed from: e */
    private final String f18758e;

    /* renamed from: f */
    private final Uri f18759f;

    /* renamed from: r */
    private final Uri f18760r;

    /* renamed from: s */
    public static final b f18752s = new b(null);

    /* renamed from: t */
    private static final String f18753t = C7827s0.class.getSimpleName();
    public static final Parcelable.Creator<C7827s0> CREATOR = new a();

    /* renamed from: i4.s0$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C7827s0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7827s0 createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C7827s0(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7827s0[] newArray(int i10) {
            return new C7827s0[i10];
        }
    }

    /* renamed from: i4.s0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i4.s0$b$a */
        /* loaded from: classes.dex */
        public static final class a implements C4634n0.a {
            a() {
            }

            @Override // com.facebook.internal.C4634n0.a
            /* renamed from: a */
            public void mo11348a(C7824r c7824r) {
                Log.e(C7827s0.f18753t, C9322n.m27787k("Got unexpected exception: ", c7824r));
            }

            @Override // com.facebook.internal.C4634n0.a
            /* renamed from: b */
            public void mo11349b(JSONObject jSONObject) {
                String optString = jSONObject == null ? null : jSONObject.optString(FacebookMediationAdapter.KEY_ID);
                if (optString == null) {
                    Log.w(C7827s0.f18753t, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                C7827s0.f18752s.m24094c(new C7827s0(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m24092a() {
            C7787a.c cVar = C7787a.f18552w;
            C7787a m23782e = cVar.m23782e();
            if (m23782e == null) {
                return;
            }
            if (!cVar.m23784g()) {
                m24094c(null);
            } else {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11274H(m23782e.m23770m(), new a());
            }
        }

        /* renamed from: b */
        public final C7827s0 m24093b() {
            return C7831u0.f18782d.m24119a().m24116c();
        }

        /* renamed from: c */
        public final void m24094c(C7827s0 c7827s0) {
            C7831u0.f18782d.m24119a().m24118f(c7827s0);
        }
    }

    private C7827s0(Parcel parcel) {
        this.f18754a = parcel.readString();
        this.f18755b = parcel.readString();
        this.f18756c = parcel.readString();
        this.f18757d = parcel.readString();
        this.f18758e = parcel.readString();
        String readString = parcel.readString();
        this.f18759f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f18760r = readString2 != null ? Uri.parse(readString2) : null;
    }

    public /* synthetic */ C7827s0(Parcel parcel, C9315g c9315g) {
        this(parcel);
    }

    public C7827s0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C4636o0.m11360k(str, FacebookMediationAdapter.KEY_ID);
        this.f18754a = str;
        this.f18755b = str2;
        this.f18756c = str3;
        this.f18757d = str4;
        this.f18758e = str5;
        this.f18759f = uri;
        this.f18760r = uri2;
    }

    public C7827s0(JSONObject jsonObject) {
        C9322n.m27781e(jsonObject, "jsonObject");
        this.f18754a = jsonObject.optString(FacebookMediationAdapter.KEY_ID, null);
        this.f18755b = jsonObject.optString("first_name", null);
        this.f18756c = jsonObject.optString("middle_name", null);
        this.f18757d = jsonObject.optString("last_name", null);
        this.f18758e = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f18759f = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f18760r = optString2 != null ? Uri.parse(optString2) : null;
    }

    /* renamed from: b */
    public final JSONObject m24089b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.f18754a);
            jSONObject.put("first_name", this.f18755b);
            jSONObject.put("middle_name", this.f18756c);
            jSONObject.put("last_name", this.f18757d);
            jSONObject.put("name", this.f18758e);
            Uri uri = this.f18759f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f18760r;
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
        if (!(obj instanceof C7827s0)) {
            return false;
        }
        String str5 = this.f18754a;
        return ((str5 == null && ((C7827s0) obj).f18754a == null) || C9322n.m27777a(str5, ((C7827s0) obj).f18754a)) && (((str = this.f18755b) == null && ((C7827s0) obj).f18755b == null) || C9322n.m27777a(str, ((C7827s0) obj).f18755b)) && ((((str2 = this.f18756c) == null && ((C7827s0) obj).f18756c == null) || C9322n.m27777a(str2, ((C7827s0) obj).f18756c)) && ((((str3 = this.f18757d) == null && ((C7827s0) obj).f18757d == null) || C9322n.m27777a(str3, ((C7827s0) obj).f18757d)) && ((((str4 = this.f18758e) == null && ((C7827s0) obj).f18758e == null) || C9322n.m27777a(str4, ((C7827s0) obj).f18758e)) && ((((uri = this.f18759f) == null && ((C7827s0) obj).f18759f == null) || C9322n.m27777a(uri, ((C7827s0) obj).f18759f)) && (((uri2 = this.f18760r) == null && ((C7827s0) obj).f18760r == null) || C9322n.m27777a(uri2, ((C7827s0) obj).f18760r))))));
    }

    public int hashCode() {
        String str = this.f18754a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f18755b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f18756c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f18757d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f18758e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f18759f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f18760r;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeString(this.f18754a);
        dest.writeString(this.f18755b);
        dest.writeString(this.f18756c);
        dest.writeString(this.f18757d);
        dest.writeString(this.f18758e);
        Uri uri = this.f18759f;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f18760r;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }
}
