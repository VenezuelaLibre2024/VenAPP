package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z1 extends ea.a {
    public static final Parcelable.Creator<z1> CREATOR = new a2();

    /* renamed from: a, reason: collision with root package name */
    private final long f23899a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23900b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23901c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f23902d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23899a = j10;
        this.f23900b = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23901c = (byte[]) com.google.android.gms.common.internal.s.j(bArr2);
        this.f23902d = (byte[]) com.google.android.gms.common.internal.s.j(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f23899a == z1Var.f23899a && Arrays.equals(this.f23900b, z1Var.f23900b) && Arrays.equals(this.f23901c, z1Var.f23901c) && Arrays.equals(this.f23902d, z1Var.f23902d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Long.valueOf(this.f23899a), this.f23900b, this.f23901c, this.f23902d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, this.f23899a);
        ea.c.l(parcel, 2, this.f23900b, false);
        ea.c.l(parcel, 3, this.f23901c, false);
        ea.c.l(parcel, 4, this.f23902d, false);
        ea.c.b(parcel, a10);
    }
}
