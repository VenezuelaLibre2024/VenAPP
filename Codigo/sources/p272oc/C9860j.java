package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzyk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6077i0;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.AbstractC6088k0;
import com.google.firebase.auth.AbstractC6092l0;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6076i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p081ea.C7140c;
import p485zb.C12867g;

/* renamed from: oc.j */
/* loaded from: classes.dex */
public final class C9860j extends AbstractC6088k0 {
    public static final Parcelable.Creator<C9860j> CREATOR = new C9866l();

    /* renamed from: a */
    private final List<C6124t0> f24328a;

    /* renamed from: b */
    private final C9875o f24329b;

    /* renamed from: c */
    private final String f24330c;

    /* renamed from: d */
    private final C6059d2 f24331d;

    /* renamed from: e */
    private final C9842d f24332e;

    /* renamed from: f */
    private final List<C6143y0> f24333f;

    public C9860j(List<C6124t0> list, C9875o c9875o, String str, C6059d2 c6059d2, C9842d c9842d, List<C6143y0> list2) {
        this.f24328a = (List) C5276s.m13324j(list);
        this.f24329b = (C9875o) C5276s.m13324j(c9875o);
        this.f24330c = C5276s.m13320f(str);
        this.f24331d = c6059d2;
        this.f24332e = c9842d;
        this.f24333f = (List) C5276s.m13324j(list2);
    }

    /* renamed from: z1 */
    public static C9860j m29544z1(zzyk zzykVar, FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        List<AbstractC6084j0> zzc = zzykVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (AbstractC6084j0 abstractC6084j0 : zzc) {
            if (abstractC6084j0 instanceof C6124t0) {
                arrayList.add((C6124t0) abstractC6084j0);
            }
        }
        List<AbstractC6084j0> zzc2 = zzykVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC6084j0 abstractC6084j02 : zzc2) {
            if (abstractC6084j02 instanceof C6143y0) {
                arrayList2.add((C6143y0) abstractC6084j02);
            }
        }
        return new C9860j(arrayList, C9875o.m29566w1(zzykVar.zzc(), zzykVar.zzb()), firebaseAuth.m16396i().m42631q(), zzykVar.zza(), (C9842d) abstractC6045a0, arrayList2);
    }

    @Override // com.google.firebase.auth.AbstractC6088k0
    /* renamed from: u1 */
    public final FirebaseAuth mo16559u1() {
        return FirebaseAuth.getInstance(C12867g.m42618p(this.f24330c));
    }

    @Override // com.google.firebase.auth.AbstractC6088k0
    /* renamed from: v1 */
    public final List<AbstractC6084j0> mo16560v1() {
        ArrayList arrayList = new ArrayList();
        Iterator<C6124t0> it = this.f24328a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<C6143y0> it2 = this.f24333f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.AbstractC6088k0
    /* renamed from: w1 */
    public final AbstractC6092l0 mo16561w1() {
        return this.f24329b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f24328a, false);
        C7140c.m21198E(parcel, 2, mo16561w1(), i10, false);
        C7140c.m21200G(parcel, 3, this.f24330c, false);
        C7140c.m21198E(parcel, 4, this.f24331d, i10, false);
        C7140c.m21198E(parcel, 5, this.f24332e, i10, false);
        C7140c.m21204K(parcel, 6, this.f24333f, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // com.google.firebase.auth.AbstractC6088k0
    /* renamed from: x1 */
    public final Task<InterfaceC6076i> mo16562x1(AbstractC6077i0 abstractC6077i0) {
        return mo16559u1().m16380T(abstractC6077i0, this.f24329b, this.f24332e).continueWithTask(new C9869m(this));
    }
}
