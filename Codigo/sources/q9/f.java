package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends ea.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    private final String f23794a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23795b;

    public f(String str, int i10) {
        this.f23794a = str;
        this.f23795b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f23794a, false);
        ea.c.u(parcel, 2, this.f23795b);
        ea.c.b(parcel, a10);
    }

    public final int zza() {
        return this.f23795b;
    }

    public final String zzb() {
        return this.f23794a;
    }
}
