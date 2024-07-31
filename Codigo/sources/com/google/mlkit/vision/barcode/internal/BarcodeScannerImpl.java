package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpz;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.android.gms.internal.mlkit_vision_barcode.zzus;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.m;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import vf.b;

/* loaded from: classes2.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<xf.a>> implements vf.a {

    /* renamed from: x */
    private static final vf.b f13091x = new b.a().a();

    /* renamed from: y */
    public static final /* synthetic */ int f13092y = 0;

    /* renamed from: s */
    private final boolean f13093s;

    /* renamed from: t */
    private final vf.b f13094t;

    /* renamed from: u */
    final zzus f13095u;

    /* renamed from: v */
    private int f13096v;

    /* renamed from: w */
    private boolean f13097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScannerImpl(vf.b bVar, i iVar, Executor executor, zztx zztxVar, com.google.mlkit.common.sdkinternal.i iVar2) {
        super(iVar, executor);
        bVar.b();
        this.f13094t = bVar;
        boolean f10 = b.f();
        this.f13093s = f10;
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzi(b.c(bVar));
        zzpz zzj = zzpxVar.zzj();
        zzpl zzplVar = new zzpl();
        zzplVar.zze(f10 ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzplVar.zzg(zzj);
        zztxVar.zzd(zzua.zzg(zzplVar, 1), zzpk.ON_DEVICE_BARCODE_CREATE);
        this.f13095u = null;
    }

    private final Task j(Task task, int i10, int i11) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.d

            /* renamed from: b */
            public final /* synthetic */ int f13105b;

            /* renamed from: c */
            public final /* synthetic */ int f13106c;

            public /* synthetic */ d(int i102, int i112) {
                r2 = i102;
                r3 = i112;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return BarcodeScannerImpl.this.g(r2, r3, (List) obj);
            }
        });
    }

    @Override // vf.a
    public final Task<List<xf.a>> W(ag.a aVar) {
        return j(super.b(aVar), aVar.k(), aVar.g());
    }

    @Override // com.google.android.gms.common.api.g
    public final ca.d[] a() {
        return this.f13093s ? m.f13040a : new ca.d[]{m.f13041b};
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, vf.a
    public final synchronized void close() {
        zzus zzusVar = this.f13095u;
        if (zzusVar != null) {
            zzusVar.zzn(this.f13097w);
            this.f13095u.zzj();
        }
        super.close();
    }

    public final /* synthetic */ Task g(int i10, int i11, List list) {
        if (this.f13095u == null) {
            return Tasks.forResult(list);
        }
        boolean z10 = true;
        this.f13096v++;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xf.a aVar = (xf.a) it.next();
            if (aVar.h() == -1) {
                arrayList2.add(aVar);
            } else {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Point[] d10 = ((xf.a) arrayList2.get(i12)).d();
                if (d10 != null) {
                    zzus zzusVar = this.f13095u;
                    int i13 = this.f13096v;
                    int i14 = i10;
                    int i15 = i11;
                    int i16 = 0;
                    int i17 = 0;
                    for (Point point : Arrays.asList(d10)) {
                        i14 = Math.min(i14, point.x);
                        i15 = Math.min(i15, point.y);
                        i16 = Math.max(i16, point.x);
                        i17 = Math.max(i17, point.y);
                    }
                    float f10 = i10;
                    float f11 = i11;
                    zzusVar.zzi(i13, zzuv.zzg((i14 + 0.0f) / f10, (i15 + 0.0f) / f11, (i16 + 0.0f) / f10, (i17 + 0.0f) / f11, 0.0f));
                }
                i12++;
                z10 = true;
            }
        } else {
            this.f13097w = true;
        }
        if (z10 == this.f13094t.d()) {
            arrayList = list;
        }
        return Tasks.forResult(arrayList);
    }
}
