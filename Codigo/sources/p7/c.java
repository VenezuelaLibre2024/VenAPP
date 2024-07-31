package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l7.a;
import t6.h2;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22867a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22868b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22869c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(Parcel parcel) {
        this.f22867a = (byte[]) t8.a.e(parcel.createByteArray());
        this.f22868b = parcel.readString();
        this.f22869c = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f22867a = bArr;
        this.f22868b = str;
        this.f22869c = str2;
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        String str = this.f22868b;
        if (str != null) {
            bVar.m0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22867a, ((c) obj).f22867a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f22867a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f22868b, this.f22869c, Integer.valueOf(this.f22867a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f22867a);
        parcel.writeString(this.f22868b);
        parcel.writeString(this.f22869c);
    }
}
