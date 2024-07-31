package v9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    private final e f28661a;

    /* renamed from: b, reason: collision with root package name */
    private final C0461b f28662b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28663c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28664d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28665e;

    /* renamed from: f, reason: collision with root package name */
    private final d f28666f;

    /* renamed from: r, reason: collision with root package name */
    private final c f28667r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f28668a;

        /* renamed from: b, reason: collision with root package name */
        private C0461b f28669b;

        /* renamed from: c, reason: collision with root package name */
        private d f28670c;

        /* renamed from: d, reason: collision with root package name */
        private c f28671d;

        /* renamed from: e, reason: collision with root package name */
        private String f28672e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28673f;

        /* renamed from: g, reason: collision with root package name */
        private int f28674g;

        public a() {
            e.a u12 = e.u1();
            u12.b(false);
            this.f28668a = u12.a();
            C0461b.a u13 = C0461b.u1();
            u13.b(false);
            this.f28669b = u13.a();
            d.a u14 = d.u1();
            u14.b(false);
            this.f28670c = u14.a();
            c.a u15 = c.u1();
            u15.b(false);
            this.f28671d = u15.a();
        }

        public b a() {
            return new b(this.f28668a, this.f28669b, this.f28672e, this.f28673f, this.f28674g, this.f28670c, this.f28671d);
        }

        public a b(boolean z10) {
            this.f28673f = z10;
            return this;
        }

        public a c(C0461b c0461b) {
            this.f28669b = (C0461b) com.google.android.gms.common.internal.s.j(c0461b);
            return this;
        }

        public a d(c cVar) {
            this.f28671d = (c) com.google.android.gms.common.internal.s.j(cVar);
            return this;
        }

        @Deprecated
        public a e(d dVar) {
            this.f28670c = (d) com.google.android.gms.common.internal.s.j(dVar);
            return this;
        }

        public a f(e eVar) {
            this.f28668a = (e) com.google.android.gms.common.internal.s.j(eVar);
            return this;
        }

        public final a g(String str) {
            this.f28672e = str;
            return this;
        }

        public final a h(int i10) {
            this.f28674g = i10;
            return this;
        }
    }

    /* renamed from: v9.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0461b extends ea.a {
        public static final Parcelable.Creator<C0461b> CREATOR = new s();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28675a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28676b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28677c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28678d;

        /* renamed from: e, reason: collision with root package name */
        private final String f28679e;

        /* renamed from: f, reason: collision with root package name */
        private final List f28680f;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f28681r;

        /* renamed from: v9.b$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f28682a = false;

            /* renamed from: b, reason: collision with root package name */
            private String f28683b = null;

            /* renamed from: c, reason: collision with root package name */
            private String f28684c = null;

            /* renamed from: d, reason: collision with root package name */
            private boolean f28685d = true;

            /* renamed from: e, reason: collision with root package name */
            private String f28686e = null;

            /* renamed from: f, reason: collision with root package name */
            private List f28687f = null;

            /* renamed from: g, reason: collision with root package name */
            private boolean f28688g = false;

            public C0461b a() {
                return new C0461b(this.f28682a, this.f28683b, this.f28684c, this.f28685d, this.f28686e, this.f28687f, this.f28688g);
            }

            public a b(boolean z10) {
                this.f28682a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0461b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            com.google.android.gms.common.internal.s.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f28675a = z10;
            if (z10) {
                com.google.android.gms.common.internal.s.k(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f28676b = str;
            this.f28677c = str2;
            this.f28678d = z11;
            Parcelable.Creator<b> creator = b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f28680f = arrayList;
            this.f28679e = str3;
            this.f28681r = z12;
        }

        public static a u1() {
            return new a();
        }

        public boolean A1() {
            return this.f28675a;
        }

        @Deprecated
        public boolean B1() {
            return this.f28681r;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0461b)) {
                return false;
            }
            C0461b c0461b = (C0461b) obj;
            return this.f28675a == c0461b.f28675a && com.google.android.gms.common.internal.q.b(this.f28676b, c0461b.f28676b) && com.google.android.gms.common.internal.q.b(this.f28677c, c0461b.f28677c) && this.f28678d == c0461b.f28678d && com.google.android.gms.common.internal.q.b(this.f28679e, c0461b.f28679e) && com.google.android.gms.common.internal.q.b(this.f28680f, c0461b.f28680f) && this.f28681r == c0461b.f28681r;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f28675a), this.f28676b, this.f28677c, Boolean.valueOf(this.f28678d), this.f28679e, this.f28680f, Boolean.valueOf(this.f28681r));
        }

        public boolean v1() {
            return this.f28678d;
        }

        public List<String> w1() {
            return this.f28680f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.g(parcel, 1, A1());
            ea.c.G(parcel, 2, z1(), false);
            ea.c.G(parcel, 3, y1(), false);
            ea.c.g(parcel, 4, v1());
            ea.c.G(parcel, 5, x1(), false);
            ea.c.I(parcel, 6, w1(), false);
            ea.c.g(parcel, 7, B1());
            ea.c.b(parcel, a10);
        }

        public String x1() {
            return this.f28679e;
        }

        public String y1() {
            return this.f28677c;
        }

        public String z1() {
            return this.f28676b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ea.a {
        public static final Parcelable.Creator<c> CREATOR = new t();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28689a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28690b;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f28691a = false;

            /* renamed from: b, reason: collision with root package name */
            private String f28692b;

            public c a() {
                return new c(this.f28691a, this.f28692b);
            }

            public a b(boolean z10) {
                this.f28691a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(boolean z10, String str) {
            if (z10) {
                com.google.android.gms.common.internal.s.j(str);
            }
            this.f28689a = z10;
            this.f28690b = str;
        }

        public static a u1() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f28689a == cVar.f28689a && com.google.android.gms.common.internal.q.b(this.f28690b, cVar.f28690b);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f28689a), this.f28690b);
        }

        public String v1() {
            return this.f28690b;
        }

        public boolean w1() {
            return this.f28689a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.g(parcel, 1, w1());
            ea.c.G(parcel, 2, v1(), false);
            ea.c.b(parcel, a10);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class d extends ea.a {
        public static final Parcelable.Creator<d> CREATOR = new u();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28693a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f28694b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28695c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f28696a = false;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f28697b;

            /* renamed from: c, reason: collision with root package name */
            private String f28698c;

            public d a() {
                return new d(this.f28696a, this.f28697b, this.f28698c);
            }

            public a b(boolean z10) {
                this.f28696a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                com.google.android.gms.common.internal.s.j(bArr);
                com.google.android.gms.common.internal.s.j(str);
            }
            this.f28693a = z10;
            this.f28694b = bArr;
            this.f28695c = str;
        }

        public static a u1() {
            return new a();
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28693a == dVar.f28693a && Arrays.equals(this.f28694b, dVar.f28694b) && ((str = this.f28695c) == (str2 = dVar.f28695c) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f28693a), this.f28695c}) * 31) + Arrays.hashCode(this.f28694b);
        }

        public byte[] v1() {
            return this.f28694b;
        }

        public String w1() {
            return this.f28695c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.g(parcel, 1, x1());
            ea.c.l(parcel, 2, v1(), false);
            ea.c.G(parcel, 3, w1(), false);
            ea.c.b(parcel, a10);
        }

        public boolean x1() {
            return this.f28693a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ea.a {
        public static final Parcelable.Creator<e> CREATOR = new v();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28699a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f28700a = false;

            public e a() {
                return new e(this.f28700a);
            }

            public a b(boolean z10) {
                this.f28700a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(boolean z10) {
            this.f28699a = z10;
        }

        public static a u1() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f28699a == ((e) obj).f28699a;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f28699a));
        }

        public boolean v1() {
            return this.f28699a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.g(parcel, 1, v1());
            ea.c.b(parcel, a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(e eVar, C0461b c0461b, String str, boolean z10, int i10, d dVar, c cVar) {
        this.f28661a = (e) com.google.android.gms.common.internal.s.j(eVar);
        this.f28662b = (C0461b) com.google.android.gms.common.internal.s.j(c0461b);
        this.f28663c = str;
        this.f28664d = z10;
        this.f28665e = i10;
        if (dVar == null) {
            d.a u12 = d.u1();
            u12.b(false);
            dVar = u12.a();
        }
        this.f28666f = dVar;
        if (cVar == null) {
            c.a u13 = c.u1();
            u13.b(false);
            cVar = u13.a();
        }
        this.f28667r = cVar;
    }

    public static a A1(b bVar) {
        com.google.android.gms.common.internal.s.j(bVar);
        a u12 = u1();
        u12.c(bVar.v1());
        u12.f(bVar.y1());
        u12.e(bVar.x1());
        u12.d(bVar.w1());
        u12.b(bVar.f28664d);
        u12.h(bVar.f28665e);
        String str = bVar.f28663c;
        if (str != null) {
            u12.g(str);
        }
        return u12;
    }

    public static a u1() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.q.b(this.f28661a, bVar.f28661a) && com.google.android.gms.common.internal.q.b(this.f28662b, bVar.f28662b) && com.google.android.gms.common.internal.q.b(this.f28666f, bVar.f28666f) && com.google.android.gms.common.internal.q.b(this.f28667r, bVar.f28667r) && com.google.android.gms.common.internal.q.b(this.f28663c, bVar.f28663c) && this.f28664d == bVar.f28664d && this.f28665e == bVar.f28665e;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28661a, this.f28662b, this.f28666f, this.f28667r, this.f28663c, Boolean.valueOf(this.f28664d));
    }

    public C0461b v1() {
        return this.f28662b;
    }

    public c w1() {
        return this.f28667r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, y1(), i10, false);
        ea.c.E(parcel, 2, v1(), i10, false);
        ea.c.G(parcel, 3, this.f28663c, false);
        ea.c.g(parcel, 4, z1());
        ea.c.u(parcel, 5, this.f28665e);
        ea.c.E(parcel, 6, x1(), i10, false);
        ea.c.E(parcel, 7, w1(), i10, false);
        ea.c.b(parcel, a10);
    }

    public d x1() {
        return this.f28666f;
    }

    public e y1() {
        return this.f28661a;
    }

    public boolean z1() {
        return this.f28664d;
    }
}
