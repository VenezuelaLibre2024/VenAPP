package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new f2();

    /* renamed from: a, reason: collision with root package name */
    private final String f11726a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str) {
        this.f11726a = com.google.android.gms.common.internal.s.f(str);
    }

    public static zzagt x1(l lVar, String str) {
        com.google.android.gms.common.internal.s.j(lVar);
        return new zzagt(null, lVar.f11726a, lVar.u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new l(this.f11726a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11726a, false);
        ea.c.b(parcel, a10);
    }
}
