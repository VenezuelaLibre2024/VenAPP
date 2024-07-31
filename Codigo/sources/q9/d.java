package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    private final String f23792a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23793b;

    public d(String str, String str2) {
        this.f23792a = str;
        this.f23793b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f23792a, false);
        ea.c.G(parcel, 2, this.f23793b, false);
        ea.c.b(parcel, a10);
    }
}
