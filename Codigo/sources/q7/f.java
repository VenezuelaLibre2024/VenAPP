package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23575c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23576d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f23577e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f23574b = (String) r0.j(parcel.readString());
        this.f23575c = (String) r0.j(parcel.readString());
        this.f23576d = (String) r0.j(parcel.readString());
        this.f23577e = (byte[]) r0.j(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f23574b = str;
        this.f23575c = str2;
        this.f23576d = str3;
        this.f23577e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return r0.c(this.f23574b, fVar.f23574b) && r0.c(this.f23575c, fVar.f23575c) && r0.c(this.f23576d, fVar.f23576d) && Arrays.equals(this.f23577e, fVar.f23577e);
    }

    public int hashCode() {
        String str = this.f23574b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23575c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23576d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23577e);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": mimeType=" + this.f23574b + ", filename=" + this.f23575c + ", description=" + this.f23576d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23574b);
        parcel.writeString(this.f23575c);
        parcel.writeString(this.f23576d);
        parcel.writeByteArray(this.f23577e);
    }
}
