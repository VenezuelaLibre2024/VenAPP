package v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends ea.a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f28701a;

    public c(PendingIntent pendingIntent) {
        this.f28701a = (PendingIntent) com.google.android.gms.common.internal.s.j(pendingIntent);
    }

    public PendingIntent u1() {
        return this.f28701a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, u1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
