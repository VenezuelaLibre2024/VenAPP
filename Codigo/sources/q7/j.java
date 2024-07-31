package q7;

import android.os.Parcel;
import android.os.Parcelable;
import t8.r0;

/* loaded from: classes.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23584b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23585c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23586d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    j(Parcel parcel) {
        super("----");
        this.f23584b = (String) r0.j(parcel.readString());
        this.f23585c = (String) r0.j(parcel.readString());
        this.f23586d = (String) r0.j(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f23584b = str;
        this.f23585c = str2;
        this.f23586d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return r0.c(this.f23585c, jVar.f23585c) && r0.c(this.f23584b, jVar.f23584b) && r0.c(this.f23586d, jVar.f23586d);
    }

    public int hashCode() {
        String str = this.f23584b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23585c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23586d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": domain=" + this.f23584b + ", description=" + this.f23585c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23583a);
        parcel.writeString(this.f23584b);
        parcel.writeString(this.f23586d);
    }
}
