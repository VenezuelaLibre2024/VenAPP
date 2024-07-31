package l7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import t6.h2;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0329a();

    /* renamed from: a */
    private final b[] f20981a;

    /* renamed from: b */
    public final long f20982b;

    /* renamed from: l7.a$a */
    /* loaded from: classes.dex */
    class C0329a implements Parcelable.Creator<a> {
        C0329a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        default u1 H() {
            return null;
        }

        default void O(h2.b bVar) {
        }

        default byte[] q1() {
            return null;
        }
    }

    public a(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    public a(long j10, b... bVarArr) {
        this.f20982b = j10;
        this.f20981a = bVarArr;
    }

    a(Parcel parcel) {
        this.f20981a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f20981a;
            if (i10 >= bVarArr.length) {
                this.f20982b = parcel.readLong();
                return;
            } else {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            }
        }
    }

    public a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a(this.f20982b, (b[]) r0.G0(this.f20981a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f20981a);
    }

    public a c(long j10) {
        return this.f20982b == j10 ? this : new a(j10, this.f20981a);
    }

    public b d(int i10) {
        return this.f20981a[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f20981a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f20981a, aVar.f20981a) && this.f20982b == aVar.f20982b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f20981a) * 31) + hb.g.b(this.f20982b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f20981a));
        if (this.f20982b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f20982b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20981a.length);
        for (b bVar : this.f20981a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f20982b);
    }
}
