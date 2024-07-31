package oc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.d2;
import java.util.List;

/* loaded from: classes.dex */
public final class w1 implements com.google.firebase.auth.i {
    public static final Parcelable.Creator<w1> CREATOR = new z1();

    /* renamed from: a, reason: collision with root package name */
    private d f22473a;

    /* renamed from: b, reason: collision with root package name */
    private u1 f22474b;

    /* renamed from: c, reason: collision with root package name */
    private d2 f22475c;

    public w1(d dVar) {
        d dVar2 = (d) com.google.android.gms.common.internal.s.j(dVar);
        this.f22473a = dVar2;
        List<y1> c22 = dVar2.c2();
        this.f22474b = null;
        for (int i10 = 0; i10 < c22.size(); i10++) {
            if (!TextUtils.isEmpty(c22.get(i10).zza())) {
                this.f22474b = new u1(c22.get(i10).q(), c22.get(i10).zza(), dVar.d2());
            }
        }
        if (this.f22474b == null) {
            this.f22474b = new u1(dVar.d2());
        }
        this.f22475c = dVar.b2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1(d dVar, u1 u1Var, d2 d2Var) {
        this.f22473a = dVar;
        this.f22474b = u1Var;
        this.f22475c = d2Var;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.g W0() {
        return this.f22474b;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.h a1() {
        return this.f22475c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.a0 j0() {
        return this.f22473a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, j0(), i10, false);
        ea.c.E(parcel, 2, W0(), i10, false);
        ea.c.E(parcel, 3, this.f22475c, i10, false);
        ea.c.b(parcel, a10);
    }
}
