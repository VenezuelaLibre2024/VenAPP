package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.b */
/* loaded from: classes.dex */
public final class C10280b extends AbstractC10287i {
    public static final Parcelable.Creator<C10280b> CREATOR = new a();

    /* renamed from: b */
    public final byte[] f25527b;

    /* renamed from: q7.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10280b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10280b createFromParcel(Parcel parcel) {
            return new C10280b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10280b[] newArray(int i10) {
            return new C10280b[i10];
        }
    }

    C10280b(Parcel parcel) {
        super((String) C11172r0.m34928j(parcel.readString()));
        this.f25527b = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    public C10280b(String str, byte[] bArr) {
        super(str);
        this.f25527b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10280b.class != obj.getClass()) {
            return false;
        }
        C10280b c10280b = (C10280b) obj;
        return this.f25551a.equals(c10280b.f25551a) && Arrays.equals(this.f25527b, c10280b.f25527b);
    }

    public int hashCode() {
        return ((527 + this.f25551a.hashCode()) * 31) + Arrays.hashCode(this.f25527b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25551a);
        parcel.writeByteArray(this.f25527b);
    }
}
