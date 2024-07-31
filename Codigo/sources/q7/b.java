package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23559b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(Parcel parcel) {
        super((String) r0.j(parcel.readString()));
        this.f23559b = (byte[]) r0.j(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f23559b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23583a.equals(bVar.f23583a) && Arrays.equals(this.f23559b, bVar.f23559b);
    }

    public int hashCode() {
        return ((527 + this.f23583a.hashCode()) * 31) + Arrays.hashCode(this.f23559b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23583a);
        parcel.writeByteArray(this.f23559b);
    }
}
