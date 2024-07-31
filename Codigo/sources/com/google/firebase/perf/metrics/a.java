package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0179a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12312a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f12313b;

    /* renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0179a implements Parcelable.Creator<a> {
        C0179a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f12312a = parcel.readString();
        this.f12313b = new AtomicLong(parcel.readLong());
    }

    /* synthetic */ a(Parcel parcel, C0179a c0179a) {
        this(parcel);
    }

    public a(String str) {
        this.f12312a = str;
        this.f12313b = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f12313b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f12312a;
    }

    public void c(long j10) {
        this.f12313b.addAndGet(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j10) {
        this.f12313b.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12312a);
        parcel.writeLong(this.f12313b.get());
    }
}
