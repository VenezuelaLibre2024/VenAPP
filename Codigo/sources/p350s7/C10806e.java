package p350s7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s7.e */
/* loaded from: classes.dex */
public final class C10806e extends AbstractC10803b {
    public static final Parcelable.Creator<C10806e> CREATOR = new a();

    /* renamed from: s7.e$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10806e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10806e createFromParcel(Parcel parcel) {
            return new C10806e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10806e[] newArray(int i10) {
            return new C10806e[i10];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
