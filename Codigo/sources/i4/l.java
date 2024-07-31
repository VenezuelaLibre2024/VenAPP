package i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f17055a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17057c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17054d = new b(null);
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new l(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public l(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
        this.f17055a = com.facebook.internal.o0.k(parcel.readString(), "alg");
        this.f17056b = com.facebook.internal.o0.k(parcel.readString(), "typ");
        this.f17057c = com.facebook.internal.o0.k(parcel.readString(), "kid");
    }

    public l(String encodedHeaderString) {
        kotlin.jvm.internal.n.e(encodedHeaderString, "encodedHeaderString");
        if (!b(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.n.d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, xk.d.f31393b));
        String string = jSONObject.getString("alg");
        kotlin.jvm.internal.n.d(string, "jsonObj.getString(\"alg\")");
        this.f17055a = string;
        String string2 = jSONObject.getString("typ");
        kotlin.jvm.internal.n.d(string2, "jsonObj.getString(\"typ\")");
        this.f17056b = string2;
        String string3 = jSONObject.getString("kid");
        kotlin.jvm.internal.n.d(string3, "jsonObj.getString(\"kid\")");
        this.f17057c = string3;
    }

    private final boolean b(String str) {
        com.facebook.internal.o0.g(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        kotlin.jvm.internal.n.d(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, xk.d.f31393b));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.n.d(alg, "alg");
            boolean z10 = (alg.length() > 0) && kotlin.jvm.internal.n.a(alg, "RS256");
            String optString = jSONObject.optString("kid");
            kotlin.jvm.internal.n.d(optString, "jsonObj.optString(\"kid\")");
            boolean z11 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.n.d(optString2, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (optString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.f17057c;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f17055a);
        jSONObject.put("typ", this.f17056b);
        jSONObject.put("kid", this.f17057c);
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.n.a(this.f17055a, lVar.f17055a) && kotlin.jvm.internal.n.a(this.f17056b, lVar.f17056b) && kotlin.jvm.internal.n.a(this.f17057c, lVar.f17057c);
    }

    public int hashCode() {
        return ((((527 + this.f17055a.hashCode()) * 31) + this.f17056b.hashCode()) * 31) + this.f17057c.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        kotlin.jvm.internal.n.d(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeString(this.f17055a);
        dest.writeString(this.f17056b);
        dest.writeString(this.f17057c);
    }
}
