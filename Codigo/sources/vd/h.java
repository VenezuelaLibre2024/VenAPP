package vd;

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
import de.j;
import java.util.Map;
import ud.l;

/* loaded from: classes.dex */
public class h extends c {

    /* renamed from: d */
    private FiamRelativeLayout f28981d;

    /* renamed from: e */
    private ViewGroup f28982e;

    /* renamed from: f */
    private ScrollView f28983f;

    /* renamed from: g */
    private Button f28984g;

    /* renamed from: h */
    private View f28985h;

    /* renamed from: i */
    private ImageView f28986i;

    /* renamed from: j */
    private TextView f28987j;

    /* renamed from: k */
    private TextView f28988k;

    /* renamed from: l */
    private j f28989l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f28990m;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            h.this.f28986i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public h(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        super(lVar, layoutInflater, iVar);
        this.f28990m = new a();
    }

    private void m(Map<de.a, View.OnClickListener> map) {
        Button button;
        int i10;
        de.a e10 = this.f28989l.e();
        if (e10 == null || e10.c() == null || TextUtils.isEmpty(e10.c().c().c())) {
            button = this.f28984g;
            i10 = 8;
        } else {
            c.k(this.f28984g, e10.c());
            h(this.f28984g, map.get(this.f28989l.e()));
            button = this.f28984g;
            i10 = 0;
        }
        button.setVisibility(i10);
    }

    private void n(View.OnClickListener onClickListener) {
        this.f28985h.setOnClickListener(onClickListener);
        this.f28981d.setDismissListener(onClickListener);
    }

    private void o(l lVar) {
        this.f28986i.setMaxHeight(lVar.r());
        this.f28986i.setMaxWidth(lVar.s());
    }

    private void p(j jVar) {
        if (jVar.b() == null || TextUtils.isEmpty(jVar.b().b())) {
            this.f28986i.setVisibility(8);
        } else {
            this.f28986i.setVisibility(0);
        }
        if (jVar.h() != null) {
            if (TextUtils.isEmpty(jVar.h().c())) {
                this.f28988k.setVisibility(8);
            } else {
                this.f28988k.setVisibility(0);
                this.f28988k.setText(jVar.h().c());
            }
            if (!TextUtils.isEmpty(jVar.h().b())) {
                this.f28988k.setTextColor(Color.parseColor(jVar.h().b()));
            }
        }
        if (jVar.g() == null || TextUtils.isEmpty(jVar.g().c())) {
            this.f28983f.setVisibility(8);
            this.f28987j.setVisibility(8);
        } else {
            this.f28983f.setVisibility(0);
            this.f28987j.setVisibility(0);
            this.f28987j.setTextColor(Color.parseColor(jVar.g().b()));
            this.f28987j.setText(jVar.g().c());
        }
    }

    @Override // vd.c
    public l b() {
        return this.f28957b;
    }

    @Override // vd.c
    public View c() {
        return this.f28982e;
    }

    @Override // vd.c
    public ImageView e() {
        return this.f28986i;
    }

    @Override // vd.c
    public ViewGroup f() {
        return this.f28981d;
    }

    @Override // vd.c
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<de.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f28958c.inflate(sd.g.f25544d, (ViewGroup) null);
        this.f28983f = (ScrollView) inflate.findViewById(sd.f.f25527g);
        this.f28984g = (Button) inflate.findViewById(sd.f.f25528h);
        this.f28985h = inflate.findViewById(sd.f.f25531k);
        this.f28986i = (ImageView) inflate.findViewById(sd.f.f25534n);
        this.f28987j = (TextView) inflate.findViewById(sd.f.f25535o);
        this.f28988k = (TextView) inflate.findViewById(sd.f.f25536p);
        this.f28981d = (FiamRelativeLayout) inflate.findViewById(sd.f.f25538r);
        this.f28982e = (ViewGroup) inflate.findViewById(sd.f.f25537q);
        if (this.f28956a.c().equals(MessageType.MODAL)) {
            j jVar = (j) this.f28956a;
            this.f28989l = jVar;
            p(jVar);
            m(map);
            o(this.f28957b);
            n(onClickListener);
            j(this.f28982e, this.f28989l.f());
        }
        return this.f28990m;
    }
}
