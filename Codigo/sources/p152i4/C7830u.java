package p152i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C4625j;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;

/* renamed from: i4.u */
/* loaded from: classes.dex */
public final class C7830u implements Parcelable {

    /* renamed from: a */
    private final int f18766a;

    /* renamed from: b */
    private final int f18767b;

    /* renamed from: c */
    private final int f18768c;

    /* renamed from: d */
    private final String f18769d;

    /* renamed from: e */
    private final String f18770e;

    /* renamed from: f */
    private final String f18771f;

    /* renamed from: r */
    private final JSONObject f18772r;

    /* renamed from: s */
    private final JSONObject f18773s;

    /* renamed from: t */
    private final Object f18774t;

    /* renamed from: u */
    private final HttpURLConnection f18775u;

    /* renamed from: v */
    private final String f18776v;

    /* renamed from: w */
    private C7824r f18777w;

    /* renamed from: x */
    private final a f18778x;

    /* renamed from: y */
    private final String f18779y;

    /* renamed from: z */
    public static final c f18765z = new c(null);

    /* renamed from: A */
    private static final d f18764A = new d(200, 299);
    public static final Parcelable.Creator<C7830u> CREATOR = new b();

    /* renamed from: i4.u$a */
    /* loaded from: classes.dex */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: i4.u$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C7830u> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7830u createFromParcel(Parcel parcel) {
            C9322n.m27781e(parcel, "parcel");
            return new C7830u(parcel, (C9315g) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7830u[] newArray(int i10) {
            return new C7830u[i10];
        }
    }

    /* renamed from: i4.u$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[Catch: JSONException -> 0x012d, TryCatch #0 {JSONException -> 0x012d, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:30:0x00cf, B:33:0x0077, B:34:0x006e, B:35:0x0064, B:36:0x005c, B:37:0x0055, B:38:0x004b, B:39:0x0041, B:40:0x0083, B:43:0x0090, B:45:0x0099, B:49:0x00aa, B:50:0x00f0, B:52:0x00fa, B:54:0x0108, B:55:0x0111), top: B:2:0x0012 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p152i4.C7830u m24108a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p152i4.C7830u.c.m24108a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):i4.u");
        }

        /* renamed from: b */
        public final synchronized C4625j m24109b() {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
            if (m11447f == null) {
                return C4625j.f8737g.m11240b();
            }
            return m11447f.m11378d();
        }

        /* renamed from: c */
        public final d m24110c() {
            return C7830u.f18764A;
        }
    }

    /* renamed from: i4.u$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final int f18780a;

        /* renamed from: b */
        private final int f18781b;

        public d(int i10, int i11) {
            this.f18780a = i10;
            this.f18781b = i11;
        }

        /* renamed from: a */
        public final boolean m24111a(int i10) {
            return i10 <= this.f18781b && this.f18780a <= i10;
        }
    }

    private C7830u(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C7824r c7824r, boolean z10) {
        boolean z11;
        this.f18766a = i10;
        this.f18767b = i11;
        this.f18768c = i12;
        this.f18769d = str;
        this.f18770e = str3;
        this.f18771f = str4;
        this.f18772r = jSONObject;
        this.f18773s = jSONObject2;
        this.f18774t = obj;
        this.f18775u = httpURLConnection;
        this.f18776v = str2;
        if (c7824r != null) {
            this.f18777w = c7824r;
            z11 = true;
        } else {
            this.f18777w = new C7803g0(this, m24100c());
            z11 = false;
        }
        a m11235c = z11 ? a.OTHER : f18765z.m24109b().m11235c(i11, i12, z10);
        this.f18778x = m11235c;
        this.f18779y = f18765z.m24109b().m11236d(m11235c);
    }

    public /* synthetic */ C7830u(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C7824r c7824r, boolean z10, C9315g c9315g) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, c7824r, z10);
    }

    public C7830u(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private C7830u(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ C7830u(Parcel parcel, C9315g c9315g) {
        this(parcel);
    }

    public C7830u(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof C7824r ? (C7824r) exc : new C7824r(exc), false);
    }

    /* renamed from: b */
    public final int m24099b() {
        return this.f18767b;
    }

    /* renamed from: c */
    public final String m24100c() {
        String str = this.f18776v;
        if (str != null) {
            return str;
        }
        C7824r c7824r = this.f18777w;
        if (c7824r == null) {
            return null;
        }
        return c7824r.getLocalizedMessage();
    }

    /* renamed from: d */
    public final String m24101d() {
        return this.f18769d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C7824r m24102e() {
        return this.f18777w;
    }

    /* renamed from: f */
    public final int m24103f() {
        return this.f18766a;
    }

    /* renamed from: g */
    public final int m24104g() {
        return this.f18768c;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f18766a + ", errorCode: " + this.f18767b + ", subErrorCode: " + this.f18768c + ", errorType: " + this.f18769d + ", errorMessage: " + m24100c() + "}";
        C9322n.m27780d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        C9322n.m27781e(out, "out");
        out.writeInt(this.f18766a);
        out.writeInt(this.f18767b);
        out.writeInt(this.f18768c);
        out.writeString(this.f18769d);
        out.writeString(m24100c());
        out.writeString(this.f18770e);
        out.writeString(this.f18771f);
    }
}
