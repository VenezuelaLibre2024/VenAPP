package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.C10379o;

/* renamed from: qa.y1 */
/* loaded from: classes.dex */
final class C10411y1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C10379o.m31160a(parcel.readInt());
        } catch (C10379o.a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10379o[i10];
    }
}
