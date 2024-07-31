package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC5252k;
import p081ea.AbstractC7138a;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes.dex */
public class C5240g extends AbstractC7138a {

    /* renamed from: a */
    final int f10676a;

    /* renamed from: b */
    final int f10677b;

    /* renamed from: c */
    final int f10678c;

    /* renamed from: d */
    String f10679d;

    /* renamed from: e */
    IBinder f10680e;

    /* renamed from: f */
    Scope[] f10681f;

    /* renamed from: r */
    Bundle f10682r;

    /* renamed from: s */
    Account f10683s;

    /* renamed from: t */
    C1898d[] f10684t;

    /* renamed from: u */
    C1898d[] f10685u;

    /* renamed from: v */
    final boolean f10686v;

    /* renamed from: w */
    final int f10687w;

    /* renamed from: x */
    boolean f10688x;

    /* renamed from: y */
    private final String f10689y;
    public static final Parcelable.Creator<C5240g> CREATOR = new C5269p1();

    /* renamed from: z */
    static final Scope[] f10675z = new Scope[0];

    /* renamed from: A */
    static final C1898d[] f10674A = new C1898d[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5240g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1898d[] c1898dArr, C1898d[] c1898dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f10675z : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1898dArr = c1898dArr == null ? f10674A : c1898dArr;
        c1898dArr2 = c1898dArr2 == null ? f10674A : c1898dArr2;
        this.f10676a = i10;
        this.f10677b = i11;
        this.f10678c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f10679d = "com.google.android.gms";
        } else {
            this.f10679d = str;
        }
        if (i10 < 2) {
            this.f10683s = iBinder != null ? BinderC5220a.m13222g2(InterfaceC5252k.a.m13292f2(iBinder)) : null;
        } else {
            this.f10680e = iBinder;
            this.f10683s = account;
        }
        this.f10681f = scopeArr;
        this.f10682r = bundle;
        this.f10684t = c1898dArr;
        this.f10685u = c1898dArr2;
        this.f10686v = z10;
        this.f10687w = i13;
        this.f10688x = z11;
        this.f10689y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5269p1.m13302a(this, parcel, i10);
    }

    public final String zza() {
        return this.f10689y;
    }
}
