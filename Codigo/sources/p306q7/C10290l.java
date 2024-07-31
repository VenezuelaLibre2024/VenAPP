package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.l */
/* loaded from: classes.dex */
public final class C10290l extends AbstractC10287i {
    public static final Parcelable.Creator<C10290l> CREATOR = new a();

    /* renamed from: b */
    public final String f25560b;

    /* renamed from: c */
    public final byte[] f25561c;

    /* renamed from: q7.l$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10290l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10290l createFromParcel(Parcel parcel) {
            return new C10290l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10290l[] newArray(int i10) {
            return new C10290l[i10];
        }
    }

    C10290l(Parcel parcel) {
        super("PRIV");
        this.f25560b = (String) C11172r0.m34928j(parcel.readString());
        this.f25561c = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    public C10290l(String str, byte[] bArr) {
        super("PRIV");
        this.f25560b = str;
        this.f25561c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10290l.class != obj.getClass()) {
            return false;
        }
        C10290l c10290l = (C10290l) obj;
        return C11172r0.m34914c(this.f25560b, c10290l.f25560b) && Arrays.equals(this.f25561c, c10290l.f25561c);
    }

    public int hashCode() {
        String str = this.f25560b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f25561c);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": owner=" + this.f25560b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25560b);
        parcel.writeByteArray(this.f25561c);
    }
}
