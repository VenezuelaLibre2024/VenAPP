package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import p331ra.C10657a;

/* renamed from: ra.f */
/* loaded from: classes.dex */
final class C10662f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C10657a.m32442x1(parcel.readInt());
        } catch (C10657a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10657a.a[i10];
    }
}
