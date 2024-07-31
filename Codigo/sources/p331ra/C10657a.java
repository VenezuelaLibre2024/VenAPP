package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

@Deprecated
/* renamed from: ra.a */
/* loaded from: classes.dex */
public class C10657a extends AbstractC7138a {
    public static final Parcelable.Creator<C10657a> CREATOR = new C10663g();

    /* renamed from: d */
    public static final C10657a f26948d = new C10657a();

    /* renamed from: e */
    public static final C10657a f26949e = new C10657a("unavailable");

    /* renamed from: f */
    public static final C10657a f26950f = new C10657a("unused");

    /* renamed from: a */
    private final a f26951a;

    /* renamed from: b */
    private final String f26952b;

    /* renamed from: c */
    private final String f26953c;

    /* renamed from: ra.a$a */
    /* loaded from: classes.dex */
    public enum a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<a> CREATOR = new C10662f();
        private final int zzb;

        a(int i10) {
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

    /* renamed from: ra.a$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    private C10657a() {
        this.f26951a = a.ABSENT;
        this.f26953c = null;
        this.f26952b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10657a(int i10, String str, String str2) {
        try {
            this.f26951a = m32442x1(i10);
            this.f26952b = str;
            this.f26953c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private C10657a(String str) {
        this.f26952b = (String) C5276s.m13324j(str);
        this.f26951a = a.STRING;
        this.f26953c = null;
    }

    /* renamed from: x1 */
    public static a m32442x1(int i10) {
        for (a aVar : a.values()) {
            if (i10 == aVar.zzb) {
                return aVar;
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
        if (!(obj instanceof C10657a)) {
            return false;
        }
        C10657a c10657a = (C10657a) obj;
        if (!this.f26951a.equals(c10657a.f26951a)) {
            return false;
        }
        int ordinal = this.f26951a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            str = this.f26952b;
            str2 = c10657a.f26952b;
        } else {
            if (ordinal != 2) {
                return false;
            }
            str = this.f26953c;
            str2 = c10657a.f26953c;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i10;
        String str;
        int hashCode = this.f26951a.hashCode() + 31;
        int ordinal = this.f26951a.ordinal();
        if (ordinal == 1) {
            i10 = hashCode * 31;
            str = this.f26952b;
        } else {
            if (ordinal != 2) {
                return hashCode;
            }
            i10 = hashCode * 31;
            str = this.f26953c;
        }
        return i10 + str.hashCode();
    }

    /* renamed from: u1 */
    public String m32443u1() {
        return this.f26953c;
    }

    /* renamed from: v1 */
    public String m32444v1() {
        return this.f26952b;
    }

    /* renamed from: w1 */
    public int m32445w1() {
        return this.f26951a.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, m32445w1());
        C7140c.m21200G(parcel, 3, m32444v1(), false);
        C7140c.m21200G(parcel, 4, m32443u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
