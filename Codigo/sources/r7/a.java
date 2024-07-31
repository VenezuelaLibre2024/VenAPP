package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l7.a;
import t8.r0;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0414a();

    /* renamed from: a, reason: collision with root package name */
    public final String f24745a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24748d;

    /* renamed from: r7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0414a implements Parcelable.Creator<a> {
        C0414a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f24745a = (String) r0.j(parcel.readString());
        this.f24746b = (byte[]) r0.j(parcel.createByteArray());
        this.f24747c = parcel.readInt();
        this.f24748d = parcel.readInt();
    }

    /* synthetic */ a(Parcel parcel, C0414a c0414a) {
        this(parcel);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f24745a = str;
        this.f24746b = bArr;
        this.f24747c = i10;
        this.f24748d = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24745a.equals(aVar.f24745a) && Arrays.equals(this.f24746b, aVar.f24746b) && this.f24747c == aVar.f24747c && this.f24748d == aVar.f24748d;
    }

    public int hashCode() {
        return ((((((527 + this.f24745a.hashCode()) * 31) + Arrays.hashCode(this.f24746b)) * 31) + this.f24747c) * 31) + this.f24748d;
    }

    public String toString() {
        return "mdta: key=" + this.f24745a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24745a);
        parcel.writeByteArray(this.f24746b);
        parcel.writeInt(this.f24747c);
        parcel.writeInt(this.f24748d);
    }
}
