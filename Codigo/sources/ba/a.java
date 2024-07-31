package ba;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    Intent f6316a;

    public a(Intent intent) {
        this.f6316a = intent;
    }

    public Intent u1() {
        return this.f6316a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, this.f6316a, i10, false);
        ea.c.b(parcel, a10);
    }
}
