package p152i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.C4636o0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p450xk.C12512d;

/* renamed from: i4.l */
/* loaded from: classes.dex */
public final class C7812l implements Parcelable {

    /* renamed from: a */
    private final String f18714a;

    /* renamed from: b */
    private final String f18715b;

    /* renamed from: c */
    private final String f18716c;

    /* renamed from: d */
    public static final b f18713d = new b(null);
    public static final Parcelable.Creator<C7812l> CREATOR = new a();

    /* renamed from: i4.l$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C7812l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7812l createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C7812l(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7812l[] newArray(int i10) {
            return new C7812l[i10];
        }
    }

    /* renamed from: i4.l$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    public C7812l(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        this.f18714a = C4636o0.m11360k(parcel.readString(), "alg");
        this.f18715b = C4636o0.m11360k(parcel.readString(), "typ");
        this.f18716c = C4636o0.m11360k(parcel.readString(), "kid");
    }

    public C7812l(String encodedHeaderString) {
        C9322n.m27781e(encodedHeaderString, "encodedHeaderString");
        if (!m24028b(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        C9322n.m27780d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, C12512d.f33913b));
        String string = jSONObject.getString("alg");
        C9322n.m27780d(string, "jsonObj.getString(\"alg\")");
        this.f18714a = string;
        String string2 = jSONObject.getString("typ");
        C9322n.m27780d(string2, "jsonObj.getString(\"typ\")");
        this.f18715b = string2;
        String string3 = jSONObject.getString("kid");
        C9322n.m27780d(string3, "jsonObj.getString(\"kid\")");
        this.f18716c = string3;
    }

    /* renamed from: b */
    private final boolean m24028b(String str) {
        C4636o0.m11356g(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        C9322n.m27780d(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, C12512d.f33913b));
            String alg = jSONObject.optString("alg");
            C9322n.m27780d(alg, "alg");
            boolean z10 = (alg.length() > 0) && C9322n.m27777a(alg, "RS256");
            String optString = jSONObject.optString("kid");
            C9322n.m27780d(optString, "jsonObj.optString(\"kid\")");
            boolean z11 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            C9322n.m27780d(optString2, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (optString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String m24029a() {
        return this.f18716c;
    }

    /* renamed from: c */
    public final JSONObject m24030c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f18714a);
        jSONObject.put("typ", this.f18715b);
        jSONObject.put("kid", this.f18716c);
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
        if (!(obj instanceof C7812l)) {
            return false;
        }
        C7812l c7812l = (C7812l) obj;
        return C9322n.m27777a(this.f18714a, c7812l.f18714a) && C9322n.m27777a(this.f18715b, c7812l.f18715b) && C9322n.m27777a(this.f18716c, c7812l.f18716c);
    }

    public int hashCode() {
        return ((((527 + this.f18714a.hashCode()) * 31) + this.f18715b.hashCode()) * 31) + this.f18716c.hashCode();
    }

    public String toString() {
        String jSONObject = m24030c().toString();
        C9322n.m27780d(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeString(this.f18714a);
        dest.writeString(this.f18715b);
        dest.writeString(this.f18716c);
    }
}
