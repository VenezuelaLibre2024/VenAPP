package p461y8;

import android.text.TextUtils;
import java.util.List;
import p438x8.AbstractC12351a;
import p438x8.C12365h;

/* renamed from: y8.a */
/* loaded from: classes.dex */
public final class C12645a extends C12365h {

    /* renamed from: y8.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC12351a<a> {
        @Override // p438x8.AbstractC12351a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ a mo39942c() {
            return this;
        }

        /* renamed from: k */
        public a m41630k(String str, String str2) {
            this.f33170a.m12500r(str, str2);
            return this;
        }

        /* renamed from: l */
        public a m41631l(String str, List<String> list) {
            if (list != null) {
                this.f33170a.m12500r(str, TextUtils.join(",", list));
            }
            return this;
        }

        /* renamed from: m */
        public C12645a m41632m() {
            return new C12645a(this, null);
        }

        /* renamed from: n */
        public a m41633n(String str) {
            this.f33170a.m12497a(str);
            return this;
        }
    }

    /* synthetic */ C12645a(a aVar, C12650f c12650f) {
        super(aVar);
    }
}
