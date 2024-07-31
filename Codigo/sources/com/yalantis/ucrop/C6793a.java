package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p068di.C6972a;

/* renamed from: com.yalantis.ucrop.a */
/* loaded from: classes3.dex */
public class C6793a {

    /* renamed from: a */
    private Intent f14911a = new Intent();

    /* renamed from: b */
    private Bundle f14912b;

    /* renamed from: com.yalantis.ucrop.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final Bundle f14913a = new Bundle();

        /* renamed from: a */
        public Bundle m19599a() {
            return this.f14913a;
        }

        /* renamed from: b */
        public void m19600b(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i10);
        }

        /* renamed from: c */
        public void m19601c(int i10, C6972a... c6972aArr) {
            if (i10 >= c6972aArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", Integer.valueOf(i10), Integer.valueOf(c6972aArr.length)));
            }
            this.f14913a.putInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", i10);
            this.f14913a.putParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions", new ArrayList<>(Arrays.asList(c6972aArr)));
        }

        /* renamed from: d */
        public void m19602d(boolean z10) {
            this.f14913a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z10);
        }

        /* renamed from: e */
        public void m19603e(Bitmap.CompressFormat compressFormat) {
            this.f14913a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: f */
        public void m19604f(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CompressionQuality", i10);
        }

        /* renamed from: g */
        public void m19605g(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropFrameColor", i10);
        }

        /* renamed from: h */
        public void m19606h(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropFrameStrokeWidth", i10);
        }

        /* renamed from: i */
        public void m19607i(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropGridColor", i10);
        }

        /* renamed from: j */
        public void m19608j(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropGridColumnCount", i10);
        }

        /* renamed from: k */
        public void m19609k(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropGridRowCount", i10);
        }

        /* renamed from: l */
        public void m19610l(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.CropGridStrokeWidth", i10);
        }

        /* renamed from: m */
        public void m19611m(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.DimmedLayerColor", i10);
        }

        /* renamed from: n */
        public void m19612n(boolean z10) {
            this.f14913a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z10);
        }

        /* renamed from: o */
        public void m19613o(boolean z10) {
            this.f14913a.putBoolean("com.yalantis.ucrop.HideBottomControls", z10);
        }

        /* renamed from: p */
        public void m19614p(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", i10);
        }

        /* renamed from: q */
        public void m19615q(boolean z10) {
            this.f14913a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z10);
        }

        /* renamed from: r */
        public void m19616r(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.StatusBarColor", i10);
        }

        /* renamed from: s */
        public void m19617s(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.ToolbarColor", i10);
        }

        /* renamed from: t */
        public void m19618t(String str) {
            this.f14913a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: u */
        public void m19619u(int i10) {
            this.f14913a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i10);
        }
    }

    private C6793a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f14912b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f14912b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    /* renamed from: a */
    public static Throwable m19592a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    /* renamed from: c */
    public static Uri m19593c(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: d */
    public static C6793a m19594d(Uri uri, Uri uri2) {
        return new C6793a(uri, uri2);
    }

    /* renamed from: b */
    public Intent m19595b(Context context) {
        this.f14911a.setClass(context, UCropActivity.class);
        this.f14911a.putExtras(this.f14912b);
        return this.f14911a;
    }

    /* renamed from: e */
    public C6793a m19596e(float f10, float f11) {
        this.f14912b.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
        this.f14912b.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        return this;
    }

    /* renamed from: f */
    public C6793a m19597f(int i10, int i11) {
        if (i10 < 10) {
            i10 = 10;
        }
        if (i11 < 10) {
            i11 = 10;
        }
        this.f14912b.putInt("com.yalantis.ucrop.MaxSizeX", i10);
        this.f14912b.putInt("com.yalantis.ucrop.MaxSizeY", i11);
        return this;
    }

    /* renamed from: g */
    public C6793a m19598g(a aVar) {
        this.f14912b.putAll(aVar.m19599a());
        return this;
    }
}
