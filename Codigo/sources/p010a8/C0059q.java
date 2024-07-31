package p010a8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p216l7.C9400a;

/* renamed from: a8.q */
/* loaded from: classes.dex */
public final class C0059q implements C9400a.b {
    public static final Parcelable.Creator<C0059q> CREATOR = new a();

    /* renamed from: a */
    public final String f282a;

    /* renamed from: b */
    public final String f283b;

    /* renamed from: c */
    public final List<b> f284c;

    /* renamed from: a8.q$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C0059q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0059q createFromParcel(Parcel parcel) {
            return new C0059q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0059q[] newArray(int i10) {
            return new C0059q[i10];
        }
    }

    /* renamed from: a8.q$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        public final int f285a;

        /* renamed from: b */
        public final int f286b;

        /* renamed from: c */
        public final String f287c;

        /* renamed from: d */
        public final String f288d;

        /* renamed from: e */
        public final String f289e;

        /* renamed from: f */
        public final String f290f;

        /* renamed from: a8.q$b$a */
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

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f285a = i10;
            this.f286b = i11;
            this.f287c = str;
            this.f288d = str2;
            this.f289e = str3;
            this.f290f = str4;
        }

        b(Parcel parcel) {
            this.f285a = parcel.readInt();
            this.f286b = parcel.readInt();
            this.f287c = parcel.readString();
            this.f288d = parcel.readString();
            this.f289e = parcel.readString();
            this.f290f = parcel.readString();
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
            return this.f285a == bVar.f285a && this.f286b == bVar.f286b && TextUtils.equals(this.f287c, bVar.f287c) && TextUtils.equals(this.f288d, bVar.f288d) && TextUtils.equals(this.f289e, bVar.f289e) && TextUtils.equals(this.f290f, bVar.f290f);
        }

        public int hashCode() {
            int i10 = ((this.f285a * 31) + this.f286b) * 31;
            String str = this.f287c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f288d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f289e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f290f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f285a);
            parcel.writeInt(this.f286b);
            parcel.writeString(this.f287c);
            parcel.writeString(this.f288d);
            parcel.writeString(this.f289e);
            parcel.writeString(this.f290f);
        }
    }

    C0059q(Parcel parcel) {
        this.f282a = parcel.readString();
        this.f283b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f284c = Collections.unmodifiableList(arrayList);
    }

    public C0059q(String str, String str2, List<b> list) {
        this.f282a = str;
        this.f283b = str2;
        this.f284c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0059q.class != obj.getClass()) {
            return false;
        }
        C0059q c0059q = (C0059q) obj;
        return TextUtils.equals(this.f282a, c0059q.f282a) && TextUtils.equals(this.f283b, c0059q.f283b) && this.f284c.equals(c0059q.f284c);
    }

    public int hashCode() {
        String str = this.f282a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f283b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f284c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f282a != null) {
            str = " [" + this.f282a + ", " + this.f283b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f282a);
        parcel.writeString(this.f283b);
        int size = this.f284c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f284c.get(i11), 0);
        }
    }
}
