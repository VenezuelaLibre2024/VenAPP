package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import cg.d0;
import cg.e;
import cg.f;
import cg.f0;
import cg.g;
import cg.h0;
import cg.i;
import cg.j0;
import cg.l;
import cg.o0;
import cg.q;
import cg.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import db.c;
import db.j;
import db.n;
import db.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class a extends zzbk {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13086d = {5, 7, 7, 7, 5, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final double[][] f13087e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a, reason: collision with root package name */
    private final Context f13088a;

    /* renamed from: b, reason: collision with root package name */
    private final RecognitionOptions f13089b;

    /* renamed from: c, reason: collision with root package name */
    private BarhopperV3 f13090c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f13089b = recognitionOptions;
        this.f13088a = context;
        recognitionOptions.setBarcodeFormats(zzbcVar.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(zzbcVar.zzb());
    }

    private static zzap f2(d0 d0Var, String str, String str2) {
        if (d0Var == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzap(d0Var.d(), d0Var.zzd(), d0Var.a(), d0Var.b(), d0Var.zzc(), d0Var.c(), d0Var.g(), matcher.find() ? matcher.group(1) : null);
    }

    private final cg.a g2(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) s.j(this.f13090c);
        if (((ByteBuffer) s.j(byteBuffer)).isDirect()) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, this.f13089b);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), this.f13089b);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), bArr, this.f13089b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(b bVar, zzbu zzbuVar) {
        cg.a recognize;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        int i10;
        zzar zzarVar;
        zzas zzasVar;
        int i11;
        Point[] pointArr;
        int i12;
        int i13;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        ByteBuffer byteBuffer;
        int zzb = zzbuVar.zzb();
        int i14 = -1;
        int i15 = 0;
        if (zzb != -1) {
            if (zzb != 17) {
                if (zzb == 35) {
                    byteBuffer = ((Image) s.j((Image) d.g2(bVar))).getPlanes()[0].getBuffer();
                    recognize = g2(byteBuffer, zzbuVar);
                } else if (zzb != 842094169) {
                    throw new IllegalArgumentException("Unsupported image format: " + zzbuVar.zzb());
                }
            }
            byteBuffer = (ByteBuffer) d.g2(bVar);
            recognize = g2(byteBuffer, zzbuVar);
        } else {
            recognize = ((BarhopperV3) s.j(this.f13090c)).recognize((Bitmap) d.g2(bVar), this.f13089b);
        }
        ArrayList arrayList = new ArrayList();
        Matrix d10 = bg.d.b().d(zzbuVar.zzd(), zzbuVar.zza(), zzbuVar.zzc());
        for (cg.s sVar : recognize.c()) {
            if (sVar.b() > 0 && d10 != null) {
                float[] fArr = new float[8];
                List n10 = sVar.n();
                int b10 = sVar.b();
                for (int i16 = i15; i16 < b10; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((g) n10.get(i16)).a();
                    fArr[i17 + 1] = ((g) n10.get(i16)).b();
                }
                d10.mapPoints(fArr);
                int zzc = zzbuVar.zzc();
                for (int i18 = i15; i18 < b10; i18++) {
                    r rVar = (r) sVar.zzG();
                    int i19 = i18 + i18;
                    f c10 = g.c();
                    c10.a((int) fArr[i19]);
                    c10.b((int) fArr[i19 + 1]);
                    rVar.a((i18 + zzc) % b10, (g) c10.zzj());
                    sVar = (cg.s) rVar.zzj();
                }
            }
            if (sVar.s()) {
                o0 g10 = sVar.g();
                zzatVar = new zzat(g10.c() + i14, g10.zzc(), g10.zze(), g10.zzd());
            } else {
                zzatVar = null;
            }
            if (sVar.u()) {
                zzci zzb2 = sVar.zzb();
                zzawVar = new zzaw(zzb2.zzd() + i14, zzb2.zzc());
            } else {
                zzawVar = null;
            }
            if (sVar.v()) {
                i i20 = sVar.i();
                zzaxVar = new zzax(i20.zzc(), i20.zzd());
            } else {
                zzaxVar = null;
            }
            if (sVar.x()) {
                q k10 = sVar.k();
                zzazVar = new zzaz(k10.zzd(), k10.zzc(), k10.c() + i14);
            } else {
                zzazVar = null;
            }
            if (sVar.w()) {
                l j10 = sVar.j();
                zzayVar = new zzay(j10.zzc(), j10.zzd());
            } else {
                zzayVar = null;
            }
            if (sVar.t()) {
                e h10 = sVar.h();
                zzauVar = new zzau(h10.a(), h10.b());
            } else {
                zzauVar = null;
            }
            if (sVar.p()) {
                f0 d11 = sVar.d();
                zzaqVar = new zzaq(d11.zzj(), d11.zze(), d11.zzf(), d11.zzh(), d11.zzi(), f2(d11.b(), sVar.l().zzn() ? sVar.l().zzu() : null, "DTSTART:([0-9TZ]*)"), f2(d11.a(), sVar.l().zzn() ? sVar.l().zzu() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (sVar.q()) {
                h0 e10 = sVar.e();
                zzcd zza = e10.zza();
                zzav zzavVar = zza != null ? new zzav(zza.zzd(), zza.zzi(), zza.zzh(), zza.zzc(), zza.zzf(), zza.zze(), zza.zzj()) : null;
                String zzd = e10.zzd();
                String zze = e10.zze();
                List e11 = e10.e();
                if (e11.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[e11.size()];
                    for (int i21 = 0; i21 < e11.size(); i21++) {
                        zzawVarArr2[i21] = new zzaw(((zzci) e11.get(i21)).zzd() + i14, ((zzci) e11.get(i21)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                List d12 = e10.d();
                if (d12.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[d12.size()];
                    int i22 = 0;
                    while (i22 < d12.size()) {
                        zzatVarArr2[i22] = new zzat(((o0) d12.get(i22)).c() + i14, ((o0) d12.get(i22)).zzc(), ((o0) d12.get(i22)).zze(), ((o0) d12.get(i22)).zzd());
                        i22++;
                        i14 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) e10.f().toArray(new String[0]);
                List c11 = e10.c();
                if (c11.isEmpty()) {
                    i10 = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[c11.size()];
                    for (int i23 = 0; i23 < c11.size(); i23++) {
                        zzaoVarArr2[i23] = new zzao(((zzcb) c11.get(i23)).zzc() - 1, (String[]) ((zzcb) c11.get(i23)).zzb().toArray(new String[0]));
                    }
                    i10 = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, zzd, zze, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i10 = 0;
                zzarVar = null;
            }
            if (sVar.r()) {
                j0 f10 = sVar.f();
                zzasVar = new zzas(f10.zzi(), f10.c(), f10.i(), f10.g(), f10.d(), f10.zze(), f10.zzc(), f10.zzd(), f10.zzf(), f10.h(), f10.e(), f10.zzj(), f10.zzh(), f10.f());
            } else {
                zzasVar = null;
            }
            switch (sVar.y() - 1) {
                case 0:
                    i11 = i10;
                    break;
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 4;
                    break;
                case 4:
                    i11 = 8;
                    break;
                case 5:
                    i11 = 16;
                    break;
                case 6:
                    i11 = 32;
                    break;
                case 7:
                    i11 = 64;
                    break;
                case 8:
                    i11 = RecognitionOptions.ITF;
                    break;
                case 9:
                    i11 = RecognitionOptions.QR_CODE;
                    break;
                case 10:
                    i11 = RecognitionOptions.UPC_A;
                    break;
                case 11:
                    i11 = RecognitionOptions.UPC_E;
                    break;
                case 12:
                    i11 = RecognitionOptions.PDF417;
                    break;
                case 13:
                    i11 = RecognitionOptions.AZTEC;
                    break;
                default:
                    i11 = -1;
                    break;
            }
            String m10 = sVar.m();
            String zzu = sVar.l().zzn() ? sVar.l().zzu() : null;
            byte[] zzx = sVar.l().zzx();
            List n11 = sVar.n();
            if (n11.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[n11.size()];
                for (int i24 = i10; i24 < n11.size(); i24++) {
                    pointArr2[i24] = new Point(((g) n11.get(i24)).a(), ((g) n11.get(i24)).b());
                }
                pointArr = pointArr2;
            }
            switch (sVar.a() - 1) {
                case 1:
                    i12 = 1;
                    continue;
                case 2:
                    i12 = 2;
                    continue;
                case 3:
                    i13 = 3;
                    break;
                case 4:
                    i12 = 4;
                    continue;
                case 5:
                    i13 = 5;
                    break;
                case 6:
                    i13 = 6;
                    break;
                case 7:
                    i13 = 7;
                    break;
                case 8:
                    i12 = 8;
                    continue;
                case 9:
                    i13 = 9;
                    break;
                case 10:
                    i13 = 10;
                    break;
                case 11:
                    i13 = 11;
                    break;
                case 12:
                    i13 = 12;
                    break;
                default:
                    i12 = i10;
                    continue;
            }
            i12 = i13;
            arrayList.add(new zzba(i11, m10, zzu, zzx, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i14 = -1;
            i15 = i10;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() {
        if (this.f13090c != null) {
            return;
        }
        this.f13090c = new BarhopperV3();
        db.i a10 = j.a();
        db.f a11 = db.g.a();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            c a12 = db.d.a();
            a12.c(i10);
            a12.d(i10);
            for (int i13 = 0; i13 < f13086d[i12]; i13++) {
                double[] dArr = f13087e[i11];
                double d10 = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                a12.a(f10 / sqrt);
                a12.b(f10 * sqrt);
                i11++;
            }
            i10 += i10;
            a11.a(a12);
        }
        a10.a(a11);
        try {
            InputStream open = this.f13088a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = this.f13088a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = this.f13088a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) s.j(this.f13090c);
                        db.l a13 = db.a.a();
                        a10.b(zzdb.zzs(open));
                        a13.a(a10);
                        n a14 = o.a();
                        a14.a(zzdb.zzs(open2));
                        a14.b(zzdb.zzs(open3));
                        a13.b(a14);
                        barhopperV3.create(a13.zzj());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed to open Barcode models", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f13090c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f13090c = null;
        }
    }
}
