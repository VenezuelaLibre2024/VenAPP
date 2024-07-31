package p401vd;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import de.AbstractC6896i;
import de.C6888a;
import de.C6895h;
import java.util.Map;
import p382ud.C11543l;
import sd.C10899f;
import sd.C10900g;

/* renamed from: vd.f */
/* loaded from: classes.dex */
public class C11878f extends AbstractC11875c {

    /* renamed from: d */
    private FiamFrameLayout f31408d;

    /* renamed from: e */
    private ViewGroup f31409e;

    /* renamed from: f */
    private ImageView f31410f;

    /* renamed from: g */
    private Button f31411g;

    public C11878f(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        super(c11543l, layoutInflater, abstractC6896i);
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: c */
    public View mo37968c() {
        return this.f31409e;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: e */
    public ImageView mo37970e() {
        return this.f31410f;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: f */
    public ViewGroup mo37971f() {
        return this.f31408d;
    }

    @Override // p401vd.AbstractC11875c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo37972g(Map<C6888a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f31392c.inflate(C10900g.f27662c, (ViewGroup) null);
        this.f31408d = (FiamFrameLayout) inflate.findViewById(C10899f.f27652m);
        this.f31409e = (ViewGroup) inflate.findViewById(C10899f.f27651l);
        this.f31410f = (ImageView) inflate.findViewById(C10899f.f27653n);
        this.f31411g = (Button) inflate.findViewById(C10899f.f27650k);
        this.f31410f.setMaxHeight(this.f31391b.m36159r());
        this.f31410f.setMaxWidth(this.f31391b.m36160s());
        if (this.f31390a.m19930c().equals(MessageType.IMAGE_ONLY)) {
            C6895h c6895h = (C6895h) this.f31390a;
            this.f31410f.setVisibility((c6895h.mo19884b() == null || TextUtils.isEmpty(c6895h.mo19884b().m19921b())) ? 8 : 0);
            this.f31410f.setOnClickListener(map.get(c6895h.m19925e()));
        }
        this.f31408d.setDismissListener(onClickListener);
        this.f31411g.setOnClickListener(onClickListener);
        return null;
    }
}
