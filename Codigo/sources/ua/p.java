package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class p extends ea.a {
    public static final Parcelable.Creator<p> CREATOR = new w0();

    /* renamed from: a */
    private final int f27543a;

    /* renamed from: b */
    private final int f27544b;

    /* renamed from: c */
    private final a f27545c;

    /* loaded from: classes2.dex */
    public static class a extends ea.a {
        public static final Parcelable.Creator<a> CREATOR = new p0();

        /* renamed from: a */
        private String f27546a;

        /* renamed from: b */
        private b f27547b;

        /* renamed from: c */
        private int f27548c;

        /* renamed from: d */
        private int f27549d;

        public a(String str, IBinder iBinder, int i10, int i11) {
            this.f27548c = -5041134;
            this.f27549d = -16777216;
            this.f27546a = str;
            this.f27547b = iBinder == null ? null : new b(b.a.f2(iBinder));
            this.f27548c = i10;
            this.f27549d = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27548c != aVar.f27548c || !v0.a(this.f27546a, aVar.f27546a) || this.f27549d != aVar.f27549d) {
                return false;
            }
            b bVar = this.f27547b;
            if ((bVar == null && aVar.f27547b != null) || (bVar != null && aVar.f27547b == null)) {
                return false;
            }
            b bVar2 = aVar.f27547b;
            if (bVar == null || bVar2 == null) {
                return true;
            }
            return v0.a(com.google.android.gms.dynamic.d.g2(bVar.a()), com.google.android.gms.dynamic.d.g2(bVar2.a()));
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f27546a, this.f27547b, Integer.valueOf(this.f27548c)});
        }

        public int u1() {
            return this.f27548c;
        }

        public String v1() {
            return this.f27546a;
        }

        public int w1() {
            return this.f27549d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.G(parcel, 2, v1(), false);
            b bVar = this.f27547b;
            ea.c.t(parcel, 3, bVar == null ? null : bVar.a().asBinder(), false);
            ea.c.u(parcel, 4, u1());
            ea.c.u(parcel, 5, w1());
            ea.c.b(parcel, a10);
        }
    }

    public p(int i10, int i11, a aVar) {
        this.f27543a = i10;
        this.f27544b = i11;
        this.f27545c = aVar;
    }

    public int u1() {
        return this.f27543a;
    }

    public int v1() {
        return this.f27544b;
    }

    public a w1() {
        return this.f27545c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, u1());
        ea.c.u(parcel, 3, v1());
        ea.c.E(parcel, 4, w1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
