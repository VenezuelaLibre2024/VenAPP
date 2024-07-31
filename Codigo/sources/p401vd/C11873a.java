package p401vd;

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
import de.AbstractC6896i;
import de.C6888a;
import de.C6890c;
import java.util.Map;
import p382ud.C11543l;
import sd.C10899f;
import sd.C10900g;

/* renamed from: vd.a */
/* loaded from: classes.dex */
public class C11873a extends AbstractC11875c {

    /* renamed from: d */
    private FiamFrameLayout f31381d;

    /* renamed from: e */
    private ViewGroup f31382e;

    /* renamed from: f */
    private TextView f31383f;

    /* renamed from: g */
    private ResizableImageView f31384g;

    /* renamed from: h */
    private TextView f31385h;

    /* renamed from: i */
    private View.OnClickListener f31386i;

    public C11873a(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        super(c11543l, layoutInflater, abstractC6896i);
    }

    /* renamed from: l */
    private void m37962l(View.OnClickListener onClickListener) {
        this.f31382e.setOnClickListener(onClickListener);
    }

    /* renamed from: m */
    private void m37963m(C11543l c11543l) {
        int min = Math.min(c11543l.m36162u().intValue(), c11543l.m36161t().intValue());
        ViewGroup.LayoutParams layoutParams = this.f31381d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = min;
        this.f31381d.setLayoutParams(layoutParams);
        this.f31384g.setMaxHeight(c11543l.m36159r());
        this.f31384g.setMaxWidth(c11543l.m36160s());
    }

    /* renamed from: n */
    private void m37964n(C6890c c6890c) {
        if (!TextUtils.isEmpty(c6890c.m19886f())) {
            m37979j(this.f31382e, c6890c.m19886f());
        }
        this.f31384g.setVisibility((c6890c.mo19884b() == null || TextUtils.isEmpty(c6890c.mo19884b().m19921b())) ? 8 : 0);
        if (c6890c.m19888h() != null) {
            if (!TextUtils.isEmpty(c6890c.m19888h().m19957c())) {
                this.f31385h.setText(c6890c.m19888h().m19957c());
            }
            if (!TextUtils.isEmpty(c6890c.m19888h().m19956b())) {
                this.f31385h.setTextColor(Color.parseColor(c6890c.m19888h().m19956b()));
            }
        }
        if (c6890c.m19887g() != null) {
            if (!TextUtils.isEmpty(c6890c.m19887g().m19957c())) {
                this.f31383f.setText(c6890c.m19887g().m19957c());
            }
            if (TextUtils.isEmpty(c6890c.m19887g().m19956b())) {
                return;
            }
            this.f31383f.setTextColor(Color.parseColor(c6890c.m19887g().m19956b()));
        }
    }

    /* renamed from: o */
    private void m37965o(View.OnClickListener onClickListener) {
        this.f31386i = onClickListener;
        this.f31381d.setDismissListener(onClickListener);
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: a */
    public boolean mo37966a() {
        return true;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: b */
    public C11543l mo37967b() {
        return this.f31391b;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: c */
    public View mo37968c() {
        return this.f31382e;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: d */
    public View.OnClickListener mo37969d() {
        return this.f31386i;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: e */
    public ImageView mo37970e() {
        return this.f31384g;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: f */
    public ViewGroup mo37971f() {
        return this.f31381d;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo37972g(Map<C6888a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f31392c.inflate(C10900g.f27660a, (ViewGroup) null);
        this.f31381d = (FiamFrameLayout) inflate.findViewById(C10899f.f27644e);
        this.f31382e = (ViewGroup) inflate.findViewById(C10899f.f27642c);
        this.f31383f = (TextView) inflate.findViewById(C10899f.f27641b);
        this.f31384g = (ResizableImageView) inflate.findViewById(C10899f.f27643d);
        this.f31385h = (TextView) inflate.findViewById(C10899f.f27645f);
        if (this.f31390a.m19930c().equals(MessageType.BANNER)) {
            C6890c c6890c = (C6890c) this.f31390a;
            m37964n(c6890c);
            m37963m(this.f31391b);
            m37965o(onClickListener);
            m37962l(map.get(c6890c.m19885e()));
        }
        return null;
    }
}
