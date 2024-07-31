package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import bg.C1780d;
import cg.C1964a;
import cg.C1971d0;
import cg.C1972e;
import cg.C1974f;
import cg.C1975f0;
import cg.C1976g;
import cg.C1979h0;
import cg.C1980i;
import cg.C1983j0;
import cg.C1986l;
import cg.C1993o0;
import cg.C1996q;
import cg.C1997r;
import cg.C1998s;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p062db.C6864a;
import p062db.C6866c;
import p062db.C6867d;
import p062db.C6869f;
import p062db.C6870g;
import p062db.C6872i;
import p062db.C6873j;
import p062db.C6875l;
import p062db.C6877n;
import p062db.C6878o;

/* renamed from: com.google.mlkit.vision.barcode.bundled.internal.a */
/* loaded from: classes2.dex */
final class BinderC6545a extends zzbk {

    /* renamed from: d */
    private static final int[] f14360d = {5, 7, 7, 7, 5, 5};

    /* renamed from: e */
    private static final double[][] f14361e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a */
    private final Context f14362a;

    /* renamed from: b */
    private final RecognitionOptions f14363b;

    /* renamed from: c */
    private BarhopperV3 f14364c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6545a(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f14363b = recognitionOptions;
        this.f14362a = context;
        recognitionOptions.setBarcodeFormats(zzbcVar.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(zzbcVar.zzb());
    }

    /* renamed from: f2 */
    private static zzap m18344f2(C1971d0 c1971d0, String str, String str2) {
        if (c1971d0 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzap(c1971d0.m10225d(), c1971d0.zzd(), c1971d0.m10222a(), c1971d0.m10223b(), c1971d0.zzc(), c1971d0.m10224c(), c1971d0.m10226g(), matcher.find() ? matcher.group(1) : null);
    }

    /* renamed from: g2 */
    private final C1964a m18345g2(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) C5276s.m13324j(this.f14364c);
        if (((ByteBuffer) C5276s.m13324j(byteBuffer)).isDirect()) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, this.f14363b);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), this.f14363b);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), bArr, this.f14363b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(InterfaceC5312b interfaceC5312b, zzbu zzbuVar) {
        C1964a recognize;
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
                    byteBuffer = ((Image) C5276s.m13324j((Image) BinderC5314d.m13411g2(interfaceC5312b))).getPlanes()[0].getBuffer();
                    recognize = m18345g2(byteBuffer, zzbuVar);
                } else if (zzb != 842094169) {
                    throw new IllegalArgumentException("Unsupported image format: " + zzbuVar.zzb());
                }
            }
            byteBuffer = (ByteBuffer) BinderC5314d.m13411g2(interfaceC5312b);
            recognize = m18345g2(byteBuffer, zzbuVar);
        } else {
            recognize = ((BarhopperV3) C5276s.m13324j(this.f14364c)).recognize((Bitmap) BinderC5314d.m13411g2(interfaceC5312b), this.f14363b);
        }
        ArrayList arrayList = new ArrayList();
        Matrix m9504d = C1780d.m9501b().m9504d(zzbuVar.zzd(), zzbuVar.zza(), zzbuVar.zzc());
        for (C1998s c1998s : recognize.m10217c()) {
            if (c1998s.m10274b() > 0 && m9504d != null) {
                float[] fArr = new float[8];
                List m10285n = c1998s.m10285n();
                int m10274b = c1998s.m10274b();
                for (int i16 = i15; i16 < m10274b; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((C1976g) m10285n.get(i16)).m10241a();
                    fArr[i17 + 1] = ((C1976g) m10285n.get(i16)).m10242b();
                }
                m9504d.mapPoints(fArr);
                int zzc = zzbuVar.zzc();
                for (int i18 = i15; i18 < m10274b; i18++) {
                    C1997r c1997r = (C1997r) c1998s.zzG();
                    int i19 = i18 + i18;
                    C1974f m10237c = C1976g.m10237c();
                    m10237c.m10231a((int) fArr[i19]);
                    m10237c.m10232b((int) fArr[i19 + 1]);
                    c1997r.m10270a((i18 + zzc) % m10274b, (C1976g) m10237c.zzj());
                    c1998s = (C1998s) c1997r.zzj();
                }
            }
            if (c1998s.m10289s()) {
                C1993o0 m10278g = c1998s.m10278g();
                zzatVar = new zzat(m10278g.m10265c() + i14, m10278g.zzc(), m10278g.zze(), m10278g.zzd());
            } else {
                zzatVar = null;
            }
            if (c1998s.m10291u()) {
                zzci zzb2 = c1998s.zzb();
                zzawVar = new zzaw(zzb2.zzd() + i14, zzb2.zzc());
            } else {
                zzawVar = null;
            }
            if (c1998s.m10292v()) {
                C1980i m10280i = c1998s.m10280i();
                zzaxVar = new zzax(m10280i.zzc(), m10280i.zzd());
            } else {
                zzaxVar = null;
            }
            if (c1998s.m10294x()) {
                C1996q m10282k = c1998s.m10282k();
                zzazVar = new zzaz(m10282k.zzd(), m10282k.zzc(), m10282k.m10269c() + i14);
            } else {
                zzazVar = null;
            }
            if (c1998s.m10293w()) {
                C1986l m10281j = c1998s.m10281j();
                zzayVar = new zzay(m10281j.zzc(), m10281j.zzd());
            } else {
                zzayVar = null;
            }
            if (c1998s.m10290t()) {
                C1972e m10279h = c1998s.m10279h();
                zzauVar = new zzau(m10279h.m10229a(), m10279h.m10230b());
            } else {
                zzauVar = null;
            }
            if (c1998s.m10286p()) {
                C1975f0 m10275d = c1998s.m10275d();
                zzaqVar = new zzaq(m10275d.zzj(), m10275d.zze(), m10275d.zzf(), m10275d.zzh(), m10275d.zzi(), m18344f2(m10275d.m10236b(), c1998s.m10283l().zzn() ? c1998s.m10283l().zzu() : null, "DTSTART:([0-9TZ]*)"), m18344f2(m10275d.m10235a(), c1998s.m10283l().zzn() ? c1998s.m10283l().zzu() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (c1998s.m10287q()) {
                C1979h0 m10276e = c1998s.m10276e();
                zzcd zza = m10276e.zza();
                zzav zzavVar = zza != null ? new zzav(zza.zzd(), zza.zzi(), zza.zzh(), zza.zzc(), zza.zzf(), zza.zze(), zza.zzj()) : null;
                String zzd = m10276e.zzd();
                String zze = m10276e.zze();
                List m10247e = m10276e.m10247e();
                if (m10247e.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[m10247e.size()];
                    for (int i20 = 0; i20 < m10247e.size(); i20++) {
                        zzawVarArr2[i20] = new zzaw(((zzci) m10247e.get(i20)).zzd() + i14, ((zzci) m10247e.get(i20)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                List m10246d = m10276e.m10246d();
                if (m10246d.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[m10246d.size()];
                    int i21 = 0;
                    while (i21 < m10246d.size()) {
                        zzatVarArr2[i21] = new zzat(((C1993o0) m10246d.get(i21)).m10265c() + i14, ((C1993o0) m10246d.get(i21)).zzc(), ((C1993o0) m10246d.get(i21)).zze(), ((C1993o0) m10246d.get(i21)).zzd());
                        i21++;
                        i14 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) m10276e.m10248f().toArray(new String[0]);
                List m10245c = m10276e.m10245c();
                if (m10245c.isEmpty()) {
                    i10 = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[m10245c.size()];
                    for (int i22 = 0; i22 < m10245c.size(); i22++) {
                        zzaoVarArr2[i22] = new zzao(((zzcb) m10245c.get(i22)).zzc() - 1, (String[]) ((zzcb) m10245c.get(i22)).zzb().toArray(new String[0]));
                    }
                    i10 = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, zzd, zze, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i10 = 0;
                zzarVar = null;
            }
            if (c1998s.m10288r()) {
                C1983j0 m10277f = c1998s.m10277f();
                zzasVar = new zzas(m10277f.zzi(), m10277f.m10253c(), m10277f.m10259i(), m10277f.m10257g(), m10277f.m10254d(), m10277f.zze(), m10277f.zzc(), m10277f.zzd(), m10277f.zzf(), m10277f.m10258h(), m10277f.m10255e(), m10277f.zzj(), m10277f.zzh(), m10277f.m10256f());
            } else {
                zzasVar = null;
            }
            switch (c1998s.m10295y() - 1) {
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
            String m10284m = c1998s.m10284m();
            String zzu = c1998s.m10283l().zzn() ? c1998s.m10283l().zzu() : null;
            byte[] zzx = c1998s.m10283l().zzx();
            List m10285n2 = c1998s.m10285n();
            if (m10285n2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[m10285n2.size()];
                for (int i23 = i10; i23 < m10285n2.size(); i23++) {
                    pointArr2[i23] = new Point(((C1976g) m10285n2.get(i23)).m10241a(), ((C1976g) m10285n2.get(i23)).m10242b());
                }
                pointArr = pointArr2;
            }
            switch (c1998s.m10273a() - 1) {
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
            arrayList.add(new zzba(i11, m10284m, zzu, zzx, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i14 = -1;
            i15 = i10;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() {
        if (this.f14364c != null) {
            return;
        }
        this.f14364c = new BarhopperV3();
        C6872i m19854a = C6873j.m19854a();
        C6869f m19849a = C6870g.m19849a();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            C6866c m19842a = C6867d.m19842a();
            m19842a.m19840c(i10);
            m19842a.m19841d(i10);
            for (int i13 = 0; i13 < f14360d[i12]; i13++) {
                double[] dArr = f14361e[i11];
                double d10 = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                m19842a.m19838a(f10 / sqrt);
                m19842a.m19839b(f10 * sqrt);
                i11++;
            }
            i10 += i10;
            m19849a.m19848a(m19842a);
        }
        m19854a.m19852a(m19849a);
        try {
            InputStream open = this.f14362a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = this.f14362a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = this.f14362a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) C5276s.m13324j(this.f14364c);
                        C6875l m19834a = C6864a.m19834a();
                        m19854a.m19853b(zzdb.zzs(open));
                        m19834a.m19858a(m19854a);
                        C6877n m19862a = C6878o.m19862a();
                        m19862a.m19860a(zzdb.zzs(open2));
                        m19862a.m19861b(zzdb.zzs(open3));
                        m19834a.m19859b(m19862a);
                        barhopperV3.create(m19834a.zzj());
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
        BarhopperV3 barhopperV3 = this.f14364c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f14364c = null;
        }
    }
}
