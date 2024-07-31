package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;
import p418wa.C12097c;
import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes2.dex */
public final class C5543j4 extends zzbu implements InterfaceC12109i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5543j4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: A0 */
    public final void mo13600A0(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        zzb(20, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: C0 */
    public final void mo13601C0(Bundle bundle, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, bundle);
        zzbw.zza(m13467a_, c5576lb);
        zzb(19, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: D0 */
    public final void mo13602D0(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        zzb(6, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: I1 */
    public final List<C5524hb> mo13603I1(String str, String str2, boolean z10, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        zzbw.zza(m13467a_, z10);
        zzbw.zza(m13467a_, c5576lb);
        Parcel zza = zza(14, m13467a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C5524hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: J */
    public final void mo13604J(long j10, String str, String str2, String str3) {
        Parcel m13467a_ = m13467a_();
        m13467a_.writeLong(j10);
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        m13467a_.writeString(str3);
        zzb(10, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: K */
    public final List<C5460d> mo13605K(String str, String str2, String str3) {
        Parcel m13467a_ = m13467a_();
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        m13467a_.writeString(str3);
        Parcel zza = zza(17, m13467a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C5460d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: N0 */
    public final String mo13606N0(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        Parcel zza = zza(11, m13467a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: P1 */
    public final void mo13607P1(C5461d0 c5461d0, String str, String str2) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5461d0);
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        zzb(5, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: T */
    public final void mo13608T(C5460d c5460d) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5460d);
        zzb(13, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: V0 */
    public final void mo13609V0(C5461d0 c5461d0, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5461d0);
        zzbw.zza(m13467a_, c5576lb);
        zzb(1, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: X */
    public final C12097c mo13610X(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        Parcel zza = zza(21, m13467a_);
        C12097c c12097c = (C12097c) zzbw.zza(zza, C12097c.CREATOR);
        zza.recycle();
        return c12097c;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: a1 */
    public final byte[] mo13611a1(C5461d0 c5461d0, String str) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5461d0);
        m13467a_.writeString(str);
        Parcel zza = zza(9, m13467a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: b2 */
    public final void mo13612b2(C5460d c5460d, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5460d);
        zzbw.zza(m13467a_, c5576lb);
        zzb(12, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: c2 */
    public final void mo13613c2(C5524hb c5524hb, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5524hb);
        zzbw.zza(m13467a_, c5576lb);
        zzb(2, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: d */
    public final List<C5460d> mo13614d(String str, String str2, C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        zzbw.zza(m13467a_, c5576lb);
        Parcel zza = zza(16, m13467a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C5460d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: d1 */
    public final void mo13615d1(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        zzb(4, m13467a_);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: j0 */
    public final List<C5601na> mo13617j0(C5576lb c5576lb, Bundle bundle) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        zzbw.zza(m13467a_, bundle);
        Parcel zza = zza(24, m13467a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C5601na.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: p */
    public final List<C5524hb> mo13621p(String str, String str2, String str3, boolean z10) {
        Parcel m13467a_ = m13467a_();
        m13467a_.writeString(str);
        m13467a_.writeString(str2);
        m13467a_.writeString(str3);
        zzbw.zza(m13467a_, z10);
        Parcel zza = zza(15, m13467a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C5524hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: t0 */
    public final void mo13622t0(C5576lb c5576lb) {
        Parcel m13467a_ = m13467a_();
        zzbw.zza(m13467a_, c5576lb);
        zzb(18, m13467a_);
    }
}
