package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

@Deprecated
/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final a f24834d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final a f24835e = new a("unavailable");

    /* renamed from: f, reason: collision with root package name */
    public static final a f24836f = new a("unused");

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0415a f24837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24838b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24839c;

    /* renamed from: ra.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0415a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<EnumC0415a> CREATOR = new f();
        private final int zzb;

        EnumC0415a(int i10) {
            this.zzb = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.zzb);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    private a() {
        this.f24837a = EnumC0415a.ABSENT;
        this.f24839c = null;
        this.f24838b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, String str, String str2) {
        try {
            this.f24837a = x1(i10);
            this.f24838b = str;
            this.f24839c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private a(String str) {
        this.f24838b = (String) s.j(str);
        this.f24837a = EnumC0415a.STRING;
        this.f24839c = null;
    }

    public static EnumC0415a x1(int i10) {
        for (EnumC0415a enumC0415a : EnumC0415a.values()) {
            if (i10 == enumC0415a.zzb) {
                return enumC0415a;
            }
        }
        throw new b(i10);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f24837a.equals(aVar.f24837a)) {
            return false;
        }
        int ordinal = this.f24837a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            str = this.f24838b;
            str2 = aVar.f24838b;
        } else {
            if (ordinal != 2) {
                return false;
            }
            str = this.f24839c;
            str2 = aVar.f24839c;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i10;
        String str;
        int hashCode = this.f24837a.hashCode() + 31;
        int ordinal = this.f24837a.ordinal();
        if (ordinal == 1) {
            i10 = hashCode * 31;
            str = this.f24838b;
        } else {
            if (ordinal != 2) {
                return hashCode;
            }
            i10 = hashCode * 31;
            str = this.f24839c;
        }
        return i10 + str.hashCode();
    }

    public String u1() {
        return this.f24839c;
    }

    public String v1() {
        return this.f24838b;
    }

    public int w1() {
        return this.f24837a.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, w1());
        ea.c.G(parcel, 3, v1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.b(parcel, a10);
    }
}
