package gd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;

/* renamed from: gd.a */
/* loaded from: classes.dex */
public class C7545a extends AbstractC7138a {
    public static final Parcelable.Creator<C7545a> CREATOR = new C7546b();

    /* renamed from: a */
    private String f17837a;

    /* renamed from: b */
    private String f17838b;

    /* renamed from: c */
    private int f17839c;

    /* renamed from: d */
    private long f17840d;

    /* renamed from: e */
    private Bundle f17841e;

    /* renamed from: f */
    private Uri f17842f;

    public C7545a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f17837a = str;
        this.f17838b = str2;
        this.f17839c = i10;
        this.f17840d = j10;
        this.f17841e = bundle;
        this.f17842f = uri;
    }

    /* renamed from: A1 */
    public void m22903A1(long j10) {
        this.f17840d = j10;
    }

    /* renamed from: u1 */
    public long m22904u1() {
        return this.f17840d;
    }

    /* renamed from: v1 */
    public String m22905v1() {
        return this.f17838b;
    }

    /* renamed from: w1 */
    public String m22906w1() {
        return this.f17837a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C7546b.m22910c(this, parcel, i10);
    }

    /* renamed from: x1 */
    public Bundle m22907x1() {
        Bundle bundle = this.f17841e;
        return bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: y1 */
    public int m22908y1() {
        return this.f17839c;
    }

    /* renamed from: z1 */
    public Uri m22909z1() {
        return this.f17842f;
    }
}
