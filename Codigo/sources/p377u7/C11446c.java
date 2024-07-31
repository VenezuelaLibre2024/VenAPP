package p377u7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u7.c */
/* loaded from: classes.dex */
public final class C11446c implements Comparable<C11446c>, Parcelable {
    public static final Parcelable.Creator<C11446c> CREATOR = new a();

    /* renamed from: a */
    public final int f29633a;

    /* renamed from: b */
    public final int f29634b;

    /* renamed from: c */
    public final int f29635c;

    /* renamed from: d */
    @Deprecated
    public final int f29636d;

    /* renamed from: u7.c$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C11446c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11446c createFromParcel(Parcel parcel) {
            return new C11446c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C11446c[] newArray(int i10) {
            return new C11446c[i10];
        }
    }

    public C11446c(int i10, int i11, int i12) {
        this.f29633a = i10;
        this.f29634b = i11;
        this.f29635c = i12;
        this.f29636d = i12;
    }

    C11446c(Parcel parcel) {
        this.f29633a = parcel.readInt();
        this.f29634b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f29635c = readInt;
        this.f29636d = readInt;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C11446c c11446c) {
        int i10 = this.f29633a - c11446c.f29633a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f29634b - c11446c.f29634b;
        return i11 == 0 ? this.f29635c - c11446c.f29635c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11446c.class != obj.getClass()) {
            return false;
        }
        C11446c c11446c = (C11446c) obj;
        return this.f29633a == c11446c.f29633a && this.f29634b == c11446c.f29634b && this.f29635c == c11446c.f29635c;
    }

    public int hashCode() {
        return (((this.f29633a * 31) + this.f29634b) * 31) + this.f29635c;
    }

    public String toString() {
        return this.f29633a + "." + this.f29634b + "." + this.f29635c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f29633a);
        parcel.writeInt(this.f29634b);
        parcel.writeInt(this.f29635c);
    }
}
