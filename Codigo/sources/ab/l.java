package ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u0;

/* loaded from: classes2.dex */
public final class l extends ea.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f299a;

    /* renamed from: b, reason: collision with root package name */
    private final ca.b f300b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f301c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, ca.b bVar, u0 u0Var) {
        this.f299a = i10;
        this.f300b = bVar;
        this.f301c = u0Var;
    }

    public final ca.b u1() {
        return this.f300b;
    }

    public final u0 v1() {
        return this.f301c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f299a);
        ea.c.E(parcel, 2, this.f300b, i10, false);
        ea.c.E(parcel, 3, this.f301c, i10, false);
        ea.c.b(parcel, a10);
    }
}
