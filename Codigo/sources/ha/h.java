package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class h extends ea.a {
    public static final Parcelable.Creator<h> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    private final int f16639a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16640b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f16641c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f16642d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16643e;

    /* renamed from: f, reason: collision with root package name */
    private final a f16644f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f16645a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16646b;

        a(long j10, long j11) {
            s.m(j11);
            this.f16645a = j10;
            this.f16646b = j11;
        }
    }

    public h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f16639a = i10;
        this.f16640b = i11;
        this.f16641c = l10;
        this.f16642d = l11;
        this.f16643e = i12;
        this.f16644f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int u1() {
        return this.f16643e;
    }

    public int v1() {
        return this.f16640b;
    }

    public int w1() {
        return this.f16639a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, w1());
        ea.c.u(parcel, 2, v1());
        ea.c.B(parcel, 3, this.f16641c, false);
        ea.c.B(parcel, 4, this.f16642d, false);
        ea.c.u(parcel, 5, u1());
        ea.c.b(parcel, a10);
    }
}
