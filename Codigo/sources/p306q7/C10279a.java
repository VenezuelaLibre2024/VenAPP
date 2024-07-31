package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p361t6.C11040h2;
import p363t8.C11172r0;

/* renamed from: q7.a */
/* loaded from: classes.dex */
public final class C10279a extends AbstractC10287i {
    public static final Parcelable.Creator<C10279a> CREATOR = new a();

    /* renamed from: b */
    public final String f25523b;

    /* renamed from: c */
    public final String f25524c;

    /* renamed from: d */
    public final int f25525d;

    /* renamed from: e */
    public final byte[] f25526e;

    /* renamed from: q7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10279a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10279a createFromParcel(Parcel parcel) {
            return new C10279a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10279a[] newArray(int i10) {
            return new C10279a[i10];
        }
    }

    C10279a(Parcel parcel) {
        super("APIC");
        this.f25523b = (String) C11172r0.m34928j(parcel.readString());
        this.f25524c = parcel.readString();
        this.f25525d = parcel.readInt();
        this.f25526e = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    public C10279a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f25523b = str;
        this.f25524c = str2;
        this.f25525d = i10;
        this.f25526e = bArr;
    }

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        bVar.m34096I(this.f25526e, this.f25525d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10279a.class != obj.getClass()) {
            return false;
        }
        C10279a c10279a = (C10279a) obj;
        return this.f25525d == c10279a.f25525d && C11172r0.m34914c(this.f25523b, c10279a.f25523b) && C11172r0.m34914c(this.f25524c, c10279a.f25524c) && Arrays.equals(this.f25526e, c10279a.f25526e);
    }

    public int hashCode() {
        int i10 = (527 + this.f25525d) * 31;
        String str = this.f25523b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25524c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f25526e);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": mimeType=" + this.f25523b + ", description=" + this.f25524c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25523b);
        parcel.writeString(this.f25524c);
        parcel.writeInt(this.f25525d);
        parcel.writeByteArray(this.f25526e);
    }
}
