package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j extends ea.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a */
    public final long f30766a;

    /* renamed from: b */
    public final a[] f30767b;

    /* renamed from: c */
    public final int f30768c;

    /* renamed from: d */
    public final boolean f30769d;

    public j(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f30766a = j10;
        this.f30767b = aVarArr;
        this.f30769d = z10;
        if (z10) {
            this.f30768c = i10;
        } else {
            this.f30768c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 2, this.f30766a);
        ea.c.J(parcel, 3, this.f30767b, i10, false);
        ea.c.u(parcel, 4, this.f30768c);
        ea.c.g(parcel, 5, this.f30769d);
        ea.c.b(parcel, a10);
    }
}
