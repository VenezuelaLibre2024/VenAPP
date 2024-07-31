package p152i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import com.facebook.internal.C4636o0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p076e5.C7125c;
import p450xk.C12525q;

/* renamed from: i4.i */
/* loaded from: classes.dex */
public final class C7806i implements Parcelable {

    /* renamed from: a */
    private final String f18653a;

    /* renamed from: b */
    private final String f18654b;

    /* renamed from: c */
    private final C7812l f18655c;

    /* renamed from: d */
    private final C7810k f18656d;

    /* renamed from: e */
    private final String f18657e;

    /* renamed from: f */
    public static final b f18652f = new b(null);
    public static final Parcelable.Creator<C7806i> CREATOR = new a();

    /* renamed from: i4.i$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C7806i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7806i createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C7806i(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7806i[] newArray(int i10) {
            return new C7806i[i10];
        }
    }

    /* renamed from: i4.i$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m23923a(C7806i c7806i) {
            AuthenticationTokenManager.f8509d.m10917a().m10916e(c7806i);
        }
    }

    public C7806i(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        this.f18653a = C4636o0.m11360k(parcel.readString(), Constants.TOKEN);
        this.f18654b = C4636o0.m11360k(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(C7812l.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f18655c = (C7812l) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(C7810k.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f18656d = (C7810k) readParcelable2;
        this.f18657e = C4636o0.m11360k(parcel.readString(), "signature");
    }

    public C7806i(String token, String expectedNonce) {
        List m41098u0;
        C9322n.m27781e(token, "token");
        C9322n.m27781e(expectedNonce, "expectedNonce");
        C4636o0.m11356g(token, Constants.TOKEN);
        C4636o0.m11356g(expectedNonce, "expectedNonce");
        m41098u0 = C12525q.m41098u0(token, new String[]{"."}, false, 0, 6, null);
        if (!(m41098u0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) m41098u0.get(0);
        String str2 = (String) m41098u0.get(1);
        String str3 = (String) m41098u0.get(2);
        this.f18653a = token;
        this.f18654b = expectedNonce;
        C7812l c7812l = new C7812l(str);
        this.f18655c = c7812l;
        this.f18656d = new C7810k(str2, expectedNonce);
        if (!m23919a(str, str2, str3, c7812l.m24029a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f18657e = str3;
    }

    /* renamed from: a */
    private final boolean m23919a(String str, String str2, String str3, String str4) {
        try {
            String m21024c = C7125c.m21024c(str4);
            if (m21024c == null) {
                return false;
            }
            return C7125c.m21026e(C7125c.m21023b(m21024c), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final JSONObject m23920b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f18653a);
        jSONObject.put("expected_nonce", this.f18654b);
        jSONObject.put("header", this.f18655c.m24030c());
        jSONObject.put("claims", this.f18656d.m24024b());
        jSONObject.put("signature", this.f18657e);
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
        if (!(obj instanceof C7806i)) {
            return false;
        }
        C7806i c7806i = (C7806i) obj;
        return C9322n.m27777a(this.f18653a, c7806i.f18653a) && C9322n.m27777a(this.f18654b, c7806i.f18654b) && C9322n.m27777a(this.f18655c, c7806i.f18655c) && C9322n.m27777a(this.f18656d, c7806i.f18656d) && C9322n.m27777a(this.f18657e, c7806i.f18657e);
    }

    public int hashCode() {
        return ((((((((527 + this.f18653a.hashCode()) * 31) + this.f18654b.hashCode()) * 31) + this.f18655c.hashCode()) * 31) + this.f18656d.hashCode()) * 31) + this.f18657e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeString(this.f18653a);
        dest.writeString(this.f18654b);
        dest.writeParcelable(this.f18655c, i10);
        dest.writeParcelable(this.f18656d, i10);
        dest.writeString(this.f18657e);
    }
}
