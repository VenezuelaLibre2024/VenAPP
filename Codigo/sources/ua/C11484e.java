package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.e */
/* loaded from: classes2.dex */
public class C11484e extends AbstractC7138a {
    public static final Parcelable.Creator<C11484e> CREATOR = new C11503n0();

    /* renamed from: d */
    private static final String f29814d = "e";

    /* renamed from: a */
    private final int f29815a;

    /* renamed from: b */
    private final C11478b f29816b;

    /* renamed from: c */
    private final Float f29817c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11484e(int i10) {
        this(i10, (C11478b) null, (Float) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11484e(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new C11478b(InterfaceC5312b.a.m13410f2(iBinder)), f10);
    }

    private C11484e(int i10, C11478b c11478b, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z10 = c11478b != null && z11;
            i10 = 3;
        } else {
            z10 = true;
        }
        C5276s.m13316b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), c11478b, f10));
        this.f29815a = i10;
        this.f29816b = c11478b;
        this.f29817c = f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11484e(C11478b c11478b, float f10) {
        this(3, c11478b, Float.valueOf(f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11484e)) {
            return false;
        }
        C11484e c11484e = (C11484e) obj;
        return this.f29815a == c11484e.f29815a && C5270q.m13304b(this.f29816b, c11484e.f29816b) && C5270q.m13304b(this.f29817c, c11484e.f29817c);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f29815a), this.f29816b, this.f29817c);
    }

    public String toString() {
        return "[Cap: type=" + this.f29815a + "]";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C11484e m35936u1() {
        int i10 = this.f29815a;
        if (i10 == 0) {
            return new C11482d();
        }
        if (i10 == 1) {
            return new C11520w();
        }
        if (i10 == 2) {
            return new C11516u();
        }
        if (i10 == 3) {
            C5276s.m13329o(this.f29816b != null, "bitmapDescriptor must not be null");
            C5276s.m13329o(this.f29817c != null, "bitmapRefWidth must not be null");
            return new C11490h(this.f29816b, this.f29817c.floatValue());
        }
        Log.w(f29814d, "Unknown Cap type: " + i10);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29815a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, i11);
        C11478b c11478b = this.f29816b;
        C7140c.m21228t(parcel, 3, c11478b == null ? null : c11478b.m35908a().asBinder(), false);
        C7140c.m21227s(parcel, 4, this.f29817c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
