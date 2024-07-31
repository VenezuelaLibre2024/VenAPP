package ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s0;

/* loaded from: classes2.dex */
public final class j extends ea.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f297a;

    /* renamed from: b, reason: collision with root package name */
    final s0 f298b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i10, s0 s0Var) {
        this.f297a = i10;
        this.f298b = s0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f297a);
        ea.c.E(parcel, 2, this.f298b, i10, false);
        ea.c.b(parcel, a10);
    }
}
