package p068di;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: di.b */
/* loaded from: classes3.dex */
public class C6973b {

    /* renamed from: a */
    private int f15541a;

    /* renamed from: b */
    private int f15542b;

    /* renamed from: c */
    private Bitmap.CompressFormat f15543c;

    /* renamed from: d */
    private int f15544d;

    /* renamed from: e */
    private String f15545e;

    /* renamed from: f */
    private String f15546f;

    /* renamed from: g */
    private C6974c f15547g;

    /* renamed from: h */
    private Uri f15548h;

    /* renamed from: i */
    private Uri f15549i;

    public C6973b(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, C6974c c6974c) {
        this.f15541a = i10;
        this.f15542b = i11;
        this.f15543c = compressFormat;
        this.f15544d = i12;
        this.f15545e = str;
        this.f15546f = str2;
        this.f15547g = c6974c;
    }

    /* renamed from: a */
    public Bitmap.CompressFormat m20177a() {
        return this.f15543c;
    }

    /* renamed from: b */
    public int m20178b() {
        return this.f15544d;
    }

    /* renamed from: c */
    public Uri m20179c() {
        return this.f15548h;
    }

    /* renamed from: d */
    public Uri m20180d() {
        return this.f15549i;
    }

    /* renamed from: e */
    public C6974c m20181e() {
        return this.f15547g;
    }

    /* renamed from: f */
    public String m20182f() {
        return this.f15545e;
    }

    /* renamed from: g */
    public String m20183g() {
        return this.f15546f;
    }

    /* renamed from: h */
    public int m20184h() {
        return this.f15541a;
    }

    /* renamed from: i */
    public int m20185i() {
        return this.f15542b;
    }

    /* renamed from: j */
    public void m20186j(Uri uri) {
        this.f15548h = uri;
    }

    /* renamed from: k */
    public void m20187k(Uri uri) {
        this.f15549i = uri;
    }
}
