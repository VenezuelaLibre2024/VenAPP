package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m4 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<String[]> f10397b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String[]> f10398c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<String[]> f10399d = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    private final wa.j f10400a;

    public m4(wa.j jVar) {
        this.f10400a = jVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.s.j(strArr);
        com.google.android.gms.common.internal.s.j(strArr2);
        com.google.android.gms.common.internal.s.j(atomicReference);
        com.google.android.gms.common.internal.s.a(strArr.length == strArr2.length);
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

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String a10 = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(a10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f10400a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (!this.f10400a.zza()) {
            return d0Var.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(d0Var.f10056c);
        sb2.append(",name=");
        sb2.append(c(d0Var.f10054a));
        sb2.append(",params=");
        z zVar = d0Var.f10055b;
        sb2.append(zVar != null ? !this.f10400a.zza() ? zVar.toString() : a(zVar.w1()) : null);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10400a.zza() ? str : d(str, wa.r.f29747c, wa.r.f29745a, f10397b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10400a.zza() ? str : d(str, wa.t.f29752b, wa.t.f29751a, f10398c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10400a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, wa.s.f29750b, wa.s.f29749a, f10399d);
        }
        return "experiment_id(" + str + ")";
    }
}
