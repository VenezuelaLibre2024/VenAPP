package u3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c4.k;
import h3.l;
import java.nio.ByteBuffer;
import java.util.List;
import u3.g;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a */
    private final a f27031a;

    /* renamed from: b */
    private boolean f27032b;

    /* renamed from: c */
    private boolean f27033c;

    /* renamed from: d */
    private boolean f27034d;

    /* renamed from: e */
    private boolean f27035e;

    /* renamed from: f */
    private int f27036f;

    /* renamed from: r */
    private int f27037r;

    /* renamed from: s */
    private boolean f27038s;

    /* renamed from: t */
    private Paint f27039t;

    /* renamed from: u */
    private Rect f27040u;

    /* renamed from: v */
    private List<c2.a> f27041v;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final g f27042a;

        a(g gVar) {
            this.f27042a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public c(Context context, g3.a aVar, l<Bitmap> lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), aVar, i10, i11, lVar, bitmap)));
    }

    c(a aVar) {
        this.f27035e = true;
        this.f27037r = -1;
        this.f27031a = (a) k.d(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f27040u == null) {
            this.f27040u = new Rect();
        }
        return this.f27040u;
    }

    private Paint h() {
        if (this.f27039t == null) {
            this.f27039t = new Paint(2);
        }
        return this.f27039t;
    }

    private void j() {
        List<c2.a> list = this.f27041v;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f27041v.get(i10).a(this);
            }
        }
    }

    private void l() {
        this.f27036f = 0;
    }

    private void n() {
        k.a(!this.f27034d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f27031a.f27042a.f() != 1) {
            if (this.f27032b) {
                return;
            }
            this.f27032b = true;
            this.f27031a.f27042a.r(this);
        }
        invalidateSelf();
    }

    private void o() {
        this.f27032b = false;
        this.f27031a.f27042a.s(this);
    }

    @Override // u3.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f27036f++;
        }
        int i10 = this.f27037r;
        if (i10 == -1 || this.f27036f < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f27031a.f27042a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f27034d) {
            return;
        }
        if (this.f27038s) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f27038s = false;
        }
        canvas.drawBitmap(this.f27031a.f27042a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f27031a.f27042a.e();
    }

    public int f() {
        return this.f27031a.f27042a.f();
    }

    public int g() {
        return this.f27031a.f27042a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f27031a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27031a.f27042a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27031a.f27042a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f27031a.f27042a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f27032b;
    }

    public void k() {
        this.f27034d = true;
        this.f27031a.f27042a.a();
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f27031a.f27042a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27038s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f27034d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f27035e = z10;
        if (!z10) {
            o();
        } else if (this.f27033c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f27033c = true;
        l();
        if (this.f27035e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f27033c = false;
        o();
    }
}
