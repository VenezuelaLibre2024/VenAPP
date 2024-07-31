package a9;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

@Deprecated
/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private x8.p f251a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView.ScaleType f252b;

    public b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f252b = scaleType;
    }

    public void setMediaContent(x8.p pVar) {
        this.f251a = pVar;
    }
}
