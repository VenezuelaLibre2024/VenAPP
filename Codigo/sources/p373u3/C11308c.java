package p373u3;

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
import com.bumptech.glide.ComponentCallbacks2C2116b;
import java.nio.ByteBuffer;
import java.util.List;
import p034c2.AbstractC1836a;
import p036c4.C1870k;
import p115g3.InterfaceC7442a;
import p129h3.InterfaceC7628l;
import p373u3.C11312g;

/* renamed from: u3.c */
/* loaded from: classes.dex */
public class C11308c extends Drawable implements C11312g.b, Animatable {

    /* renamed from: a */
    private final a f29333a;

    /* renamed from: b */
    private boolean f29334b;

    /* renamed from: c */
    private boolean f29335c;

    /* renamed from: d */
    private boolean f29336d;

    /* renamed from: e */
    private boolean f29337e;

    /* renamed from: f */
    private int f29338f;

    /* renamed from: r */
    private int f29339r;

    /* renamed from: s */
    private boolean f29340s;

    /* renamed from: t */
    private Paint f29341t;

    /* renamed from: u */
    private Rect f29342u;

    /* renamed from: v */
    private List<AbstractC1836a> f29343v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u3.c$a */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final C11312g f29344a;

        a(C11312g c11312g) {
            this.f29344a = c11312g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C11308c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C11308c(Context context, InterfaceC7442a interfaceC7442a, InterfaceC7628l<Bitmap> interfaceC7628l, int i10, int i11, Bitmap bitmap) {
        this(new a(new C11312g(ComponentCallbacks2C2116b.m10641d(context), interfaceC7442a, i10, i11, interfaceC7628l, bitmap)));
    }

    C11308c(a aVar) {
        this.f29337e = true;
        this.f29339r = -1;
        this.f29333a = (a) C1870k.m9950d(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private Drawable.Callback m35315b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m35316d() {
        if (this.f29342u == null) {
            this.f29342u = new Rect();
        }
        return this.f29342u;
    }

    /* renamed from: h */
    private Paint m35317h() {
        if (this.f29341t == null) {
            this.f29341t = new Paint(2);
        }
        return this.f29341t;
    }

    /* renamed from: j */
    private void m35318j() {
        List<AbstractC1836a> list = this.f29343v;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f29343v.get(i10).m9870a(this);
            }
        }
    }

    /* renamed from: l */
    private void m35319l() {
        this.f29338f = 0;
    }

    /* renamed from: n */
    private void m35320n() {
        C1870k.m9947a(!this.f29336d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f29333a.f29344a.m35342f() != 1) {
            if (this.f29334b) {
                return;
            }
            this.f29334b = true;
            this.f29333a.f29344a.m35348r(this);
        }
        invalidateSelf();
    }

    /* renamed from: o */
    private void m35321o() {
        this.f29334b = false;
        this.f29333a.f29344a.m35349s(this);
    }

    @Override // p373u3.C11312g.b
    /* renamed from: a */
    public void mo35322a() {
        if (m35315b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m35326g() == m35325f() - 1) {
            this.f29338f++;
        }
        int i10 = this.f29339r;
        if (i10 == -1 || this.f29338f < i10) {
            return;
        }
        m35318j();
        stop();
    }

    /* renamed from: c */
    public ByteBuffer m35323c() {
        return this.f29333a.f29344a.m35338b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f29336d) {
            return;
        }
        if (this.f29340s) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m35316d());
            this.f29340s = false;
        }
        canvas.drawBitmap(this.f29333a.f29344a.m35339c(), (Rect) null, m35316d(), m35317h());
    }

    /* renamed from: e */
    public Bitmap m35324e() {
        return this.f29333a.f29344a.m35341e();
    }

    /* renamed from: f */
    public int m35325f() {
        return this.f29333a.f29344a.m35342f();
    }

    /* renamed from: g */
    public int m35326g() {
        return this.f29333a.f29344a.m35340d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f29333a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29333a.f29344a.m35343h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29333a.f29344a.m35345k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int m35327i() {
        return this.f29333a.f29344a.m35344j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29334b;
    }

    /* renamed from: k */
    public void m35328k() {
        this.f29336d = true;
        this.f29333a.f29344a.m35337a();
    }

    /* renamed from: m */
    public void m35329m(InterfaceC7628l<Bitmap> interfaceC7628l, Bitmap bitmap) {
        this.f29333a.f29344a.m35347o(interfaceC7628l, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f29340s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        m35317h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m35317h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        C1870k.m9947a(!this.f29336d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f29337e = z10;
        if (!z10) {
            m35321o();
        } else if (this.f29335c) {
            m35320n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f29335c = true;
        m35319l();
        if (this.f29337e) {
            m35320n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f29335c = false;
        m35321o();
    }
}
