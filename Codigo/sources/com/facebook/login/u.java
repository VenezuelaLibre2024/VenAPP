package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private f0[] f8006a;

    /* renamed from: b, reason: collision with root package name */
    private int f8007b;

    /* renamed from: c, reason: collision with root package name */
    private Fragment f8008c;

    /* renamed from: d, reason: collision with root package name */
    private d f8009d;

    /* renamed from: e, reason: collision with root package name */
    private a f8010e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8011f;

    /* renamed from: r, reason: collision with root package name */
    private e f8012r;

    /* renamed from: s, reason: collision with root package name */
    private Map<String, String> f8013s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, String> f8014t;

    /* renamed from: u, reason: collision with root package name */
    private a0 f8015u;

    /* renamed from: v, reason: collision with root package name */
    private int f8016v;

    /* renamed from: w, reason: collision with root package name */
    private int f8017w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f8005x = new c(null);
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<u> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new u(source);
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

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.n.d(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return d.c.Login.h();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(f fVar);
    }

    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        private final String A;
        private final String B;
        private final com.facebook.login.a C;

        /* renamed from: a, reason: collision with root package name */
        private final t f8018a;

        /* renamed from: b, reason: collision with root package name */
        private Set<String> f8019b;

        /* renamed from: c, reason: collision with root package name */
        private final com.facebook.login.e f8020c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8021d;

        /* renamed from: e, reason: collision with root package name */
        private String f8022e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8023f;

        /* renamed from: r, reason: collision with root package name */
        private String f8024r;

        /* renamed from: s, reason: collision with root package name */
        private String f8025s;

        /* renamed from: t, reason: collision with root package name */
        private String f8026t;

        /* renamed from: u, reason: collision with root package name */
        private String f8027u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f8028v;

        /* renamed from: w, reason: collision with root package name */
        private final i0 f8029w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f8030x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f8031y;

        /* renamed from: z, reason: collision with root package name */
        private final String f8032z;
        public static final b D = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel source) {
                kotlin.jvm.internal.n.e(source, "source");
                return new e(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
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

        private e(Parcel parcel) {
            com.facebook.internal.o0 o0Var = com.facebook.internal.o0.f7793a;
            this.f8018a = t.valueOf(com.facebook.internal.o0.k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f8019b = new HashSet(arrayList);
            String readString = parcel.readString();
            this.f8020c = readString != null ? com.facebook.login.e.valueOf(readString) : com.facebook.login.e.NONE;
            this.f8021d = com.facebook.internal.o0.k(parcel.readString(), "applicationId");
            this.f8022e = com.facebook.internal.o0.k(parcel.readString(), "authId");
            this.f8023f = parcel.readByte() != 0;
            this.f8024r = parcel.readString();
            this.f8025s = com.facebook.internal.o0.k(parcel.readString(), "authType");
            this.f8026t = parcel.readString();
            this.f8027u = parcel.readString();
            this.f8028v = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.f8029w = readString2 != null ? i0.valueOf(readString2) : i0.FACEBOOK;
            this.f8030x = parcel.readByte() != 0;
            this.f8031y = parcel.readByte() != 0;
            this.f8032z = com.facebook.internal.o0.k(parcel.readString(), "nonce");
            this.A = parcel.readString();
            this.B = parcel.readString();
            String readString3 = parcel.readString();
            this.C = readString3 == null ? null : com.facebook.login.a.valueOf(readString3);
        }

        public /* synthetic */ e(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public e(t loginBehavior, Set<String> set, com.facebook.login.e defaultAudience, String authType, String applicationId, String authId, i0 i0Var, String str, String str2, String str3, com.facebook.login.a aVar) {
            kotlin.jvm.internal.n.e(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.n.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.n.e(authType, "authType");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            kotlin.jvm.internal.n.e(authId, "authId");
            this.f8018a = loginBehavior;
            this.f8019b = set == null ? new HashSet<>() : set;
            this.f8020c = defaultAudience;
            this.f8025s = authType;
            this.f8021d = applicationId;
            this.f8022e = authId;
            this.f8029w = i0Var == null ? i0.FACEBOOK : i0Var;
            if (str != null) {
                if (!(str.length() == 0)) {
                    this.f8032z = str;
                    this.A = str2;
                    this.B = str3;
                    this.C = aVar;
                }
            }
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.d(uuid, "randomUUID().toString()");
            this.f8032z = uuid;
            this.A = str2;
            this.B = str3;
            this.C = aVar;
        }

        public final boolean A() {
            return this.f8031y;
        }

        public final String a() {
            return this.f8021d;
        }

        public final String b() {
            return this.f8022e;
        }

        public final String c() {
            return this.f8025s;
        }

        public final String d() {
            return this.B;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final com.facebook.login.a e() {
            return this.C;
        }

        public final String f() {
            return this.A;
        }

        public final com.facebook.login.e g() {
            return this.f8020c;
        }

        public final String h() {
            return this.f8026t;
        }

        public final String i() {
            return this.f8024r;
        }

        public final t j() {
            return this.f8018a;
        }

        public final i0 k() {
            return this.f8029w;
        }

        public final String l() {
            return this.f8027u;
        }

        public final String m() {
            return this.f8032z;
        }

        public final Set<String> n() {
            return this.f8019b;
        }

        public final boolean o() {
            return this.f8028v;
        }

        public final boolean p() {
            Iterator<String> it = this.f8019b.iterator();
            while (it.hasNext()) {
                if (e0.f7914j.g(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean r() {
            return this.f8030x;
        }

        public final boolean s() {
            return this.f8029w == i0.INSTAGRAM;
        }

        public final boolean t() {
            return this.f8023f;
        }

        public final void u(boolean z10) {
            this.f8030x = z10;
        }

        public final void v(String str) {
            this.f8027u = str;
        }

        public final void w(Set<String> set) {
            kotlin.jvm.internal.n.e(set, "<set-?>");
            this.f8019b = set;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.e(dest, "dest");
            dest.writeString(this.f8018a.name());
            dest.writeStringList(new ArrayList(this.f8019b));
            dest.writeString(this.f8020c.name());
            dest.writeString(this.f8021d);
            dest.writeString(this.f8022e);
            dest.writeByte(this.f8023f ? (byte) 1 : (byte) 0);
            dest.writeString(this.f8024r);
            dest.writeString(this.f8025s);
            dest.writeString(this.f8026t);
            dest.writeString(this.f8027u);
            dest.writeByte(this.f8028v ? (byte) 1 : (byte) 0);
            dest.writeString(this.f8029w.name());
            dest.writeByte(this.f8030x ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f8031y ? (byte) 1 : (byte) 0);
            dest.writeString(this.f8032z);
            dest.writeString(this.A);
            dest.writeString(this.B);
            com.facebook.login.a aVar = this.C;
            dest.writeString(aVar == null ? null : aVar.name());
        }

        public final void x(boolean z10) {
            this.f8023f = z10;
        }

        public final void y(boolean z10) {
            this.f8028v = z10;
        }

        public final void z(boolean z10) {
            this.f8031y = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public final a f8034a;

        /* renamed from: b, reason: collision with root package name */
        public final i4.a f8035b;

        /* renamed from: c, reason: collision with root package name */
        public final i4.i f8036c;

        /* renamed from: d, reason: collision with root package name */
        public final String f8037d;

        /* renamed from: e, reason: collision with root package name */
        public final String f8038e;

        /* renamed from: f, reason: collision with root package name */
        public final e f8039f;

        /* renamed from: r, reason: collision with root package name */
        public Map<String, String> f8040r;

        /* renamed from: s, reason: collision with root package name */
        public Map<String, String> f8041s;

        /* renamed from: t, reason: collision with root package name */
        public static final c f8033t = new c(null);
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* loaded from: classes.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            a(String str) {
                this.loggingValue = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] valuesCustom = values();
                return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            public final String h() {
                return this.loggingValue;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements Parcelable.Creator<f> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                kotlin.jvm.internal.n.e(source, "source");
                return new f(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class c {
            private c() {
            }

            public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            public final f b(e eVar, i4.a aVar, i4.i iVar) {
                return new f(eVar, a.SUCCESS, aVar, iVar, null, null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, i4.a token) {
                kotlin.jvm.internal.n.e(token, "token");
                return new f(eVar, a.SUCCESS, token, null, null);
            }
        }

        private f(Parcel parcel) {
            String readString = parcel.readString();
            this.f8034a = a.valueOf(readString == null ? "error" : readString);
            this.f8035b = (i4.a) parcel.readParcelable(i4.a.class.getClassLoader());
            this.f8036c = (i4.i) parcel.readParcelable(i4.i.class.getClassLoader());
            this.f8037d = parcel.readString();
            this.f8038e = parcel.readString();
            this.f8039f = (e) parcel.readParcelable(e.class.getClassLoader());
            this.f8040r = com.facebook.internal.n0.s0(parcel);
            this.f8041s = com.facebook.internal.n0.s0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public f(e eVar, a code, i4.a aVar, i4.i iVar, String str, String str2) {
            kotlin.jvm.internal.n.e(code, "code");
            this.f8039f = eVar;
            this.f8035b = aVar;
            this.f8036c = iVar;
            this.f8037d = str;
            this.f8034a = code;
            this.f8038e = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(e eVar, a code, i4.a aVar, String str, String str2) {
            this(eVar, code, aVar, null, str, str2);
            kotlin.jvm.internal.n.e(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.e(dest, "dest");
            dest.writeString(this.f8034a.name());
            dest.writeParcelable(this.f8035b, i10);
            dest.writeParcelable(this.f8036c, i10);
            dest.writeString(this.f8037d);
            dest.writeString(this.f8038e);
            dest.writeParcelable(this.f8039f, i10);
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            com.facebook.internal.n0.H0(dest, this.f8040r);
            com.facebook.internal.n0.H0(dest, this.f8041s);
        }
    }

    public u(Parcel source) {
        kotlin.jvm.internal.n.e(source, "source");
        this.f8007b = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(f0.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            f0 f0Var = parcelable instanceof f0 ? (f0) parcelable : null;
            if (f0Var != null) {
                f0Var.m(this);
            }
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new f0[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f8006a = (f0[]) array;
        this.f8007b = source.readInt();
        this.f8012r = (e) source.readParcelable(e.class.getClassLoader());
        Map<String, String> s02 = com.facebook.internal.n0.s0(source);
        this.f8013s = s02 == null ? null : dk.k0.u(s02);
        Map<String, String> s03 = com.facebook.internal.n0.s0(source);
        this.f8014t = s03 != null ? dk.k0.u(s03) : null;
    }

    public u(Fragment fragment) {
        kotlin.jvm.internal.n.e(fragment, "fragment");
        this.f8007b = -1;
        x(fragment);
    }

    private final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f8013s;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f8013s == null) {
            this.f8013s = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void h() {
        f(f.c.d(f.f8033t, this.f8012r, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (kotlin.jvm.internal.n.a(r1, r2 == null ? null : r2.a()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.login.a0 n() {
        /*
            r3 = this;
            com.facebook.login.a0 r0 = r3.f8015u
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.b()
            com.facebook.login.u$e r2 = r3.f8012r
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.a()
        L12:
            boolean r1 = kotlin.jvm.internal.n.a(r1, r2)
            if (r1 != 0) goto L36
        L18:
            com.facebook.login.a0 r0 = new com.facebook.login.a0
            androidx.fragment.app.e r1 = r3.i()
            if (r1 != 0) goto L24
            android.content.Context r1 = i4.e0.l()
        L24:
            com.facebook.login.u$e r2 = r3.f8012r
            if (r2 != 0) goto L2d
            java.lang.String r2 = i4.e0.m()
            goto L31
        L2d:
            java.lang.String r2 = r2.a()
        L31:
            r0.<init>(r1, r2)
            r3.f8015u = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.u.n():com.facebook.login.a0");
    }

    private final void p(String str, f fVar, Map<String, String> map) {
        r(str, fVar.f8034a.h(), fVar.f8037d, fVar.f8038e, map);
    }

    private final void r(String str, String str2, String str3, String str4, Map<String, String> map) {
        e eVar = this.f8012r;
        if (eVar == null) {
            n().n("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            n().c(eVar.b(), str, str2, str3, str4, map, eVar.r() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void u(f fVar) {
        d dVar = this.f8009d;
        if (dVar == null) {
            return;
        }
        dVar.a(fVar);
    }

    public final boolean A() {
        f0 j10 = j();
        if (j10 == null) {
            return false;
        }
        if (j10.i() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        e eVar = this.f8012r;
        if (eVar == null) {
            return false;
        }
        int o10 = j10.o(eVar);
        this.f8016v = 0;
        a0 n10 = n();
        String b10 = eVar.b();
        if (o10 > 0) {
            n10.e(b10, j10.f(), eVar.r() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f8017w = o10;
        } else {
            n10.d(b10, j10.f(), eVar.r() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", j10.f(), true);
        }
        return o10 > 0;
    }

    public final void B() {
        f0 j10 = j();
        if (j10 != null) {
            r(j10.f(), "skipped", null, null, j10.e());
        }
        f0[] f0VarArr = this.f8006a;
        while (f0VarArr != null) {
            int i10 = this.f8007b;
            if (i10 >= f0VarArr.length - 1) {
                break;
            }
            this.f8007b = i10 + 1;
            if (A()) {
                return;
            }
        }
        if (this.f8012r != null) {
            h();
        }
    }

    public final void C(f pendingResult) {
        f b10;
        kotlin.jvm.internal.n.e(pendingResult, "pendingResult");
        if (pendingResult.f8035b == null) {
            throw new i4.r("Can't validate without a token");
        }
        i4.a e10 = i4.a.f16899w.e();
        i4.a aVar = pendingResult.f8035b;
        if (e10 != null) {
            try {
                if (kotlin.jvm.internal.n.a(e10.n(), aVar.n())) {
                    b10 = f.f8033t.b(this.f8012r, pendingResult.f8035b, pendingResult.f8036c);
                    f(b10);
                }
            } catch (Exception e11) {
                f(f.c.d(f.f8033t, this.f8012r, "Caught exception", e11.getMessage(), null, 8, null));
                return;
            }
        }
        b10 = f.c.d(f.f8033t, this.f8012r, "User logged in as different Facebook user.", null, null, 8, null);
        f(b10);
    }

    public final void b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f8012r != null) {
            throw new i4.r("Attempted to authorize while a request is pending.");
        }
        if (!i4.a.f16899w.g() || d()) {
            this.f8012r = eVar;
            this.f8006a = l(eVar);
            B();
        }
    }

    public final void c() {
        f0 j10 = j();
        if (j10 == null) {
            return;
        }
        j10.b();
    }

    public final boolean d() {
        if (this.f8011f) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.f8011f = true;
            return true;
        }
        androidx.fragment.app.e i10 = i();
        f(f.c.d(f.f8033t, this.f8012r, i10 == null ? null : i10.getString(com.facebook.common.d.f7688c), i10 != null ? i10.getString(com.facebook.common.d.f7687b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e(String permission) {
        kotlin.jvm.internal.n.e(permission, "permission");
        androidx.fragment.app.e i10 = i();
        if (i10 == null) {
            return -1;
        }
        return i10.checkCallingOrSelfPermission(permission);
    }

    public final void f(f outcome) {
        kotlin.jvm.internal.n.e(outcome, "outcome");
        f0 j10 = j();
        if (j10 != null) {
            p(j10.f(), outcome, j10.e());
        }
        Map<String, String> map = this.f8013s;
        if (map != null) {
            outcome.f8040r = map;
        }
        Map<String, String> map2 = this.f8014t;
        if (map2 != null) {
            outcome.f8041s = map2;
        }
        this.f8006a = null;
        this.f8007b = -1;
        this.f8012r = null;
        this.f8013s = null;
        this.f8016v = 0;
        this.f8017w = 0;
        u(outcome);
    }

    public final void g(f outcome) {
        kotlin.jvm.internal.n.e(outcome, "outcome");
        if (outcome.f8035b == null || !i4.a.f16899w.g()) {
            f(outcome);
        } else {
            C(outcome);
        }
    }

    public final androidx.fragment.app.e i() {
        Fragment fragment = this.f8008c;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final f0 j() {
        f0[] f0VarArr;
        int i10 = this.f8007b;
        if (i10 < 0 || (f0VarArr = this.f8006a) == null) {
            return null;
        }
        return f0VarArr[i10];
    }

    public final Fragment k() {
        return this.f8008c;
    }

    public f0[] l(e request) {
        f0 sVar;
        kotlin.jvm.internal.n.e(request, "request");
        ArrayList arrayList = new ArrayList();
        t j10 = request.j();
        if (!request.s()) {
            if (j10.l()) {
                arrayList.add(new q(this));
            }
            if (!i4.e0.f16966s && j10.n()) {
                sVar = new s(this);
                arrayList.add(sVar);
            }
        } else if (!i4.e0.f16966s && j10.m()) {
            sVar = new r(this);
            arrayList.add(sVar);
        }
        if (j10.h()) {
            arrayList.add(new com.facebook.login.c(this));
        }
        if (j10.o()) {
            arrayList.add(new p0(this));
        }
        if (!request.s() && j10.i()) {
            arrayList.add(new n(this));
        }
        Object[] array = arrayList.toArray(new f0[0]);
        if (array != null) {
            return (f0[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean m() {
        return this.f8012r != null && this.f8007b >= 0;
    }

    public final e o() {
        return this.f8012r;
    }

    public final void s() {
        a aVar = this.f8010e;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void t() {
        a aVar = this.f8010e;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final boolean v(int i10, int i11, Intent intent) {
        this.f8016v++;
        if (this.f8012r != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f7552u, false)) {
                B();
                return false;
            }
            f0 j10 = j();
            if (j10 != null && (!j10.n() || intent != null || this.f8016v >= this.f8017w)) {
                return j10.j(i10, i11, intent);
            }
        }
        return false;
    }

    public final void w(a aVar) {
        this.f8010e = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        dest.writeParcelableArray(this.f8006a, i10);
        dest.writeInt(this.f8007b);
        dest.writeParcelable(this.f8012r, i10);
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        com.facebook.internal.n0.H0(dest, this.f8013s);
        com.facebook.internal.n0.H0(dest, this.f8014t);
    }

    public final void x(Fragment fragment) {
        if (this.f8008c != null) {
            throw new i4.r("Can't set fragment once it is already set.");
        }
        this.f8008c = fragment;
    }

    public final void y(d dVar) {
        this.f8009d = dVar;
    }

    public final void z(e eVar) {
        if (m()) {
            return;
        }
        b(eVar);
    }
}
