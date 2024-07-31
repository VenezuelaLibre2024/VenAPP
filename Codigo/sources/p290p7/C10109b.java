package p290p7;

import android.os.Parcel;
import android.os.Parcelable;
import p216l7.C9400a;
import p361t6.C11040h2;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: p7.b */
/* loaded from: classes.dex */
public final class C10109b implements C9400a.b {
    public static final Parcelable.Creator<C10109b> CREATOR = new a();

    /* renamed from: a */
    public final int f24794a;

    /* renamed from: b */
    public final String f24795b;

    /* renamed from: c */
    public final String f24796c;

    /* renamed from: d */
    public final String f24797d;

    /* renamed from: e */
    public final boolean f24798e;

    /* renamed from: f */
    public final int f24799f;

    /* renamed from: p7.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10109b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10109b createFromParcel(Parcel parcel) {
            return new C10109b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10109b[] newArray(int i10) {
            return new C10109b[i10];
        }
    }

    public C10109b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C11137a.m34599a(i11 == -1 || i11 > 0);
        this.f24794a = i10;
        this.f24795b = str;
        this.f24796c = str2;
        this.f24797d = str3;
        this.f24798e = z10;
        this.f24799f = i11;
    }

    C10109b(Parcel parcel) {
        this.f24794a = parcel.readInt();
        this.f24795b = parcel.readString();
        this.f24796c = parcel.readString();
        this.f24797d = parcel.readString();
        this.f24798e = C11172r0.m34881M0(parcel);
        this.f24799f = parcel.readInt();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p290p7.C10109b m30148a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p290p7.C10109b.m30148a(java.util.Map):p7.b");
    }

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        String str = this.f24796c;
        if (str != null) {
            bVar.m34124k0(str);
        }
        String str2 = this.f24795b;
        if (str2 != null) {
            bVar.m34113Z(str2);
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
        if (obj == null || C10109b.class != obj.getClass()) {
            return false;
        }
        C10109b c10109b = (C10109b) obj;
        return this.f24794a == c10109b.f24794a && C11172r0.m34914c(this.f24795b, c10109b.f24795b) && C11172r0.m34914c(this.f24796c, c10109b.f24796c) && C11172r0.m34914c(this.f24797d, c10109b.f24797d) && this.f24798e == c10109b.f24798e && this.f24799f == c10109b.f24799f;
    }

    public int hashCode() {
        int i10 = (527 + this.f24794a) * 31;
        String str = this.f24795b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24796c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24797d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f24798e ? 1 : 0)) * 31) + this.f24799f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f24796c + "\", genre=\"" + this.f24795b + "\", bitrate=" + this.f24794a + ", metadataInterval=" + this.f24799f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24794a);
        parcel.writeString(this.f24795b);
        parcel.writeString(this.f24796c);
        parcel.writeString(this.f24797d);
        C11172r0.m34913b1(parcel, this.f24798e);
        parcel.writeInt(this.f24799f);
    }
}
