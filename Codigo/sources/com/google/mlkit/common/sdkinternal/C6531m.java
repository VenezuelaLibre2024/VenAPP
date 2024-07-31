package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import ca.C1898d;
import ca.C1904g;
import com.google.android.gms.common.api.InterfaceC5107g;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzau;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p136ha.C7674b;
import p136ha.C7675c;
import p136ha.C7678f;

/* renamed from: com.google.mlkit.common.sdkinternal.m */
/* loaded from: classes2.dex */
public class C6531m {

    /* renamed from: a */
    public static final C1898d[] f14314a = new C1898d[0];

    /* renamed from: b */
    public static final C1898d f14315b;

    /* renamed from: c */
    public static final C1898d f14316c;

    /* renamed from: d */
    public static final C1898d f14317d;

    /* renamed from: e */
    public static final C1898d f14318e;

    /* renamed from: f */
    public static final C1898d f14319f;

    /* renamed from: g */
    public static final C1898d f14320g;

    /* renamed from: h */
    public static final C1898d f14321h;

    /* renamed from: i */
    public static final C1898d f14322i;

    /* renamed from: j */
    public static final C1898d f14323j;

    /* renamed from: k */
    public static final C1898d f14324k;

    /* renamed from: l */
    public static final C1898d f14325l;

    /* renamed from: m */
    public static final C1898d f14326m;

    /* renamed from: n */
    public static final C1898d f14327n;

    /* renamed from: o */
    public static final C1898d f14328o;

    /* renamed from: p */
    public static final C1898d f14329p;

    /* renamed from: q */
    public static final C1898d f14330q;

    /* renamed from: r */
    public static final C1898d f14331r;

    /* renamed from: s */
    public static final C1898d f14332s;

    /* renamed from: t */
    public static final C1898d f14333t;

    /* renamed from: u */
    public static final C1898d f14334u;

    /* renamed from: v */
    public static final C1898d f14335v;

    /* renamed from: w */
    private static final zzau f14336w;

    /* renamed from: x */
    private static final zzau f14337x;

    static {
        C1898d c1898d = new C1898d("vision.barcode", 1L);
        f14315b = c1898d;
        C1898d c1898d2 = new C1898d("vision.custom.ica", 1L);
        f14316c = c1898d2;
        C1898d c1898d3 = new C1898d("vision.face", 1L);
        f14317d = c1898d3;
        C1898d c1898d4 = new C1898d("vision.ica", 1L);
        f14318e = c1898d4;
        C1898d c1898d5 = new C1898d("vision.ocr", 1L);
        f14319f = c1898d5;
        f14320g = new C1898d("mlkit.ocr.chinese", 1L);
        f14321h = new C1898d("mlkit.ocr.common", 1L);
        f14322i = new C1898d("mlkit.ocr.devanagari", 1L);
        f14323j = new C1898d("mlkit.ocr.japanese", 1L);
        f14324k = new C1898d("mlkit.ocr.korean", 1L);
        C1898d c1898d6 = new C1898d("mlkit.langid", 1L);
        f14325l = c1898d6;
        C1898d c1898d7 = new C1898d("mlkit.nlclassifier", 1L);
        f14326m = c1898d7;
        C1898d c1898d8 = new C1898d("tflite_dynamite", 1L);
        f14327n = c1898d8;
        C1898d c1898d9 = new C1898d("mlkit.barcode.ui", 1L);
        f14328o = c1898d9;
        C1898d c1898d10 = new C1898d("mlkit.smartreply", 1L);
        f14329p = c1898d10;
        f14330q = new C1898d("mlkit.image.caption", 1L);
        f14331r = new C1898d("mlkit.docscan.detect", 1L);
        f14332s = new C1898d("mlkit.docscan.crop", 1L);
        f14333t = new C1898d("mlkit.docscan.enhance", 1L);
        f14334u = new C1898d("mlkit.quality.aesthetic", 1L);
        f14335v = new C1898d("mlkit.quality.technical", 1L);
        zzat zzatVar = new zzat();
        zzatVar.zza("barcode", c1898d);
        zzatVar.zza("custom_ica", c1898d2);
        zzatVar.zza("face", c1898d3);
        zzatVar.zza("ica", c1898d4);
        zzatVar.zza("ocr", c1898d5);
        zzatVar.zza("langid", c1898d6);
        zzatVar.zza("nlclassifier", c1898d7);
        zzatVar.zza("tflite_dynamite", c1898d8);
        zzatVar.zza("barcode_ui", c1898d9);
        zzatVar.zza("smart_reply", c1898d10);
        f14336w = zzatVar.zzb();
        zzat zzatVar2 = new zzat();
        zzatVar2.zza("com.google.android.gms.vision.barcode", c1898d);
        zzatVar2.zza("com.google.android.gms.vision.custom.ica", c1898d2);
        zzatVar2.zza("com.google.android.gms.vision.face", c1898d3);
        zzatVar2.zza("com.google.android.gms.vision.ica", c1898d4);
        zzatVar2.zza("com.google.android.gms.vision.ocr", c1898d5);
        zzatVar2.zza("com.google.android.gms.mlkit.langid", c1898d6);
        zzatVar2.zza("com.google.android.gms.mlkit.nlclassifier", c1898d7);
        zzatVar2.zza("com.google.android.gms.tflite_dynamite", c1898d8);
        zzatVar2.zza("com.google.android.gms.mlkit_smartreply", c1898d10);
        f14337x = zzatVar2.zzb();
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m18328a(Context context, List<String> list) {
        if (C1904g.m10086f().m10087a(context) >= 221500000) {
            return m18329b(context, m18333f(f14337x, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.m13418e(context, DynamiteModule.f10833b, it.next());
            }
            return true;
        } catch (DynamiteModule.C5324a unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m18329b(Context context, final C1898d[] c1898dArr) {
        try {
            return ((C7674b) Tasks.await(C7675c.m23388a(context).mo23390c(new InterfaceC5107g() { // from class: com.google.mlkit.common.sdkinternal.b0
                @Override // com.google.android.gms.common.api.InterfaceC5107g
                /* renamed from: a */
                public final C1898d[] mo12993a() {
                    C1898d[] c1898dArr2 = c1898dArr;
                    C1898d[] c1898dArr3 = C6531m.f14314a;
                    return c1898dArr2;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.c0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).m23386u1();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static void m18330c(Context context, String str) {
        m18331d(context, zzar.zzh(str));
    }

    @Deprecated
    /* renamed from: d */
    public static void m18331d(Context context, List<String> list) {
        if (C1904g.m10086f().m10087a(context) >= 221500000) {
            m18332e(context, m18333f(f14336w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    /* renamed from: e */
    public static void m18332e(Context context, final C1898d[] c1898dArr) {
        C7675c.m23388a(context).mo23389b(C7678f.m23392d().m23397a(new InterfaceC5107g() { // from class: com.google.mlkit.common.sdkinternal.d0
            @Override // com.google.android.gms.common.api.InterfaceC5107g
            /* renamed from: a */
            public final C1898d[] mo12993a() {
                C1898d[] c1898dArr2 = c1898dArr;
                C1898d[] c1898dArr3 = C6531m.f14314a;
                return c1898dArr2;
            }
        }).m23398b()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.e0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    /* renamed from: f */
    private static C1898d[] m18333f(Map map, List list) {
        C1898d[] c1898dArr = new C1898d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1898dArr[i10] = (C1898d) C5276s.m13324j((C1898d) map.get(list.get(i10)));
        }
        return c1898dArr;
    }
}
