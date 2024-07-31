package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzs;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5609o5 {

    /* renamed from: a */
    static final /* synthetic */ int[] f11645a;

    /* renamed from: b */
    static final /* synthetic */ int[] f11646b;

    static {
        int[] iArr = new int[zzfc.zza.zze.values().length];
        f11646b = iArr;
        try {
            iArr[zzfc.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11646b[zzfc.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11646b[zzfc.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11646b[zzfc.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzs.values().length];
        f11645a = iArr2;
        try {
            iArr2[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11645a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11645a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11645a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
