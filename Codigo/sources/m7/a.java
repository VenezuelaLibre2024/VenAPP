package m7;

import android.os.Parcel;
import android.os.Parcelable;
import l7.a;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0342a();

    /* renamed from: a, reason: collision with root package name */
    public final int f21393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21394b;

    /* renamed from: m7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0342a implements Parcelable.Creator<a> {
        C0342a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) t8.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f21393a = i10;
        this.f21394b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f21393a + ",url=" + this.f21394b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21394b);
        parcel.writeInt(this.f21393a);
    }
}
