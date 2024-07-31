package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f17000a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17001b;

    /* renamed from: c, reason: collision with root package name */
    private final l f17002c;

    /* renamed from: d, reason: collision with root package name */
    private final k f17003d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17004e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f16999f = new b(null);
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new i(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(i iVar) {
            AuthenticationTokenManager.f7535d.a().e(iVar);
        }
    }

    public i(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
        this.f17000a = com.facebook.internal.o0.k(parcel.readString(), Constants.TOKEN);
        this.f17001b = com.facebook.internal.o0.k(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(l.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f17002c = (l) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(k.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f17003d = (k) readParcelable2;
        this.f17004e = com.facebook.internal.o0.k(parcel.readString(), "signature");
    }

    public i(String token, String expectedNonce) {
        List u02;
        kotlin.jvm.internal.n.e(token, "token");
        kotlin.jvm.internal.n.e(expectedNonce, "expectedNonce");
        com.facebook.internal.o0.g(token, Constants.TOKEN);
        com.facebook.internal.o0.g(expectedNonce, "expectedNonce");
        u02 = xk.q.u0(token, new String[]{"."}, false, 0, 6, null);
        if (!(u02.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) u02.get(0);
        String str2 = (String) u02.get(1);
        String str3 = (String) u02.get(2);
        this.f17000a = token;
        this.f17001b = expectedNonce;
        l lVar = new l(str);
        this.f17002c = lVar;
        this.f17003d = new k(str2, expectedNonce);
        if (!a(str, str2, str3, lVar.a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f17004e = str3;
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String c10 = e5.c.c(str4);
            if (c10 == null) {
                return false;
            }
            return e5.c.e(e5.c.b(c10), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f17000a);
        jSONObject.put("expected_nonce", this.f17001b);
        jSONObject.put("header", this.f17002c.c());
        jSONObject.put("claims", this.f17003d.b());
        jSONObject.put("signature", this.f17004e);
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.n.a(this.f17000a, iVar.f17000a) && kotlin.jvm.internal.n.a(this.f17001b, iVar.f17001b) && kotlin.jvm.internal.n.a(this.f17002c, iVar.f17002c) && kotlin.jvm.internal.n.a(this.f17003d, iVar.f17003d) && kotlin.jvm.internal.n.a(this.f17004e, iVar.f17004e);
    }

    public int hashCode() {
        return ((((((((527 + this.f17000a.hashCode()) * 31) + this.f17001b.hashCode()) * 31) + this.f17002c.hashCode()) * 31) + this.f17003d.hashCode()) * 31) + this.f17004e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeString(this.f17000a);
        dest.writeString(this.f17001b);
        dest.writeParcelable(this.f17002c, i10);
        dest.writeParcelable(this.f17003d, i10);
        dest.writeString(this.f17004e);
    }
}
