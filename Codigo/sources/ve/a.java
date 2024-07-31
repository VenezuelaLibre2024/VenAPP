package ve;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xe.k;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0467a();

    /* renamed from: a, reason: collision with root package name */
    private final String f28995a;

    /* renamed from: b, reason: collision with root package name */
    private final l f28996b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28997c;

    /* renamed from: ve.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0467a implements Parcelable.Creator<a> {
        C0467a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0467a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f28997c = false;
        this.f28995a = parcel.readString();
        this.f28997c = parcel.readByte() != 0;
        this.f28996b = (l) parcel.readParcelable(l.class.getClassLoader());
    }

    /* synthetic */ a(Parcel parcel, C0467a c0467a) {
        this(parcel);
    }

    public a(String str, com.google.firebase.perf.util.a aVar) {
        this.f28997c = false;
        this.f28995a = str;
        this.f28996b = aVar.a();
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (z10 || !list.get(i10).g()) {
                kVarArr[i10] = a11;
            } else {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static a c(String str) {
        a aVar = new a(str.replace("-", ""), new com.google.firebase.perf.util.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a g10 = com.google.firebase.perf.config.a.g();
        return g10.K() && Math.random() < g10.D();
    }

    public k a() {
        k.c J = k.i0().J(this.f28995a);
        if (this.f28997c) {
            J.I(xe.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return J.build();
    }

    public l d() {
        return this.f28996b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f28997c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f28996b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f28997c;
    }

    public String h() {
        return this.f28995a;
    }

    public void i(boolean z10) {
        this.f28997c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28995a);
        parcel.writeByte(this.f28997c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f28996b, 0);
    }
}
