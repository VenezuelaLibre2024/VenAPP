package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import p363t8.C11172r0;

/* renamed from: q7.n */
/* loaded from: classes.dex */
public final class C10292n extends AbstractC10287i {
    public static final Parcelable.Creator<C10292n> CREATOR = new a();

    /* renamed from: b */
    public final String f25565b;

    /* renamed from: c */
    public final String f25566c;

    /* renamed from: q7.n$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10292n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10292n createFromParcel(Parcel parcel) {
            return new C10292n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10292n[] newArray(int i10) {
            return new C10292n[i10];
        }
    }

    C10292n(Parcel parcel) {
        super((String) C11172r0.m34928j(parcel.readString()));
        this.f25565b = parcel.readString();
        this.f25566c = (String) C11172r0.m34928j(parcel.readString());
    }

    public C10292n(String str, String str2, String str3) {
        super(str);
        this.f25565b = str2;
        this.f25566c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10292n.class != obj.getClass()) {
            return false;
        }
        C10292n c10292n = (C10292n) obj;
        return this.f25551a.equals(c10292n.f25551a) && C11172r0.m34914c(this.f25565b, c10292n.f25565b) && C11172r0.m34914c(this.f25566c, c10292n.f25566c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f25551a.hashCode()) * 31;
        String str = this.f25565b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25566c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": url=" + this.f25566c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25551a);
        parcel.writeString(this.f25565b);
        parcel.writeString(this.f25566c);
    }
}
