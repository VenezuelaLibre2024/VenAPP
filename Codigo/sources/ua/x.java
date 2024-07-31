package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public class x extends ea.a {
    public static final Parcelable.Creator<x> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    protected final b f27575a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(IBinder iBinder) {
        this.f27575a = new b(b.a.f2(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = this.f27575a;
        int a10 = ea.c.a(parcel);
        ea.c.t(parcel, 2, bVar.a().asBinder(), false);
        ea.c.b(parcel, a10);
    }
}
