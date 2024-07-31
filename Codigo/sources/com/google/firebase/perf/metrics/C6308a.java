package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.perf.metrics.a */
/* loaded from: classes.dex */
public class C6308a implements Parcelable {
    public static final Parcelable.Creator<C6308a> CREATOR = new a();

    /* renamed from: a */
    private final String f13544a;

    /* renamed from: b */
    private final AtomicLong f13545b;

    /* renamed from: com.google.firebase.perf.metrics.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C6308a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6308a createFromParcel(Parcel parcel) {
            return new C6308a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6308a[] newArray(int i10) {
            return new C6308a[i10];
        }
    }

    private C6308a(Parcel parcel) {
        this.f13544a = parcel.readString();
        this.f13545b = new AtomicLong(parcel.readLong());
    }

    /* synthetic */ C6308a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C6308a(String str) {
        this.f13544a = str;
        this.f13545b = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m17400a() {
        return this.f13545b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m17401b() {
        return this.f13544a;
    }

    /* renamed from: c */
    public void m17402c(long j10) {
        this.f13545b.addAndGet(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17403d(long j10) {
        this.f13545b.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13544a);
        parcel.writeLong(this.f13545b.get());
    }
}
