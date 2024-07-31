package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t6.h2;
import t8.r0;

/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0390a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23555b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23557d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f23558e;

    /* renamed from: q7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0390a implements Parcelable.Creator<a> {
        C0390a() {
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
        super("APIC");
        this.f23555b = (String) r0.j(parcel.readString());
        this.f23556c = parcel.readString();
        this.f23557d = parcel.readInt();
        this.f23558e = (byte[]) r0.j(parcel.createByteArray());
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f23555b = str;
        this.f23556c = str2;
        this.f23557d = i10;
        this.f23558e = bArr;
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        bVar.I(this.f23558e, this.f23557d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23557d == aVar.f23557d && r0.c(this.f23555b, aVar.f23555b) && r0.c(this.f23556c, aVar.f23556c) && Arrays.equals(this.f23558e, aVar.f23558e);
    }

    public int hashCode() {
        int i10 = (527 + this.f23557d) * 31;
        String str = this.f23555b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23556c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23558e);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": mimeType=" + this.f23555b + ", description=" + this.f23556c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23555b);
        parcel.writeString(this.f23556c);
        parcel.writeInt(this.f23557d);
        parcel.writeByteArray(this.f23558e);
    }
}
