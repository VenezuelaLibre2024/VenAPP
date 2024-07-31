package g9;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcjk;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f16137a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f16138b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f16139c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f16140d;

    public p(zzcjk zzcjkVar) {
        this.f16138b = zzcjkVar.getLayoutParams();
        ViewParent parent = zzcjkVar.getParent();
        this.f16140d = zzcjkVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new n("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f16139c = viewGroup;
        this.f16137a = viewGroup.indexOfChild(zzcjkVar.zzF());
        viewGroup.removeView(zzcjkVar.zzF());
        zzcjkVar.zzao(true);
    }
}
