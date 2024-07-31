package gd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private String f16200a;

    /* renamed from: b, reason: collision with root package name */
    private String f16201b;

    /* renamed from: c, reason: collision with root package name */
    private int f16202c;

    /* renamed from: d, reason: collision with root package name */
    private long f16203d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f16204e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f16205f;

    public a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f16200a = str;
        this.f16201b = str2;
        this.f16202c = i10;
        this.f16203d = j10;
        this.f16204e = bundle;
        this.f16205f = uri;
    }

    public void A1(long j10) {
        this.f16203d = j10;
    }

    public long u1() {
        return this.f16203d;
    }

    public String v1() {
        return this.f16201b;
    }

    public String w1() {
        return this.f16200a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        b.c(this, parcel, i10);
    }

    public Bundle x1() {
        Bundle bundle = this.f16204e;
        return bundle == null ? new Bundle() : bundle;
    }

    public int y1() {
        return this.f16202c;
    }

    public Uri z1() {
        return this.f16205f;
    }
}
