package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.util.l */
/* loaded from: classes.dex */
public class C6338l implements Parcelable {
    public static final Parcelable.Creator<C6338l> CREATOR = new a();

    /* renamed from: a */
    private long f13612a;

    /* renamed from: b */
    private long f13613b;

    /* renamed from: com.google.firebase.perf.util.l$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C6338l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6338l createFromParcel(Parcel parcel) {
            return new C6338l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6338l[] newArray(int i10) {
            return new C6338l[i10];
        }
    }

    public C6338l() {
        this(m17530h(), m17528a());
    }

    C6338l(long j10, long j11) {
        this.f13612a = j10;
        this.f13613b = j11;
    }

    private C6338l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    /* synthetic */ C6338l(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    private static long m17528a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: f */
    public static C6338l m17529f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new C6338l(m17530h() + (micros - m17528a()), micros);
    }

    /* renamed from: h */
    private static long m17530h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long m17531b() {
        return this.f13612a + m17532c();
    }

    /* renamed from: c */
    public long m17532c() {
        return m17533d(new C6338l());
    }

    /* renamed from: d */
    public long m17533d(C6338l c6338l) {
        return c6338l.f13613b - this.f13613b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long m17534e() {
        return this.f13612a;
    }

    /* renamed from: g */
    public void m17535g() {
        this.f13612a = m17530h();
        this.f13613b = m17528a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f13612a);
        parcel.writeLong(this.f13613b);
    }
}
