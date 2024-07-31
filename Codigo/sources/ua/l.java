package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l extends ea.a {
    public static final Parcelable.Creator<l> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    private final String f27524a;

    public l(String str) {
        com.google.android.gms.common.internal.s.k(str, "json must not be null");
        this.f27524a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f27524a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, str, false);
        ea.c.b(parcel, a10);
    }
}
