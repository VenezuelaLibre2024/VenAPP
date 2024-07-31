package x6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import t8.r0;

/* loaded from: classes.dex */
public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a */
    private final b[] f30537a;

    /* renamed from: b */
    private int f30538b;

    /* renamed from: c */
    public final String f30539c;

    /* renamed from: d */
    public final int f30540d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private int f30541a;

        /* renamed from: b */
        public final UUID f30542b;

        /* renamed from: c */
        public final String f30543c;

        /* renamed from: d */
        public final String f30544d;

        /* renamed from: e */
        public final byte[] f30545e;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        b(Parcel parcel) {
            this.f30542b = new UUID(parcel.readLong(), parcel.readLong());
            this.f30543c = parcel.readString();
            this.f30544d = (String) r0.j(parcel.readString());
            this.f30545e = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f30542b = (UUID) t8.a.e(uuid);
            this.f30543c = str;
            this.f30544d = (String) t8.a.e(str2);
            this.f30545e = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f30542b);
        }

        public b b(byte[] bArr) {
            return new b(this.f30542b, this.f30543c, this.f30544d, bArr);
        }

        public boolean c() {
            return this.f30545e != null;
        }

        public boolean d(UUID uuid) {
            return t6.p.f26344a.equals(this.f30542b) || uuid.equals(this.f30542b);
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
            return r0.c(this.f30543c, bVar.f30543c) && r0.c(this.f30544d, bVar.f30544d) && r0.c(this.f30542b, bVar.f30542b) && Arrays.equals(this.f30545e, bVar.f30545e);
        }

        public int hashCode() {
            if (this.f30541a == 0) {
                int hashCode = this.f30542b.hashCode() * 31;
                String str = this.f30543c;
                this.f30541a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f30544d.hashCode()) * 31) + Arrays.hashCode(this.f30545e);
            }
            return this.f30541a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f30542b.getMostSignificantBits());
            parcel.writeLong(this.f30542b.getLeastSignificantBits());
            parcel.writeString(this.f30543c);
            parcel.writeString(this.f30544d);
            parcel.writeByteArray(this.f30545e);
        }
    }

    m(Parcel parcel) {
        this.f30539c = parcel.readString();
        b[] bVarArr = (b[]) r0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f30537a = bVarArr;
        this.f30540d = bVarArr.length;
    }

    public m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private m(String str, boolean z10, b... bVarArr) {
        this.f30539c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f30537a = bVarArr;
        this.f30540d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f30542b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m d(m mVar, m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f30539c;
            for (b bVar : mVar.f30537a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f30539c;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f30537a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f30542b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = t6.p.f26344a;
        return uuid.equals(bVar.f30542b) ? uuid.equals(bVar2.f30542b) ? 0 : 1 : bVar.f30542b.compareTo(bVar2.f30542b);
    }

    public m c(String str) {
        return r0.c(this.f30539c, str) ? this : new m(str, false, this.f30537a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f30537a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return r0.c(this.f30539c, mVar.f30539c) && Arrays.equals(this.f30537a, mVar.f30537a);
    }

    public m f(m mVar) {
        String str;
        String str2 = this.f30539c;
        t8.a.g(str2 == null || (str = mVar.f30539c) == null || TextUtils.equals(str2, str));
        String str3 = this.f30539c;
        if (str3 == null) {
            str3 = mVar.f30539c;
        }
        return new m(str3, (b[]) r0.G0(this.f30537a, mVar.f30537a));
    }

    public int hashCode() {
        if (this.f30538b == 0) {
            String str = this.f30539c;
            this.f30538b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f30537a);
        }
        return this.f30538b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30539c);
        parcel.writeTypedArray(this.f30537a, 0);
    }
}
