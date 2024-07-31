package p272oc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import com.google.android.gms.internal.p498firebaseauthapi.zzafq;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6073h0;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.C6053c0;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.InterfaceC6049b0;
import com.google.firebase.auth.InterfaceC6054c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p081ea.C7140c;
import p485zb.C12867g;

/* renamed from: oc.d */
/* loaded from: classes.dex */
public class C9842d extends AbstractC6045a0 {
    public static final Parcelable.Creator<C9842d> CREATOR = new C9851g();

    /* renamed from: a */
    private zzafn f24287a;

    /* renamed from: b */
    private C9907y1 f24288b;

    /* renamed from: c */
    private String f24289c;

    /* renamed from: d */
    private String f24290d;

    /* renamed from: e */
    private List<C9907y1> f24291e;

    /* renamed from: f */
    private List<String> f24292f;

    /* renamed from: r */
    private String f24293r;

    /* renamed from: s */
    private Boolean f24294s;

    /* renamed from: t */
    private C9848f f24295t;

    /* renamed from: u */
    private boolean f24296u;

    /* renamed from: v */
    private C6059d2 f24297v;

    /* renamed from: w */
    private C9867l0 f24298w;

    /* renamed from: x */
    private List<zzafq> f24299x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9842d(zzafn zzafnVar, C9907y1 c9907y1, String str, String str2, List<C9907y1> list, List<String> list2, String str3, Boolean bool, C9848f c9848f, boolean z10, C6059d2 c6059d2, C9867l0 c9867l0, List<zzafq> list3) {
        this.f24287a = zzafnVar;
        this.f24288b = c9907y1;
        this.f24289c = str;
        this.f24290d = str2;
        this.f24291e = list;
        this.f24292f = list2;
        this.f24293r = str3;
        this.f24294s = bool;
        this.f24295t = c9848f;
        this.f24296u = z10;
        this.f24297v = c6059d2;
        this.f24298w = c9867l0;
        this.f24299x = list3;
    }

    public C9842d(C12867g c12867g, List<? extends InterfaceC6054c1> list) {
        C5276s.m13324j(c12867g);
        this.f24289c = c12867g.m42631q();
        this.f24290d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f24293r = "2";
        mo16446P1(list);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: A1 */
    public boolean mo16430A1() {
        C6053c0 m29540a;
        Boolean bool = this.f24294s;
        if (bool == null || bool.booleanValue()) {
            zzafn zzafnVar = this.f24287a;
            String str = "";
            if (zzafnVar != null && (m29540a = C9855h0.m29540a(zzafnVar.zzc())) != null) {
                str = m29540a.m16475e();
            }
            boolean z10 = true;
            if (mo16461y1().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f24294s = Boolean.valueOf(z10);
        }
        return this.f24294s.booleanValue();
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: B0 */
    public boolean mo16478B0() {
        return this.f24288b.mo16478B0();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0, com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: E */
    public String mo16434E() {
        return this.f24288b.mo16434E();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: P1 */
    public final synchronized AbstractC6045a0 mo16446P1(List<? extends InterfaceC6054c1> list) {
        C5276s.m13324j(list);
        this.f24291e = new ArrayList(list.size());
        this.f24292f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6054c1 interfaceC6054c1 = list.get(i10);
            if (interfaceC6054c1.mo16479q().equals("firebase")) {
                this.f24288b = (C9907y1) interfaceC6054c1;
            } else {
                this.f24292f.add(interfaceC6054c1.mo16479q());
            }
            this.f24291e.add((C9907y1) interfaceC6054c1);
        }
        if (this.f24288b == null) {
            this.f24288b = this.f24291e.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: Q1 */
    public final C12867g mo16447Q1() {
        return C12867g.m42618p(this.f24289c);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0, com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: R */
    public String mo16448R() {
        return this.f24288b.mo16448R();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: R1 */
    public final void mo16449R1(zzafn zzafnVar) {
        this.f24287a = (zzafn) C5276s.m13324j(zzafnVar);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: S1 */
    public final /* synthetic */ AbstractC6045a0 mo16450S1() {
        this.f24294s = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: T1 */
    public final void mo16451T1(List<AbstractC6084j0> list) {
        this.f24298w = C9867l0.m29552v1(list);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: U1 */
    public final zzafn mo16452U1() {
        return this.f24287a;
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: V1 */
    public final List<String> mo16453V1() {
        return this.f24292f;
    }

    /* renamed from: W1 */
    public final C9842d m29508W1(String str) {
        this.f24293r = str;
        return this;
    }

    /* renamed from: X1 */
    public final void m29509X1(C6059d2 c6059d2) {
        this.f24297v = c6059d2;
    }

    /* renamed from: Y1 */
    public final void m29510Y1(C9848f c9848f) {
        this.f24295t = c9848f;
    }

    /* renamed from: Z1 */
    public final void m29511Z1(boolean z10) {
        this.f24296u = z10;
    }

    /* renamed from: a2 */
    public final void m29512a2(List<zzafq> list) {
        C5276s.m13324j(list);
        this.f24299x = list;
    }

    /* renamed from: b2 */
    public final C6059d2 m29513b2() {
        return this.f24297v;
    }

    /* renamed from: c2 */
    public final List<C9907y1> m29514c2() {
        return this.f24291e;
    }

    /* renamed from: d2 */
    public final boolean m29515d2() {
        return this.f24296u;
    }

    @Override // com.google.firebase.auth.AbstractC6045a0, com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: l */
    public String mo16454l() {
        return this.f24288b.mo16454l();
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: q */
    public String mo16479q() {
        return this.f24288b.mo16479q();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0, com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: r */
    public String mo16455r() {
        return this.f24288b.mo16455r();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0, com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: v0 */
    public Uri mo16457v0() {
        return this.f24288b.mo16457v0();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: w1 */
    public InterfaceC6049b0 mo16459w1() {
        return this.f24295t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, mo16452U1(), i10, false);
        C7140c.m21198E(parcel, 2, this.f24288b, i10, false);
        C7140c.m21200G(parcel, 3, this.f24289c, false);
        C7140c.m21200G(parcel, 4, this.f24290d, false);
        C7140c.m21204K(parcel, 5, this.f24291e, false);
        C7140c.m21202I(parcel, 6, mo16453V1(), false);
        C7140c.m21200G(parcel, 7, this.f24293r, false);
        C7140c.m21217i(parcel, 8, Boolean.valueOf(mo16430A1()), false);
        C7140c.m21198E(parcel, 9, mo16459w1(), i10, false);
        C7140c.m21215g(parcel, 10, this.f24296u);
        C7140c.m21198E(parcel, 11, this.f24297v, i10, false);
        C7140c.m21198E(parcel, 12, this.f24298w, i10, false);
        C7140c.m21204K(parcel, 13, this.f24299x, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: x1 */
    public /* synthetic */ AbstractC6073h0 mo16460x1() {
        return new C9854h(this);
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: y1 */
    public List<? extends InterfaceC6054c1> mo16461y1() {
        return this.f24291e;
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    /* renamed from: z1 */
    public String mo16462z1() {
        Map map;
        zzafn zzafnVar = this.f24287a;
        if (zzafnVar == null || zzafnVar.zzc() == null || (map = (Map) C9855h0.m29540a(this.f24287a.zzc()).m16472b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    public final String zzd() {
        return mo16452U1().zzc();
    }

    @Override // com.google.firebase.auth.AbstractC6045a0
    public final String zze() {
        return this.f24287a.zzf();
    }

    public final List<AbstractC6084j0> zzh() {
        C9867l0 c9867l0 = this.f24298w;
        return c9867l0 != null ? c9867l0.m29553u1() : new ArrayList();
    }
}
