package p362t7;

import android.os.Parcel;
import android.os.Parcelable;
import p267o7.C9818b;

/* renamed from: t7.a */
/* loaded from: classes.dex */
public final class C11136a extends C9818b {
    public static final Parcelable.Creator<C11136a> CREATOR = new a();

    /* renamed from: t7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C11136a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11136a createFromParcel(Parcel parcel) {
            return new C11136a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C11136a[] newArray(int i10) {
            return new C11136a[i10];
        }
    }

    C11136a(Parcel parcel) {
        super(parcel);
    }

    public C11136a(String str, String str2) {
        super(str, str2);
    }
}
