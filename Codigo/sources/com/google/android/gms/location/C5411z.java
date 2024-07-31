package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

@Deprecated
/* renamed from: com.google.android.gms.location.z */
/* loaded from: classes2.dex */
public final class C5411z extends AbstractC7138a {
    public static final Parcelable.Creator<C5411z> CREATOR = new C5362a0();

    /* renamed from: a */
    public final int f11001a;

    /* renamed from: b */
    public final int f11002b;

    /* renamed from: c */
    public final long f11003c;

    /* renamed from: d */
    public final long f11004d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5411z(int i10, int i11, long j10, long j11) {
        this.f11001a = i10;
        this.f11002b = i11;
        this.f11003c = j10;
        this.f11004d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5411z) {
            C5411z c5411z = (C5411z) obj;
            if (this.f11001a == c5411z.f11001a && this.f11002b == c5411z.f11002b && this.f11003c == c5411z.f11003c && this.f11004d == c5411z.f11004d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f11002b), Integer.valueOf(this.f11001a), Long.valueOf(this.f11004d), Long.valueOf(this.f11003c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f11001a + " Cell status: " + this.f11002b + " elapsed time NS: " + this.f11004d + " system time ms: " + this.f11003c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f11001a);
        C7140c.m21229u(parcel, 2, this.f11002b);
        C7140c.m21234z(parcel, 3, this.f11003c);
        C7140c.m21234z(parcel, 4, this.f11004d);
        C7140c.m21210b(parcel, m21209a);
    }
}
