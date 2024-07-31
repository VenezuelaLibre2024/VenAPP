package p401vd;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import de.AbstractC6896i;
import de.C6888a;
import de.C6897j;
import java.util.Map;
import p382ud.C11543l;
import sd.C10899f;
import sd.C10900g;

/* renamed from: vd.h */
/* loaded from: classes.dex */
public class C11880h extends AbstractC11875c {

    /* renamed from: d */
    private FiamRelativeLayout f31415d;

    /* renamed from: e */
    private ViewGroup f31416e;

    /* renamed from: f */
    private ScrollView f31417f;

    /* renamed from: g */
    private Button f31418g;

    /* renamed from: h */
    private View f31419h;

    /* renamed from: i */
    private ImageView f31420i;

    /* renamed from: j */
    private TextView f31421j;

    /* renamed from: k */
    private TextView f31422k;

    /* renamed from: l */
    private C6897j f31423l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f31424m;

    /* renamed from: vd.h$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C11880h.this.f31420i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public C11880h(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        super(c11543l, layoutInflater, abstractC6896i);
        this.f31424m = new a();
    }

    /* renamed from: m */
    private void m37993m(Map<C6888a, View.OnClickListener> map) {
        Button button;
        int i10;
        C6888a m19932e = this.f31423l.m19932e();
        if (m19932e == null || m19932e.m19872c() == null || TextUtils.isEmpty(m19932e.m19872c().m19897c().m19957c())) {
            button = this.f31418g;
            i10 = 8;
        } else {
            AbstractC11875c.m37977k(this.f31418g, m19932e.m19872c());
            m37978h(this.f31418g, map.get(this.f31423l.m19932e()));
            button = this.f31418g;
            i10 = 0;
        }
        button.setVisibility(i10);
    }

    /* renamed from: n */
    private void m37994n(View.OnClickListener onClickListener) {
        this.f31419h.setOnClickListener(onClickListener);
        this.f31415d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m37995o(C11543l c11543l) {
        this.f31420i.setMaxHeight(c11543l.m36159r());
        this.f31420i.setMaxWidth(c11543l.m36160s());
    }

    /* renamed from: p */
    private void m37996p(C6897j c6897j) {
        if (c6897j.mo19884b() == null || TextUtils.isEmpty(c6897j.mo19884b().m19921b())) {
            this.f31420i.setVisibility(8);
        } else {
            this.f31420i.setVisibility(0);
        }
        if (c6897j.m19935h() != null) {
            if (TextUtils.isEmpty(c6897j.m19935h().m19957c())) {
                this.f31422k.setVisibility(8);
            } else {
                this.f31422k.setVisibility(0);
                this.f31422k.setText(c6897j.m19935h().m19957c());
            }
            if (!TextUtils.isEmpty(c6897j.m19935h().m19956b())) {
                this.f31422k.setTextColor(Color.parseColor(c6897j.m19935h().m19956b()));
            }
        }
        if (c6897j.m19934g() == null || TextUtils.isEmpty(c6897j.m19934g().m19957c())) {
            this.f31417f.setVisibility(8);
            this.f31421j.setVisibility(8);
        } else {
            this.f31417f.setVisibility(0);
            this.f31421j.setVisibility(0);
            this.f31421j.setTextColor(Color.parseColor(c6897j.m19934g().m19956b()));
            this.f31421j.setText(c6897j.m19934g().m19957c());
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
        return this.f31416e;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: e */
    public ImageView mo37970e() {
        return this.f31420i;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: f */
    public ViewGroup mo37971f() {
        return this.f31415d;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo37972g(Map<C6888a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f31392c.inflate(C10900g.f27663d, (ViewGroup) null);
        this.f31417f = (ScrollView) inflate.findViewById(C10899f.f27646g);
        this.f31418g = (Button) inflate.findViewById(C10899f.f27647h);
        this.f31419h = inflate.findViewById(C10899f.f27650k);
        this.f31420i = (ImageView) inflate.findViewById(C10899f.f27653n);
        this.f31421j = (TextView) inflate.findViewById(C10899f.f27654o);
        this.f31422k = (TextView) inflate.findViewById(C10899f.f27655p);
        this.f31415d = (FiamRelativeLayout) inflate.findViewById(C10899f.f27657r);
        this.f31416e = (ViewGroup) inflate.findViewById(C10899f.f27656q);
        if (this.f31390a.m19930c().equals(MessageType.MODAL)) {
            C6897j c6897j = (C6897j) this.f31390a;
            this.f31423l = c6897j;
            m37996p(c6897j);
            m37993m(map);
            m37995o(this.f31391b);
            m37994n(onClickListener);
            m37979j(this.f31416e, this.f31423l.m19933f());
        }
        return this.f31424m;
    }
}
