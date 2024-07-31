package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    private final j f28716a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28717b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28718c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private j f28719a;

        /* renamed from: b, reason: collision with root package name */
        private String f28720b;

        /* renamed from: c, reason: collision with root package name */
        private int f28721c;

        public g a() {
            return new g(this.f28719a, this.f28720b, this.f28721c);
        }

        public a b(j jVar) {
            this.f28719a = jVar;
            return this;
        }

        public final a c(String str) {
            this.f28720b = str;
            return this;
        }

        public final a d(int i10) {
            this.f28721c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j jVar, String str, int i10) {
        this.f28716a = (j) com.google.android.gms.common.internal.s.j(jVar);
        this.f28717b = str;
        this.f28718c = i10;
    }

    public static a u1() {
        return new a();
    }

    public static a w1(g gVar) {
        com.google.android.gms.common.internal.s.j(gVar);
        a u12 = u1();
        u12.b(gVar.v1());
        u12.d(gVar.f28718c);
        String str = gVar.f28717b;
        if (str != null) {
            u12.c(str);
        }
        return u12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.q.b(this.f28716a, gVar.f28716a) && com.google.android.gms.common.internal.q.b(this.f28717b, gVar.f28717b) && this.f28718c == gVar.f28718c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28716a, this.f28717b);
    }

    public j v1() {
        return this.f28716a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, v1(), i10, false);
        ea.c.G(parcel, 2, this.f28717b, false);
        ea.c.u(parcel, 3, this.f28718c);
        ea.c.b(parcel, a10);
    }
}
