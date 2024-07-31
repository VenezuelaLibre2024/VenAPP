package t7;

import android.os.Parcel;
import android.os.Parcelable;
import o7.b;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0437a();

    /* renamed from: t7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0437a implements Parcelable.Creator<a> {
        C0437a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    a(Parcel parcel) {
        super(parcel);
    }

    public a(String str, String str2) {
        super(str, str2);
    }
}
