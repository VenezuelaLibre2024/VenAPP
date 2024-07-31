package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.c0 */
/* loaded from: classes2.dex */
public final class C11481c0 extends AbstractC7138a {
    public static final Parcelable.Creator<C11481c0> CREATOR = new C11499l0();

    /* renamed from: a */
    private zzap f29807a;

    /* renamed from: b */
    private InterfaceC11483d0 f29808b;

    /* renamed from: c */
    private boolean f29809c;

    /* renamed from: d */
    private float f29810d;

    /* renamed from: e */
    private boolean f29811e;

    /* renamed from: f */
    private float f29812f;

    public C11481c0() {
        this.f29809c = true;
        this.f29811e = true;
        this.f29812f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11481c0(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f29809c = true;
        this.f29811e = true;
        this.f29812f = 0.0f;
        zzap zzc = zzao.zzc(iBinder);
        this.f29807a = zzc;
        this.f29808b = zzc == null ? null : new C11495j0(this);
        this.f29809c = z10;
        this.f29810d = f10;
        this.f29811e = z11;
        this.f29812f = f11;
    }

    /* renamed from: A1 */
    public C11481c0 m35927A1(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C5276s.m13316b(z10, "Transparency must be in the range [0..1]");
        this.f29812f = f10;
        return this;
    }

    /* renamed from: B1 */
    public C11481c0 m35928B1(boolean z10) {
        this.f29809c = z10;
        return this;
    }

    /* renamed from: C1 */
    public C11481c0 m35929C1(float f10) {
        this.f29810d = f10;
        return this;
    }

    /* renamed from: u1 */
    public C11481c0 m35930u1(boolean z10) {
        this.f29811e = z10;
        return this;
    }

    /* renamed from: v1 */
    public boolean m35931v1() {
        return this.f29811e;
    }

    /* renamed from: w1 */
    public float m35932w1() {
        return this.f29812f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        zzap zzapVar = this.f29807a;
        C7140c.m21228t(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        C7140c.m21215g(parcel, 3, m35934y1());
        C7140c.m21225q(parcel, 4, m35933x1());
        C7140c.m21215g(parcel, 5, m35931v1());
        C7140c.m21225q(parcel, 6, m35932w1());
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public float m35933x1() {
        return this.f29810d;
    }

    /* renamed from: y1 */
    public boolean m35934y1() {
        return this.f29809c;
    }

    /* renamed from: z1 */
    public C11481c0 m35935z1(InterfaceC11483d0 interfaceC11483d0) {
        this.f29808b = (InterfaceC11483d0) C5276s.m13325k(interfaceC11483d0, "tileProvider must not be null.");
        this.f29807a = new BinderC11497k0(this, interfaceC11483d0);
        return this;
    }
}
