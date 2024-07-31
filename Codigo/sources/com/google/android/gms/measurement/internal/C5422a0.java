package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.a0 */
/* loaded from: classes2.dex */
final class C5422a0 {

    /* renamed from: a */
    final String f11054a;

    /* renamed from: b */
    final String f11055b;

    /* renamed from: c */
    final long f11056c;

    /* renamed from: d */
    final long f11057d;

    /* renamed from: e */
    final long f11058e;

    /* renamed from: f */
    final long f11059f;

    /* renamed from: g */
    final long f11060g;

    /* renamed from: h */
    final Long f11061h;

    /* renamed from: i */
    final Long f11062i;

    /* renamed from: j */
    final Long f11063j;

    /* renamed from: k */
    final Boolean f11064k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5422a0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13315a(j10 >= 0);
        C5276s.m13315a(j11 >= 0);
        C5276s.m13315a(j12 >= 0);
        C5276s.m13315a(j14 >= 0);
        this.f11054a = str;
        this.f11055b = str2;
        this.f11056c = j10;
        this.f11057d = j11;
        this.f11058e = j12;
        this.f11059f = j13;
        this.f11060g = j14;
        this.f11061h = l10;
        this.f11062i = l11;
        this.f11063j = l12;
        this.f11064k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5422a0(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5422a0 m13589a(long j10) {
        return new C5422a0(this.f11054a, this.f11055b, this.f11056c, this.f11057d, this.f11058e, j10, this.f11060g, this.f11061h, this.f11062i, this.f11063j, this.f11064k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5422a0 m13590b(long j10, long j11) {
        return new C5422a0(this.f11054a, this.f11055b, this.f11056c, this.f11057d, this.f11058e, this.f11059f, j10, Long.valueOf(j11), this.f11062i, this.f11063j, this.f11064k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5422a0 m13591c(Long l10, Long l11, Boolean bool) {
        return new C5422a0(this.f11054a, this.f11055b, this.f11056c, this.f11057d, this.f11058e, this.f11059f, this.f11060g, this.f11061h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
