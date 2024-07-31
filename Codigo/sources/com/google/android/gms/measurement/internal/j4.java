package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j4 extends zzbu implements wa.i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // wa.i
    public final void A0(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        zzb(20, a_);
    }

    @Override // wa.i
    public final void C0(Bundle bundle, lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, lbVar);
        zzb(19, a_);
    }

    @Override // wa.i
    public final void D0(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        zzb(6, a_);
    }

    @Override // wa.i
    public final List<hb> I1(String str, String str2, boolean z10, lb lbVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, lbVar);
        Parcel zza = zza(14, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // wa.i
    public final void J(long j10, String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeLong(j10);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    @Override // wa.i
    public final List<d> K(String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // wa.i
    public final String N0(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // wa.i
    public final void P1(d0 d0Var, String str, String str2) {
        Parcel a_ = a_();
        zzbw.zza(a_, d0Var);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    @Override // wa.i
    public final void T(d dVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, dVar);
        zzb(13, a_);
    }

    @Override // wa.i
    public final void V0(d0 d0Var, lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, d0Var);
        zzbw.zza(a_, lbVar);
        zzb(1, a_);
    }

    @Override // wa.i
    public final wa.c X(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        Parcel zza = zza(21, a_);
        wa.c cVar = (wa.c) zzbw.zza(zza, wa.c.CREATOR);
        zza.recycle();
        return cVar;
    }

    @Override // wa.i
    public final byte[] a1(d0 d0Var, String str) {
        Parcel a_ = a_();
        zzbw.zza(a_, d0Var);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // wa.i
    public final void b2(d dVar, lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, dVar);
        zzbw.zza(a_, lbVar);
        zzb(12, a_);
    }

    @Override // wa.i
    public final void c2(hb hbVar, lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, hbVar);
        zzbw.zza(a_, lbVar);
        zzb(2, a_);
    }

    @Override // wa.i
    public final List<d> d(String str, String str2, lb lbVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, lbVar);
        Parcel zza = zza(16, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // wa.i
    public final void d1(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        zzb(4, a_);
    }

    @Override // wa.i
    public final List<na> j0(lb lbVar, Bundle bundle) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        zzbw.zza(a_, bundle);
        Parcel zza = zza(24, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(na.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // wa.i
    public final List<hb> p(String str, String str2, String str3, boolean z10) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzbw.zza(a_, z10);
        Parcel zza = zza(15, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // wa.i
    public final void t0(lb lbVar) {
        Parcel a_ = a_();
        zzbw.zza(a_, lbVar);
        zzb(18, a_);
    }
}
