package vc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import sc.C10889g;

/* renamed from: vc.e */
/* loaded from: classes.dex */
class C11831e {

    /* renamed from: a */
    private final Float f31231a;

    /* renamed from: b */
    private final boolean f31232b;

    private C11831e(Float f10, boolean z10) {
        this.f31232b = z10;
        this.f31231a = f10;
    }

    /* renamed from: a */
    public static C11831e m37696a(Context context) {
        boolean z10 = false;
        Float f10 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = m37698e(registerReceiver);
                f10 = m37697d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            C10889g.m33216f().m33220e("An error occurred getting battery state.", e10);
        }
        return new C11831e(f10, z10);
    }

    /* renamed from: d */
    private static Float m37697d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    private static boolean m37698e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m37699b() {
        return this.f31231a;
    }

    /* renamed from: c */
    public int m37700c() {
        Float f10;
        if (!this.f31232b || (f10 = this.f31231a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
