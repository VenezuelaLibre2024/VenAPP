package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C1007p;
import androidx.core.view.accessibility.C1008q;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p299q0.C10221e;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0987a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f4548c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f4549a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f4550b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0987a f4551a;

        a(C0987a c0987a) {
            this.f4551a = c0987a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4551a.mo4849a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1008q mo4850b = this.f4551a.mo4850b(view);
            if (mo4850b != null) {
                return (AccessibilityNodeProvider) mo4850b.m4933a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4551a.mo4852f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1007p m4884S = C1007p.m4884S(accessibilityNodeInfo);
            m4884S.m4906O(C1116x0.m5245J(view));
            m4884S.m4904M(C1116x0.m5241F(view));
            m4884S.m4905N(C1116x0.m5286m(view));
            m4884S.m4908Q(C1116x0.m5301z(view));
            this.f4551a.mo4853g(view, m4884S);
            m4884S.m4912d(accessibilityNodeInfo.getText(), view);
            List<C1007p.a> m4846c = C0987a.m4846c(view);
            for (int i10 = 0; i10 < m4846c.size(); i10++) {
                m4884S.m4911b(m4846c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4551a.mo4854h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4551a.mo4855i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f4551a.mo4856j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f4551a.mo4857l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4551a.mo4858m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static AccessibilityNodeProvider m4859a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m4860b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public C0987a() {
        this(f4548c);
    }

    public C0987a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4549a = accessibilityDelegate;
        this.f4550b = new a(this);
    }

    /* renamed from: c */
    static List<C1007p.a> m4846c(View view) {
        List<C1007p.a> list = (List) view.getTag(C10221e.f25272H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m4847e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m4889l = C1007p.m4889l(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; m4889l != null && i10 < m4889l.length; i10++) {
                if (clickableSpan.equals(m4889l[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m4848k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C10221e.f25273I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m4847e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo4849a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4549a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1008q mo4850b(View view) {
        AccessibilityNodeProvider m4859a = b.m4859a(this.f4549a, view);
        if (m4859a != null) {
            return new C1008q(m4859a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m4851d() {
        return this.f4550b;
    }

    /* renamed from: f */
    public void mo4852f(View view, AccessibilityEvent accessibilityEvent) {
        this.f4549a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo4853g(View view, C1007p c1007p) {
        this.f4549a.onInitializeAccessibilityNodeInfo(view, c1007p.m4909R());
    }

    /* renamed from: h */
    public void mo4854h(View view, AccessibilityEvent accessibilityEvent) {
        this.f4549a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo4855i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4549a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo4856j(View view, int i10, Bundle bundle) {
        List<C1007p.a> m4846c = m4846c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= m4846c.size()) {
                break;
            }
            C1007p.a aVar = m4846c.get(i11);
            if (aVar.m4927a() == i10) {
                z10 = aVar.m4929c(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = b.m4860b(this.f4549a, view, i10, bundle);
        }
        return (z10 || i10 != C10221e.f25284a || bundle == null) ? z10 : m4848k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo4857l(View view, int i10) {
        this.f4549a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: m */
    public void mo4858m(View view, AccessibilityEvent accessibilityEvent) {
        this.f4549a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
