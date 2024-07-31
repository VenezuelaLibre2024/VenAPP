package pl;

import android.content.Context;
import android.graphics.Rect;
import com.journeyapps.barcodescanner.BarcodeView;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p163ih.C7999p;

/* renamed from: pl.a */
/* loaded from: classes3.dex */
public final class C10204a extends BarcodeView {

    /* renamed from: T */
    public static final a f25216T = new a(null);

    /* renamed from: S */
    private int f25217S;

    /* renamed from: pl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C10204a(Context context) {
        super(context);
        this.f25217S = -1;
    }

    /* renamed from: O */
    public final void m30518O(int i10, int i11, int i12) {
        this.f25217S = i12;
        setFramingRectSize(new C7999p(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.journeyapps.barcodescanner.C6655a
    /* renamed from: k */
    public Rect mo19438k(Rect container, Rect surface) {
        C9322n.m27781e(container, "container");
        C9322n.m27781e(surface, "surface");
        Rect rect = new Rect(container);
        rect.intersect(surface);
        Rect mo19438k = super.mo19438k(container, surface);
        if (this.f25217S != -1) {
            Rect rect2 = new Rect(mo19438k);
            int i10 = rect2.bottom;
            int i11 = this.f25217S;
            rect2.bottom = i10 - i11;
            rect2.top -= i11;
            if (rect2.intersect(rect)) {
                return rect2;
            }
        }
        C9322n.m27778b(mo19438k);
        return mo19438k;
    }
}
