package vd;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import ud.l;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: d */
    private FiamFrameLayout f28974d;

    /* renamed from: e */
    private ViewGroup f28975e;

    /* renamed from: f */
    private ImageView f28976f;

    /* renamed from: g */
    private Button f28977g;

    public f(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    @Override // vd.c
    public View c() {
        return this.f28975e;
    }

    @Override // vd.c
    public ImageView e() {
        return this.f28976f;
    }

    @Override // vd.c
    public ViewGroup f() {
        return this.f28974d;
    }

    @Override // vd.c
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<de.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f28958c.inflate(sd.g.f25543c, (ViewGroup) null);
        this.f28974d = (FiamFrameLayout) inflate.findViewById(sd.f.f25533m);
        this.f28975e = (ViewGroup) inflate.findViewById(sd.f.f25532l);
        this.f28976f = (ImageView) inflate.findViewById(sd.f.f25534n);
        this.f28977g = (Button) inflate.findViewById(sd.f.f25531k);
        this.f28976f.setMaxHeight(this.f28957b.r());
        this.f28976f.setMaxWidth(this.f28957b.s());
        if (this.f28956a.c().equals(MessageType.IMAGE_ONLY)) {
            de.h hVar = (de.h) this.f28956a;
            this.f28976f.setVisibility((hVar.b() == null || TextUtils.isEmpty(hVar.b().b())) ? 8 : 0);
            this.f28976f.setOnClickListener(map.get(hVar.e()));
        }
        this.f28974d.setDismissListener(onClickListener);
        this.f28977g.setOnClickListener(onClickListener);
        return null;
    }
}
