package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.common.C4604d;
import com.facebook.internal.C4613d;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import dk.C7018k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7806i;
import p152i4.C7824r;

/* renamed from: com.facebook.login.u */
/* loaded from: classes.dex */
public class C4689u implements Parcelable {

    /* renamed from: a */
    private AbstractC4664f0[] f9001a;

    /* renamed from: b */
    private int f9002b;

    /* renamed from: c */
    private Fragment f9003c;

    /* renamed from: d */
    private d f9004d;

    /* renamed from: e */
    private a f9005e;

    /* renamed from: f */
    private boolean f9006f;

    /* renamed from: r */
    private e f9007r;

    /* renamed from: s */
    private Map<String, String> f9008s;

    /* renamed from: t */
    private Map<String, String> f9009t;

    /* renamed from: u */
    private C4654a0 f9010u;

    /* renamed from: v */
    private int f9011v;

    /* renamed from: w */
    private int f9012w;

    /* renamed from: x */
    public static final c f9000x = new c(null);
    public static final Parcelable.Creator<C4689u> CREATOR = new b();

    /* renamed from: com.facebook.login.u$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11709a();

        /* renamed from: b */
        void mo11710b();
    }

    /* renamed from: com.facebook.login.u$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C4689u> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4689u createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4689u(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4689u[] newArray(int i10) {
            return new C4689u[i10];
        }
    }

    /* renamed from: com.facebook.login.u$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final String m11713a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            C9322n.m27780d(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        /* renamed from: b */
        public final int m11714b() {
            return C4613d.c.Login.m11150h();
        }
    }

    /* renamed from: com.facebook.login.u$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo11715a(f fVar);
    }

    /* renamed from: com.facebook.login.u$e */
    /* loaded from: classes.dex */
    public static final class e implements Parcelable {

        /* renamed from: A */
        private final String f9014A;

        /* renamed from: B */
        private final String f9015B;

        /* renamed from: C */
        private final EnumC4653a f9016C;

        /* renamed from: a */
        private final EnumC4688t f9017a;

        /* renamed from: b */
        private Set<String> f9018b;

        /* renamed from: c */
        private final EnumC4661e f9019c;

        /* renamed from: d */
        private final String f9020d;

        /* renamed from: e */
        private String f9021e;

        /* renamed from: f */
        private boolean f9022f;

        /* renamed from: r */
        private String f9023r;

        /* renamed from: s */
        private String f9024s;

        /* renamed from: t */
        private String f9025t;

        /* renamed from: u */
        private String f9026u;

        /* renamed from: v */
        private boolean f9027v;

        /* renamed from: w */
        private final EnumC4670i0 f9028w;

        /* renamed from: x */
        private boolean f9029x;

        /* renamed from: y */
        private boolean f9030y;

        /* renamed from: z */
        private final String f9031z;

        /* renamed from: D */
        public static final b f9013D = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: com.facebook.login.u$e$a */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel source) {
                C9322n.m27781e(source, "source");
                return new e(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* renamed from: com.facebook.login.u$e$b */
        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(C9315g c9315g) {
                this();
            }
        }

        private e(Parcel parcel) {
            C4636o0 c4636o0 = C4636o0.f8773a;
            this.f9017a = EnumC4688t.valueOf(C4636o0.m11360k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f9018b = new HashSet(arrayList);
            String readString = parcel.readString();
            this.f9019c = readString != null ? EnumC4661e.valueOf(readString) : EnumC4661e.NONE;
            this.f9020d = C4636o0.m11360k(parcel.readString(), "applicationId");
            this.f9021e = C4636o0.m11360k(parcel.readString(), "authId");
            this.f9022f = parcel.readByte() != 0;
            this.f9023r = parcel.readString();
            this.f9024s = C4636o0.m11360k(parcel.readString(), "authType");
            this.f9025t = parcel.readString();
            this.f9026u = parcel.readString();
            this.f9027v = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.f9028w = readString2 != null ? EnumC4670i0.valueOf(readString2) : EnumC4670i0.FACEBOOK;
            this.f9029x = parcel.readByte() != 0;
            this.f9030y = parcel.readByte() != 0;
            this.f9031z = C4636o0.m11360k(parcel.readString(), "nonce");
            this.f9014A = parcel.readString();
            this.f9015B = parcel.readString();
            String readString3 = parcel.readString();
            this.f9016C = readString3 == null ? null : EnumC4653a.valueOf(readString3);
        }

        public /* synthetic */ e(Parcel parcel, C9315g c9315g) {
            this(parcel);
        }

        public e(EnumC4688t loginBehavior, Set<String> set, EnumC4661e defaultAudience, String authType, String applicationId, String authId, EnumC4670i0 enumC4670i0, String str, String str2, String str3, EnumC4653a enumC4653a) {
            C9322n.m27781e(loginBehavior, "loginBehavior");
            C9322n.m27781e(defaultAudience, "defaultAudience");
            C9322n.m27781e(authType, "authType");
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(authId, "authId");
            this.f9017a = loginBehavior;
            this.f9018b = set == null ? new HashSet<>() : set;
            this.f9019c = defaultAudience;
            this.f9024s = authType;
            this.f9020d = applicationId;
            this.f9021e = authId;
            this.f9028w = enumC4670i0 == null ? EnumC4670i0.FACEBOOK : enumC4670i0;
            if (str != null) {
                if (!(str.length() == 0)) {
                    this.f9031z = str;
                    this.f9014A = str2;
                    this.f9015B = str3;
                    this.f9016C = enumC4653a;
                }
            }
            String uuid = UUID.randomUUID().toString();
            C9322n.m27780d(uuid, "randomUUID().toString()");
            this.f9031z = uuid;
            this.f9014A = str2;
            this.f9015B = str3;
            this.f9016C = enumC4653a;
        }

        /* renamed from: A */
        public final boolean m11716A() {
            return this.f9030y;
        }

        /* renamed from: a */
        public final String m11717a() {
            return this.f9020d;
        }

        /* renamed from: b */
        public final String m11718b() {
            return this.f9021e;
        }

        /* renamed from: c */
        public final String m11719c() {
            return this.f9024s;
        }

        /* renamed from: d */
        public final String m11720d() {
            return this.f9015B;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final EnumC4653a m11721e() {
            return this.f9016C;
        }

        /* renamed from: f */
        public final String m11722f() {
            return this.f9014A;
        }

        /* renamed from: g */
        public final EnumC4661e m11723g() {
            return this.f9019c;
        }

        /* renamed from: h */
        public final String m11724h() {
            return this.f9025t;
        }

        /* renamed from: i */
        public final String m11725i() {
            return this.f9023r;
        }

        /* renamed from: j */
        public final EnumC4688t m11726j() {
            return this.f9017a;
        }

        /* renamed from: k */
        public final EnumC4670i0 m11727k() {
            return this.f9028w;
        }

        /* renamed from: l */
        public final String m11728l() {
            return this.f9026u;
        }

        /* renamed from: m */
        public final String m11729m() {
            return this.f9031z;
        }

        /* renamed from: n */
        public final Set<String> m11730n() {
            return this.f9018b;
        }

        /* renamed from: o */
        public final boolean m11731o() {
            return this.f9027v;
        }

        /* renamed from: p */
        public final boolean m11732p() {
            Iterator<String> it = this.f9018b.iterator();
            while (it.hasNext()) {
                if (C4662e0.f8894j.m11550g(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r */
        public final boolean m11733r() {
            return this.f9029x;
        }

        /* renamed from: s */
        public final boolean m11734s() {
            return this.f9028w == EnumC4670i0.INSTAGRAM;
        }

        /* renamed from: t */
        public final boolean m11735t() {
            return this.f9022f;
        }

        /* renamed from: u */
        public final void m11736u(boolean z10) {
            this.f9029x = z10;
        }

        /* renamed from: v */
        public final void m11737v(String str) {
            this.f9026u = str;
        }

        /* renamed from: w */
        public final void m11738w(Set<String> set) {
            C9322n.m27781e(set, "<set-?>");
            this.f9018b = set;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            C9322n.m27781e(dest, "dest");
            dest.writeString(this.f9017a.name());
            dest.writeStringList(new ArrayList(this.f9018b));
            dest.writeString(this.f9019c.name());
            dest.writeString(this.f9020d);
            dest.writeString(this.f9021e);
            dest.writeByte(this.f9022f ? (byte) 1 : (byte) 0);
            dest.writeString(this.f9023r);
            dest.writeString(this.f9024s);
            dest.writeString(this.f9025t);
            dest.writeString(this.f9026u);
            dest.writeByte(this.f9027v ? (byte) 1 : (byte) 0);
            dest.writeString(this.f9028w.name());
            dest.writeByte(this.f9029x ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f9030y ? (byte) 1 : (byte) 0);
            dest.writeString(this.f9031z);
            dest.writeString(this.f9014A);
            dest.writeString(this.f9015B);
            EnumC4653a enumC4653a = this.f9016C;
            dest.writeString(enumC4653a == null ? null : enumC4653a.name());
        }

        /* renamed from: x */
        public final void m11739x(boolean z10) {
            this.f9022f = z10;
        }

        /* renamed from: y */
        public final void m11740y(boolean z10) {
            this.f9027v = z10;
        }

        /* renamed from: z */
        public final void m11741z(boolean z10) {
            this.f9030y = z10;
        }
    }

    /* renamed from: com.facebook.login.u$f */
    /* loaded from: classes.dex */
    public static final class f implements Parcelable {

        /* renamed from: a */
        public final a f9033a;

        /* renamed from: b */
        public final C7787a f9034b;

        /* renamed from: c */
        public final C7806i f9035c;

        /* renamed from: d */
        public final String f9036d;

        /* renamed from: e */
        public final String f9037e;

        /* renamed from: f */
        public final e f9038f;

        /* renamed from: r */
        public Map<String, String> f9039r;

        /* renamed from: s */
        public Map<String, String> f9040s;

        /* renamed from: t */
        public static final c f9032t = new c(null);
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* renamed from: com.facebook.login.u$f$a */
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

            /* renamed from: h */
            public final String m11745h() {
                return this.loggingValue;
            }
        }

        /* renamed from: com.facebook.login.u$f$b */
        /* loaded from: classes.dex */
        public static final class b implements Parcelable.Creator<f> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                C9322n.m27781e(source, "source");
                return new f(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* renamed from: com.facebook.login.u$f$c */
        /* loaded from: classes.dex */
        public static final class c {
            private c() {
            }

            public /* synthetic */ c(C9315g c9315g) {
                this();
            }

            /* renamed from: d */
            public static /* synthetic */ f m11748d(c cVar, e eVar, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.m11751c(eVar, str, str2, str3);
            }

            /* renamed from: a */
            public final f m11749a(e eVar, String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            /* renamed from: b */
            public final f m11750b(e eVar, C7787a c7787a, C7806i c7806i) {
                return new f(eVar, a.SUCCESS, c7787a, c7806i, null, null);
            }

            /* renamed from: c */
            public final f m11751c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            /* renamed from: e */
            public final f m11752e(e eVar, C7787a token) {
                C9322n.m27781e(token, "token");
                return new f(eVar, a.SUCCESS, token, null, null);
            }
        }

        private f(Parcel parcel) {
            String readString = parcel.readString();
            this.f9033a = a.valueOf(readString == null ? "error" : readString);
            this.f9034b = (C7787a) parcel.readParcelable(C7787a.class.getClassLoader());
            this.f9035c = (C7806i) parcel.readParcelable(C7806i.class.getClassLoader());
            this.f9036d = parcel.readString();
            this.f9037e = parcel.readString();
            this.f9038f = (e) parcel.readParcelable(e.class.getClassLoader());
            this.f9039r = C4634n0.m11330s0(parcel);
            this.f9040s = C4634n0.m11330s0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, C9315g c9315g) {
            this(parcel);
        }

        public f(e eVar, a code, C7787a c7787a, C7806i c7806i, String str, String str2) {
            C9322n.m27781e(code, "code");
            this.f9038f = eVar;
            this.f9034b = c7787a;
            this.f9035c = c7806i;
            this.f9036d = str;
            this.f9033a = code;
            this.f9037e = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(e eVar, a code, C7787a c7787a, String str, String str2) {
            this(eVar, code, c7787a, null, str, str2);
            C9322n.m27781e(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            C9322n.m27781e(dest, "dest");
            dest.writeString(this.f9033a.name());
            dest.writeParcelable(this.f9034b, i10);
            dest.writeParcelable(this.f9035c, i10);
            dest.writeString(this.f9036d);
            dest.writeString(this.f9037e);
            dest.writeParcelable(this.f9038f, i10);
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11275H0(dest, this.f9039r);
            C4634n0.m11275H0(dest, this.f9040s);
        }
    }

    public C4689u(Parcel source) {
        C9322n.m27781e(source, "source");
        this.f9002b = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(AbstractC4664f0.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            AbstractC4664f0 abstractC4664f0 = parcelable instanceof AbstractC4664f0 ? (AbstractC4664f0) parcelable : null;
            if (abstractC4664f0 != null) {
                abstractC4664f0.m11560m(this);
            }
            if (abstractC4664f0 != null) {
                arrayList.add(abstractC4664f0);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new AbstractC4664f0[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f9001a = (AbstractC4664f0[]) array;
        this.f9002b = source.readInt();
        this.f9007r = (e) source.readParcelable(e.class.getClassLoader());
        Map<String, String> m11330s0 = C4634n0.m11330s0(source);
        this.f9008s = m11330s0 == null ? null : C7018k0.m20434u(m11330s0);
        Map<String, String> m11330s02 = C4634n0.m11330s0(source);
        this.f9009t = m11330s02 != null ? C7018k0.m20434u(m11330s02) : null;
    }

    public C4689u(Fragment fragment) {
        C9322n.m27781e(fragment, "fragment");
        this.f9002b = -1;
        m11706x(fragment);
    }

    /* renamed from: a */
    private final void m11681a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f9008s;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f9008s == null) {
            this.f9008s = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* renamed from: h */
    private final void m11682h() {
        m11694f(f.c.m11748d(f.f9032t, this.f9007r, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (kotlin.jvm.internal.C9322n.m27777a(r1, r2 == null ? null : r2.m11717a()) == false) goto L10;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.login.C4654a0 m11683n() {
        /*
            r3 = this;
            com.facebook.login.a0 r0 = r3.f9010u
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.m11475b()
            com.facebook.login.u$e r2 = r3.f9007r
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.m11717a()
        L12:
            boolean r1 = kotlin.jvm.internal.C9322n.m27777a(r1, r2)
            if (r1 != 0) goto L36
        L18:
            com.facebook.login.a0 r0 = new com.facebook.login.a0
            androidx.fragment.app.e r1 = r3.m11696i()
            if (r1 != 0) goto L24
            android.content.Context r1 = p152i4.C7799e0.m23860l()
        L24:
            com.facebook.login.u$e r2 = r3.f9007r
            if (r2 != 0) goto L2d
            java.lang.String r2 = p152i4.C7799e0.m23861m()
            goto L31
        L2d:
            java.lang.String r2 = r2.m11717a()
        L31:
            r0.<init>(r1, r2)
            r3.f9010u = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C4689u.m11683n():com.facebook.login.a0");
    }

    /* renamed from: p */
    private final void m11684p(String str, f fVar, Map<String, String> map) {
        m11685r(str, fVar.f9033a.m11745h(), fVar.f9036d, fVar.f9037e, map);
    }

    /* renamed from: r */
    private final void m11685r(String str, String str2, String str3, String str4, Map<String, String> map) {
        e eVar = this.f9007r;
        if (eVar == null) {
            m11683n().m11485n("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m11683n().m11476c(eVar.m11718b(), str, str2, str3, str4, map, eVar.m11733r() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    /* renamed from: u */
    private final void m11686u(f fVar) {
        d dVar = this.f9004d;
        if (dVar == null) {
            return;
        }
        dVar.mo11715a(fVar);
    }

    /* renamed from: A */
    public final boolean m11687A() {
        AbstractC4664f0 m11697j = m11697j();
        if (m11697j == null) {
            return false;
        }
        if (m11697j.mo11558i() && !m11692d()) {
            m11681a("no_internet_permission", "1", false);
            return false;
        }
        e eVar = this.f9007r;
        if (eVar == null) {
            return false;
        }
        int mo11498o = m11697j.mo11498o(eVar);
        this.f9011v = 0;
        C4654a0 m11683n = m11683n();
        String m11718b = eVar.m11718b();
        if (mo11498o > 0) {
            m11683n.m11478e(m11718b, m11697j.mo11494f(), eVar.m11733r() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f9012w = mo11498o;
        } else {
            m11683n.m11477d(m11718b, m11697j.mo11494f(), eVar.m11733r() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            m11681a("not_tried", m11697j.mo11494f(), true);
        }
        return mo11498o > 0;
    }

    /* renamed from: B */
    public final void m11688B() {
        AbstractC4664f0 m11697j = m11697j();
        if (m11697j != null) {
            m11685r(m11697j.mo11494f(), "skipped", null, null, m11697j.m11556e());
        }
        AbstractC4664f0[] abstractC4664f0Arr = this.f9001a;
        while (abstractC4664f0Arr != null) {
            int i10 = this.f9002b;
            if (i10 >= abstractC4664f0Arr.length - 1) {
                break;
            }
            this.f9002b = i10 + 1;
            if (m11687A()) {
                return;
            }
        }
        if (this.f9007r != null) {
            m11682h();
        }
    }

    /* renamed from: C */
    public final void m11689C(f pendingResult) {
        f m11750b;
        C9322n.m27781e(pendingResult, "pendingResult");
        if (pendingResult.f9034b == null) {
            throw new C7824r("Can't validate without a token");
        }
        C7787a m23782e = C7787a.f18552w.m23782e();
        C7787a c7787a = pendingResult.f9034b;
        if (m23782e != null) {
            try {
                if (C9322n.m27777a(m23782e.m23771n(), c7787a.m23771n())) {
                    m11750b = f.f9032t.m11750b(this.f9007r, pendingResult.f9034b, pendingResult.f9035c);
                    m11694f(m11750b);
                }
            } catch (Exception e10) {
                m11694f(f.c.m11748d(f.f9032t, this.f9007r, "Caught exception", e10.getMessage(), null, 8, null));
                return;
            }
        }
        m11750b = f.c.m11748d(f.f9032t, this.f9007r, "User logged in as different Facebook user.", null, null, 8, null);
        m11694f(m11750b);
    }

    /* renamed from: b */
    public final void m11690b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f9007r != null) {
            throw new C7824r("Attempted to authorize while a request is pending.");
        }
        if (!C7787a.f18552w.m23784g() || m11692d()) {
            this.f9007r = eVar;
            this.f9001a = m11699l(eVar);
            m11688B();
        }
    }

    /* renamed from: c */
    public final void m11691c() {
        AbstractC4664f0 m11697j = m11697j();
        if (m11697j == null) {
            return;
        }
        m11697j.mo11553b();
    }

    /* renamed from: d */
    public final boolean m11692d() {
        if (this.f9006f) {
            return true;
        }
        if (m11693e("android.permission.INTERNET") == 0) {
            this.f9006f = true;
            return true;
        }
        ActivityC1263e m11696i = m11696i();
        m11694f(f.c.m11748d(f.f9032t, this.f9007r, m11696i == null ? null : m11696i.getString(C4604d.f8663c), m11696i != null ? m11696i.getString(C4604d.f8662b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m11693e(String permission) {
        C9322n.m27781e(permission, "permission");
        ActivityC1263e m11696i = m11696i();
        if (m11696i == null) {
            return -1;
        }
        return m11696i.checkCallingOrSelfPermission(permission);
    }

    /* renamed from: f */
    public final void m11694f(f outcome) {
        C9322n.m27781e(outcome, "outcome");
        AbstractC4664f0 m11697j = m11697j();
        if (m11697j != null) {
            m11684p(m11697j.mo11494f(), outcome, m11697j.m11556e());
        }
        Map<String, String> map = this.f9008s;
        if (map != null) {
            outcome.f9039r = map;
        }
        Map<String, String> map2 = this.f9009t;
        if (map2 != null) {
            outcome.f9040s = map2;
        }
        this.f9001a = null;
        this.f9002b = -1;
        this.f9007r = null;
        this.f9008s = null;
        this.f9011v = 0;
        this.f9012w = 0;
        m11686u(outcome);
    }

    /* renamed from: g */
    public final void m11695g(f outcome) {
        C9322n.m27781e(outcome, "outcome");
        if (outcome.f9034b == null || !C7787a.f18552w.m23784g()) {
            m11694f(outcome);
        } else {
            m11689C(outcome);
        }
    }

    /* renamed from: i */
    public final ActivityC1263e m11696i() {
        Fragment fragment = this.f9003c;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    /* renamed from: j */
    public final AbstractC4664f0 m11697j() {
        AbstractC4664f0[] abstractC4664f0Arr;
        int i10 = this.f9002b;
        if (i10 < 0 || (abstractC4664f0Arr = this.f9001a) == null) {
            return null;
        }
        return abstractC4664f0Arr[i10];
    }

    /* renamed from: k */
    public final Fragment m11698k() {
        return this.f9003c;
    }

    /* renamed from: l */
    public AbstractC4664f0[] m11699l(e request) {
        AbstractC4664f0 c4687s;
        C9322n.m27781e(request, "request");
        ArrayList arrayList = new ArrayList();
        EnumC4688t m11726j = request.m11726j();
        if (!request.m11734s()) {
            if (m11726j.m11677l()) {
                arrayList.add(new C4685q(this));
            }
            if (!C7799e0.f18619s && m11726j.m11679n()) {
                c4687s = new C4687s(this);
                arrayList.add(c4687s);
            }
        } else if (!C7799e0.f18619s && m11726j.m11678m()) {
            c4687s = new C4686r(this);
            arrayList.add(c4687s);
        }
        if (m11726j.m11675h()) {
            arrayList.add(new C4657c(this));
        }
        if (m11726j.m11680o()) {
            arrayList.add(new C4684p0(this));
        }
        if (!request.m11734s() && m11726j.m11676i()) {
            arrayList.add(new C4679n(this));
        }
        Object[] array = arrayList.toArray(new AbstractC4664f0[0]);
        if (array != null) {
            return (AbstractC4664f0[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: m */
    public final boolean m11700m() {
        return this.f9007r != null && this.f9002b >= 0;
    }

    /* renamed from: o */
    public final e m11701o() {
        return this.f9007r;
    }

    /* renamed from: s */
    public final void m11702s() {
        a aVar = this.f9005e;
        if (aVar == null) {
            return;
        }
        aVar.mo11709a();
    }

    /* renamed from: t */
    public final void m11703t() {
        a aVar = this.f9005e;
        if (aVar == null) {
            return;
        }
        aVar.mo11710b();
    }

    /* renamed from: v */
    public final boolean m11704v(int i10, int i11, Intent intent) {
        this.f9011v++;
        if (this.f9007r != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f8526u, false)) {
                m11688B();
                return false;
            }
            AbstractC4664f0 m11697j = m11697j();
            if (m11697j != null && (!m11697j.mo11561n() || intent != null || this.f9011v >= this.f9012w)) {
                return m11697j.mo11496j(i10, i11, intent);
            }
        }
        return false;
    }

    /* renamed from: w */
    public final void m11705w(a aVar) {
        this.f9005e = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeParcelableArray(this.f9001a, i10);
        dest.writeInt(this.f9002b);
        dest.writeParcelable(this.f9007r, i10);
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11275H0(dest, this.f9008s);
        C4634n0.m11275H0(dest, this.f9009t);
    }

    /* renamed from: x */
    public final void m11706x(Fragment fragment) {
        if (this.f9003c != null) {
            throw new C7824r("Can't set fragment once it is already set.");
        }
        this.f9003c = fragment;
    }

    /* renamed from: y */
    public final void m11707y(d dVar) {
        this.f9004d = dVar;
    }

    /* renamed from: z */
    public final void m11708z(e eVar) {
        if (m11700m()) {
            return;
        }
        m11690b(eVar);
    }
}
