package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    private final String f30765a;

    public g(String str) {
        this.f30765a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f30765a, false);
        ea.c.b(parcel, a10);
    }

    public final String zza() {
        return this.f30765a;
    }
}
