package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f27330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27332c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public final int f27333d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12) {
        this.f27330a = i10;
        this.f27331b = i11;
        this.f27332c = i12;
        this.f27333d = i12;
    }

    c(Parcel parcel) {
        this.f27330a = parcel.readInt();
        this.f27331b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f27332c = readInt;
        this.f27333d = readInt;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int i10 = this.f27330a - cVar.f27330a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27331b - cVar.f27331b;
        return i11 == 0 ? this.f27332c - cVar.f27332c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27330a == cVar.f27330a && this.f27331b == cVar.f27331b && this.f27332c == cVar.f27332c;
    }

    public int hashCode() {
        return (((this.f27330a * 31) + this.f27331b) * 31) + this.f27332c;
    }

    public String toString() {
        return this.f27330a + "." + this.f27331b + "." + this.f27332c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27330a);
        parcel.writeInt(this.f27331b);
        parcel.writeInt(this.f27332c);
    }
}
