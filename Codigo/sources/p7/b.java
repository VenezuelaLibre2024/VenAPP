package p7;

import android.os.Parcel;
import android.os.Parcelable;
import l7.a;
import t6.h2;
import t8.r0;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f22861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22862b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22863c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22864d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22866f;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        t8.a.a(i11 == -1 || i11 > 0);
        this.f22861a = i10;
        this.f22862b = str;
        this.f22863c = str2;
        this.f22864d = str3;
        this.f22865e = z10;
        this.f22866f = i11;
    }

    b(Parcel parcel) {
        this.f22861a = parcel.readInt();
        this.f22862b = parcel.readString();
        this.f22863c = parcel.readString();
        this.f22864d = parcel.readString();
        this.f22865e = r0.M0(parcel);
        this.f22866f = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p7.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.b.a(java.util.Map):p7.b");
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        String str = this.f22863c;
        if (str != null) {
            bVar.k0(str);
        }
        String str2 = this.f22862b;
        if (str2 != null) {
            bVar.Z(str2);
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22861a == bVar.f22861a && r0.c(this.f22862b, bVar.f22862b) && r0.c(this.f22863c, bVar.f22863c) && r0.c(this.f22864d, bVar.f22864d) && this.f22865e == bVar.f22865e && this.f22866f == bVar.f22866f;
    }

    public int hashCode() {
        int i10 = (527 + this.f22861a) * 31;
        String str = this.f22862b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22863c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22864d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f22865e ? 1 : 0)) * 31) + this.f22866f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f22863c + "\", genre=\"" + this.f22862b + "\", bitrate=" + this.f22861a + ", metadataInterval=" + this.f22866f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22861a);
        parcel.writeString(this.f22862b);
        parcel.writeString(this.f22863c);
        parcel.writeString(this.f22864d);
        r0.b1(parcel, this.f22865e);
        parcel.writeInt(this.f22866f);
    }
}
