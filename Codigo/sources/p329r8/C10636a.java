package p329r8;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import p363t8.C11172r0;

/* renamed from: r8.a */
/* loaded from: classes.dex */
public final class C10636a {

    /* renamed from: g */
    public static final C10636a f26875g = new C10636a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f26876a;

    /* renamed from: b */
    public final int f26877b;

    /* renamed from: c */
    public final int f26878c;

    /* renamed from: d */
    public final int f26879d;

    /* renamed from: e */
    public final int f26880e;

    /* renamed from: f */
    public final Typeface f26881f;

    public C10636a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f26876a = i10;
        this.f26877b = i11;
        this.f26878c = i12;
        this.f26879d = i13;
        this.f26880e = i14;
        this.f26881f = typeface;
    }

    /* renamed from: a */
    public static C10636a m32409a(CaptioningManager.CaptionStyle captionStyle) {
        return C11172r0.f29040a >= 21 ? m32411c(captionStyle) : m32410b(captionStyle);
    }

    /* renamed from: b */
    private static C10636a m32410b(CaptioningManager.CaptionStyle captionStyle) {
        return new C10636a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    private static C10636a m32411c(CaptioningManager.CaptionStyle captionStyle) {
        return new C10636a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f26875g.f26876a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f26875g.f26877b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f26875g.f26878c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f26875g.f26879d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f26875g.f26880e, captionStyle.getTypeface());
    }
}
