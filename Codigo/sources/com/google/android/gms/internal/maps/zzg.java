package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import ua.p;

/* loaded from: classes2.dex */
public final class zzg extends zza implements zzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzd() {
        Parcel zzJ = zzJ(4, zza());
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zze(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(2, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzg(Bitmap bitmap) {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        Parcel zzJ = zzJ(6, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(3, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(7, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzj(p pVar) {
        Parcel zza = zza();
        zzc.zzd(zza, pVar);
        Parcel zzJ = zzJ(8, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final b zzk(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        Parcel zzJ = zzJ(1, zza);
        b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }
}
