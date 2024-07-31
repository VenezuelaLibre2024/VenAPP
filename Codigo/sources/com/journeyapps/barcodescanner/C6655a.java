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
import com.journeyapps.barcodescanner.C6655a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p162ig.C7979k;
import p162ig.C7983o;
import p163ih.C7998o;
import p163ih.C7999p;
import p163ih.C8001r;
import p163ih.InterfaceC7997n;
import p184jh.AbstractC9066q;
import p184jh.C9056g;
import p184jh.C9058i;
import p184jh.C9059j;
import p184jh.C9061l;
import p184jh.C9062m;
import p184jh.C9063n;
import p184jh.C9064o;

/* renamed from: com.journeyapps.barcodescanner.a */
/* loaded from: classes3.dex */
public class C6655a extends ViewGroup {

    /* renamed from: L */
    private static final String f14718L = "a";

    /* renamed from: A */
    private C7999p f14719A;

    /* renamed from: B */
    private Rect f14720B;

    /* renamed from: C */
    private Rect f14721C;

    /* renamed from: D */
    private C7999p f14722D;

    /* renamed from: E */
    private double f14723E;

    /* renamed from: F */
    private AbstractC9066q f14724F;

    /* renamed from: G */
    private boolean f14725G;

    /* renamed from: H */
    private final SurfaceHolder.Callback f14726H;

    /* renamed from: I */
    private final Handler.Callback f14727I;

    /* renamed from: J */
    private InterfaceC7997n f14728J;

    /* renamed from: K */
    private final f f14729K;

    /* renamed from: a */
    private C9056g f14730a;

    /* renamed from: b */
    private WindowManager f14731b;

    /* renamed from: c */
    private Handler f14732c;

    /* renamed from: d */
    private boolean f14733d;

    /* renamed from: e */
    private SurfaceView f14734e;

    /* renamed from: f */
    private TextureView f14735f;

    /* renamed from: r */
    private boolean f14736r;

    /* renamed from: s */
    private C7998o f14737s;

    /* renamed from: t */
    private int f14738t;

    /* renamed from: u */
    private List<f> f14739u;

    /* renamed from: v */
    private C9062m f14740v;

    /* renamed from: w */
    private C9058i f14741w;

    /* renamed from: x */
    private C7999p f14742x;

    /* renamed from: y */
    private C7999p f14743y;

    /* renamed from: z */
    private Rect f14744z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.journeyapps.barcodescanner.a$a */
    /* loaded from: classes3.dex */
    public class a implements TextureView.SurfaceTextureListener {
        a() {
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
            C6655a.this.f14719A = new C7999p(i10, i11);
            C6655a.this.m19421C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$b */
    /* loaded from: classes3.dex */
    class b implements SurfaceHolder.Callback {
        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                Log.e(C6655a.f14718L, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C6655a.this.f14719A = new C7999p(i11, i12);
            C6655a.this.m19421C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C6655a.this.f14719A = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$c */
    /* loaded from: classes3.dex */
    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == C7979k.f19402j) {
                C6655a.this.m19435w((C7999p) message.obj);
                return true;
            }
            if (i10 != C7979k.f19396d) {
                if (i10 != C7979k.f19395c) {
                    return false;
                }
                C6655a.this.f14729K.mo19415b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!C6655a.this.m19442r()) {
                return false;
            }
            C6655a.this.mo19397u();
            C6655a.this.f14729K.mo19416c(exc);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.journeyapps.barcodescanner.a$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC7997n {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m19448c() {
            C6655a.this.m19436z();
        }

        @Override // p163ih.InterfaceC7997n
        /* renamed from: a */
        public void mo19449a(int i10) {
            C6655a.this.f14732c.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6655a.d.this.m19448c();
                }
            }, 250L);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$e */
    /* loaded from: classes3.dex */
    class e implements f {
        e() {
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: a */
        public void mo19414a() {
            Iterator it = C6655a.this.f14739u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo19414a();
            }
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: b */
        public void mo19415b() {
            Iterator it = C6655a.this.f14739u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo19415b();
            }
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: c */
        public void mo19416c(Exception exc) {
            Iterator it = C6655a.this.f14739u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo19416c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: d */
        public void mo19417d() {
            Iterator it = C6655a.this.f14739u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo19417d();
            }
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: e */
        public void mo19418e() {
            Iterator it = C6655a.this.f14739u.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo19418e();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        void mo19414a();

        /* renamed from: b */
        void mo19415b();

        /* renamed from: c */
        void mo19416c(Exception exc);

        /* renamed from: d */
        void mo19417d();

        /* renamed from: e */
        void mo19418e();
    }

    public C6655a(Context context) {
        super(context);
        this.f14733d = false;
        this.f14736r = false;
        this.f14738t = -1;
        this.f14739u = new ArrayList();
        this.f14741w = new C9058i();
        this.f14720B = null;
        this.f14721C = null;
        this.f14722D = null;
        this.f14723E = 0.1d;
        this.f14724F = null;
        this.f14725G = false;
        this.f14726H = new b();
        this.f14727I = new c();
        this.f14728J = new d();
        this.f14729K = new e();
        m19434p(context, null, 0, 0);
    }

    public C6655a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14733d = false;
        this.f14736r = false;
        this.f14738t = -1;
        this.f14739u = new ArrayList();
        this.f14741w = new C9058i();
        this.f14720B = null;
        this.f14721C = null;
        this.f14722D = null;
        this.f14723E = 0.1d;
        this.f14724F = null;
        this.f14725G = false;
        this.f14726H = new b();
        this.f14727I = new c();
        this.f14728J = new d();
        this.f14729K = new e();
        m19434p(context, attributeSet, 0, 0);
    }

    /* renamed from: A */
    private void m19419A() {
        View view;
        if (this.f14733d) {
            TextureView textureView = new TextureView(getContext());
            this.f14735f = textureView;
            textureView.setSurfaceTextureListener(m19422D());
            view = this.f14735f;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f14734e = surfaceView;
            surfaceView.getHolder().addCallback(this.f14726H);
            view = this.f14734e;
        }
        addView(view);
    }

    /* renamed from: B */
    private void m19420B(C9059j c9059j) {
        if (this.f14736r || this.f14730a == null) {
            return;
        }
        Log.i(f14718L, "Starting preview");
        this.f14730a.m26616z(c9059j);
        this.f14730a.m26606B();
        this.f14736r = true;
        mo19398x();
        this.f14729K.mo19418e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m19421C() {
        Rect rect;
        C9059j c9059j;
        C7999p c7999p = this.f14719A;
        if (c7999p == null || this.f14743y == null || (rect = this.f14744z) == null) {
            return;
        }
        if (this.f14734e == null || !c7999p.equals(new C7999p(rect.width(), this.f14744z.height()))) {
            TextureView textureView = this.f14735f;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.f14743y != null) {
                this.f14735f.setTransform(m19439l(new C7999p(this.f14735f.getWidth(), this.f14735f.getHeight()), this.f14743y));
            }
            c9059j = new C9059j(this.f14735f.getSurfaceTexture());
        } else {
            c9059j = new C9059j(this.f14734e.getHolder());
        }
        m19420B(c9059j);
    }

    /* renamed from: D */
    private TextureView.SurfaceTextureListener m19422D() {
        return new a();
    }

    private int getDisplayRotation() {
        return this.f14731b.getDefaultDisplay().getRotation();
    }

    /* renamed from: j */
    private void m19431j() {
        C7999p c7999p;
        C9062m c9062m;
        C7999p c7999p2 = this.f14742x;
        if (c7999p2 == null || (c7999p = this.f14743y) == null || (c9062m = this.f14740v) == null) {
            this.f14721C = null;
            this.f14720B = null;
            this.f14744z = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = c7999p.f19467a;
        int i11 = c7999p.f19468b;
        int i12 = c7999p2.f19467a;
        int i13 = c7999p2.f19468b;
        Rect m26664d = c9062m.m26664d(c7999p);
        if (m26664d.width() <= 0 || m26664d.height() <= 0) {
            return;
        }
        this.f14744z = m26664d;
        this.f14720B = mo19438k(new Rect(0, 0, i12, i13), this.f14744z);
        Rect rect = new Rect(this.f14720B);
        Rect rect2 = this.f14744z;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f14744z.width(), (rect.top * i11) / this.f14744z.height(), (rect.right * i10) / this.f14744z.width(), (rect.bottom * i11) / this.f14744z.height());
        this.f14721C = rect3;
        if (rect3.width() > 0 && this.f14721C.height() > 0) {
            this.f14729K.mo19414a();
            return;
        }
        this.f14721C = null;
        this.f14720B = null;
        Log.w(f14718L, "Preview frame is too small");
    }

    /* renamed from: m */
    private void m19432m(C7999p c7999p) {
        this.f14742x = c7999p;
        C9056g c9056g = this.f14730a;
        if (c9056g == null || c9056g.m26609n() != null) {
            return;
        }
        C9062m c9062m = new C9062m(getDisplayRotation(), c7999p);
        this.f14740v = c9062m;
        c9062m.m26665e(getPreviewScalingStrategy());
        this.f14730a.m26614x(this.f14740v);
        this.f14730a.m26608m();
        boolean z10 = this.f14725G;
        if (z10) {
            this.f14730a.m26605A(z10);
        }
    }

    /* renamed from: o */
    private void m19433o() {
        if (this.f14730a != null) {
            Log.w(f14718L, "initCamera called twice");
            return;
        }
        C9056g m19440n = m19440n();
        this.f14730a = m19440n;
        m19440n.m26615y(this.f14732c);
        this.f14730a.m26611u();
        this.f14738t = getDisplayRotation();
    }

    /* renamed from: p */
    private void m19434p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        m19441q(attributeSet);
        this.f14731b = (WindowManager) context.getSystemService("window");
        this.f14732c = new Handler(this.f14727I);
        this.f14737s = new C7998o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m19435w(C7999p c7999p) {
        this.f14743y = c7999p;
        if (this.f14742x != null) {
            m19431j();
            requestLayout();
            m19421C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m19436z() {
        if (!m19442r() || getDisplayRotation() == this.f14738t) {
            return;
        }
        mo19397u();
        m19446y();
    }

    public C9056g getCameraInstance() {
        return this.f14730a;
    }

    public C9058i getCameraSettings() {
        return this.f14741w;
    }

    public Rect getFramingRect() {
        return this.f14720B;
    }

    public C7999p getFramingRectSize() {
        return this.f14722D;
    }

    public double getMarginFraction() {
        return this.f14723E;
    }

    public Rect getPreviewFramingRect() {
        return this.f14721C;
    }

    public AbstractC9066q getPreviewScalingStrategy() {
        AbstractC9066q abstractC9066q = this.f14724F;
        return abstractC9066q != null ? abstractC9066q : this.f14735f != null ? new C9061l() : new C9063n();
    }

    public C7999p getPreviewSize() {
        return this.f14743y;
    }

    /* renamed from: i */
    public void m19437i(f fVar) {
        this.f14739u.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public Rect mo19438k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f14722D != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f14722D.f19467a) / 2), Math.max(0, (rect3.height() - this.f14722D.f19468b) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.f14723E, rect3.height() * this.f14723E);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* renamed from: l */
    protected Matrix m19439l(C7999p c7999p, C7999p c7999p2) {
        float f10;
        float f11 = c7999p.f19467a / c7999p.f19468b;
        float f12 = c7999p2.f19467a / c7999p2.f19468b;
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
        int i10 = c7999p.f19467a;
        int i11 = c7999p.f19468b;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    /* renamed from: n */
    protected C9056g m19440n() {
        C9056g c9056g = new C9056g(getContext());
        c9056g.m26613w(this.f14741w);
        return c9056g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m19419A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m19432m(new C7999p(i12 - i10, i13 - i11));
        View view = this.f14734e;
        if (view != null) {
            Rect rect = this.f14744z;
            if (rect != null) {
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        } else {
            view = this.f14735f;
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
        bundle.putBoolean("torch", this.f14725G);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m19441q(AttributeSet attributeSet) {
        AbstractC9066q c9064o;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7983o.f19419i);
        int dimension = (int) obtainStyledAttributes.getDimension(C7983o.f19421k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C7983o.f19420j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f14722D = new C7999p(dimension, dimension2);
        }
        this.f14733d = obtainStyledAttributes.getBoolean(C7983o.f19423m, true);
        int integer = obtainStyledAttributes.getInteger(C7983o.f19422l, -1);
        if (integer == 1) {
            c9064o = new C9061l();
        } else {
            if (integer != 2) {
                if (integer == 3) {
                    c9064o = new C9064o();
                }
                obtainStyledAttributes.recycle();
            }
            c9064o = new C9063n();
        }
        this.f14724F = c9064o;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r */
    protected boolean m19442r() {
        return this.f14730a != null;
    }

    /* renamed from: s */
    public boolean m19443s() {
        C9056g c9056g = this.f14730a;
        return c9056g == null || c9056g.m26610p();
    }

    public void setCameraSettings(C9058i c9058i) {
        this.f14741w = c9058i;
    }

    public void setFramingRectSize(C7999p c7999p) {
        this.f14722D = c7999p;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f14723E = d10;
    }

    public void setPreviewScalingStrategy(AbstractC9066q abstractC9066q) {
        this.f14724F = abstractC9066q;
    }

    public void setTorch(boolean z10) {
        this.f14725G = z10;
        C9056g c9056g = this.f14730a;
        if (c9056g != null) {
            c9056g.m26605A(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f14733d = z10;
    }

    /* renamed from: t */
    public boolean m19444t() {
        return this.f14736r;
    }

    /* renamed from: u */
    public void mo19397u() {
        TextureView textureView;
        SurfaceView surfaceView;
        C8001r.m24578a();
        Log.d(f14718L, "pause()");
        this.f14738t = -1;
        C9056g c9056g = this.f14730a;
        if (c9056g != null) {
            c9056g.m26607l();
            this.f14730a = null;
            this.f14736r = false;
        } else {
            this.f14732c.sendEmptyMessage(C7979k.f19395c);
        }
        if (this.f14719A == null && (surfaceView = this.f14734e) != null) {
            surfaceView.getHolder().removeCallback(this.f14726H);
        }
        if (this.f14719A == null && (textureView = this.f14735f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f14742x = null;
        this.f14743y = null;
        this.f14721C = null;
        this.f14737s.m24567f();
        this.f14729K.mo19417d();
    }

    /* renamed from: v */
    public void m19445v() {
        C9056g cameraInstance = getCameraInstance();
        mo19397u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.m26610p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void mo19398x() {
    }

    /* renamed from: y */
    public void m19446y() {
        C8001r.m24578a();
        Log.d(f14718L, "resume()");
        m19433o();
        if (this.f14719A != null) {
            m19421C();
        } else {
            SurfaceView surfaceView = this.f14734e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f14726H);
            } else {
                TextureView textureView = this.f14735f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        m19422D().onSurfaceTextureAvailable(this.f14735f.getSurfaceTexture(), this.f14735f.getWidth(), this.f14735f.getHeight());
                    } else {
                        this.f14735f.setSurfaceTextureListener(m19422D());
                    }
                }
            }
        }
        requestLayout();
        this.f14737s.m24566e(getContext(), this.f14728J);
    }
}
