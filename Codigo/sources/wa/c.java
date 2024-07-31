package wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c extends ea.a {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f29737a;

    public c(Bundle bundle) {
        this.f29737a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.j(parcel, 1, this.f29737a, false);
        ea.c.b(parcel, a10);
    }
}
