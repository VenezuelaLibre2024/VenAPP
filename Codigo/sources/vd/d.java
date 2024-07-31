package vd;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import ud.l;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: d */
    private FiamCardView f28959d;

    /* renamed from: e */
    private com.google.firebase.inappmessaging.display.internal.layout.a f28960e;

    /* renamed from: f */
    private ScrollView f28961f;

    /* renamed from: g */
    private Button f28962g;

    /* renamed from: h */
    private Button f28963h;

    /* renamed from: i */
    private ImageView f28964i;

    /* renamed from: j */
    private TextView f28965j;

    /* renamed from: k */
    private TextView f28966k;

    /* renamed from: l */
    private de.f f28967l;

    /* renamed from: m */
    private View.OnClickListener f28968m;

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f28969n;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f28964i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public d(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        super(lVar, layoutInflater, iVar);
        this.f28969n = new a();
    }

    private void m(Map<de.a, View.OnClickListener> map) {
        de.a i10 = this.f28967l.i();
        de.a j10 = this.f28967l.j();
        c.k(this.f28962g, i10.c());
        h(this.f28962g, map.get(i10));
        this.f28962g.setVisibility(0);
        if (j10 == null || j10.c() == null) {
            this.f28963h.setVisibility(8);
            return;
        }
        c.k(this.f28963h, j10.c());
        h(this.f28963h, map.get(j10));
        this.f28963h.setVisibility(0);
    }

    private void n(View.OnClickListener onClickListener) {
        this.f28968m = onClickListener;
        this.f28959d.setDismissListener(onClickListener);
    }

    private void o(de.f fVar) {
        ImageView imageView;
        int i10;
        if (fVar.h() == null && fVar.g() == null) {
            imageView = this.f28964i;
            i10 = 8;
        } else {
            imageView = this.f28964i;
            i10 = 0;
        }
        imageView.setVisibility(i10);
    }

    private void p(l lVar) {
        this.f28964i.setMaxHeight(lVar.r());
        this.f28964i.setMaxWidth(lVar.s());
    }

    private void q(de.f fVar) {
        this.f28966k.setText(fVar.k().c());
        this.f28966k.setTextColor(Color.parseColor(fVar.k().b()));
        if (fVar.f() == null || fVar.f().c() == null) {
            this.f28961f.setVisibility(8);
            this.f28965j.setVisibility(8);
        } else {
            this.f28961f.setVisibility(0);
            this.f28965j.setVisibility(0);
            this.f28965j.setText(fVar.f().c());
            this.f28965j.setTextColor(Color.parseColor(fVar.f().b()));
        }
    }

    @Override // vd.c
    public l b() {
        return this.f28957b;
    }

    @Override // vd.c
    public View c() {
        return this.f28960e;
    }

    @Override // vd.c
    public View.OnClickListener d() {
        return this.f28968m;
    }

    @Override // vd.c
    public ImageView e() {
        return this.f28964i;
    }

    @Override // vd.c
    public ViewGroup f() {
        return this.f28959d;
    }

    @Override // vd.c
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<de.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f28958c.inflate(sd.g.f25542b, (ViewGroup) null);
        this.f28961f = (ScrollView) inflate.findViewById(sd.f.f25527g);
        this.f28962g = (Button) inflate.findViewById(sd.f.f25539s);
        this.f28963h = (Button) inflate.findViewById(sd.f.f25540t);
        this.f28964i = (ImageView) inflate.findViewById(sd.f.f25534n);
        this.f28965j = (TextView) inflate.findViewById(sd.f.f25535o);
        this.f28966k = (TextView) inflate.findViewById(sd.f.f25536p);
        this.f28959d = (FiamCardView) inflate.findViewById(sd.f.f25530j);
        this.f28960e = (com.google.firebase.inappmessaging.display.internal.layout.a) inflate.findViewById(sd.f.f25529i);
        if (this.f28956a.c().equals(MessageType.CARD)) {
            de.f fVar = (de.f) this.f28956a;
            this.f28967l = fVar;
            q(fVar);
            o(this.f28967l);
            m(map);
            p(this.f28957b);
            n(onClickListener);
            j(this.f28960e, this.f28967l.e());
        }
        return this.f28969n;
    }
}
