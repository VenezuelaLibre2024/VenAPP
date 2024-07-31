package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class n extends ea.a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final int f30771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30772b;

    public n(int i10, boolean z10) {
        this.f30771a = i10;
        this.f30772b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, this.f30771a);
        ea.c.g(parcel, 3, this.f30772b);
        ea.c.b(parcel, a10);
    }
}
