package com.google.mlkit.vision.barcode.internal;

import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqa;
import com.google.android.gms.internal.mlkit_vision_barcode.zzte;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzth;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.mlkit.common.sdkinternal.C6524i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p402vf.C11886b;

/* renamed from: com.google.mlkit.vision.barcode.internal.b */
/* loaded from: classes2.dex */
public final class C6547b {

    /* renamed from: a */
    private static final SparseArray f14373a;

    /* renamed from: b */
    private static final SparseArray f14374b;

    /* renamed from: c */
    static final AtomicReference f14375c;

    /* renamed from: d */
    private static final Map f14376d;

    static {
        SparseArray sparseArray = new SparseArray();
        f14373a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f14374b = sparseArray2;
        f14375c = new AtomicReference();
        sparseArray.put(-1, zzpv.FORMAT_UNKNOWN);
        sparseArray.put(1, zzpv.FORMAT_CODE_128);
        sparseArray.put(2, zzpv.FORMAT_CODE_39);
        sparseArray.put(4, zzpv.FORMAT_CODE_93);
        sparseArray.put(8, zzpv.FORMAT_CODABAR);
        sparseArray.put(16, zzpv.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzpv.FORMAT_EAN_13);
        sparseArray.put(64, zzpv.FORMAT_EAN_8);
        sparseArray.put(RecognitionOptions.ITF, zzpv.FORMAT_ITF);
        sparseArray.put(RecognitionOptions.QR_CODE, zzpv.FORMAT_QR_CODE);
        sparseArray.put(RecognitionOptions.UPC_A, zzpv.FORMAT_UPC_A);
        sparseArray.put(RecognitionOptions.UPC_E, zzpv.FORMAT_UPC_E);
        sparseArray.put(RecognitionOptions.PDF417, zzpv.FORMAT_PDF417);
        sparseArray.put(RecognitionOptions.AZTEC, zzpv.FORMAT_AZTEC);
        sparseArray2.put(0, zzpw.TYPE_UNKNOWN);
        sparseArray2.put(1, zzpw.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzpw.TYPE_EMAIL);
        sparseArray2.put(3, zzpw.TYPE_ISBN);
        sparseArray2.put(4, zzpw.TYPE_PHONE);
        sparseArray2.put(5, zzpw.TYPE_PRODUCT);
        sparseArray2.put(6, zzpw.TYPE_SMS);
        sparseArray2.put(7, zzpw.TYPE_TEXT);
        sparseArray2.put(8, zzpw.TYPE_URL);
        sparseArray2.put(9, zzpw.TYPE_WIFI);
        sparseArray2.put(10, zzpw.TYPE_GEO);
        sparseArray2.put(11, zzpw.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzpw.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f14376d = hashMap;
        hashMap.put(1, zzte.CODE_128);
        hashMap.put(2, zzte.CODE_39);
        hashMap.put(4, zzte.CODE_93);
        hashMap.put(8, zzte.CODABAR);
        hashMap.put(16, zzte.DATA_MATRIX);
        hashMap.put(32, zzte.EAN_13);
        hashMap.put(64, zzte.EAN_8);
        hashMap.put(Integer.valueOf(RecognitionOptions.ITF), zzte.ITF);
        hashMap.put(Integer.valueOf(RecognitionOptions.QR_CODE), zzte.QR_CODE);
        hashMap.put(Integer.valueOf(RecognitionOptions.UPC_A), zzte.UPC_A);
        hashMap.put(Integer.valueOf(RecognitionOptions.UPC_E), zzte.UPC_E);
        hashMap.put(Integer.valueOf(RecognitionOptions.PDF417), zzte.PDF417);
        hashMap.put(Integer.valueOf(RecognitionOptions.AZTEC), zzte.AZTEC);
    }

    /* renamed from: a */
    public static zzpv m18350a(int i10) {
        zzpv zzpvVar = (zzpv) f14373a.get(i10);
        return zzpvVar == null ? zzpv.FORMAT_UNKNOWN : zzpvVar;
    }

    /* renamed from: b */
    public static zzpw m18351b(int i10) {
        zzpw zzpwVar = (zzpw) f14374b.get(i10);
        return zzpwVar == null ? zzpw.TYPE_UNKNOWN : zzpwVar;
    }

    /* renamed from: c */
    public static zzth m18352c(C11886b c11886b) {
        int m38012a = c11886b.m38012a();
        zzcs zzcsVar = new zzcs();
        if (m38012a == 0) {
            zzcsVar.zze(f14376d.values());
        } else {
            for (Map.Entry entry : f14376d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & m38012a) != 0) {
                    zzcsVar.zzd((zzte) entry.getValue());
                }
            }
        }
        zztf zztfVar = new zztf();
        zztfVar.zzb(zzcsVar.zzf());
        return zztfVar.zzc();
    }

    /* renamed from: d */
    public static String m18353d() {
        return true != m18355f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m18354e(zztx zztxVar, final zzpj zzpjVar) {
        zztxVar.zzf(new zztw() { // from class: com.google.mlkit.vision.barcode.internal.a
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
            public final zztm zza() {
                zzpj zzpjVar2 = zzpj.this;
                zzpl zzplVar = new zzpl();
                zzplVar.zze(C6547b.m18355f() ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
                zzqa zzqaVar = new zzqa();
                zzqaVar.zzb(zzpjVar2);
                zzplVar.zzh(zzqaVar.zzc());
                return zzua.zzf(zzplVar);
            }
        }, zzpk.ON_DEVICE_BARCODE_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m18355f() {
        AtomicReference atomicReference = f14375c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean m18364b = C6556k.m18364b(C6524i.m18312c().m18316b());
        atomicReference.set(Boolean.valueOf(m18364b));
        return m18364b;
    }
}
