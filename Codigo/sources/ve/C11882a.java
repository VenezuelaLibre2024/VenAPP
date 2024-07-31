package ve;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.util.C6327a;
import com.google.firebase.perf.util.C6338l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p444xe.C12478k;
import p444xe.EnumC12479l;

/* renamed from: ve.a */
/* loaded from: classes.dex */
public class C11882a implements Parcelable {
    public static final Parcelable.Creator<C11882a> CREATOR = new a();

    /* renamed from: a */
    private final String f31429a;

    /* renamed from: b */
    private final C6338l f31430b;

    /* renamed from: c */
    private boolean f31431c;

    /* renamed from: ve.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C11882a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11882a createFromParcel(Parcel parcel) {
            return new C11882a(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C11882a[] newArray(int i10) {
            return new C11882a[i10];
        }
    }

    private C11882a(Parcel parcel) {
        this.f31431c = false;
        this.f31429a = parcel.readString();
        this.f31431c = parcel.readByte() != 0;
        this.f31430b = (C6338l) parcel.readParcelable(C6338l.class.getClassLoader());
    }

    /* synthetic */ C11882a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C11882a(String str, C6327a c6327a) {
        this.f31431c = false;
        this.f31429a = str;
        this.f31430b = c6327a.m17508a();
    }

    /* renamed from: b */
    public static C12478k[] m38000b(List<C11882a> list) {
        if (list.isEmpty()) {
            return null;
        }
        C12478k[] c12478kArr = new C12478k[list.size()];
        C12478k m38003a = list.get(0).m38003a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            C12478k m38003a2 = list.get(i10).m38003a();
            if (z10 || !list.get(i10).m38007g()) {
                c12478kArr[i10] = m38003a2;
            } else {
                c12478kArr[0] = m38003a2;
                c12478kArr[i10] = m38003a;
                z10 = true;
            }
        }
        if (!z10) {
            c12478kArr[0] = m38003a;
        }
        return c12478kArr;
    }

    /* renamed from: c */
    public static C11882a m38001c(String str) {
        C11882a c11882a = new C11882a(str.replace("-", ""), new C6327a());
        c11882a.m38009i(m38002j());
        return c11882a;
    }

    /* renamed from: j */
    public static boolean m38002j() {
        C6277a m17265g = C6277a.m17265g();
        return m17265g.m17282K() && Math.random() < m17265g.m17278D();
    }

    /* renamed from: a */
    public C12478k m38003a() {
        C12478k.c m40694J = C12478k.m40689i0().m40694J(this.f31429a);
        if (this.f31431c) {
            m40694J.m40693I(EnumC12479l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return m40694J.build();
    }

    /* renamed from: d */
    public C6338l m38004d() {
        return this.f31430b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m38005e() {
        return this.f31431c;
    }

    /* renamed from: f */
    public boolean m38006f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f31430b.m17532c()) > C6277a.m17265g().m17275A();
    }

    /* renamed from: g */
    public boolean m38007g() {
        return this.f31431c;
    }

    /* renamed from: h */
    public String m38008h() {
        return this.f31429a;
    }

    /* renamed from: i */
    public void m38009i(boolean z10) {
        this.f31431c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31429a);
        parcel.writeByte(this.f31431c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f31430b, 0);
    }
}
