package ha;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f16628a;

    public e(PendingIntent pendingIntent) {
        this.f16628a = pendingIntent;
    }

    public PendingIntent u1() {
        return this.f16628a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, u1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
