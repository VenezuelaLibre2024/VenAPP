package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new n0();

    /* renamed from: d */
    private static final String f27498d = "e";

    /* renamed from: a */
    private final int f27499a;

    /* renamed from: b */
    private final b f27500b;

    /* renamed from: c */
    private final Float f27501c;

    public e(int i10) {
        this(i10, (b) null, (Float) null);
    }

    public e(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new b(b.a.f2(iBinder)), f10);
    }

    private e(int i10, b bVar, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z10 = bVar != null && z11;
            i10 = 3;
        } else {
            z10 = true;
        }
        com.google.android.gms.common.internal.s.b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), bVar, f10));
        this.f27499a = i10;
        this.f27500b = bVar;
        this.f27501c = f10;
    }

    public e(b bVar, float f10) {
        this(3, bVar, Float.valueOf(f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f27499a == eVar.f27499a && com.google.android.gms.common.internal.q.b(this.f27500b, eVar.f27500b) && com.google.android.gms.common.internal.q.b(this.f27501c, eVar.f27501c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f27499a), this.f27500b, this.f27501c);
    }

    public String toString() {
        return "[Cap: type=" + this.f27499a + "]";
    }

    public final e u1() {
        int i10 = this.f27499a;
        if (i10 == 0) {
            return new d();
        }
        if (i10 == 1) {
            return new w();
        }
        if (i10 == 2) {
            return new u();
        }
        if (i10 == 3) {
            com.google.android.gms.common.internal.s.o(this.f27500b != null, "bitmapDescriptor must not be null");
            com.google.android.gms.common.internal.s.o(this.f27501c != null, "bitmapRefWidth must not be null");
            return new h(this.f27500b, this.f27501c.floatValue());
        }
        Log.w(f27498d, "Unknown Cap type: " + i10);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27499a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, i11);
        b bVar = this.f27500b;
        ea.c.t(parcel, 3, bVar == null ? null : bVar.a().asBinder(), false);
        ea.c.s(parcel, 4, this.f27501c, false);
        ea.c.b(parcel, a10);
    }
}
