package oc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzafq;
import com.google.firebase.auth.d2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends com.google.firebase.auth.a0 {
    public static final Parcelable.Creator<d> CREATOR = new g();

    /* renamed from: a */
    private zzafn f22354a;

    /* renamed from: b */
    private y1 f22355b;

    /* renamed from: c */
    private String f22356c;

    /* renamed from: d */
    private String f22357d;

    /* renamed from: e */
    private List<y1> f22358e;

    /* renamed from: f */
    private List<String> f22359f;

    /* renamed from: r */
    private String f22360r;

    /* renamed from: s */
    private Boolean f22361s;

    /* renamed from: t */
    private f f22362t;

    /* renamed from: u */
    private boolean f22363u;

    /* renamed from: v */
    private d2 f22364v;

    /* renamed from: w */
    private l0 f22365w;

    /* renamed from: x */
    private List<zzafq> f22366x;

    public d(zzafn zzafnVar, y1 y1Var, String str, String str2, List<y1> list, List<String> list2, String str3, Boolean bool, f fVar, boolean z10, d2 d2Var, l0 l0Var, List<zzafq> list3) {
        this.f22354a = zzafnVar;
        this.f22355b = y1Var;
        this.f22356c = str;
        this.f22357d = str2;
        this.f22358e = list;
        this.f22359f = list2;
        this.f22360r = str3;
        this.f22361s = bool;
        this.f22362t = fVar;
        this.f22363u = z10;
        this.f22364v = d2Var;
        this.f22365w = l0Var;
        this.f22366x = list3;
    }

    public d(zb.g gVar, List<? extends com.google.firebase.auth.c1> list) {
        com.google.android.gms.common.internal.s.j(gVar);
        this.f22356c = gVar.q();
        this.f22357d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f22360r = "2";
        P1(list);
    }

    @Override // com.google.firebase.auth.a0
    public boolean A1() {
        com.google.firebase.auth.c0 a10;
        Boolean bool = this.f22361s;
        if (bool == null || bool.booleanValue()) {
            zzafn zzafnVar = this.f22354a;
            String str = "";
            if (zzafnVar != null && (a10 = h0.a(zzafnVar.zzc())) != null) {
                str = a10.e();
            }
            boolean z10 = true;
            if (y1().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f22361s = Boolean.valueOf(z10);
        }
        return this.f22361s.booleanValue();
    }

    @Override // com.google.firebase.auth.c1
    public boolean B0() {
        return this.f22355b.B0();
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.c1
    public String E() {
        return this.f22355b.E();
    }

    @Override // com.google.firebase.auth.a0
    public final synchronized com.google.firebase.auth.a0 P1(List<? extends com.google.firebase.auth.c1> list) {
        com.google.android.gms.common.internal.s.j(list);
        this.f22358e = new ArrayList(list.size());
        this.f22359f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.firebase.auth.c1 c1Var = list.get(i10);
            if (c1Var.q().equals("firebase")) {
                this.f22355b = (y1) c1Var;
            } else {
                this.f22359f.add(c1Var.q());
            }
            this.f22358e.add((y1) c1Var);
        }
        if (this.f22355b == null) {
            this.f22355b = this.f22358e.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.a0
    public final zb.g Q1() {
        return zb.g.p(this.f22356c);
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.c1
    public String R() {
        return this.f22355b.R();
    }

    @Override // com.google.firebase.auth.a0
    public final void R1(zzafn zzafnVar) {
        this.f22354a = (zzafn) com.google.android.gms.common.internal.s.j(zzafnVar);
    }

    @Override // com.google.firebase.auth.a0
    public final /* synthetic */ com.google.firebase.auth.a0 S1() {
        this.f22361s = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.a0
    public final void T1(List<com.google.firebase.auth.j0> list) {
        this.f22365w = l0.v1(list);
    }

    @Override // com.google.firebase.auth.a0
    public final zzafn U1() {
        return this.f22354a;
    }

    @Override // com.google.firebase.auth.a0
    public final List<String> V1() {
        return this.f22359f;
    }

    public final d W1(String str) {
        this.f22360r = str;
        return this;
    }

    public final void X1(d2 d2Var) {
        this.f22364v = d2Var;
    }

    public final void Y1(f fVar) {
        this.f22362t = fVar;
    }

    public final void Z1(boolean z10) {
        this.f22363u = z10;
    }

    public final void a2(List<zzafq> list) {
        com.google.android.gms.common.internal.s.j(list);
        this.f22366x = list;
    }

    public final d2 b2() {
        return this.f22364v;
    }

    public final List<y1> c2() {
        return this.f22358e;
    }

    public final boolean d2() {
        return this.f22363u;
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.c1
    public String l() {
        return this.f22355b.l();
    }

    @Override // com.google.firebase.auth.c1
    public String q() {
        return this.f22355b.q();
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.c1
    public String r() {
        return this.f22355b.r();
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.c1
    public Uri v0() {
        return this.f22355b.v0();
    }

    @Override // com.google.firebase.auth.a0
    public com.google.firebase.auth.b0 w1() {
        return this.f22362t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, U1(), i10, false);
        ea.c.E(parcel, 2, this.f22355b, i10, false);
        ea.c.G(parcel, 3, this.f22356c, false);
        ea.c.G(parcel, 4, this.f22357d, false);
        ea.c.K(parcel, 5, this.f22358e, false);
        ea.c.I(parcel, 6, V1(), false);
        ea.c.G(parcel, 7, this.f22360r, false);
        ea.c.i(parcel, 8, Boolean.valueOf(A1()), false);
        ea.c.E(parcel, 9, w1(), i10, false);
        ea.c.g(parcel, 10, this.f22363u);
        ea.c.E(parcel, 11, this.f22364v, i10, false);
        ea.c.E(parcel, 12, this.f22365w, i10, false);
        ea.c.K(parcel, 13, this.f22366x, false);
        ea.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.a0
    public /* synthetic */ com.google.firebase.auth.h0 x1() {
        return new h(this);
    }

    @Override // com.google.firebase.auth.a0
    public List<? extends com.google.firebase.auth.c1> y1() {
        return this.f22358e;
    }

    @Override // com.google.firebase.auth.a0
    public String z1() {
        Map map;
        zzafn zzafnVar = this.f22354a;
        if (zzafnVar == null || zzafnVar.zzc() == null || (map = (Map) h0.a(this.f22354a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.a0
    public final String zzd() {
        return U1().zzc();
    }

    @Override // com.google.firebase.auth.a0
    public final String zze() {
        return this.f22354a.zzf();
    }

    public final List<com.google.firebase.auth.j0> zzh() {
        l0 l0Var = this.f22365w;
        return l0Var != null ? l0Var.u1() : new ArrayList();
    }
}
