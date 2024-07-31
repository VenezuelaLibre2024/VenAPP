package pl;

import android.content.Context;
import android.graphics.Rect;
import com.journeyapps.barcodescanner.BarcodeView;
import ih.p;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a extends BarcodeView {
    public static final C0386a T = new C0386a(null);
    private int S;

    /* renamed from: pl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0386a {
        private C0386a() {
        }

        public /* synthetic */ C0386a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public a(Context context) {
        super(context);
        this.S = -1;
    }

    public final void O(int i10, int i11, int i12) {
        this.S = i12;
        setFramingRectSize(new p(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.journeyapps.barcodescanner.a
    public Rect k(Rect container, Rect surface) {
        n.e(container, "container");
        n.e(surface, "surface");
        Rect rect = new Rect(container);
        rect.intersect(surface);
        Rect k10 = super.k(container, surface);
        if (this.S != -1) {
            Rect rect2 = new Rect(k10);
            int i10 = rect2.bottom;
            int i11 = this.S;
            rect2.bottom = i10 - i11;
            rect2.top -= i11;
            if (rect2.intersect(rect)) {
                return rect2;
            }
        }
        n.b(k10);
        return k10;
    }
}
