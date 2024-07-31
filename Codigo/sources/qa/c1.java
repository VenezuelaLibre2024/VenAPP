package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.e0;

/* loaded from: classes.dex */
final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return e0.a.b(parcel.readString());
        } catch (e0.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0.a[i10];
    }
}
