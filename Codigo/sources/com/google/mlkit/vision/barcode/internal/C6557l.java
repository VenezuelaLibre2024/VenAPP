package com.google.mlkit.vision.barcode.internal;

import ag.C0113a;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import bg.C1778b;
import bg.C1779c;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.sdkinternal.C6531m;
import java.util.ArrayList;
import java.util.List;
import p313qf.C10475a;
import p402vf.C11886b;
import p445xf.C12482a;
import p489zf.C13024d;

/* renamed from: com.google.mlkit.vision.barcode.internal.l */
/* loaded from: classes2.dex */
final class C6557l implements InterfaceC6555j {

    /* renamed from: a */
    private boolean f14408a;

    /* renamed from: b */
    private final Context f14409b;

    /* renamed from: c */
    private final zzah f14410c;

    /* renamed from: d */
    private final zztx f14411d;

    /* renamed from: e */
    private zzaj f14412e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6557l(Context context, C11886b c11886b, zztx zztxVar) {
        zzah zzahVar = new zzah();
        this.f14410c = zzahVar;
        this.f14409b = context;
        zzahVar.zza = c11886b.m38012a();
        this.f14411d = zztxVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    /* renamed from: a */
    public final List mo18363a(C0113a c0113a) {
        zzu[] zzf;
        InterfaceC5312b m13412h2;
        if (this.f14412e == null) {
            zzc();
        }
        zzaj zzajVar = this.f14412e;
        if (zzajVar == null) {
            throw new C10475a("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) C5276s.m13324j(zzajVar);
        zzan zzanVar = new zzan(c0113a.m543k(), c0113a.m539g(), 0, 0L, C1778b.m9490a(c0113a.m542j()));
        try {
            int m538f = c0113a.m538f();
            if (m538f != -1) {
                if (m538f == 17) {
                    m13412h2 = BinderC5314d.m13412h2(c0113a.m536d());
                } else if (m538f == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) C5276s.m13324j(c0113a.m541i());
                    zzanVar.zza = planeArr[0].getRowStride();
                    m13412h2 = BinderC5314d.m13412h2(planeArr[0].getBuffer());
                } else {
                    if (m538f != 842094169) {
                        throw new C10475a("Unsupported image format: " + c0113a.m538f(), 3);
                    }
                    m13412h2 = BinderC5314d.m13412h2(C1779c.m9494d().m9499c(c0113a, false));
                }
                zzf = zzajVar2.zze(m13412h2, zzanVar);
            } else {
                zzf = zzajVar2.zzf(BinderC5314d.m13412h2(c0113a.m535c()), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzf) {
                arrayList.add(new C12482a(new C13024d(zzuVar), c0113a.m537e()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new C10475a("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    public final void zzb() {
        zzaj zzajVar = this.f14412e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f14412e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    public final boolean zzc() {
        if (this.f14412e != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(DynamiteModule.m13418e(this.f14409b, DynamiteModule.f10833b, "com.google.android.gms.vision.dynamite").m13427d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(BinderC5314d.m13412h2(this.f14409b), this.f14410c);
            this.f14412e = zzd;
            if (zzd == null && !this.f14408a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                C6531m.m18330c(this.f14409b, "barcode");
                this.f14408a = true;
                C6547b.m18354e(this.f14411d, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C10475a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            C6547b.m18354e(this.f14411d, zzpj.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new C10475a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.C5324a e11) {
            throw new C10475a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }
}
