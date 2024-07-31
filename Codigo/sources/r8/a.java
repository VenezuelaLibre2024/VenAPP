package r8;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import t8.r0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f24761g = new a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f24762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24765d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24766e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f24767f;

    public a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f24762a = i10;
        this.f24763b = i11;
        this.f24764c = i12;
        this.f24765d = i13;
        this.f24766e = i14;
        this.f24767f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return r0.f26744a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f24761g.f24762a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f24761g.f24763b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f24761g.f24764c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f24761g.f24765d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f24761g.f24766e, captionStyle.getTypeface());
    }
}
