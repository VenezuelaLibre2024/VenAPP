package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.f */
/* loaded from: classes.dex */
public final class C10284f extends AbstractC10287i {
    public static final Parcelable.Creator<C10284f> CREATOR = new a();

    /* renamed from: b */
    public final String f25542b;

    /* renamed from: c */
    public final String f25543c;

    /* renamed from: d */
    public final String f25544d;

    /* renamed from: e */
    public final byte[] f25545e;

    /* renamed from: q7.f$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10284f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10284f createFromParcel(Parcel parcel) {
            return new C10284f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10284f[] newArray(int i10) {
            return new C10284f[i10];
        }
    }

    C10284f(Parcel parcel) {
        super("GEOB");
        this.f25542b = (String) C11172r0.m34928j(parcel.readString());
        this.f25543c = (String) C11172r0.m34928j(parcel.readString());
        this.f25544d = (String) C11172r0.m34928j(parcel.readString());
        this.f25545e = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    public C10284f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f25542b = str;
        this.f25543c = str2;
        this.f25544d = str3;
        this.f25545e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10284f.class != obj.getClass()) {
            return false;
        }
        C10284f c10284f = (C10284f) obj;
        return C11172r0.m34914c(this.f25542b, c10284f.f25542b) && C11172r0.m34914c(this.f25543c, c10284f.f25543c) && C11172r0.m34914c(this.f25544d, c10284f.f25544d) && Arrays.equals(this.f25545e, c10284f.f25545e);
    }

    public int hashCode() {
        String str = this.f25542b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25543c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25544d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f25545e);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": mimeType=" + this.f25542b + ", filename=" + this.f25543c + ", description=" + this.f25544d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25542b);
        parcel.writeString(this.f25543c);
        parcel.writeString(this.f25544d);
        parcel.writeByteArray(this.f25545e);
    }
}
