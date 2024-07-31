package com.google.mlkit.vision.barcode.internal;

import ag.C0113a;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import bg.C1778b;
import bg.C1780d;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
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
import com.google.mlkit.common.sdkinternal.C6531m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p313qf.C10475a;
import p402vf.C11886b;
import p445xf.C12482a;
import p489zf.C13023c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.mlkit.vision.barcode.internal.k */
/* loaded from: classes2.dex */
public final class C6556k implements InterfaceC6555j {

    /* renamed from: h */
    private static final zzcv f14400h = zzcv.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a */
    private boolean f14401a;

    /* renamed from: b */
    private boolean f14402b;

    /* renamed from: c */
    private boolean f14403c;

    /* renamed from: d */
    private final Context f14404d;

    /* renamed from: e */
    private final C11886b f14405e;

    /* renamed from: f */
    private final zztx f14406f;

    /* renamed from: g */
    private zzvt f14407g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6556k(Context context, C11886b c11886b, zztx zztxVar) {
        this.f14404d = context;
        this.f14405e = c11886b;
        this.f14406f = zztxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18364b(Context context) {
        return DynamiteModule.m13416a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    /* renamed from: a */
    public final List mo18363a(C0113a c0113a) {
        if (this.f14407g == null) {
            zzc();
        }
        zzvt zzvtVar = (zzvt) C5276s.m13324j(this.f14407g);
        if (!this.f14401a) {
            try {
                zzvtVar.zze();
                this.f14401a = true;
            } catch (RemoteException e10) {
                throw new C10475a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int m543k = c0113a.m543k();
        if (c0113a.m538f() == 35) {
            m543k = ((Image.Plane[]) C5276s.m13324j(c0113a.m541i()))[0].getRowStride();
        }
        try {
            List zzd = zzvtVar.zzd(C1780d.m9501b().m9502a(c0113a), new zzwc(c0113a.m538f(), m543k, c0113a.m539g(), C1778b.m9490a(c0113a.m542j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12482a(new C13023c((zzvj) it.next()), c0113a.m537e()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new C10475a("Failed to run barcode scanner.", 13, e11);
        }
    }

    /* renamed from: c */
    final zzvt m18365c(DynamiteModule.InterfaceC5325b interfaceC5325b, String str, String str2) {
        boolean z10;
        zzvw zza = zzvv.zza(DynamiteModule.m13418e(this.f14404d, interfaceC5325b, str).m13427d(str2));
        InterfaceC5312b m13412h2 = BinderC5314d.m13412h2(this.f14404d);
        int m38012a = this.f14405e.m38012a();
        if (this.f14405e.m38015d()) {
            z10 = true;
        } else {
            this.f14405e.m38013b();
            z10 = false;
        }
        return zza.zzd(m13412h2, new zzvl(m38012a, z10));
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    public final void zzb() {
        zzvt zzvtVar = this.f14407g;
        if (zzvtVar != null) {
            try {
                zzvtVar.zzf();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f14407g = null;
            this.f14401a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6555j
    public final boolean zzc() {
        if (this.f14407g != null) {
            return this.f14402b;
        }
        if (m18364b(this.f14404d)) {
            this.f14402b = true;
            try {
                this.f14407g = m18365c(DynamiteModule.f10834c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new C10475a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.C5324a e11) {
                throw new C10475a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f14402b = false;
            if (!C6531m.m18328a(this.f14404d, f14400h)) {
                if (!this.f14403c) {
                    C6531m.m18331d(this.f14404d, zzcv.zzh("barcode", "tflite_dynamite"));
                    this.f14403c = true;
                }
                C6547b.m18354e(this.f14406f, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C10475a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f14407g = m18365c(DynamiteModule.f10833b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.C5324a e12) {
                C6547b.m18354e(this.f14406f, zzpj.OPTIONAL_MODULE_INIT_ERROR);
                throw new C10475a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        C6547b.m18354e(this.f14406f, zzpj.NO_ERROR);
        return this.f14402b;
    }
}
