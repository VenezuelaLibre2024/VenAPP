package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.C10346e0;

/* renamed from: qa.c1 */
/* loaded from: classes.dex */
final class C10339c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C10346e0.a.m31128b(parcel.readString());
        } catch (C10346e0.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10346e0.a[i10];
    }
}
