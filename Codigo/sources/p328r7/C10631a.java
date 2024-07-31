package p328r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p216l7.C9400a;
import p363t8.C11172r0;

/* renamed from: r7.a */
/* loaded from: classes.dex */
public final class C10631a implements C9400a.b {
    public static final Parcelable.Creator<C10631a> CREATOR = new a();

    /* renamed from: a */
    public final String f26859a;

    /* renamed from: b */
    public final byte[] f26860b;

    /* renamed from: c */
    public final int f26861c;

    /* renamed from: d */
    public final int f26862d;

    /* renamed from: r7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10631a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10631a createFromParcel(Parcel parcel) {
            return new C10631a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10631a[] newArray(int i10) {
            return new C10631a[i10];
        }
    }

    private C10631a(Parcel parcel) {
        this.f26859a = (String) C11172r0.m34928j(parcel.readString());
        this.f26860b = (byte[]) C11172r0.m34928j(parcel.createByteArray());
        this.f26861c = parcel.readInt();
        this.f26862d = parcel.readInt();
    }

    /* synthetic */ C10631a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C10631a(String str, byte[] bArr, int i10, int i11) {
        this.f26859a = str;
        this.f26860b = bArr;
        this.f26861c = i10;
        this.f26862d = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10631a.class != obj.getClass()) {
            return false;
        }
        C10631a c10631a = (C10631a) obj;
        return this.f26859a.equals(c10631a.f26859a) && Arrays.equals(this.f26860b, c10631a.f26860b) && this.f26861c == c10631a.f26861c && this.f26862d == c10631a.f26862d;
    }

    public int hashCode() {
        return ((((((527 + this.f26859a.hashCode()) * 31) + Arrays.hashCode(this.f26860b)) * 31) + this.f26861c) * 31) + this.f26862d;
    }

    public String toString() {
        return "mdta: key=" + this.f26859a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26859a);
        parcel.writeByteArray(this.f26860b);
        parcel.writeInt(this.f26861c);
        parcel.writeInt(this.f26862d);
    }
}
