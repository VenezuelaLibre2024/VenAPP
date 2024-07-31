package q7;

import android.os.Parcel;
import android.os.Parcelable;
import t8.r0;

/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23571b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23572c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23573d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    e(Parcel parcel) {
        super("COMM");
        this.f23571b = (String) r0.j(parcel.readString());
        this.f23572c = (String) r0.j(parcel.readString());
        this.f23573d = (String) r0.j(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f23571b = str;
        this.f23572c = str2;
        this.f23573d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return r0.c(this.f23572c, eVar.f23572c) && r0.c(this.f23571b, eVar.f23571b) && r0.c(this.f23573d, eVar.f23573d);
    }

    public int hashCode() {
        String str = this.f23571b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23572c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23573d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": language=" + this.f23571b + ", description=" + this.f23572c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23583a);
        parcel.writeString(this.f23571b);
        parcel.writeString(this.f23573d);
    }
}
