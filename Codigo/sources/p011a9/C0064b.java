package p011a9;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p438x8.InterfaceC12378p;

@Deprecated
/* renamed from: a9.b */
/* loaded from: classes.dex */
public class C0064b extends FrameLayout {

    /* renamed from: a */
    private InterfaceC12378p f302a;

    /* renamed from: b */
    private ImageView.ScaleType f303b;

    public C0064b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f303b = scaleType;
    }

    public void setMediaContent(InterfaceC12378p interfaceC12378p) {
        this.f302a = interfaceC12378p;
    }
}
