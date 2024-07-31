package v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class h extends ea.a {
    public static final Parcelable.Creator<h> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f28722a;

    public h(PendingIntent pendingIntent) {
        this.f28722a = (PendingIntent) com.google.android.gms.common.internal.s.j(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return com.google.android.gms.common.internal.q.b(this.f28722a, ((h) obj).f28722a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28722a);
    }

    public PendingIntent u1() {
        return this.f28722a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, u1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
