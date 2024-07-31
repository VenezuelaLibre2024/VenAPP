package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzau;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a */
    public static final ca.d[] f13040a = new ca.d[0];

    /* renamed from: b */
    public static final ca.d f13041b;

    /* renamed from: c */
    public static final ca.d f13042c;

    /* renamed from: d */
    public static final ca.d f13043d;

    /* renamed from: e */
    public static final ca.d f13044e;

    /* renamed from: f */
    public static final ca.d f13045f;

    /* renamed from: g */
    public static final ca.d f13046g;

    /* renamed from: h */
    public static final ca.d f13047h;

    /* renamed from: i */
    public static final ca.d f13048i;

    /* renamed from: j */
    public static final ca.d f13049j;

    /* renamed from: k */
    public static final ca.d f13050k;

    /* renamed from: l */
    public static final ca.d f13051l;

    /* renamed from: m */
    public static final ca.d f13052m;

    /* renamed from: n */
    public static final ca.d f13053n;

    /* renamed from: o */
    public static final ca.d f13054o;

    /* renamed from: p */
    public static final ca.d f13055p;

    /* renamed from: q */
    public static final ca.d f13056q;

    /* renamed from: r */
    public static final ca.d f13057r;

    /* renamed from: s */
    public static final ca.d f13058s;

    /* renamed from: t */
    public static final ca.d f13059t;

    /* renamed from: u */
    public static final ca.d f13060u;

    /* renamed from: v */
    public static final ca.d f13061v;

    /* renamed from: w */
    private static final zzau f13062w;

    /* renamed from: x */
    private static final zzau f13063x;

    static {
        ca.d dVar = new ca.d("vision.barcode", 1L);
        f13041b = dVar;
        ca.d dVar2 = new ca.d("vision.custom.ica", 1L);
        f13042c = dVar2;
        ca.d dVar3 = new ca.d("vision.face", 1L);
        f13043d = dVar3;
        ca.d dVar4 = new ca.d("vision.ica", 1L);
        f13044e = dVar4;
        ca.d dVar5 = new ca.d("vision.ocr", 1L);
        f13045f = dVar5;
        f13046g = new ca.d("mlkit.ocr.chinese", 1L);
        f13047h = new ca.d("mlkit.ocr.common", 1L);
        f13048i = new ca.d("mlkit.ocr.devanagari", 1L);
        f13049j = new ca.d("mlkit.ocr.japanese", 1L);
        f13050k = new ca.d("mlkit.ocr.korean", 1L);
        ca.d dVar6 = new ca.d("mlkit.langid", 1L);
        f13051l = dVar6;
        ca.d dVar7 = new ca.d("mlkit.nlclassifier", 1L);
        f13052m = dVar7;
        ca.d dVar8 = new ca.d("tflite_dynamite", 1L);
        f13053n = dVar8;
        ca.d dVar9 = new ca.d("mlkit.barcode.ui", 1L);
        f13054o = dVar9;
        ca.d dVar10 = new ca.d("mlkit.smartreply", 1L);
        f13055p = dVar10;
        f13056q = new ca.d("mlkit.image.caption", 1L);
        f13057r = new ca.d("mlkit.docscan.detect", 1L);
        f13058s = new ca.d("mlkit.docscan.crop", 1L);
        f13059t = new ca.d("mlkit.docscan.enhance", 1L);
        f13060u = new ca.d("mlkit.quality.aesthetic", 1L);
        f13061v = new ca.d("mlkit.quality.technical", 1L);
        zzat zzatVar = new zzat();
        zzatVar.zza("barcode", dVar);
        zzatVar.zza("custom_ica", dVar2);
        zzatVar.zza("face", dVar3);
        zzatVar.zza("ica", dVar4);
        zzatVar.zza("ocr", dVar5);
        zzatVar.zza("langid", dVar6);
        zzatVar.zza("nlclassifier", dVar7);
        zzatVar.zza("tflite_dynamite", dVar8);
        zzatVar.zza("barcode_ui", dVar9);
        zzatVar.zza("smart_reply", dVar10);
        f13062w = zzatVar.zzb();
        zzat zzatVar2 = new zzat();
        zzatVar2.zza("com.google.android.gms.vision.barcode", dVar);
        zzatVar2.zza("com.google.android.gms.vision.custom.ica", dVar2);
        zzatVar2.zza("com.google.android.gms.vision.face", dVar3);
        zzatVar2.zza("com.google.android.gms.vision.ica", dVar4);
        zzatVar2.zza("com.google.android.gms.vision.ocr", dVar5);
        zzatVar2.zza("com.google.android.gms.mlkit.langid", dVar6);
        zzatVar2.zza("com.google.android.gms.mlkit.nlclassifier", dVar7);
        zzatVar2.zza("com.google.android.gms.tflite_dynamite", dVar8);
        zzatVar2.zza("com.google.android.gms.mlkit_smartreply", dVar10);
        f13063x = zzatVar2.zzb();
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) {
        if (ca.g.f().a(context) >= 221500000) {
            return b(context, f(f13063x, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f9718b, it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, ca.d[] dVarArr) {
        try {
            return ((ha.b) Tasks.await(ha.c.a(context).c(new com.google.android.gms.common.api.g() { // from class: com.google.mlkit.common.sdkinternal.b0

                /* renamed from: a */
                public final /* synthetic */ ca.d[] f13017a;

                public /* synthetic */ b0(ca.d[] dVarArr2) {
                    r1 = dVarArr2;
                }

                @Override // com.google.android.gms.common.api.g
                public final ca.d[] a() {
                    ca.d[] dVarArr2 = r1;
                    ca.d[] dVarArr3 = m.f13040a;
                    return dVarArr2;
                }
            }).addOnFailureListener(c0.f13019a))).u1();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, zzar.zzh(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (ca.g.f().a(context) >= 221500000) {
            e(context, f(f13062w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, ca.d[] dVarArr) {
        ha.c.a(context).b(ha.f.d().a(new com.google.android.gms.common.api.g() { // from class: com.google.mlkit.common.sdkinternal.d0

            /* renamed from: a */
            public final /* synthetic */ ca.d[] f13021a;

            public /* synthetic */ d0(ca.d[] dVarArr2) {
                r1 = dVarArr2;
            }

            @Override // com.google.android.gms.common.api.g
            public final ca.d[] a() {
                ca.d[] dVarArr2 = r1;
                ca.d[] dVarArr3 = m.f13040a;
                return dVarArr2;
            }
        }).b()).addOnFailureListener(e0.f13022a);
    }

    private static ca.d[] f(Map map, List list) {
        ca.d[] dVarArr = new ca.d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            dVarArr[i10] = (ca.d) com.google.android.gms.common.internal.s.j((ca.d) map.get(list.get(i10)));
        }
        return dVarArr;
    }
}
