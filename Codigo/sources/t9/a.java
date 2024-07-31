package t9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f26816a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26817b;

    /* renamed from: c, reason: collision with root package name */
    private long f26818c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26819d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, boolean z10, long j10, boolean z11) {
        this.f26816a = i10;
        this.f26817b = z10;
        this.f26818c = j10;
        this.f26819d = z11;
    }

    public long u1() {
        return this.f26818c;
    }

    public boolean v1() {
        return this.f26819d;
    }

    public boolean w1() {
        return this.f26817b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f26816a);
        ea.c.g(parcel, 2, w1());
        ea.c.z(parcel, 3, u1());
        ea.c.g(parcel, 4, v1());
        ea.c.b(parcel, a10);
    }
}
