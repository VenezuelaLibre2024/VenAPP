package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public abstract class AbstractC1408h {

    /* renamed from: a */
    protected final RecyclerView.AbstractC1382n f6245a;

    /* renamed from: b */
    private int f6246b;

    /* renamed from: c */
    final Rect f6247c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1408h {
        a(RecyclerView.AbstractC1382n abstractC1382n) {
            super(abstractC1382n, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: d */
        public int mo8064d(View view) {
            return this.f6245a.m7865z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1383o) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: e */
        public int mo8065e(View view) {
            return this.f6245a.m7863y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1383o) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: f */
        public int mo8066f() {
            return this.f6245a.m7830O() - this.f6245a.m7824G();
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: g */
        public int mo8067g() {
            return this.f6245a.m7822F();
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: h */
        public int mo8068h() {
            return (this.f6245a.m7830O() - this.f6245a.m7822F()) - this.f6245a.m7824G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC1408h {
        b(RecyclerView.AbstractC1382n abstractC1382n) {
            super(abstractC1382n, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: d */
        public int mo8064d(View view) {
            return this.f6245a.m7859w(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1383o) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: e */
        public int mo8065e(View view) {
            return this.f6245a.m7812A(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1383o) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: f */
        public int mo8066f() {
            return this.f6245a.m7814B() - this.f6245a.m7820E();
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: g */
        public int mo8067g() {
            return this.f6245a.m7825H();
        }

        @Override // androidx.recyclerview.widget.AbstractC1408h
        /* renamed from: h */
        public int mo8068h() {
            return (this.f6245a.m7814B() - this.f6245a.m7825H()) - this.f6245a.m7820E();
        }
    }

    private AbstractC1408h(RecyclerView.AbstractC1382n abstractC1382n) {
        this.f6246b = Integer.MIN_VALUE;
        this.f6247c = new Rect();
        this.f6245a = abstractC1382n;
    }

    /* synthetic */ AbstractC1408h(RecyclerView.AbstractC1382n abstractC1382n, a aVar) {
        this(abstractC1382n);
    }

    /* renamed from: a */
    public static AbstractC1408h m8061a(RecyclerView.AbstractC1382n abstractC1382n) {
        return new a(abstractC1382n);
    }

    /* renamed from: b */
    public static AbstractC1408h m8062b(RecyclerView.AbstractC1382n abstractC1382n, int i10) {
        if (i10 == 0) {
            return m8061a(abstractC1382n);
        }
        if (i10 == 1) {
            return m8063c(abstractC1382n);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC1408h m8063c(RecyclerView.AbstractC1382n abstractC1382n) {
        return new b(abstractC1382n);
    }

    /* renamed from: d */
    public abstract int mo8064d(View view);

    /* renamed from: e */
    public abstract int mo8065e(View view);

    /* renamed from: f */
    public abstract int mo8066f();

    /* renamed from: g */
    public abstract int mo8067g();

    /* renamed from: h */
    public abstract int mo8068h();
}
