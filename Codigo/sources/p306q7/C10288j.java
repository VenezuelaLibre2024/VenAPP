package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import p363t8.C11172r0;

/* renamed from: q7.j */
/* loaded from: classes.dex */
public final class C10288j extends AbstractC10287i {
    public static final Parcelable.Creator<C10288j> CREATOR = new a();

    /* renamed from: b */
    public final String f25552b;

    /* renamed from: c */
    public final String f25553c;

    /* renamed from: d */
    public final String f25554d;

    /* renamed from: q7.j$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10288j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10288j createFromParcel(Parcel parcel) {
            return new C10288j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10288j[] newArray(int i10) {
            return new C10288j[i10];
        }
    }

    C10288j(Parcel parcel) {
        super("----");
        this.f25552b = (String) C11172r0.m34928j(parcel.readString());
        this.f25553c = (String) C11172r0.m34928j(parcel.readString());
        this.f25554d = (String) C11172r0.m34928j(parcel.readString());
    }

    public C10288j(String str, String str2, String str3) {
        super("----");
        this.f25552b = str;
        this.f25553c = str2;
        this.f25554d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10288j.class != obj.getClass()) {
            return false;
        }
        C10288j c10288j = (C10288j) obj;
        return C11172r0.m34914c(this.f25553c, c10288j.f25553c) && C11172r0.m34914c(this.f25552b, c10288j.f25552b) && C11172r0.m34914c(this.f25554d, c10288j.f25554d);
    }

    public int hashCode() {
        String str = this.f25552b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25553c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25554d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": domain=" + this.f25552b + ", description=" + this.f25553c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25551a);
        parcel.writeString(this.f25552b);
        parcel.writeString(this.f25554d);
    }
}
