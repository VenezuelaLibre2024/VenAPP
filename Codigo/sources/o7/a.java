package o7;

import android.os.Parcel;
import android.os.Parcelable;
import eb.e;
import java.util.Arrays;
import l7.a;
import t6.h2;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0369a();

    /* renamed from: a, reason: collision with root package name */
    public final int f22309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22310b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22313e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22314f;

    /* renamed from: r, reason: collision with root package name */
    public final int f22315r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f22316s;

    /* renamed from: o7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0369a implements Parcelable.Creator<a> {
        C0369a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f22309a = i10;
        this.f22310b = str;
        this.f22311c = str2;
        this.f22312d = i11;
        this.f22313e = i12;
        this.f22314f = i13;
        this.f22315r = i14;
        this.f22316s = bArr;
    }

    a(Parcel parcel) {
        this.f22309a = parcel.readInt();
        this.f22310b = (String) r0.j(parcel.readString());
        this.f22311c = (String) r0.j(parcel.readString());
        this.f22312d = parcel.readInt();
        this.f22313e = parcel.readInt();
        this.f22314f = parcel.readInt();
        this.f22315r = parcel.readInt();
        this.f22316s = (byte[]) r0.j(parcel.createByteArray());
    }

    public static a a(e0 e0Var) {
        int q10 = e0Var.q();
        String F = e0Var.F(e0Var.q(), e.f14594a);
        String E = e0Var.E(e0Var.q());
        int q11 = e0Var.q();
        int q12 = e0Var.q();
        int q13 = e0Var.q();
        int q14 = e0Var.q();
        int q15 = e0Var.q();
        byte[] bArr = new byte[q15];
        e0Var.l(bArr, 0, q15);
        return new a(q10, F, E, q11, q12, q13, q14, bArr);
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        bVar.I(this.f22316s, this.f22309a);
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
        return this.f22309a == aVar.f22309a && this.f22310b.equals(aVar.f22310b) && this.f22311c.equals(aVar.f22311c) && this.f22312d == aVar.f22312d && this.f22313e == aVar.f22313e && this.f22314f == aVar.f22314f && this.f22315r == aVar.f22315r && Arrays.equals(this.f22316s, aVar.f22316s);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f22309a) * 31) + this.f22310b.hashCode()) * 31) + this.f22311c.hashCode()) * 31) + this.f22312d) * 31) + this.f22313e) * 31) + this.f22314f) * 31) + this.f22315r) * 31) + Arrays.hashCode(this.f22316s);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f22310b + ", description=" + this.f22311c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22309a);
        parcel.writeString(this.f22310b);
        parcel.writeString(this.f22311c);
        parcel.writeInt(this.f22312d);
        parcel.writeInt(this.f22313e);
        parcel.writeInt(this.f22314f);
        parcel.writeInt(this.f22315r);
        parcel.writeByteArray(this.f22316s);
    }
}
