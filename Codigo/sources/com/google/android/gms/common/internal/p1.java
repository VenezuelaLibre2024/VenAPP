package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class p1 implements Parcelable.Creator {
    public static void a(g gVar, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, gVar.f9561a);
        ea.c.u(parcel, 2, gVar.f9562b);
        ea.c.u(parcel, 3, gVar.f9563c);
        ea.c.G(parcel, 4, gVar.f9564d, false);
        ea.c.t(parcel, 5, gVar.f9565e, false);
        ea.c.J(parcel, 6, gVar.f9566f, i10, false);
        ea.c.j(parcel, 7, gVar.f9567r, false);
        ea.c.E(parcel, 8, gVar.f9568s, i10, false);
        ea.c.J(parcel, 10, gVar.f9569t, i10, false);
        ea.c.J(parcel, 11, gVar.f9570u, i10, false);
        ea.c.g(parcel, 12, gVar.f9571v);
        ea.c.u(parcel, 13, gVar.f9572w);
        ea.c.g(parcel, 14, gVar.f9573x);
        ea.c.G(parcel, 15, gVar.zza(), false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Scope[] scopeArr = g.f9560z;
        Bundle bundle = new Bundle();
        ca.d[] dVarArr = g.A;
        ca.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 3:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 4:
                    str = ea.b.q(parcel, E);
                    break;
                case 5:
                    iBinder = ea.b.F(parcel, E);
                    break;
                case 6:
                    scopeArr = (Scope[]) ea.b.t(parcel, E, Scope.CREATOR);
                    break;
                case 7:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 8:
                    account = (Account) ea.b.p(parcel, E, Account.CREATOR);
                    break;
                case 9:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 10:
                    dVarArr = (ca.d[]) ea.b.t(parcel, E, ca.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (ca.d[]) ea.b.t(parcel, E, ca.d.CREATOR);
                    break;
                case 12:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 13:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 14:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 15:
                    str2 = ea.b.q(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
