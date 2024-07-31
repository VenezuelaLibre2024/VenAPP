package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13134a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13135b;

    /* renamed from: c, reason: collision with root package name */
    private final zzah f13136c;

    /* renamed from: d, reason: collision with root package name */
    private final zztx f13137d;

    /* renamed from: e, reason: collision with root package name */
    private zzaj f13138e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, vf.b bVar, zztx zztxVar) {
        zzah zzahVar = new zzah();
        this.f13136c = zzahVar;
        this.f13135b = context;
        zzahVar.zza = bVar.a();
        this.f13137d = zztxVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final List a(ag.a aVar) {
        zzu[] zzf;
        com.google.android.gms.dynamic.b h22;
        if (this.f13138e == null) {
            zzc();
        }
        zzaj zzajVar = this.f13138e;
        if (zzajVar == null) {
            throw new qf.a("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) s.j(zzajVar);
        zzan zzanVar = new zzan(aVar.k(), aVar.g(), 0, 0L, bg.b.a(aVar.j()));
        try {
            int f10 = aVar.f();
            if (f10 != -1) {
                if (f10 == 17) {
                    h22 = com.google.android.gms.dynamic.d.h2(aVar.d());
                } else if (f10 == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) s.j(aVar.i());
                    zzanVar.zza = planeArr[0].getRowStride();
                    h22 = com.google.android.gms.dynamic.d.h2(planeArr[0].getBuffer());
                } else {
                    if (f10 != 842094169) {
                        throw new qf.a("Unsupported image format: " + aVar.f(), 3);
                    }
                    h22 = com.google.android.gms.dynamic.d.h2(bg.c.d().c(aVar, false));
                }
                zzf = zzajVar2.zze(h22, zzanVar);
            } else {
                zzf = zzajVar2.zzf(com.google.android.gms.dynamic.d.h2(aVar.c()), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzf) {
                arrayList.add(new xf.a(new zf.d(zzuVar), aVar.e()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new qf.a("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final void zzb() {
        zzaj zzajVar = this.f13138e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f13138e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.j
    public final boolean zzc() {
        if (this.f13138e != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(DynamiteModule.e(this.f13135b, DynamiteModule.f9718b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(com.google.android.gms.dynamic.d.h2(this.f13135b), this.f13136c);
            this.f13138e = zzd;
            if (zzd == null && !this.f13134a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                m.c(this.f13135b, "barcode");
                this.f13134a = true;
                b.e(this.f13137d, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new qf.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f13137d, zzpj.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new qf.a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new qf.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }
}
