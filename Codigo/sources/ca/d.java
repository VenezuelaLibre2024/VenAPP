package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    private final String f6957a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f6958b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6959c;

    public d(String str, int i10, long j10) {
        this.f6957a = str;
        this.f6958b = i10;
        this.f6959c = j10;
    }

    public d(String str, long j10) {
        this.f6957a = str;
        this.f6959c = j10;
        this.f6958b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((u1() != null && u1().equals(dVar.u1())) || (u1() == null && dVar.u1() == null)) && v1() == dVar.v1()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(u1(), Long.valueOf(v1()));
    }

    public final String toString() {
        q.a d10 = com.google.android.gms.common.internal.q.d(this);
        d10.a("name", u1());
        d10.a("version", Long.valueOf(v1()));
        return d10.toString();
    }

    public String u1() {
        return this.f6957a;
    }

    public long v1() {
        long j10 = this.f6959c;
        return j10 == -1 ? this.f6958b : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, u1(), false);
        ea.c.u(parcel, 2, this.f6958b);
        ea.c.z(parcel, 3, v1());
        ea.c.b(parcel, a10);
    }
}
