package q7;

import android.os.Parcel;
import android.os.Parcelable;
import t8.r0;

/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23598c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    n(Parcel parcel) {
        super((String) r0.j(parcel.readString()));
        this.f23597b = parcel.readString();
        this.f23598c = (String) r0.j(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f23597b = str2;
        this.f23598c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f23583a.equals(nVar.f23583a) && r0.c(this.f23597b, nVar.f23597b) && r0.c(this.f23598c, nVar.f23598c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f23583a.hashCode()) * 31;
        String str = this.f23597b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23598c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": url=" + this.f23598c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23583a);
        parcel.writeString(this.f23597b);
        parcel.writeString(this.f23598c);
    }
}
