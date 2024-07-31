package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23592b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f23593c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f23592b = (String) r0.j(parcel.readString());
        this.f23593c = (byte[]) r0.j(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f23592b = str;
        this.f23593c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return r0.c(this.f23592b, lVar.f23592b) && Arrays.equals(this.f23593c, lVar.f23593c);
    }

    public int hashCode() {
        String str = this.f23592b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23593c);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": owner=" + this.f23592b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23592b);
        parcel.writeByteArray(this.f23593c);
    }
}
