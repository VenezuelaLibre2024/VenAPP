package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l extends ea.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    private final String f30770a;

    public l(String str) {
        this.f30770a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f30770a, false);
        ea.c.b(parcel, a10);
    }

    public final String zza() {
        return this.f30770a;
    }
}
