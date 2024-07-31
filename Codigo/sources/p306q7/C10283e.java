package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import p363t8.C11172r0;

/* renamed from: q7.e */
/* loaded from: classes.dex */
public final class C10283e extends AbstractC10287i {
    public static final Parcelable.Creator<C10283e> CREATOR = new a();

    /* renamed from: b */
    public final String f25539b;

    /* renamed from: c */
    public final String f25540c;

    /* renamed from: d */
    public final String f25541d;

    /* renamed from: q7.e$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10283e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10283e createFromParcel(Parcel parcel) {
            return new C10283e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10283e[] newArray(int i10) {
            return new C10283e[i10];
        }
    }

    C10283e(Parcel parcel) {
        super("COMM");
        this.f25539b = (String) C11172r0.m34928j(parcel.readString());
        this.f25540c = (String) C11172r0.m34928j(parcel.readString());
        this.f25541d = (String) C11172r0.m34928j(parcel.readString());
    }

    public C10283e(String str, String str2, String str3) {
        super("COMM");
        this.f25539b = str;
        this.f25540c = str2;
        this.f25541d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10283e.class != obj.getClass()) {
            return false;
        }
        C10283e c10283e = (C10283e) obj;
        return C11172r0.m34914c(this.f25540c, c10283e.f25540c) && C11172r0.m34914c(this.f25539b, c10283e.f25539b) && C11172r0.m34914c(this.f25541d, c10283e.f25541d);
    }

    public int hashCode() {
        String str = this.f25539b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25540c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25541d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": language=" + this.f25539b + ", description=" + this.f25540c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25551a);
        parcel.writeString(this.f25539b);
        parcel.writeString(this.f25541d);
    }
}
