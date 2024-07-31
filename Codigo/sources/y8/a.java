package y8;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends x8.h {

    /* renamed from: y8.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0532a extends x8.a<C0532a> {
        @Override // x8.a
        public final /* bridge */ /* synthetic */ C0532a c() {
            return this;
        }

        public C0532a k(String str, String str2) {
            this.f30650a.r(str, str2);
            return this;
        }

        public C0532a l(String str, List<String> list) {
            if (list != null) {
                this.f30650a.r(str, TextUtils.join(",", list));
            }
            return this;
        }

        public a m() {
            return new a(this, null);
        }

        public C0532a n(String str) {
            this.f30650a.a(str);
            return this;
        }
    }

    /* synthetic */ a(C0532a c0532a, f fVar) {
        super(c0532a);
    }
}
