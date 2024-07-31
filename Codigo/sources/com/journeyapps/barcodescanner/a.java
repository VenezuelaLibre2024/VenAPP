package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.a;
import ig.k;
import ih.n;
import ih.o;
import ih.p;
import ih.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.g;
import jh.i;
import jh.j;
import jh.l;
import jh.m;
import jh.q;

/* loaded from: classes3.dex */
public class a extends ViewGroup {
    private static final String L = "a";
    private p A;
    private Rect B;
    private Rect C;
    private p D;
    private double E;
    private q F;
    private boolean G;
    private final SurfaceHolder.Callback H;
    private final Handler.Callback I;
    private n J;
    private final f K;

    /* renamed from: a, reason: collision with root package name */
    private g f13438a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f13439b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f13440c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13441d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceView f13442e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f13443f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13444r;

    /* renamed from: s, reason: collision with root package name */
    private o f13445s;

    /* renamed from: t, reason: collision with root package name */
    private int f13446t;

    /* renamed from: u, reason: collision with root package name */
    private List<f> f13447u;

    /* renamed from: v, reason: collision with root package name */
    private m f13448v;

    /* renamed from: w, reason: collision with root package name */
    private i f13449w;

    /* renamed from: x, reason: collision with root package name */
    private p f13450x;

    /* renamed from: y, reason: collision with root package name */
    private p f13451y;

    /* renamed from: z, reason: collision with root package name */
    private Rect f13452z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.journeyapps.barcodescanner.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class TextureViewSurfaceTextureListenerC0191a implements TextureView.SurfaceTextureListener {
        TextureViewSurfaceTextureListenerC0191a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a.this.A = new p(i10, i11);
            a.this.C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements SurfaceHolder.Callback {
        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                Log.e(a.L, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            a.this.A = new p(i11, i12);
            a.this.C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.A = null;
        }
    }

    /* loaded from: classes3.dex */
    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f17739j) {
                a.this.w((p) message.obj);
                return true;
            }
            if (i10 != k.f17733d) {
                if (i10 != k.f17732c) {
                    return false;
                }
                a.this.K.b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!a.this.r()) {
                return false;
            }
            a.this.u();
            a.this.K.c(exc);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements n {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            a.this.z();
        }

        @Override // ih.n
        public void a(int i10) {
            a.this.f13440c.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.d.this.c();
                }
            }, 250L);
        }
    }

    /* loaded from: classes3.dex */
    class e implements f {
        e() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            Iterator it = a.this.f13447u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
            Iterator it = a.this.f13447u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
            Iterator it = a.this.f13447u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
            Iterator it = a.this.f13447u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
            Iterator it = a.this.f13447u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).e();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a();

        void b();

        void c(Exception exc);

        void d();

        void e();
    }

    public a(Context context) {
        super(context);
        this.f13441d = false;
        this.f13444r = false;
        this.f13446t = -1;
        this.f13447u = new ArrayList();
        this.f13449w = new i();
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = 0.1d;
        this.F = null;
        this.G = false;
        this.H = new b();
        this.I = new c();
        this.J = new d();
        this.K = new e();
        p(context, null, 0, 0);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13441d = false;
        this.f13444r = false;
        this.f13446t = -1;
        this.f13447u = new ArrayList();
        this.f13449w = new i();
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = 0.1d;
        this.F = null;
        this.G = false;
        this.H = new b();
        this.I = new c();
        this.J = new d();
        this.K = new e();
        p(context, attributeSet, 0, 0);
    }

    private void A() {
        View view;
        if (this.f13441d) {
            TextureView textureView = new TextureView(getContext());
            this.f13443f = textureView;
            textureView.setSurfaceTextureListener(D());
            view = this.f13443f;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f13442e = surfaceView;
            surfaceView.getHolder().addCallback(this.H);
            view = this.f13442e;
        }
        addView(view);
    }

    private void B(j jVar) {
        if (this.f13444r || this.f13438a == null) {
            return;
        }
        Log.i(L, "Starting preview");
        this.f13438a.z(jVar);
        this.f13438a.B();
        this.f13444r = true;
        x();
        this.K.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Rect rect;
        j jVar;
        p pVar = this.A;
        if (pVar == null || this.f13451y == null || (rect = this.f13452z) == null) {
            return;
        }
        if (this.f13442e == null || !pVar.equals(new p(rect.width(), this.f13452z.height()))) {
            TextureView textureView = this.f13443f;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.f13451y != null) {
                this.f13443f.setTransform(l(new p(this.f13443f.getWidth(), this.f13443f.getHeight()), this.f13451y));
            }
            jVar = new j(this.f13443f.getSurfaceTexture());
        } else {
            jVar = new j(this.f13442e.getHolder());
        }
        B(jVar);
    }

    private TextureView.SurfaceTextureListener D() {
        return new TextureViewSurfaceTextureListenerC0191a();
    }

    private int getDisplayRotation() {
        return this.f13439b.getDefaultDisplay().getRotation();
    }

    private void j() {
        p pVar;
        m mVar;
        p pVar2 = this.f13450x;
        if (pVar2 == null || (pVar = this.f13451y) == null || (mVar = this.f13448v) == null) {
            this.C = null;
            this.B = null;
            this.f13452z = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = pVar.f17804a;
        int i11 = pVar.f17805b;
        int i12 = pVar2.f17804a;
        int i13 = pVar2.f17805b;
        Rect d10 = mVar.d(pVar);
        if (d10.width() <= 0 || d10.height() <= 0) {
            return;
        }
        this.f13452z = d10;
        this.B = k(new Rect(0, 0, i12, i13), this.f13452z);
        Rect rect = new Rect(this.B);
        Rect rect2 = this.f13452z;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f13452z.width(), (rect.top * i11) / this.f13452z.height(), (rect.right * i10) / this.f13452z.width(), (rect.bottom * i11) / this.f13452z.height());
        this.C = rect3;
        if (rect3.width() > 0 && this.C.height() > 0) {
            this.K.a();
            return;
        }
        this.C = null;
        this.B = null;
        Log.w(L, "Preview frame is too small");
    }

    private void m(p pVar) {
        this.f13450x = pVar;
        g gVar = this.f13438a;
        if (gVar == null || gVar.n() != null) {
            return;
        }
        m mVar = new m(getDisplayRotation(), pVar);
        this.f13448v = mVar;
        mVar.e(getPreviewScalingStrategy());
        this.f13438a.x(this.f13448v);
        this.f13438a.m();
        boolean z10 = this.G;
        if (z10) {
            this.f13438a.A(z10);
        }
    }

    private void o() {
        if (this.f13438a != null) {
            Log.w(L, "initCamera called twice");
            return;
        }
        g n10 = n();
        this.f13438a = n10;
        n10.y(this.f13440c);
        this.f13438a.u();
        this.f13446t = getDisplayRotation();
    }

    private void p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f13439b = (WindowManager) context.getSystemService("window");
        this.f13440c = new Handler(this.I);
        this.f13445s = new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(p pVar) {
        this.f13451y = pVar;
        if (this.f13450x != null) {
            j();
            requestLayout();
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (!r() || getDisplayRotation() == this.f13446t) {
            return;
        }
        u();
        y();
    }

    public g getCameraInstance() {
        return this.f13438a;
    }

    public i getCameraSettings() {
        return this.f13449w;
    }

    public Rect getFramingRect() {
        return this.B;
    }

    public p getFramingRectSize() {
        return this.D;
    }

    public double getMarginFraction() {
        return this.E;
    }

    public Rect getPreviewFramingRect() {
        return this.C;
    }

    public q getPreviewScalingStrategy() {
        q qVar = this.F;
        return qVar != null ? qVar : this.f13443f != null ? new l() : new jh.n();
    }

    public p getPreviewSize() {
        return this.f13451y;
    }

    public void i(f fVar) {
        this.f13447u.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.D != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.D.f17804a) / 2), Math.max(0, (rect3.height() - this.D.f17805b) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.E, rect3.height() * this.E);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix l(p pVar, p pVar2) {
        float f10;
        float f11 = pVar.f17804a / pVar.f17805b;
        float f12 = pVar2.f17804a / pVar2.f17805b;
        float f13 = 1.0f;
        if (f11 < f12) {
            float f14 = f12 / f11;
            f10 = 1.0f;
            f13 = f14;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = pVar.f17804a;
        int i11 = pVar.f17805b;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    protected g n() {
        g gVar = new g(getContext());
        gVar.w(this.f13449w);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m(new p(i12 - i10, i13 - i11));
        View view = this.f13442e;
        if (view != null) {
            Rect rect = this.f13452z;
            if (rect != null) {
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        } else {
            view = this.f13443f;
            if (view == null) {
                return;
            }
        }
        view.layout(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.G);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(AttributeSet attributeSet) {
        q oVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ig.o.f17756i);
        int dimension = (int) obtainStyledAttributes.getDimension(ig.o.f17758k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(ig.o.f17757j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.D = new p(dimension, dimension2);
        }
        this.f13441d = obtainStyledAttributes.getBoolean(ig.o.f17760m, true);
        int integer = obtainStyledAttributes.getInteger(ig.o.f17759l, -1);
        if (integer == 1) {
            oVar = new l();
        } else {
            if (integer != 2) {
                if (integer == 3) {
                    oVar = new jh.o();
                }
                obtainStyledAttributes.recycle();
            }
            oVar = new jh.n();
        }
        this.F = oVar;
        obtainStyledAttributes.recycle();
    }

    protected boolean r() {
        return this.f13438a != null;
    }

    public boolean s() {
        g gVar = this.f13438a;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f13449w = iVar;
    }

    public void setFramingRectSize(p pVar) {
        this.D = pVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.E = d10;
    }

    public void setPreviewScalingStrategy(q qVar) {
        this.F = qVar;
    }

    public void setTorch(boolean z10) {
        this.G = z10;
        g gVar = this.f13438a;
        if (gVar != null) {
            gVar.A(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f13441d = z10;
    }

    public boolean t() {
        return this.f13444r;
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        r.a();
        Log.d(L, "pause()");
        this.f13446t = -1;
        g gVar = this.f13438a;
        if (gVar != null) {
            gVar.l();
            this.f13438a = null;
            this.f13444r = false;
        } else {
            this.f13440c.sendEmptyMessage(k.f17732c);
        }
        if (this.A == null && (surfaceView = this.f13442e) != null) {
            surfaceView.getHolder().removeCallback(this.H);
        }
        if (this.A == null && (textureView = this.f13443f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f13450x = null;
        this.f13451y = null;
        this.C = null;
        this.f13445s.f();
        this.K.d();
    }

    public void v() {
        g cameraInstance = getCameraInstance();
        u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
    }

    public void y() {
        r.a();
        Log.d(L, "resume()");
        o();
        if (this.A != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f13442e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.H);
            } else {
                TextureView textureView = this.f13443f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.f13443f.getSurfaceTexture(), this.f13443f.getWidth(), this.f13443f.getHeight());
                    } else {
                        this.f13443f.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.f13445s.e(getContext(), this.J);
    }
}
