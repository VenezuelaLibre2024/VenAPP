package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class g extends ea.a {

    /* renamed from: a, reason: collision with root package name */
    final int f9561a;

    /* renamed from: b, reason: collision with root package name */
    final int f9562b;

    /* renamed from: c, reason: collision with root package name */
    final int f9563c;

    /* renamed from: d, reason: collision with root package name */
    String f9564d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f9565e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f9566f;

    /* renamed from: r, reason: collision with root package name */
    Bundle f9567r;

    /* renamed from: s, reason: collision with root package name */
    Account f9568s;

    /* renamed from: t, reason: collision with root package name */
    ca.d[] f9569t;

    /* renamed from: u, reason: collision with root package name */
    ca.d[] f9570u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f9571v;

    /* renamed from: w, reason: collision with root package name */
    final int f9572w;

    /* renamed from: x, reason: collision with root package name */
    boolean f9573x;

    /* renamed from: y, reason: collision with root package name */
    private final String f9574y;
    public static final Parcelable.Creator<g> CREATOR = new p1();

    /* renamed from: z, reason: collision with root package name */
    static final Scope[] f9560z = new Scope[0];
    static final ca.d[] A = new ca.d[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ca.d[] dVarArr, ca.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f9560z : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? A : dVarArr;
        dVarArr2 = dVarArr2 == null ? A : dVarArr2;
        this.f9561a = i10;
        this.f9562b = i11;
        this.f9563c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f9564d = "com.google.android.gms";
        } else {
            this.f9564d = str;
        }
        if (i10 < 2) {
            this.f9568s = iBinder != null ? a.g2(k.a.f2(iBinder)) : null;
        } else {
            this.f9565e = iBinder;
            this.f9568s = account;
        }
        this.f9566f = scopeArr;
        this.f9567r = bundle;
        this.f9569t = dVarArr;
        this.f9570u = dVarArr2;
        this.f9571v = z10;
        this.f9572w = i13;
        this.f9573x = z11;
        this.f9574y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        p1.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f9574y;
    }
}
