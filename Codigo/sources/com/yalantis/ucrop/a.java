package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Intent f13593a = new Intent();

    /* renamed from: b, reason: collision with root package name */
    private Bundle f13594b;

    /* renamed from: com.yalantis.ucrop.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0198a {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f13595a = new Bundle();

        public Bundle a() {
            return this.f13595a;
        }

        public void b(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i10);
        }

        public void c(int i10, di.a... aVarArr) {
            if (i10 >= aVarArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", Integer.valueOf(i10), Integer.valueOf(aVarArr.length)));
            }
            this.f13595a.putInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", i10);
            this.f13595a.putParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions", new ArrayList<>(Arrays.asList(aVarArr)));
        }

        public void d(boolean z10) {
            this.f13595a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z10);
        }

        public void e(Bitmap.CompressFormat compressFormat) {
            this.f13595a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        public void f(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CompressionQuality", i10);
        }

        public void g(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropFrameColor", i10);
        }

        public void h(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropFrameStrokeWidth", i10);
        }

        public void i(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropGridColor", i10);
        }

        public void j(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropGridColumnCount", i10);
        }

        public void k(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropGridRowCount", i10);
        }

        public void l(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.CropGridStrokeWidth", i10);
        }

        public void m(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.DimmedLayerColor", i10);
        }

        public void n(boolean z10) {
            this.f13595a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z10);
        }

        public void o(boolean z10) {
            this.f13595a.putBoolean("com.yalantis.ucrop.HideBottomControls", z10);
        }

        public void p(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", i10);
        }

        public void q(boolean z10) {
            this.f13595a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z10);
        }

        public void r(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.StatusBarColor", i10);
        }

        public void s(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.ToolbarColor", i10);
        }

        public void t(String str) {
            this.f13595a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        public void u(int i10) {
            this.f13595a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i10);
        }
    }

    private a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f13594b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f13594b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static Throwable a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    public static Uri c(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static a d(Uri uri, Uri uri2) {
        return new a(uri, uri2);
    }

    public Intent b(Context context) {
        this.f13593a.setClass(context, UCropActivity.class);
        this.f13593a.putExtras(this.f13594b);
        return this.f13593a;
    }

    public a e(float f10, float f11) {
        this.f13594b.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
        this.f13594b.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        return this;
    }

    public a f(int i10, int i11) {
        if (i10 < 10) {
            i10 = 10;
        }
        if (i11 < 10) {
            i11 = 10;
        }
        this.f13594b.putInt("com.yalantis.ucrop.MaxSizeX", i10);
        this.f13594b.putInt("com.yalantis.ucrop.MaxSizeY", i11);
        return this;
    }

    public a g(C0198a c0198a) {
        this.f13594b.putAll(c0198a.a());
        return this;
    }
}
