package ra;

import android.os.Parcel;
import android.os.Parcelable;
import ra.a;

/* loaded from: classes.dex */
final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return a.x1(parcel.readInt());
        } catch (a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.EnumC0415a[i10];
    }
}
