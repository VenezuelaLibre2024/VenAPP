package p121g9;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcdv;

/* renamed from: g9.z */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7532z extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private final ImageButton f17801a;

    /* renamed from: b */
    private final InterfaceC7510f f17802b;

    public ViewOnClickListenerC7532z(Context context, C7531y c7531y, InterfaceC7510f interfaceC7510f) {
        super(context);
        this.f17802b = interfaceC7510f;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f17801a = imageButton;
        m22867c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C4930x.m12474b();
        int zzx = zzcdv.zzx(context, c7531y.f17797a);
        C4930x.m12474b();
        int zzx2 = zzcdv.zzx(context, 0);
        C4930x.m12474b();
        int zzx3 = zzcdv.zzx(context, c7531y.f17798b);
        C4930x.m12474b();
        imageButton.setPadding(zzx, zzx2, zzx3, zzcdv.zzx(context, c7531y.f17799c));
        imageButton.setContentDescription("Interstitial close button");
        C4930x.m12474b();
        int zzx4 = zzcdv.zzx(context, c7531y.f17800d + c7531y.f17797a + c7531y.f17798b);
        C4930x.m12474b();
        addView(imageButton, new FrameLayout.LayoutParams(zzx4, zzcdv.zzx(context, c7531y.f17800d + c7531y.f17799c), 17));
        long longValue = ((Long) C4784a0.m12365c().zza(zzbgc.zzbc)).longValue();
        if (longValue <= 0) {
            return;
        }
        C7530x c7530x = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzbd)).booleanValue() ? new C7530x(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(c7530x);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m22867c() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzbb
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = la.C9471p.m28169f()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.google.android.gms.internal.ads.zzcdl r1 = com.google.android.gms.ads.internal.C4965t.m12580q()
            android.content.res.Resources r1 = r1.zze()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = p060d9.C6859a.f15206b     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = p060d9.C6859a.f15205a     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.zzcec.zze(r0)
        L4e:
            android.widget.ImageButton r0 = r5.f17801a
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.f17801a
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.f17801a
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.f17801a
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121g9.ViewOnClickListenerC7532z.m22867c():void");
    }

    /* renamed from: b */
    public final void m22868b(boolean z10) {
        if (!z10) {
            this.f17801a.setVisibility(0);
            return;
        }
        this.f17801a.setVisibility(8);
        if (((Long) C4784a0.m12365c().zza(zzbgc.zzbc)).longValue() > 0) {
            this.f17801a.animate().cancel();
            this.f17801a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7510f interfaceC7510f = this.f17802b;
        if (interfaceC7510f != null) {
            interfaceC7510f.zzj();
        }
    }
}
