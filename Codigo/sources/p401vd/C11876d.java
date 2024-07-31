package p401vd;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.AbstractC6193a;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import de.AbstractC6896i;
import de.C6888a;
import de.C6893f;
import java.util.Map;
import p382ud.C11543l;
import sd.C10899f;
import sd.C10900g;

/* renamed from: vd.d */
/* loaded from: classes.dex */
public class C11876d extends AbstractC11875c {

    /* renamed from: d */
    private FiamCardView f31393d;

    /* renamed from: e */
    private AbstractC6193a f31394e;

    /* renamed from: f */
    private ScrollView f31395f;

    /* renamed from: g */
    private Button f31396g;

    /* renamed from: h */
    private Button f31397h;

    /* renamed from: i */
    private ImageView f31398i;

    /* renamed from: j */
    private TextView f31399j;

    /* renamed from: k */
    private TextView f31400k;

    /* renamed from: l */
    private C6893f f31401l;

    /* renamed from: m */
    private View.OnClickListener f31402m;

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f31403n;

    /* renamed from: vd.d$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C11876d.this.f31398i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public C11876d(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        super(c11543l, layoutInflater, abstractC6896i);
        this.f31403n = new a();
    }

    /* renamed from: m */
    private void m37981m(Map<C6888a, View.OnClickListener> map) {
        C6888a m19909i = this.f31401l.m19909i();
        C6888a m19910j = this.f31401l.m19910j();
        AbstractC11875c.m37977k(this.f31396g, m19909i.m19872c());
        m37978h(this.f31396g, map.get(m19909i));
        this.f31396g.setVisibility(0);
        if (m19910j == null || m19910j.m19872c() == null) {
            this.f31397h.setVisibility(8);
            return;
        }
        AbstractC11875c.m37977k(this.f31397h, m19910j.m19872c());
        m37978h(this.f31397h, map.get(m19910j));
        this.f31397h.setVisibility(0);
    }

    /* renamed from: n */
    private void m37982n(View.OnClickListener onClickListener) {
        this.f31402m = onClickListener;
        this.f31393d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m37983o(C6893f c6893f) {
        ImageView imageView;
        int i10;
        if (c6893f.m19908h() == null && c6893f.m19907g() == null) {
            imageView = this.f31398i;
            i10 = 8;
        } else {
            imageView = this.f31398i;
            i10 = 0;
        }
        imageView.setVisibility(i10);
    }

    /* renamed from: p */
    private void m37984p(C11543l c11543l) {
        this.f31398i.setMaxHeight(c11543l.m36159r());
        this.f31398i.setMaxWidth(c11543l.m36160s());
    }

    /* renamed from: q */
    private void m37985q(C6893f c6893f) {
        this.f31400k.setText(c6893f.m19911k().m19957c());
        this.f31400k.setTextColor(Color.parseColor(c6893f.m19911k().m19956b()));
        if (c6893f.m19906f() == null || c6893f.m19906f().m19957c() == null) {
            this.f31395f.setVisibility(8);
            this.f31399j.setVisibility(8);
        } else {
            this.f31395f.setVisibility(0);
            this.f31399j.setVisibility(0);
            this.f31399j.setText(c6893f.m19906f().m19957c());
            this.f31399j.setTextColor(Color.parseColor(c6893f.m19906f().m19956b()));
        }
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: b */
    public C11543l mo37967b() {
        return this.f31391b;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: c */
    public View mo37968c() {
        return this.f31394e;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: d */
    public View.OnClickListener mo37969d() {
        return this.f31402m;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: e */
    public ImageView mo37970e() {
        return this.f31398i;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: f */
    public ViewGroup mo37971f() {
        return this.f31393d;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo37972g(Map<C6888a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f31392c.inflate(C10900g.f27661b, (ViewGroup) null);
        this.f31395f = (ScrollView) inflate.findViewById(C10899f.f27646g);
        this.f31396g = (Button) inflate.findViewById(C10899f.f27658s);
        this.f31397h = (Button) inflate.findViewById(C10899f.f27659t);
        this.f31398i = (ImageView) inflate.findViewById(C10899f.f27653n);
        this.f31399j = (TextView) inflate.findViewById(C10899f.f27654o);
        this.f31400k = (TextView) inflate.findViewById(C10899f.f27655p);
        this.f31393d = (FiamCardView) inflate.findViewById(C10899f.f27649j);
        this.f31394e = (AbstractC6193a) inflate.findViewById(C10899f.f27648i);
        if (this.f31390a.m19930c().equals(MessageType.CARD)) {
            C6893f c6893f = (C6893f) this.f31390a;
            this.f31401l = c6893f;
            m37985q(c6893f);
            m37983o(this.f31401l);
            m37981m(map);
            m37984p(this.f31391b);
            m37982n(onClickListener);
            m37979j(this.f31394e, this.f31401l.m19905e());
        }
        return this.f31403n;
    }
}
