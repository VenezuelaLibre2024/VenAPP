package s7;

import android.os.Parcel;
import android.os.Parcelable;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0419a();

    /* renamed from: a, reason: collision with root package name */
    public final long f25147a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25148b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25149c;

    /* renamed from: s7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0419a implements Parcelable.Creator<a> {
        C0419a() {
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

    private a(long j10, byte[] bArr, long j11) {
        this.f25147a = j11;
        this.f25148b = j10;
        this.f25149c = bArr;
    }

    private a(Parcel parcel) {
        this.f25147a = parcel.readLong();
        this.f25148b = parcel.readLong();
        this.f25149c = (byte[]) r0.j(parcel.createByteArray());
    }

    /* synthetic */ a(Parcel parcel, C0419a c0419a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(e0 e0Var, int i10, long j10) {
        long J = e0Var.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        e0Var.l(bArr, 0, i11);
        return new a(J, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25147a);
        parcel.writeLong(this.f25148b);
        parcel.writeByteArray(this.f25149c);
    }
}
