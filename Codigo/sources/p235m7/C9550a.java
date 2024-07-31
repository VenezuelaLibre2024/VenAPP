package p235m7;

import android.os.Parcel;
import android.os.Parcelable;
import p216l7.C9400a;
import p363t8.C11137a;

/* renamed from: m7.a */
/* loaded from: classes.dex */
public final class C9550a implements C9400a.b {
    public static final Parcelable.Creator<C9550a> CREATOR = new a();

    /* renamed from: a */
    public final int f23247a;

    /* renamed from: b */
    public final String f23248b;

    /* renamed from: m7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C9550a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9550a createFromParcel(Parcel parcel) {
            return new C9550a(parcel.readInt(), (String) C11137a.m34603e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9550a[] newArray(int i10) {
            return new C9550a[i10];
        }
    }

    public C9550a(int i10, String str) {
        this.f23247a = i10;
        this.f23248b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f23247a + ",url=" + this.f23248b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23248b);
        parcel.writeInt(this.f23247a);
    }
}
