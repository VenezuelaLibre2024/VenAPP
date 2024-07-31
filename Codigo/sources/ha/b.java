package ha;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16626a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16627b;

    public b(boolean z10, int i10) {
        this.f16626a = z10;
        this.f16627b = i10;
    }

    public boolean u1() {
        return this.f16626a;
    }

    public int v1() {
        return this.f16627b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, u1());
        ea.c.u(parcel, 2, v1());
        ea.c.b(parcel, a10);
    }
}
