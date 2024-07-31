package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzs;

/* loaded from: classes2.dex */
final /* synthetic */ class o5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f10458a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f10459b;

    static {
        int[] iArr = new int[zzfc.zza.zze.values().length];
        f10459b = iArr;
        try {
            iArr[zzfc.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10459b[zzfc.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10459b[zzfc.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10459b[zzfc.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzs.values().length];
        f10458a = iArr2;
        try {
            iArr2[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10458a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f10458a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10458a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
