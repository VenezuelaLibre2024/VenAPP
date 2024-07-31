package p350s7;

import android.os.Parcel;
import android.os.Parcelable;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: s7.a */
/* loaded from: classes.dex */
public final class C10802a extends AbstractC10803b {
    public static final Parcelable.Creator<C10802a> CREATOR = new a();

    /* renamed from: a */
    public final long f27266a;

    /* renamed from: b */
    public final long f27267b;

    /* renamed from: c */
    public final byte[] f27268c;

    /* renamed from: s7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10802a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10802a createFromParcel(Parcel parcel) {
            return new C10802a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10802a[] newArray(int i10) {
            return new C10802a[i10];
        }
    }

    private C10802a(long j10, byte[] bArr, long j11) {
        this.f27266a = j11;
        this.f27267b = j10;
        this.f27268c = bArr;
    }

    private C10802a(Parcel parcel) {
        this.f27266a = parcel.readLong();
        this.f27267b = parcel.readLong();
        this.f27268c = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    /* synthetic */ C10802a(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10802a m32914a(C11146e0 c11146e0, int i10, long j10) {
        long m34666J = c11146e0.m34666J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c11146e0.m34688l(bArr, 0, i11);
        return new C10802a(m34666J, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27266a);
        parcel.writeLong(this.f27267b);
        parcel.writeByteArray(this.f27268c);
    }
}
