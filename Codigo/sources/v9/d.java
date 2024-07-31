package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    private final int f28702a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10) {
        this.f28702a = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return com.google.android.gms.common.internal.q.b(Integer.valueOf(this.f28702a), Integer.valueOf(((d) obj).f28702a));
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f28702a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f28702a);
        ea.c.b(parcel, a10);
    }
}
