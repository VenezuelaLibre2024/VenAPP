package oc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends com.google.firebase.auth.l0 {
    public static final Parcelable.Creator<o> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    private String f22421a;

    /* renamed from: b, reason: collision with root package name */
    private String f22422b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.google.firebase.auth.t0> f22423c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.google.firebase.auth.y0> f22424d;

    /* renamed from: e, reason: collision with root package name */
    private d f22425e;

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str, String str2, List<com.google.firebase.auth.t0> list, List<com.google.firebase.auth.y0> list2, d dVar) {
        this.f22421a = str;
        this.f22422b = str2;
        this.f22423c = list;
        this.f22424d = list2;
        this.f22425e = dVar;
    }

    public static o v1(String str, d dVar) {
        com.google.android.gms.common.internal.s.f(str);
        o oVar = new o();
        oVar.f22421a = str;
        oVar.f22425e = dVar;
        return oVar;
    }

    public static o w1(List<com.google.firebase.auth.j0> list, String str) {
        List list2;
        ea.a aVar;
        com.google.android.gms.common.internal.s.j(list);
        com.google.android.gms.common.internal.s.f(str);
        o oVar = new o();
        oVar.f22423c = new ArrayList();
        oVar.f22424d = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var : list) {
            if (j0Var instanceof com.google.firebase.auth.t0) {
                list2 = oVar.f22423c;
                aVar = (com.google.firebase.auth.t0) j0Var;
            } else {
                if (!(j0Var instanceof com.google.firebase.auth.y0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + j0Var.v1());
                }
                list2 = oVar.f22424d;
                aVar = (com.google.firebase.auth.y0) j0Var;
            }
            list2.add(aVar);
        }
        oVar.f22422b = str;
        return oVar;
    }

    public final d u1() {
        return this.f22425e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f22421a, false);
        ea.c.G(parcel, 2, this.f22422b, false);
        ea.c.K(parcel, 3, this.f22423c, false);
        ea.c.K(parcel, 4, this.f22424d, false);
        ea.c.E(parcel, 5, this.f22425e, i10, false);
        ea.c.b(parcel, a10);
    }

    public final String zzb() {
        return this.f22421a;
    }

    public final String zzc() {
        return this.f22422b;
    }

    public final boolean zzd() {
        return this.f22421a != null;
    }
}
