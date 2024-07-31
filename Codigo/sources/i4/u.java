package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f17106a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17107b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17108c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17109d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17110e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17111f;

    /* renamed from: r, reason: collision with root package name */
    private final JSONObject f17112r;

    /* renamed from: s, reason: collision with root package name */
    private final JSONObject f17113s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f17114t;

    /* renamed from: u, reason: collision with root package name */
    private final HttpURLConnection f17115u;

    /* renamed from: v, reason: collision with root package name */
    private final String f17116v;

    /* renamed from: w, reason: collision with root package name */
    private r f17117w;

    /* renamed from: x, reason: collision with root package name */
    private final a f17118x;

    /* renamed from: y, reason: collision with root package name */
    private final String f17119y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f17105z = new c(null);
    private static final d A = new d(200, 299);
    public static final Parcelable.Creator<u> CREATOR = new b();

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

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<u> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.e(parcel, "parcel");
            return new u(parcel, (kotlin.jvm.internal.g) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[Catch: JSONException -> 0x012d, TryCatch #0 {JSONException -> 0x012d, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:30:0x00cf, B:33:0x0077, B:34:0x006e, B:35:0x0064, B:36:0x005c, B:37:0x0055, B:38:0x004b, B:39:0x0041, B:40:0x0083, B:43:0x0090, B:45:0x0099, B:49:0x00aa, B:50:0x00f0, B:52:0x00fa, B:54:0x0108, B:55:0x0111), top: B:2:0x0012 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final i4.u a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.u.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):i4.u");
        }

        public final synchronized com.facebook.internal.j b() {
            com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
            com.facebook.internal.r f10 = com.facebook.internal.v.f(e0.m());
            if (f10 == null) {
                return com.facebook.internal.j.f7760g.b();
            }
            return f10.d();
        }

        public final d c() {
            return u.A;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f17120a;

        /* renamed from: b, reason: collision with root package name */
        private final int f17121b;

        public d(int i10, int i11) {
            this.f17120a = i10;
            this.f17121b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f17121b && this.f17120a <= i10;
        }
    }

    private u(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, r rVar, boolean z10) {
        boolean z11;
        this.f17106a = i10;
        this.f17107b = i11;
        this.f17108c = i12;
        this.f17109d = str;
        this.f17110e = str3;
        this.f17111f = str4;
        this.f17112r = jSONObject;
        this.f17113s = jSONObject2;
        this.f17114t = obj;
        this.f17115u = httpURLConnection;
        this.f17116v = str2;
        if (rVar != null) {
            this.f17117w = rVar;
            z11 = true;
        } else {
            this.f17117w = new g0(this, c());
            z11 = false;
        }
        a c10 = z11 ? a.OTHER : f17105z.b().c(i11, i12, z10);
        this.f17118x = c10;
        this.f17119y = f17105z.b().d(c10);
    }

    public /* synthetic */ u(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, r rVar, boolean z10, kotlin.jvm.internal.g gVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, rVar, z10);
    }

    public u(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private u(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ u(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public u(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof r ? (r) exc : new r(exc), false);
    }

    public final int b() {
        return this.f17107b;
    }

    public final String c() {
        String str = this.f17116v;
        if (str != null) {
            return str;
        }
        r rVar = this.f17117w;
        if (rVar == null) {
            return null;
        }
        return rVar.getLocalizedMessage();
    }

    public final String d() {
        return this.f17109d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final r e() {
        return this.f17117w;
    }

    public final int f() {
        return this.f17106a;
    }

    public final int g() {
        return this.f17108c;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f17106a + ", errorCode: " + this.f17107b + ", subErrorCode: " + this.f17108c + ", errorType: " + this.f17109d + ", errorMessage: " + c() + "}";
        kotlin.jvm.internal.n.d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.n.e(out, "out");
        out.writeInt(this.f17106a);
        out.writeInt(this.f17107b);
        out.writeInt(this.f17108c);
        out.writeString(this.f17109d);
        out.writeString(c());
        out.writeString(this.f17110e);
        out.writeString(this.f17111f);
    }
}
