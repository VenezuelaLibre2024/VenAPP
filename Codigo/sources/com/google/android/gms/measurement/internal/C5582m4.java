package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p418wa.C12120r;
import p418wa.C12121s;
import p418wa.C12122t;
import p418wa.InterfaceC12111j;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* loaded from: classes2.dex */
public final class C5582m4 {

    /* renamed from: b */
    private static final AtomicReference<String[]> f11584b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f11585c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f11586d = new AtomicReference<>();

    /* renamed from: a */
    private final InterfaceC12111j f11587a;

    public C5582m4(InterfaceC12111j interfaceC12111j) {
        this.f11587a = interfaceC12111j;
    }

    /* renamed from: d */
    private static String m14163d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C5276s.m13324j(strArr);
        C5276s.m13324j(strArr2);
        C5276s.m13324j(atomicReference);
        C5276s.m13315a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || (str != null && str.equals(obj))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: e */
    private final String m14164e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String m14165a = obj instanceof Bundle ? m14165a((Bundle) obj) : String.valueOf(obj);
            if (m14165a != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(m14165a);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m14165a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f11587a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m14168f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? m14164e(new Object[]{obj}) : obj instanceof Object[] ? m14164e((Object[]) obj) : obj instanceof ArrayList ? m14164e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m14166b(C5461d0 c5461d0) {
        if (c5461d0 == null) {
            return null;
        }
        if (!this.f11587a.zza()) {
            return c5461d0.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(c5461d0.f11176c);
        sb2.append(",name=");
        sb2.append(m14167c(c5461d0.f11174a));
        sb2.append(",params=");
        C5742z c5742z = c5461d0.f11175b;
        sb2.append(c5742z != null ? !this.f11587a.zza() ? c5742z.toString() : m14165a(c5742z.m14603w1()) : null);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m14167c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11587a.zza() ? str : m14163d(str, C12120r.f32212c, C12120r.f32210a, f11584b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m14168f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11587a.zza() ? str : m14163d(str, C12122t.f32217b, C12122t.f32216a, f11585c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final String m14169g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f11587a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m14163d(str, C12121s.f32215b, C12121s.f32214a, f11586d);
        }
        return "experiment_id(" + str + ")";
    }
}
