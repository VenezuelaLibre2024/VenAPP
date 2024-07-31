package ja;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f19827a;

    /* renamed from: b, reason: collision with root package name */
    final String f19828b;

    /* renamed from: c, reason: collision with root package name */
    final int f19829c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10, String str, int i11) {
        this.f19827a = i10;
        this.f19828b = str;
        this.f19829c = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, int i10) {
        this.f19827a = 1;
        this.f19828b = str;
        this.f19829c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f19827a);
        ea.c.G(parcel, 2, this.f19828b, false);
        ea.c.u(parcel, 3, this.f19829c);
        ea.c.b(parcel, a10);
    }
}
