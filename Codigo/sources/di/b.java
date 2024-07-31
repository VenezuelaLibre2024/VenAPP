package di;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f14183a;

    /* renamed from: b, reason: collision with root package name */
    private int f14184b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap.CompressFormat f14185c;

    /* renamed from: d, reason: collision with root package name */
    private int f14186d;

    /* renamed from: e, reason: collision with root package name */
    private String f14187e;

    /* renamed from: f, reason: collision with root package name */
    private String f14188f;

    /* renamed from: g, reason: collision with root package name */
    private c f14189g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f14190h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f14191i;

    public b(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, c cVar) {
        this.f14183a = i10;
        this.f14184b = i11;
        this.f14185c = compressFormat;
        this.f14186d = i12;
        this.f14187e = str;
        this.f14188f = str2;
        this.f14189g = cVar;
    }

    public Bitmap.CompressFormat a() {
        return this.f14185c;
    }

    public int b() {
        return this.f14186d;
    }

    public Uri c() {
        return this.f14190h;
    }

    public Uri d() {
        return this.f14191i;
    }

    public c e() {
        return this.f14189g;
    }

    public String f() {
        return this.f14187e;
    }

    public String g() {
        return this.f14188f;
    }

    public int h() {
        return this.f14183a;
    }

    public int i() {
        return this.f14184b;
    }

    public void j(Uri uri) {
        this.f14190h = uri;
    }

    public void k(Uri uri) {
        this.f14191i = uri;
    }
}
