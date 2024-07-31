package vd;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import ud.l;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: d */
    private FiamFrameLayout f28947d;

    /* renamed from: e */
    private ViewGroup f28948e;

    /* renamed from: f */
    private TextView f28949f;

    /* renamed from: g */
    private ResizableImageView f28950g;

    /* renamed from: h */
    private TextView f28951h;

    /* renamed from: i */
    private View.OnClickListener f28952i;

    public a(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    private void l(View.OnClickListener onClickListener) {
        this.f28948e.setOnClickListener(onClickListener);
    }

    private void m(l lVar) {
        int min = Math.min(lVar.u().intValue(), lVar.t().intValue());
        ViewGroup.LayoutParams layoutParams = this.f28947d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = min;
        this.f28947d.setLayoutParams(layoutParams);
        this.f28950g.setMaxHeight(lVar.r());
        this.f28950g.setMaxWidth(lVar.s());
    }

    private void n(de.c cVar) {
        if (!TextUtils.isEmpty(cVar.f())) {
            j(this.f28948e, cVar.f());
        }
        this.f28950g.setVisibility((cVar.b() == null || TextUtils.isEmpty(cVar.b().b())) ? 8 : 0);
        if (cVar.h() != null) {
            if (!TextUtils.isEmpty(cVar.h().c())) {
                this.f28951h.setText(cVar.h().c());
            }
            if (!TextUtils.isEmpty(cVar.h().b())) {
                this.f28951h.setTextColor(Color.parseColor(cVar.h().b()));
            }
        }
        if (cVar.g() != null) {
            if (!TextUtils.isEmpty(cVar.g().c())) {
                this.f28949f.setText(cVar.g().c());
            }
            if (TextUtils.isEmpty(cVar.g().b())) {
                return;
            }
            this.f28949f.setTextColor(Color.parseColor(cVar.g().b()));
        }
    }

    private void o(View.OnClickListener onClickListener) {
        this.f28952i = onClickListener;
        this.f28947d.setDismissListener(onClickListener);
    }

    @Override // vd.c
    public boolean a() {
        return true;
    }

    @Override // vd.c
    public l b() {
        return this.f28957b;
    }

    @Override // vd.c
    public View c() {
        return this.f28948e;
    }

    @Override // vd.c
    public View.OnClickListener d() {
        return this.f28952i;
    }

    @Override // vd.c
    public ImageView e() {
        return this.f28950g;
    }

    @Override // vd.c
    public ViewGroup f() {
        return this.f28947d;
    }

    @Override // vd.c
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<de.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f28958c.inflate(sd.g.f25541a, (ViewGroup) null);
        this.f28947d = (FiamFrameLayout) inflate.findViewById(sd.f.f25525e);
        this.f28948e = (ViewGroup) inflate.findViewById(sd.f.f25523c);
        this.f28949f = (TextView) inflate.findViewById(sd.f.f25522b);
        this.f28950g = (ResizableImageView) inflate.findViewById(sd.f.f25524d);
        this.f28951h = (TextView) inflate.findViewById(sd.f.f25526f);
        if (this.f28956a.c().equals(MessageType.BANNER)) {
            de.c cVar = (de.c) this.f28956a;
            n(cVar);
            m(this.f28957b);
            o(onClickListener);
            l(map.get(cVar.e()));
        }
        return null;
    }
}
