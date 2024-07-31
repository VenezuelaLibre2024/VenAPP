package p436x6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p361t6.C11081p;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: x6.m */
/* loaded from: classes.dex */
public final class C12318m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C12318m> CREATOR = new a();

    /* renamed from: a */
    private final b[] f33049a;

    /* renamed from: b */
    private int f33050b;

    /* renamed from: c */
    public final String f33051c;

    /* renamed from: d */
    public final int f33052d;

    /* renamed from: x6.m$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C12318m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C12318m createFromParcel(Parcel parcel) {
            return new C12318m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C12318m[] newArray(int i10) {
            return new C12318m[i10];
        }
    }

    /* renamed from: x6.m$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private int f33053a;

        /* renamed from: b */
        public final UUID f33054b;

        /* renamed from: c */
        public final String f33055c;

        /* renamed from: d */
        public final String f33056d;

        /* renamed from: e */
        public final byte[] f33057e;

        /* renamed from: x6.m$b$a */
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

        b(Parcel parcel) {
            this.f33054b = new UUID(parcel.readLong(), parcel.readLong());
            this.f33055c = parcel.readString();
            this.f33056d = (String) C11172r0.m34928j(parcel.readString());
            this.f33057e = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f33054b = (UUID) C11137a.m34603e(uuid);
            this.f33055c = str;
            this.f33056d = (String) C11137a.m34603e(str2);
            this.f33057e = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m39844a(b bVar) {
            return m39846c() && !bVar.m39846c() && m39847d(bVar.f33054b);
        }

        /* renamed from: b */
        public b m39845b(byte[] bArr) {
            return new b(this.f33054b, this.f33055c, this.f33056d, bArr);
        }

        /* renamed from: c */
        public boolean m39846c() {
            return this.f33057e != null;
        }

        /* renamed from: d */
        public boolean m39847d(UUID uuid) {
            return C11081p.f28571a.equals(this.f33054b) || uuid.equals(this.f33054b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return C11172r0.m34914c(this.f33055c, bVar.f33055c) && C11172r0.m34914c(this.f33056d, bVar.f33056d) && C11172r0.m34914c(this.f33054b, bVar.f33054b) && Arrays.equals(this.f33057e, bVar.f33057e);
        }

        public int hashCode() {
            if (this.f33053a == 0) {
                int hashCode = this.f33054b.hashCode() * 31;
                String str = this.f33055c;
                this.f33053a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33056d.hashCode()) * 31) + Arrays.hashCode(this.f33057e);
            }
            return this.f33053a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f33054b.getMostSignificantBits());
            parcel.writeLong(this.f33054b.getLeastSignificantBits());
            parcel.writeString(this.f33055c);
            parcel.writeString(this.f33056d);
            parcel.writeByteArray(this.f33057e);
        }
    }

    C12318m(Parcel parcel) {
        this.f33051c = parcel.readString();
        b[] bVarArr = (b[]) C11172r0.m34928j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f33049a = bVarArr;
        this.f33052d = bVarArr.length;
    }

    public C12318m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private C12318m(String str, boolean z10, b... bVarArr) {
        this.f33051c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f33049a = bVarArr;
        this.f33052d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C12318m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C12318m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public C12318m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    /* renamed from: b */
    private static boolean m39836b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f33054b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static C12318m m39837d(C12318m c12318m, C12318m c12318m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c12318m != null) {
            str = c12318m.f33051c;
            for (b bVar : c12318m.f33049a) {
                if (bVar.m39846c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c12318m2 != null) {
            if (str == null) {
                str = c12318m2.f33051c;
            }
            int size = arrayList.size();
            for (b bVar2 : c12318m2.f33049a) {
                if (bVar2.m39846c() && !m39836b(arrayList, size, bVar2.f33054b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C12318m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C11081p.f28571a;
        return uuid.equals(bVar.f33054b) ? uuid.equals(bVar2.f33054b) ? 0 : 1 : bVar.f33054b.compareTo(bVar2.f33054b);
    }

    /* renamed from: c */
    public C12318m m39839c(String str) {
        return C11172r0.m34914c(this.f33051c, str) ? this : new C12318m(str, false, this.f33049a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public b m39840e(int i10) {
        return this.f33049a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12318m.class != obj.getClass()) {
            return false;
        }
        C12318m c12318m = (C12318m) obj;
        return C11172r0.m34914c(this.f33051c, c12318m.f33051c) && Arrays.equals(this.f33049a, c12318m.f33049a);
    }

    /* renamed from: f */
    public C12318m m39841f(C12318m c12318m) {
        String str;
        String str2 = this.f33051c;
        C11137a.m34605g(str2 == null || (str = c12318m.f33051c) == null || TextUtils.equals(str2, str));
        String str3 = this.f33051c;
        if (str3 == null) {
            str3 = c12318m.f33051c;
        }
        return new C12318m(str3, (b[]) C11172r0.m34869G0(this.f33049a, c12318m.f33049a));
    }

    public int hashCode() {
        if (this.f33050b == 0) {
            String str = this.f33051c;
            this.f33050b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f33049a);
        }
        return this.f33050b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f33051c);
        parcel.writeTypedArray(this.f33049a, 0);
    }
}
