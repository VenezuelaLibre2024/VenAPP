package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.b */
/* loaded from: classes.dex */
public final class C11758b extends AbstractC7138a {
    public static final Parcelable.Creator<C11758b> CREATOR = new C11771n();

    /* renamed from: a */
    private final e f31095a;

    /* renamed from: b */
    private final b f31096b;

    /* renamed from: c */
    private final String f31097c;

    /* renamed from: d */
    private final boolean f31098d;

    /* renamed from: e */
    private final int f31099e;

    /* renamed from: f */
    private final d f31100f;

    /* renamed from: r */
    private final c f31101r;

    /* renamed from: v9.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private e f31102a;

        /* renamed from: b */
        private b f31103b;

        /* renamed from: c */
        private d f31104c;

        /* renamed from: d */
        private c f31105d;

        /* renamed from: e */
        private String f31106e;

        /* renamed from: f */
        private boolean f31107f;

        /* renamed from: g */
        private int f31108g;

        public a() {
            e.a m37208u1 = e.m37208u1();
            m37208u1.m37211b(false);
            this.f31102a = m37208u1.m37210a();
            b.a m37187u1 = b.m37187u1();
            m37187u1.m37196b(false);
            this.f31103b = m37187u1.m37195a();
            d.a m37202u1 = d.m37202u1();
            m37202u1.m37207b(false);
            this.f31104c = m37202u1.m37206a();
            c.a m37197u1 = c.m37197u1();
            m37197u1.m37201b(false);
            this.f31105d = m37197u1.m37200a();
        }

        /* renamed from: a */
        public C11758b m37179a() {
            return new C11758b(this.f31102a, this.f31103b, this.f31106e, this.f31107f, this.f31108g, this.f31104c, this.f31105d);
        }

        /* renamed from: b */
        public a m37180b(boolean z10) {
            this.f31107f = z10;
            return this;
        }

        /* renamed from: c */
        public a m37181c(b bVar) {
            this.f31103b = (b) C5276s.m13324j(bVar);
            return this;
        }

        /* renamed from: d */
        public a m37182d(c cVar) {
            this.f31105d = (c) C5276s.m13324j(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public a m37183e(d dVar) {
            this.f31104c = (d) C5276s.m13324j(dVar);
            return this;
        }

        /* renamed from: f */
        public a m37184f(e eVar) {
            this.f31102a = (e) C5276s.m13324j(eVar);
            return this;
        }

        /* renamed from: g */
        public final a m37185g(String str) {
            this.f31106e = str;
            return this;
        }

        /* renamed from: h */
        public final a m37186h(int i10) {
            this.f31108g = i10;
            return this;
        }
    }

    /* renamed from: v9.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC7138a {
        public static final Parcelable.Creator<b> CREATOR = new C11776s();

        /* renamed from: a */
        private final boolean f31109a;

        /* renamed from: b */
        private final String f31110b;

        /* renamed from: c */
        private final String f31111c;

        /* renamed from: d */
        private final boolean f31112d;

        /* renamed from: e */
        private final String f31113e;

        /* renamed from: f */
        private final List f31114f;

        /* renamed from: r */
        private final boolean f31115r;

        /* renamed from: v9.b$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private boolean f31116a = false;

            /* renamed from: b */
            private String f31117b = null;

            /* renamed from: c */
            private String f31118c = null;

            /* renamed from: d */
            private boolean f31119d = true;

            /* renamed from: e */
            private String f31120e = null;

            /* renamed from: f */
            private List f31121f = null;

            /* renamed from: g */
            private boolean f31122g = false;

            /* renamed from: a */
            public b m37195a() {
                return new b(this.f31116a, this.f31117b, this.f31118c, this.f31119d, this.f31120e, this.f31121f, this.f31122g);
            }

            /* renamed from: b */
            public a m37196b(boolean z10) {
                this.f31116a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            C5276s.m13316b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f31109a = z10;
            if (z10) {
                C5276s.m13325k(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f31110b = str;
            this.f31111c = str2;
            this.f31112d = z11;
            Parcelable.Creator<C11758b> creator = C11758b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f31114f = arrayList;
            this.f31113e = str3;
            this.f31115r = z12;
        }

        /* renamed from: u1 */
        public static a m37187u1() {
            return new a();
        }

        /* renamed from: A1 */
        public boolean m37188A1() {
            return this.f31109a;
        }

        @Deprecated
        /* renamed from: B1 */
        public boolean m37189B1() {
            return this.f31115r;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31109a == bVar.f31109a && C5270q.m13304b(this.f31110b, bVar.f31110b) && C5270q.m13304b(this.f31111c, bVar.f31111c) && this.f31112d == bVar.f31112d && C5270q.m13304b(this.f31113e, bVar.f31113e) && C5270q.m13304b(this.f31114f, bVar.f31114f) && this.f31115r == bVar.f31115r;
        }

        public int hashCode() {
            return C5270q.m13305c(Boolean.valueOf(this.f31109a), this.f31110b, this.f31111c, Boolean.valueOf(this.f31112d), this.f31113e, this.f31114f, Boolean.valueOf(this.f31115r));
        }

        /* renamed from: v1 */
        public boolean m37190v1() {
            return this.f31112d;
        }

        /* renamed from: w1 */
        public List<String> m37191w1() {
            return this.f31114f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21215g(parcel, 1, m37188A1());
            C7140c.m21200G(parcel, 2, m37194z1(), false);
            C7140c.m21200G(parcel, 3, m37193y1(), false);
            C7140c.m21215g(parcel, 4, m37190v1());
            C7140c.m21200G(parcel, 5, m37192x1(), false);
            C7140c.m21202I(parcel, 6, m37191w1(), false);
            C7140c.m21215g(parcel, 7, m37189B1());
            C7140c.m21210b(parcel, m21209a);
        }

        /* renamed from: x1 */
        public String m37192x1() {
            return this.f31113e;
        }

        /* renamed from: y1 */
        public String m37193y1() {
            return this.f31111c;
        }

        /* renamed from: z1 */
        public String m37194z1() {
            return this.f31110b;
        }
    }

    /* renamed from: v9.b$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC7138a {
        public static final Parcelable.Creator<c> CREATOR = new C11777t();

        /* renamed from: a */
        private final boolean f31123a;

        /* renamed from: b */
        private final String f31124b;

        /* renamed from: v9.b$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private boolean f31125a = false;

            /* renamed from: b */
            private String f31126b;

            /* renamed from: a */
            public c m37200a() {
                return new c(this.f31125a, this.f31126b);
            }

            /* renamed from: b */
            public a m37201b(boolean z10) {
                this.f31125a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(boolean z10, String str) {
            if (z10) {
                C5276s.m13324j(str);
            }
            this.f31123a = z10;
            this.f31124b = str;
        }

        /* renamed from: u1 */
        public static a m37197u1() {
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
            return this.f31123a == cVar.f31123a && C5270q.m13304b(this.f31124b, cVar.f31124b);
        }

        public int hashCode() {
            return C5270q.m13305c(Boolean.valueOf(this.f31123a), this.f31124b);
        }

        /* renamed from: v1 */
        public String m37198v1() {
            return this.f31124b;
        }

        /* renamed from: w1 */
        public boolean m37199w1() {
            return this.f31123a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21215g(parcel, 1, m37199w1());
            C7140c.m21200G(parcel, 2, m37198v1(), false);
            C7140c.m21210b(parcel, m21209a);
        }
    }

    @Deprecated
    /* renamed from: v9.b$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC7138a {
        public static final Parcelable.Creator<d> CREATOR = new C11778u();

        /* renamed from: a */
        private final boolean f31127a;

        /* renamed from: b */
        private final byte[] f31128b;

        /* renamed from: c */
        private final String f31129c;

        /* renamed from: v9.b$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private boolean f31130a = false;

            /* renamed from: b */
            private byte[] f31131b;

            /* renamed from: c */
            private String f31132c;

            /* renamed from: a */
            public d m37206a() {
                return new d(this.f31130a, this.f31131b, this.f31132c);
            }

            /* renamed from: b */
            public a m37207b(boolean z10) {
                this.f31130a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                C5276s.m13324j(bArr);
                C5276s.m13324j(str);
            }
            this.f31127a = z10;
            this.f31128b = bArr;
            this.f31129c = str;
        }

        /* renamed from: u1 */
        public static a m37202u1() {
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
            return this.f31127a == dVar.f31127a && Arrays.equals(this.f31128b, dVar.f31128b) && ((str = this.f31129c) == (str2 = dVar.f31129c) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31127a), this.f31129c}) * 31) + Arrays.hashCode(this.f31128b);
        }

        /* renamed from: v1 */
        public byte[] m37203v1() {
            return this.f31128b;
        }

        /* renamed from: w1 */
        public String m37204w1() {
            return this.f31129c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21215g(parcel, 1, m37205x1());
            C7140c.m21220l(parcel, 2, m37203v1(), false);
            C7140c.m21200G(parcel, 3, m37204w1(), false);
            C7140c.m21210b(parcel, m21209a);
        }

        /* renamed from: x1 */
        public boolean m37205x1() {
            return this.f31127a;
        }
    }

    /* renamed from: v9.b$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC7138a {
        public static final Parcelable.Creator<e> CREATOR = new C11779v();

        /* renamed from: a */
        private final boolean f31133a;

        /* renamed from: v9.b$e$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private boolean f31134a = false;

            /* renamed from: a */
            public e m37210a() {
                return new e(this.f31134a);
            }

            /* renamed from: b */
            public a m37211b(boolean z10) {
                this.f31134a = z10;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(boolean z10) {
            this.f31133a = z10;
        }

        /* renamed from: u1 */
        public static a m37208u1() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f31133a == ((e) obj).f31133a;
        }

        public int hashCode() {
            return C5270q.m13305c(Boolean.valueOf(this.f31133a));
        }

        /* renamed from: v1 */
        public boolean m37209v1() {
            return this.f31133a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21215g(parcel, 1, m37209v1());
            C7140c.m21210b(parcel, m21209a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11758b(e eVar, b bVar, String str, boolean z10, int i10, d dVar, c cVar) {
        this.f31095a = (e) C5276s.m13324j(eVar);
        this.f31096b = (b) C5276s.m13324j(bVar);
        this.f31097c = str;
        this.f31098d = z10;
        this.f31099e = i10;
        if (dVar == null) {
            d.a m37202u1 = d.m37202u1();
            m37202u1.m37207b(false);
            dVar = m37202u1.m37206a();
        }
        this.f31100f = dVar;
        if (cVar == null) {
            c.a m37197u1 = c.m37197u1();
            m37197u1.m37201b(false);
            cVar = m37197u1.m37200a();
        }
        this.f31101r = cVar;
    }

    /* renamed from: A1 */
    public static a m37172A1(C11758b c11758b) {
        C5276s.m13324j(c11758b);
        a m37173u1 = m37173u1();
        m37173u1.m37181c(c11758b.m37174v1());
        m37173u1.m37184f(c11758b.m37177y1());
        m37173u1.m37183e(c11758b.m37176x1());
        m37173u1.m37182d(c11758b.m37175w1());
        m37173u1.m37180b(c11758b.f31098d);
        m37173u1.m37186h(c11758b.f31099e);
        String str = c11758b.f31097c;
        if (str != null) {
            m37173u1.m37185g(str);
        }
        return m37173u1;
    }

    /* renamed from: u1 */
    public static a m37173u1() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11758b)) {
            return false;
        }
        C11758b c11758b = (C11758b) obj;
        return C5270q.m13304b(this.f31095a, c11758b.f31095a) && C5270q.m13304b(this.f31096b, c11758b.f31096b) && C5270q.m13304b(this.f31100f, c11758b.f31100f) && C5270q.m13304b(this.f31101r, c11758b.f31101r) && C5270q.m13304b(this.f31097c, c11758b.f31097c) && this.f31098d == c11758b.f31098d && this.f31099e == c11758b.f31099e;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31095a, this.f31096b, this.f31100f, this.f31101r, this.f31097c, Boolean.valueOf(this.f31098d));
    }

    /* renamed from: v1 */
    public b m37174v1() {
        return this.f31096b;
    }

    /* renamed from: w1 */
    public c m37175w1() {
        return this.f31101r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m37177y1(), i10, false);
        C7140c.m21198E(parcel, 2, m37174v1(), i10, false);
        C7140c.m21200G(parcel, 3, this.f31097c, false);
        C7140c.m21215g(parcel, 4, m37178z1());
        C7140c.m21229u(parcel, 5, this.f31099e);
        C7140c.m21198E(parcel, 6, m37176x1(), i10, false);
        C7140c.m21198E(parcel, 7, m37175w1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public d m37176x1() {
        return this.f31100f;
    }

    /* renamed from: y1 */
    public e m37177y1() {
        return this.f31095a;
    }

    /* renamed from: z1 */
    public boolean m37178z1() {
        return this.f31098d;
    }
}
