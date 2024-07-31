package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f23587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23589d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f23590e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f23591f;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f23587b = i10;
        this.f23588c = i11;
        this.f23589d = i12;
        this.f23590e = iArr;
        this.f23591f = iArr2;
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f23587b = parcel.readInt();
        this.f23588c = parcel.readInt();
        this.f23589d = parcel.readInt();
        this.f23590e = (int[]) r0.j(parcel.createIntArray());
        this.f23591f = (int[]) r0.j(parcel.createIntArray());
    }

    @Override // q7.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f23587b == kVar.f23587b && this.f23588c == kVar.f23588c && this.f23589d == kVar.f23589d && Arrays.equals(this.f23590e, kVar.f23590e) && Arrays.equals(this.f23591f, kVar.f23591f);
    }

    public int hashCode() {
        return ((((((((527 + this.f23587b) * 31) + this.f23588c) * 31) + this.f23589d) * 31) + Arrays.hashCode(this.f23590e)) * 31) + Arrays.hashCode(this.f23591f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23587b);
        parcel.writeInt(this.f23588c);
        parcel.writeInt(this.f23589d);
        parcel.writeIntArray(this.f23590e);
        parcel.writeIntArray(this.f23591f);
    }
}
