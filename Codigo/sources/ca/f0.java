package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 extends ea.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6970a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6971b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6972c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6973d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(boolean z10, String str, int i10, int i11) {
        this.f6970a = z10;
        this.f6971b = str;
        this.f6972c = n0.a(i10) - 1;
        this.f6973d = s.a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, this.f6970a);
        ea.c.G(parcel, 2, this.f6971b, false);
        ea.c.u(parcel, 3, this.f6972c);
        ea.c.u(parcel, 4, this.f6973d);
        ea.c.b(parcel, a10);
    }

    public final String zza() {
        return this.f6971b;
    }

    public final boolean zzb() {
        return this.f6970a;
    }

    public final int zzc() {
        return s.a(this.f6973d);
    }

    public final int zzd() {
        return n0.a(this.f6972c);
    }
}
