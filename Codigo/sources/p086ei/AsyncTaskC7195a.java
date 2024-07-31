package p086ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import ci.InterfaceC2008a;
import fi.C7356a;
import fi.C7360e;
import fi.C7361f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import p068di.C6973b;
import p068di.C6974c;
import p068di.C6975d;

/* renamed from: ei.a */
/* loaded from: classes3.dex */
public class AsyncTaskC7195a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private final WeakReference<Context> f16107a;

    /* renamed from: b */
    private Bitmap f16108b;

    /* renamed from: c */
    private final RectF f16109c;

    /* renamed from: d */
    private final RectF f16110d;

    /* renamed from: e */
    private float f16111e;

    /* renamed from: f */
    private float f16112f;

    /* renamed from: g */
    private final int f16113g;

    /* renamed from: h */
    private final int f16114h;

    /* renamed from: i */
    private final Bitmap.CompressFormat f16115i;

    /* renamed from: j */
    private final int f16116j;

    /* renamed from: k */
    private final String f16117k;

    /* renamed from: l */
    private final String f16118l;

    /* renamed from: m */
    private final Uri f16119m;

    /* renamed from: n */
    private final Uri f16120n;

    /* renamed from: o */
    private final C6974c f16121o;

    /* renamed from: p */
    private final InterfaceC2008a f16122p;

    /* renamed from: q */
    private int f16123q;

    /* renamed from: r */
    private int f16124r;

    /* renamed from: s */
    private int f16125s;

    /* renamed from: t */
    private int f16126t;

    public AsyncTaskC7195a(Context context, Bitmap bitmap, C6975d c6975d, C6973b c6973b, InterfaceC2008a interfaceC2008a) {
        this.f16107a = new WeakReference<>(context);
        this.f16108b = bitmap;
        this.f16109c = c6975d.m20188a();
        this.f16110d = c6975d.m20190c();
        this.f16111e = c6975d.m20191d();
        this.f16112f = c6975d.m20189b();
        this.f16113g = c6973b.m20184h();
        this.f16114h = c6973b.m20185i();
        this.f16115i = c6973b.m20177a();
        this.f16116j = c6973b.m20178b();
        this.f16117k = c6973b.m20182f();
        this.f16118l = c6973b.m20183g();
        this.f16119m = c6973b.m20179c();
        this.f16120n = c6973b.m20180d();
        this.f16121o = c6973b.m20181e();
        this.f16122p = interfaceC2008a;
    }

    /* renamed from: a */
    private void m21439a(Context context) {
        boolean m22196h = C7356a.m22196h(this.f16119m);
        boolean m22196h2 = C7356a.m22196h(this.f16120n);
        if (m22196h && m22196h2) {
            C7361f.m22206b(context, this.f16123q, this.f16124r, this.f16119m, this.f16120n);
            return;
        }
        if (m22196h) {
            C7361f.m22207c(context, this.f16123q, this.f16124r, this.f16119m, this.f16118l);
        } else if (m22196h2) {
            C7361f.m22208d(context, new C1239a(this.f16117k), this.f16123q, this.f16124r, this.f16120n);
        } else {
            C7361f.m22209e(new C1239a(this.f16117k), this.f16123q, this.f16124r, this.f16118l);
        }
    }

    /* renamed from: b */
    private boolean m21440b() {
        Context context = this.f16107a.get();
        if (context == null) {
            return false;
        }
        if (this.f16113g > 0 && this.f16114h > 0) {
            float width = this.f16109c.width() / this.f16111e;
            float height = this.f16109c.height() / this.f16111e;
            int i10 = this.f16113g;
            if (width > i10 || height > this.f16114h) {
                float min = Math.min(i10 / width, this.f16114h / height);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f16108b, Math.round(r3.getWidth() * min), Math.round(this.f16108b.getHeight() * min), false);
                Bitmap bitmap = this.f16108b;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.f16108b = createScaledBitmap;
                this.f16111e /= min;
            }
        }
        if (this.f16112f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f16112f, this.f16108b.getWidth() / 2, this.f16108b.getHeight() / 2);
            Bitmap bitmap2 = this.f16108b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f16108b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f16108b;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.f16108b = createBitmap;
        }
        this.f16125s = Math.round((this.f16109c.left - this.f16110d.left) / this.f16111e);
        this.f16126t = Math.round((this.f16109c.top - this.f16110d.top) / this.f16111e);
        this.f16123q = Math.round(this.f16109c.width() / this.f16111e);
        int round = Math.round(this.f16109c.height() / this.f16111e);
        this.f16124r = round;
        boolean m21442f = m21442f(this.f16123q, round);
        Log.i("BitmapCropTask", "Should crop: " + m21442f);
        if (!m21442f) {
            C7360e.m22204a(context, this.f16119m, this.f16120n);
            return false;
        }
        m21441e(Bitmap.createBitmap(this.f16108b, this.f16125s, this.f16126t, this.f16123q, this.f16124r));
        if (!this.f16115i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        m21439a(context);
        return true;
    }

    /* renamed from: e */
    private void m21441e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream openOutputStream;
        Context context = this.f16107a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            openOutputStream = context.getContentResolver().openOutputStream(this.f16120n);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            bitmap.compress(this.f16115i, this.f16116j, byteArrayOutputStream);
            openOutputStream.write(byteArrayOutputStream.toByteArray());
            bitmap.recycle();
            C7356a.m22191c(openOutputStream);
        } catch (IOException e12) {
            e = e12;
            outputStream = openOutputStream;
            try {
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                C7356a.m22191c(outputStream);
                C7356a.m22191c(byteArrayOutputStream);
            } catch (Throwable th4) {
                th = th4;
                C7356a.m22191c(outputStream);
                C7356a.m22191c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = openOutputStream;
            C7356a.m22191c(outputStream);
            C7356a.m22191c(byteArrayOutputStream);
            throw th;
        }
        C7356a.m22191c(byteArrayOutputStream);
    }

    /* renamed from: f */
    private boolean m21442f(int i10, int i11) {
        int round = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f16113g > 0 && this.f16114h > 0) {
            return true;
        }
        float f10 = round;
        return Math.abs(this.f16109c.left - this.f16110d.left) > f10 || Math.abs(this.f16109c.top - this.f16110d.top) > f10 || Math.abs(this.f16109c.bottom - this.f16110d.bottom) > f10 || Math.abs(this.f16109c.right - this.f16110d.right) > f10 || this.f16112f != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f16108b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f16110d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f16120n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            m21440b();
            this.f16108b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th2) {
        InterfaceC2008a interfaceC2008a = this.f16122p;
        if (interfaceC2008a != null) {
            if (th2 != null) {
                interfaceC2008a.mo10305b(th2);
            } else {
                this.f16122p.mo10304a(C7356a.m22196h(this.f16120n) ? this.f16120n : Uri.fromFile(new File(this.f16118l)), this.f16125s, this.f16126t, this.f16123q, this.f16124r);
            }
        }
    }
}
