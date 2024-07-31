package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.g */
/* loaded from: classes2.dex */
public final class C11488g extends AbstractC7138a {
    public static final Parcelable.Creator<C11488g> CREATOR = new C11505o0();

    /* renamed from: a */
    private LatLng f29824a;

    /* renamed from: b */
    private double f29825b;

    /* renamed from: c */
    private float f29826c;

    /* renamed from: d */
    private int f29827d;

    /* renamed from: e */
    private int f29828e;

    /* renamed from: f */
    private float f29829f;

    /* renamed from: r */
    private boolean f29830r;

    /* renamed from: s */
    private boolean f29831s;

    /* renamed from: t */
    private List f29832t;

    public C11488g() {
        this.f29824a = null;
        this.f29825b = 0.0d;
        this.f29826c = 10.0f;
        this.f29827d = -16777216;
        this.f29828e = 0;
        this.f29829f = 0.0f;
        this.f29830r = true;
        this.f29831s = false;
        this.f29832t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11488g(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f29824a = latLng;
        this.f29825b = d10;
        this.f29826c = f10;
        this.f29827d = i10;
        this.f29828e = i11;
        this.f29829f = f11;
        this.f29830r = z10;
        this.f29831s = z11;
        this.f29832t = list;
    }

    /* renamed from: A1 */
    public int m35947A1() {
        return this.f29827d;
    }

    /* renamed from: B1 */
    public List<C11504o> m35948B1() {
        return this.f29832t;
    }

    /* renamed from: C1 */
    public float m35949C1() {
        return this.f29826c;
    }

    /* renamed from: D1 */
    public float m35950D1() {
        return this.f29829f;
    }

    /* renamed from: E1 */
    public boolean m35951E1() {
        return this.f29831s;
    }

    /* renamed from: F1 */
    public boolean m35952F1() {
        return this.f29830r;
    }

    /* renamed from: G1 */
    public C11488g m35953G1(double d10) {
        this.f29825b = d10;
        return this;
    }

    /* renamed from: H1 */
    public C11488g m35954H1(int i10) {
        this.f29827d = i10;
        return this;
    }

    /* renamed from: I1 */
    public C11488g m35955I1(float f10) {
        this.f29826c = f10;
        return this;
    }

    /* renamed from: J1 */
    public C11488g m35956J1(boolean z10) {
        this.f29830r = z10;
        return this;
    }

    /* renamed from: K1 */
    public C11488g m35957K1(float f10) {
        this.f29829f = f10;
        return this;
    }

    /* renamed from: u1 */
    public C11488g m35958u1(LatLng latLng) {
        C5276s.m13325k(latLng, "center must not be null.");
        this.f29824a = latLng;
        return this;
    }

    /* renamed from: v1 */
    public C11488g m35959v1(boolean z10) {
        this.f29831s = z10;
        return this;
    }

    /* renamed from: w1 */
    public C11488g m35960w1(int i10) {
        this.f29828e = i10;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m35961x1(), i10, false);
        C7140c.m21222n(parcel, 3, m35963z1());
        C7140c.m21225q(parcel, 4, m35949C1());
        C7140c.m21229u(parcel, 5, m35947A1());
        C7140c.m21229u(parcel, 6, m35962y1());
        C7140c.m21225q(parcel, 7, m35950D1());
        C7140c.m21215g(parcel, 8, m35952F1());
        C7140c.m21215g(parcel, 9, m35951E1());
        C7140c.m21204K(parcel, 10, m35948B1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public LatLng m35961x1() {
        return this.f29824a;
    }

    /* renamed from: y1 */
    public int m35962y1() {
        return this.f29828e;
    }

    /* renamed from: z1 */
    public double m35963z1() {
        return this.f29825b;
    }
}
