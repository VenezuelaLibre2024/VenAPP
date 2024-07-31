package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.maps.model.LatLng;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.n */
/* loaded from: classes2.dex */
public class C11502n extends AbstractC7138a {
    public static final Parcelable.Creator<C11502n> CREATOR = new C11515t0();

    /* renamed from: A */
    private View f29842A;

    /* renamed from: B */
    private int f29843B;

    /* renamed from: C */
    private String f29844C;

    /* renamed from: D */
    private float f29845D;

    /* renamed from: a */
    private LatLng f29846a;

    /* renamed from: b */
    private String f29847b;

    /* renamed from: c */
    private String f29848c;

    /* renamed from: d */
    private C11478b f29849d;

    /* renamed from: e */
    private float f29850e;

    /* renamed from: f */
    private float f29851f;

    /* renamed from: r */
    private boolean f29852r;

    /* renamed from: s */
    private boolean f29853s;

    /* renamed from: t */
    private boolean f29854t;

    /* renamed from: u */
    private float f29855u;

    /* renamed from: v */
    private float f29856v;

    /* renamed from: w */
    private float f29857w;

    /* renamed from: x */
    private float f29858x;

    /* renamed from: y */
    private float f29859y;

    /* renamed from: z */
    private int f29860z;

    public C11502n() {
        this.f29850e = 0.5f;
        this.f29851f = 1.0f;
        this.f29853s = true;
        this.f29854t = false;
        this.f29855u = 0.0f;
        this.f29856v = 0.5f;
        this.f29857w = 0.0f;
        this.f29858x = 1.0f;
        this.f29860z = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11502n(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f29850e = 0.5f;
        this.f29851f = 1.0f;
        this.f29853s = true;
        this.f29854t = false;
        this.f29855u = 0.0f;
        this.f29856v = 0.5f;
        this.f29857w = 0.0f;
        this.f29858x = 1.0f;
        this.f29860z = 0;
        this.f29846a = latLng;
        this.f29847b = str;
        this.f29848c = str2;
        if (iBinder == null) {
            this.f29849d = null;
        } else {
            this.f29849d = new C11478b(InterfaceC5312b.a.m13410f2(iBinder));
        }
        this.f29850e = f10;
        this.f29851f = f11;
        this.f29852r = z10;
        this.f29853s = z11;
        this.f29854t = z12;
        this.f29855u = f12;
        this.f29856v = f13;
        this.f29857w = f14;
        this.f29858x = f15;
        this.f29859y = f16;
        this.f29843B = i11;
        this.f29860z = i10;
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(iBinder2);
        this.f29842A = m13410f2 != null ? (View) BinderC5314d.m13411g2(m13410f2) : null;
        this.f29844C = str3;
        this.f29845D = f17;
    }

    /* renamed from: A1 */
    public float m35982A1() {
        return this.f29851f;
    }

    /* renamed from: B1 */
    public float m35983B1() {
        return this.f29856v;
    }

    /* renamed from: C1 */
    public float m35984C1() {
        return this.f29857w;
    }

    /* renamed from: D1 */
    public LatLng m35985D1() {
        return this.f29846a;
    }

    /* renamed from: E1 */
    public float m35986E1() {
        return this.f29855u;
    }

    /* renamed from: F1 */
    public String m35987F1() {
        return this.f29848c;
    }

    /* renamed from: G1 */
    public String m35988G1() {
        return this.f29847b;
    }

    /* renamed from: H1 */
    public float m35989H1() {
        return this.f29859y;
    }

    /* renamed from: I1 */
    public C11502n m35990I1(C11478b c11478b) {
        this.f29849d = c11478b;
        return this;
    }

    /* renamed from: J1 */
    public C11502n m35991J1(float f10, float f11) {
        this.f29856v = f10;
        this.f29857w = f11;
        return this;
    }

    /* renamed from: K1 */
    public boolean m35992K1() {
        return this.f29852r;
    }

    /* renamed from: L1 */
    public boolean m35993L1() {
        return this.f29854t;
    }

    /* renamed from: M1 */
    public boolean m35994M1() {
        return this.f29853s;
    }

    /* renamed from: N1 */
    public C11502n m35995N1(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f29846a = latLng;
        return this;
    }

    /* renamed from: O1 */
    public C11502n m35996O1(float f10) {
        this.f29855u = f10;
        return this;
    }

    /* renamed from: P1 */
    public C11502n m35997P1(String str) {
        this.f29848c = str;
        return this;
    }

    /* renamed from: Q1 */
    public C11502n m35998Q1(String str) {
        this.f29847b = str;
        return this;
    }

    /* renamed from: R1 */
    public C11502n m35999R1(boolean z10) {
        this.f29853s = z10;
        return this;
    }

    /* renamed from: S1 */
    public C11502n m36000S1(float f10) {
        this.f29859y = f10;
        return this;
    }

    /* renamed from: u1 */
    public C11502n m36001u1(float f10) {
        this.f29858x = f10;
        return this;
    }

    /* renamed from: v1 */
    public C11502n m36002v1(float f10, float f11) {
        this.f29850e = f10;
        this.f29851f = f11;
        return this;
    }

    /* renamed from: w1 */
    public C11502n m36003w1(boolean z10) {
        this.f29852r = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m35985D1(), i10, false);
        C7140c.m21200G(parcel, 3, m35988G1(), false);
        C7140c.m21200G(parcel, 4, m35987F1(), false);
        C11478b c11478b = this.f29849d;
        C7140c.m21228t(parcel, 5, c11478b == null ? null : c11478b.m35908a().asBinder(), false);
        C7140c.m21225q(parcel, 6, m36006z1());
        C7140c.m21225q(parcel, 7, m35982A1());
        C7140c.m21215g(parcel, 8, m35992K1());
        C7140c.m21215g(parcel, 9, m35994M1());
        C7140c.m21215g(parcel, 10, m35993L1());
        C7140c.m21225q(parcel, 11, m35986E1());
        C7140c.m21225q(parcel, 12, m35983B1());
        C7140c.m21225q(parcel, 13, m35984C1());
        C7140c.m21225q(parcel, 14, m36005y1());
        C7140c.m21225q(parcel, 15, m35989H1());
        C7140c.m21229u(parcel, 17, this.f29860z);
        C7140c.m21228t(parcel, 18, BinderC5314d.m13412h2(this.f29842A).asBinder(), false);
        C7140c.m21229u(parcel, 19, this.f29843B);
        C7140c.m21200G(parcel, 20, this.f29844C, false);
        C7140c.m21225q(parcel, 21, this.f29845D);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public C11502n m36004x1(boolean z10) {
        this.f29854t = z10;
        return this;
    }

    /* renamed from: y1 */
    public float m36005y1() {
        return this.f29858x;
    }

    /* renamed from: z1 */
    public float m36006z1() {
        return this.f29850e;
    }

    public final int zzb() {
        return this.f29843B;
    }
}
