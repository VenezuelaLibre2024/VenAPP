package v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f extends ea.a {
    public static final Parcelable.Creator<f> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f28715a;

    public f(PendingIntent pendingIntent) {
        this.f28715a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return com.google.android.gms.common.internal.q.b(this.f28715a, ((f) obj).f28715a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28715a);
    }

    public PendingIntent u1() {
        return this.f28715a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, u1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
