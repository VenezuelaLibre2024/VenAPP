package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwc;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements j {

    /* renamed from: h, reason: collision with root package name */
    private static final zzcv f13126h = zzcv.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    private boolean f13127a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13128b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13129c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f13130d;

    /* renamed from: e, reason: collision with root package name */
    private final vf.b f13131e;

    /* renamed from: f, reason: collision with root package name */
    private final zztx f13132f;

    /* renamed from: g, reason: collision with root package name */
    private zzvt f13133g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, vf.b bVar, zztx zztxVar) {
        this.f13130d = context;
        this.f13131e = bVar;
        this.f13132f = zztxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final List a(ag.a aVar) {
        if (this.f13133g == null) {
            zzc();
        }
        zzvt zzvtVar = (zzvt) s.j(this.f13133g);
        if (!this.f13127a) {
            try {
                zzvtVar.zze();
                this.f13127a = true;
            } catch (RemoteException e10) {
                throw new qf.a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int k10 = aVar.k();
        if (aVar.f() == 35) {
            k10 = ((Image.Plane[]) s.j(aVar.i()))[0].getRowStride();
        }
        try {
            List zzd = zzvtVar.zzd(bg.d.b().a(aVar), new zzwc(aVar.f(), k10, aVar.g(), bg.b.a(aVar.j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new xf.a(new zf.c((zzvj) it.next()), aVar.e()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new qf.a("Failed to run barcode scanner.", 13, e11);
        }
    }

    final zzvt c(DynamiteModule.b bVar, String str, String str2) {
        boolean z10;
        zzvw zza = zzvv.zza(DynamiteModule.e(this.f13130d, bVar, str).d(str2));
        com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(this.f13130d);
        int a10 = this.f13131e.a();
        if (this.f13131e.d()) {
            z10 = true;
        } else {
            this.f13131e.b();
            z10 = false;
        }
        return zza.zzd(h22, new zzvl(a10, z10));
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final void zzb() {
        zzvt zzvtVar = this.f13133g;
        if (zzvtVar != null) {
            try {
                zzvtVar.zzf();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f13133g = null;
            this.f13127a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final boolean zzc() {
        if (this.f13133g != null) {
            return this.f13128b;
        }
        if (b(this.f13130d)) {
            this.f13128b = true;
            try {
                this.f13133g = c(DynamiteModule.f9719c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new qf.a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new qf.a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f13128b = false;
            if (!m.a(this.f13130d, f13126h)) {
                if (!this.f13129c) {
                    m.d(this.f13130d, zzcv.zzh("barcode", "tflite_dynamite"));
                    this.f13129c = true;
                }
                b.e(this.f13132f, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new qf.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f13133g = c(DynamiteModule.f9718b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                b.e(this.f13132f, zzpj.OPTIONAL_MODULE_INIT_ERROR);
                throw new qf.a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        b.e(this.f13132f, zzpj.NO_ERROR);
        return this.f13128b;
    }
}
