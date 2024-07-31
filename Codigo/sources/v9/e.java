package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    private final String f28703a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28704b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28705c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28706d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28707e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28708f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f28709a;

        /* renamed from: b, reason: collision with root package name */
        private String f28710b;

        /* renamed from: c, reason: collision with root package name */
        private String f28711c;

        /* renamed from: d, reason: collision with root package name */
        private String f28712d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f28713e;

        /* renamed from: f, reason: collision with root package name */
        private int f28714f;

        public e a() {
            return new e(this.f28709a, this.f28710b, this.f28711c, this.f28712d, this.f28713e, this.f28714f);
        }

        public a b(String str) {
            this.f28710b = str;
            return this;
        }

        public a c(String str) {
            this.f28712d = str;
            return this;
        }

        @Deprecated
        public a d(boolean z10) {
            this.f28713e = z10;
            return this;
        }

        public a e(String str) {
            com.google.android.gms.common.internal.s.j(str);
            this.f28709a = str;
            return this;
        }

        public final a f(String str) {
            this.f28711c = str;
            return this;
        }

        public final a g(int i10) {
            this.f28714f = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, String str3, String str4, boolean z10, int i10) {
        com.google.android.gms.common.internal.s.j(str);
        this.f28703a = str;
        this.f28704b = str2;
        this.f28705c = str3;
        this.f28706d = str4;
        this.f28707e = z10;
        this.f28708f = i10;
    }

    public static a u1() {
        return new a();
    }

    public static a z1(e eVar) {
        com.google.android.gms.common.internal.s.j(eVar);
        a u12 = u1();
        u12.e(eVar.x1());
        u12.c(eVar.w1());
        u12.b(eVar.v1());
        u12.d(eVar.f28707e);
        u12.g(eVar.f28708f);
        String str = eVar.f28705c;
        if (str != null) {
            u12.f(str);
        }
        return u12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.android.gms.common.internal.q.b(this.f28703a, eVar.f28703a) && com.google.android.gms.common.internal.q.b(this.f28706d, eVar.f28706d) && com.google.android.gms.common.internal.q.b(this.f28704b, eVar.f28704b) && com.google.android.gms.common.internal.q.b(Boolean.valueOf(this.f28707e), Boolean.valueOf(eVar.f28707e)) && this.f28708f == eVar.f28708f;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28703a, this.f28704b, this.f28706d, Boolean.valueOf(this.f28707e), Integer.valueOf(this.f28708f));
    }

    public String v1() {
        return this.f28704b;
    }

    public String w1() {
        return this.f28706d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, x1(), false);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.G(parcel, 3, this.f28705c, false);
        ea.c.G(parcel, 4, w1(), false);
        ea.c.g(parcel, 5, y1());
        ea.c.u(parcel, 6, this.f28708f);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f28703a;
    }

    @Deprecated
    public boolean y1() {
        return this.f28707e;
    }
}
