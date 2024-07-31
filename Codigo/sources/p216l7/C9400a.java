package p216l7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p137hb.C7692g;
import p361t6.C11040h2;
import p361t6.C11108u1;
import p363t8.C11172r0;

/* renamed from: l7.a */
/* loaded from: classes.dex */
public final class C9400a implements Parcelable {
    public static final Parcelable.Creator<C9400a> CREATOR = new a();

    /* renamed from: a */
    private final b[] f22803a;

    /* renamed from: b */
    public final long f22804b;

    /* renamed from: l7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C9400a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9400a createFromParcel(Parcel parcel) {
            return new C9400a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9400a[] newArray(int i10) {
            return new C9400a[i10];
        }
    }

    /* renamed from: l7.a$b */
    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        /* renamed from: H */
        default C11108u1 mo28002H() {
            return null;
        }

        /* renamed from: O */
        default void mo28003O(C11040h2.b bVar) {
        }

        /* renamed from: q1 */
        default byte[] mo28004q1() {
            return null;
        }
    }

    public C9400a(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    public C9400a(long j10, b... bVarArr) {
        this.f22804b = j10;
        this.f22803a = bVarArr;
    }

    C9400a(Parcel parcel) {
        this.f22803a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f22803a;
            if (i10 >= bVarArr.length) {
                this.f22804b = parcel.readLong();
                return;
            } else {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            }
        }
    }

    public C9400a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C9400a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    /* renamed from: a */
    public C9400a m27995a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C9400a(this.f22804b, (b[]) C11172r0.m34869G0(this.f22803a, bVarArr));
    }

    /* renamed from: b */
    public C9400a m27996b(C9400a c9400a) {
        return c9400a == null ? this : m27995a(c9400a.f22803a);
    }

    /* renamed from: c */
    public C9400a m27997c(long j10) {
        return this.f22804b == j10 ? this : new C9400a(j10, this.f22803a);
    }

    /* renamed from: d */
    public b m27998d(int i10) {
        return this.f22803a[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m27999e() {
        return this.f22803a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9400a.class != obj.getClass()) {
            return false;
        }
        C9400a c9400a = (C9400a) obj;
        return Arrays.equals(this.f22803a, c9400a.f22803a) && this.f22804b == c9400a.f22804b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f22803a) * 31) + C7692g.m23426b(this.f22804b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f22803a));
        if (this.f22804b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f22804b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22803a.length);
        for (b bVar : this.f22803a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f22804b);
    }
}
