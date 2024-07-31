package ha;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final int f16637a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16638b;

    public g(int i10) {
        this(i10, false);
    }

    public g(int i10, boolean z10) {
        this.f16637a = i10;
        this.f16638b = z10;
    }

    public int u1() {
        return this.f16637a;
    }

    public final boolean v1() {
        return this.f16638b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, u1());
        ea.c.g(parcel, 2, this.f16638b);
        ea.c.b(parcel, a10);
    }
}
