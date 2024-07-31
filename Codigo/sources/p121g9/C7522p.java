package p121g9;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcjk;

/* renamed from: g9.p */
/* loaded from: classes.dex */
public final class C7522p {

    /* renamed from: a */
    public final int f17766a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f17767b;

    /* renamed from: c */
    public final ViewGroup f17768c;

    /* renamed from: d */
    public final Context f17769d;

    public C7522p(zzcjk zzcjkVar) {
        this.f17767b = zzcjkVar.getLayoutParams();
        ViewParent parent = zzcjkVar.getParent();
        this.f17769d = zzcjkVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C7520n("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f17768c = viewGroup;
        this.f17766a = viewGroup.indexOfChild(zzcjkVar.zzF());
        viewGroup.removeView(zzcjkVar.zzF());
        zzcjkVar.zzao(true);
    }
}
