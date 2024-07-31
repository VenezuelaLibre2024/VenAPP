package oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzyk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.d2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends com.google.firebase.auth.k0 {
    public static final Parcelable.Creator<j> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.firebase.auth.t0> f22395a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22396b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22397c;

    /* renamed from: d, reason: collision with root package name */
    private final d2 f22398d;

    /* renamed from: e, reason: collision with root package name */
    private final d f22399e;

    /* renamed from: f, reason: collision with root package name */
    private final List<com.google.firebase.auth.y0> f22400f;

    public j(List<com.google.firebase.auth.t0> list, o oVar, String str, d2 d2Var, d dVar, List<com.google.firebase.auth.y0> list2) {
        this.f22395a = (List) com.google.android.gms.common.internal.s.j(list);
        this.f22396b = (o) com.google.android.gms.common.internal.s.j(oVar);
        this.f22397c = com.google.android.gms.common.internal.s.f(str);
        this.f22398d = d2Var;
        this.f22399e = dVar;
        this.f22400f = (List) com.google.android.gms.common.internal.s.j(list2);
    }

    public static j z1(zzyk zzykVar, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        List<com.google.firebase.auth.j0> zzc = zzykVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var : zzc) {
            if (j0Var instanceof com.google.firebase.auth.t0) {
                arrayList.add((com.google.firebase.auth.t0) j0Var);
            }
        }
        List<com.google.firebase.auth.j0> zzc2 = zzykVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var2 : zzc2) {
            if (j0Var2 instanceof com.google.firebase.auth.y0) {
                arrayList2.add((com.google.firebase.auth.y0) j0Var2);
            }
        }
        return new j(arrayList, o.w1(zzykVar.zzc(), zzykVar.zzb()), firebaseAuth.i().q(), zzykVar.zza(), (d) a0Var, arrayList2);
    }

    @Override // com.google.firebase.auth.k0
    public final FirebaseAuth u1() {
        return FirebaseAuth.getInstance(zb.g.p(this.f22397c));
    }

    @Override // com.google.firebase.auth.k0
    public final List<com.google.firebase.auth.j0> v1() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.firebase.auth.t0> it = this.f22395a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<com.google.firebase.auth.y0> it2 = this.f22400f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.k0
    public final com.google.firebase.auth.l0 w1() {
        return this.f22396b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f22395a, false);
        ea.c.E(parcel, 2, w1(), i10, false);
        ea.c.G(parcel, 3, this.f22397c, false);
        ea.c.E(parcel, 4, this.f22398d, i10, false);
        ea.c.E(parcel, 5, this.f22399e, i10, false);
        ea.c.K(parcel, 6, this.f22400f, false);
        ea.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.k0
    public final Task<com.google.firebase.auth.i> x1(com.google.firebase.auth.i0 i0Var) {
        return u1().T(i0Var, this.f22396b, this.f22399e).continueWithTask(new m(this));
    }
}
