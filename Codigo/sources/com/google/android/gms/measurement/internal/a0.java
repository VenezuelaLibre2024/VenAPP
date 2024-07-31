package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    final String f9934a;

    /* renamed from: b, reason: collision with root package name */
    final String f9935b;

    /* renamed from: c, reason: collision with root package name */
    final long f9936c;

    /* renamed from: d, reason: collision with root package name */
    final long f9937d;

    /* renamed from: e, reason: collision with root package name */
    final long f9938e;

    /* renamed from: f, reason: collision with root package name */
    final long f9939f;

    /* renamed from: g, reason: collision with root package name */
    final long f9940g;

    /* renamed from: h, reason: collision with root package name */
    final Long f9941h;

    /* renamed from: i, reason: collision with root package name */
    final Long f9942i;

    /* renamed from: j, reason: collision with root package name */
    final Long f9943j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f9944k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.a(j10 >= 0);
        com.google.android.gms.common.internal.s.a(j11 >= 0);
        com.google.android.gms.common.internal.s.a(j12 >= 0);
        com.google.android.gms.common.internal.s.a(j14 >= 0);
        this.f9934a = str;
        this.f9935b = str2;
        this.f9936c = j10;
        this.f9937d = j11;
        this.f9938e = j12;
        this.f9939f = j13;
        this.f9940g = j14;
        this.f9941h = l10;
        this.f9942i = l11;
        this.f9943j = l12;
        this.f9944k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a0 a(long j10) {
        return new a0(this.f9934a, this.f9935b, this.f9936c, this.f9937d, this.f9938e, j10, this.f9940g, this.f9941h, this.f9942i, this.f9943j, this.f9944k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a0 b(long j10, long j11) {
        return new a0(this.f9934a, this.f9935b, this.f9936c, this.f9937d, this.f9938e, this.f9939f, j10, Long.valueOf(j11), this.f9942i, this.f9943j, this.f9944k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a0 c(Long l10, Long l11, Boolean bool) {
        return new a0(this.f9934a, this.f9935b, this.f9936c, this.f9937d, this.f9938e, this.f9939f, this.f9940g, this.f9941h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
