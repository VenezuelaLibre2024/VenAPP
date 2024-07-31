package a8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l7.a;

/* loaded from: classes.dex */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f232b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f233c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f234a;

        /* renamed from: b, reason: collision with root package name */
        public final int f235b;

        /* renamed from: c, reason: collision with root package name */
        public final String f236c;

        /* renamed from: d, reason: collision with root package name */
        public final String f237d;

        /* renamed from: e, reason: collision with root package name */
        public final String f238e;

        /* renamed from: f, reason: collision with root package name */
        public final String f239f;

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
            this.f234a = i10;
            this.f235b = i11;
            this.f236c = str;
            this.f237d = str2;
            this.f238e = str3;
            this.f239f = str4;
        }

        b(Parcel parcel) {
            this.f234a = parcel.readInt();
            this.f235b = parcel.readInt();
            this.f236c = parcel.readString();
            this.f237d = parcel.readString();
            this.f238e = parcel.readString();
            this.f239f = parcel.readString();
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
            return this.f234a == bVar.f234a && this.f235b == bVar.f235b && TextUtils.equals(this.f236c, bVar.f236c) && TextUtils.equals(this.f237d, bVar.f237d) && TextUtils.equals(this.f238e, bVar.f238e) && TextUtils.equals(this.f239f, bVar.f239f);
        }

        public int hashCode() {
            int i10 = ((this.f234a * 31) + this.f235b) * 31;
            String str = this.f236c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f237d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f238e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f239f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f234a);
            parcel.writeInt(this.f235b);
            parcel.writeString(this.f236c);
            parcel.writeString(this.f237d);
            parcel.writeString(this.f238e);
            parcel.writeString(this.f239f);
        }
    }

    q(Parcel parcel) {
        this.f231a = parcel.readString();
        this.f232b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f233c = Collections.unmodifiableList(arrayList);
    }

    public q(String str, String str2, List<b> list) {
        this.f231a = str;
        this.f232b = str2;
        this.f233c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return TextUtils.equals(this.f231a, qVar.f231a) && TextUtils.equals(this.f232b, qVar.f232b) && this.f233c.equals(qVar.f233c);
    }

    public int hashCode() {
        String str = this.f231a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f232b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f233c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f231a != null) {
            str = " [" + this.f231a + ", " + this.f232b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f231a);
        parcel.writeString(this.f232b);
        int size = this.f233c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f233c.get(i11), 0);
        }
    }
}
