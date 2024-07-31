package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ba.f */
/* loaded from: classes.dex */
final class C1694f implements Parcelable.Creator<C1696h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1696h createFromParcel(Parcel parcel) {
        return new C1696h(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1696h[] newArray(int i10) {
        return new C1696h[i10];
    }
}
