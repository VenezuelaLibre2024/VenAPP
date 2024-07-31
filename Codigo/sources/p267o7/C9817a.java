package p267o7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p082eb.C7149e;
import p216l7.C9400a;
import p361t6.C11040h2;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: o7.a */
/* loaded from: classes.dex */
public final class C9817a implements C9400a.b {
    public static final Parcelable.Creator<C9817a> CREATOR = new a();

    /* renamed from: a */
    public final int f24242a;

    /* renamed from: b */
    public final String f24243b;

    /* renamed from: c */
    public final String f24244c;

    /* renamed from: d */
    public final int f24245d;

    /* renamed from: e */
    public final int f24246e;

    /* renamed from: f */
    public final int f24247f;

    /* renamed from: r */
    public final int f24248r;

    /* renamed from: s */
    public final byte[] f24249s;

    /* renamed from: o7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C9817a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9817a createFromParcel(Parcel parcel) {
            return new C9817a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9817a[] newArray(int i10) {
            return new C9817a[i10];
        }
    }

    public C9817a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f24242a = i10;
        this.f24243b = str;
        this.f24244c = str2;
        this.f24245d = i11;
        this.f24246e = i12;
        this.f24247f = i13;
        this.f24248r = i14;
        this.f24249s = bArr;
    }

    C9817a(Parcel parcel) {
        this.f24242a = parcel.readInt();
        this.f24243b = (String) C11172r0.m34928j(parcel.readString());
        this.f24244c = (String) C11172r0.m34928j(parcel.readString());
        this.f24245d = parcel.readInt();
        this.f24246e = parcel.readInt();
        this.f24247f = parcel.readInt();
        this.f24248r = parcel.readInt();
        this.f24249s = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    /* renamed from: a */
    public static C9817a m29486a(C11146e0 c11146e0) {
        int m34692q = c11146e0.m34692q();
        String m34662F = c11146e0.m34662F(c11146e0.m34692q(), C7149e.f16017a);
        String m34661E = c11146e0.m34661E(c11146e0.m34692q());
        int m34692q2 = c11146e0.m34692q();
        int m34692q3 = c11146e0.m34692q();
        int m34692q4 = c11146e0.m34692q();
        int m34692q5 = c11146e0.m34692q();
        int m34692q6 = c11146e0.m34692q();
        byte[] bArr = new byte[m34692q6];
        c11146e0.m34688l(bArr, 0, m34692q6);
        return new C9817a(m34692q, m34662F, m34661E, m34692q2, m34692q3, m34692q4, m34692q5, bArr);
    }

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        bVar.m34096I(this.f24249s, this.f24242a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9817a.class != obj.getClass()) {
            return false;
        }
        C9817a c9817a = (C9817a) obj;
        return this.f24242a == c9817a.f24242a && this.f24243b.equals(c9817a.f24243b) && this.f24244c.equals(c9817a.f24244c) && this.f24245d == c9817a.f24245d && this.f24246e == c9817a.f24246e && this.f24247f == c9817a.f24247f && this.f24248r == c9817a.f24248r && Arrays.equals(this.f24249s, c9817a.f24249s);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f24242a) * 31) + this.f24243b.hashCode()) * 31) + this.f24244c.hashCode()) * 31) + this.f24245d) * 31) + this.f24246e) * 31) + this.f24247f) * 31) + this.f24248r) * 31) + Arrays.hashCode(this.f24249s);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f24243b + ", description=" + this.f24244c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24242a);
        parcel.writeString(this.f24243b);
        parcel.writeString(this.f24244c);
        parcel.writeInt(this.f24245d);
        parcel.writeInt(this.f24246e);
        parcel.writeInt(this.f24247f);
        parcel.writeInt(this.f24248r);
        parcel.writeByteArray(this.f24249s);
    }
}
