package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
