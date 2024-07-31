package com.google.android.exoplayer2.p048ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p307q8.AbstractC10314t;
import p307q8.C10307m;
import p329r8.C10637b;
import p329r8.C10638c;
import p329r8.C10639d;
import p329r8.InterfaceC10641f;
import p361t6.C11108u1;
import p363t8.C11137a;
import p397v7.C11694d1;
import p397v7.C11700f1;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    private final int f9596a;

    /* renamed from: b */
    private final LayoutInflater f9597b;

    /* renamed from: c */
    private final CheckedTextView f9598c;

    /* renamed from: d */
    private final CheckedTextView f9599d;

    /* renamed from: e */
    private final ViewOnClickListenerC4768b f9600e;

    /* renamed from: f */
    private final SparseArray<C10307m.e> f9601f;

    /* renamed from: r */
    private boolean f9602r;

    /* renamed from: s */
    private boolean f9603s;

    /* renamed from: t */
    private InterfaceC10641f f9604t;

    /* renamed from: u */
    private CheckedTextView[][] f9605u;

    /* renamed from: v */
    private AbstractC10314t.a f9606v;

    /* renamed from: w */
    private int f9607w;

    /* renamed from: x */
    private C11700f1 f9608x;

    /* renamed from: y */
    private boolean f9609y;

    /* renamed from: z */
    private Comparator<C4769c> f9610z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC4768b implements View.OnClickListener {
        private ViewOnClickListenerC4768b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m12283d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    /* loaded from: classes.dex */
    public static final class C4769c {

        /* renamed from: a */
        public final int f9612a;

        /* renamed from: b */
        public final int f9613b;

        /* renamed from: c */
        public final C11108u1 f9614c;

        public C4769c(int i10, int i11, C11108u1 c11108u1) {
            this.f9612a = i10;
            this.f9613b = i11;
            this.f9614c = c11108u1;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f9601f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f9596a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f9597b = from;
        ViewOnClickListenerC4768b viewOnClickListenerC4768b = new ViewOnClickListenerC4768b();
        this.f9600e = viewOnClickListenerC4768b;
        this.f9604t = new C10637b(getResources());
        this.f9608x = C11700f1.f30689d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9598c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C10639d.f26893j);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC4768b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C10638c.f26883a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9599d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C10639d.f26892i);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC4768b);
        addView(checkedTextView2);
    }

    /* renamed from: b */
    private static int[] m12281b(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i10;
        return copyOf;
    }

    /* renamed from: c */
    private static int[] m12282c(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12283d(View view) {
        if (view == this.f9598c) {
            m12285f();
        } else if (view == this.f9599d) {
            m12284e();
        } else {
            m12286g(view);
        }
        m12289j();
    }

    /* renamed from: e */
    private void m12284e() {
        this.f9609y = false;
        this.f9601f.clear();
    }

    /* renamed from: f */
    private void m12285f() {
        this.f9609y = true;
        this.f9601f.clear();
    }

    /* renamed from: g */
    private void m12286g(View view) {
        SparseArray<C10307m.e> sparseArray;
        C10307m.e eVar;
        SparseArray<C10307m.e> sparseArray2;
        C10307m.e eVar2;
        this.f9609y = false;
        C4769c c4769c = (C4769c) C11137a.m34603e(view.getTag());
        int i10 = c4769c.f9612a;
        int i11 = c4769c.f9613b;
        C10307m.e eVar3 = this.f9601f.get(i10);
        C11137a.m34603e(this.f9606v);
        if (eVar3 != null) {
            int i12 = eVar3.f25699c;
            int[] iArr = eVar3.f25698b;
            boolean isChecked = ((CheckedTextView) view).isChecked();
            boolean m12287h = m12287h(i10);
            boolean z10 = m12287h || m12288i();
            if (isChecked && z10) {
                if (i12 == 1) {
                    this.f9601f.remove(i10);
                    return;
                } else {
                    int[] m12282c = m12282c(iArr, i11);
                    sparseArray2 = this.f9601f;
                    eVar2 = new C10307m.e(i10, m12282c);
                }
            } else {
                if (isChecked) {
                    return;
                }
                if (m12287h) {
                    int[] m12281b = m12281b(iArr, i11);
                    sparseArray2 = this.f9601f;
                    eVar2 = new C10307m.e(i10, m12281b);
                } else {
                    sparseArray = this.f9601f;
                    eVar = new C10307m.e(i10, i11);
                }
            }
            sparseArray2.put(i10, eVar2);
            return;
        }
        if (!this.f9603s && this.f9601f.size() > 0) {
            this.f9601f.clear();
        }
        sparseArray = this.f9601f;
        eVar = new C10307m.e(i10, i11);
        sparseArray.put(i10, eVar);
    }

    /* renamed from: h */
    private boolean m12287h(int i10) {
        return this.f9602r && this.f9608x.m36857c(i10).f30658a > 1 && this.f9606v.m31040a(this.f9607w, i10, false) != 0;
    }

    /* renamed from: i */
    private boolean m12288i() {
        return this.f9603s && this.f9608x.f30692a > 1;
    }

    /* renamed from: j */
    private void m12289j() {
        this.f9598c.setChecked(this.f9609y);
        this.f9599d.setChecked(!this.f9609y && this.f9601f.size() == 0);
        for (int i10 = 0; i10 < this.f9605u.length; i10++) {
            C10307m.e eVar = this.f9601f.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f9605u[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (eVar != null) {
                        this.f9605u[i10][i11].setChecked(eVar.m31013c(((C4769c) C11137a.m34603e(checkedTextViewArr[i11].getTag())).f9613b));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    /* renamed from: k */
    private void m12290k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f9606v == null) {
            this.f9598c.setEnabled(false);
            this.f9599d.setEnabled(false);
            return;
        }
        this.f9598c.setEnabled(true);
        this.f9599d.setEnabled(true);
        C11700f1 m31045f = this.f9606v.m31045f(this.f9607w);
        this.f9608x = m31045f;
        this.f9605u = new CheckedTextView[m31045f.f30692a];
        boolean m12288i = m12288i();
        int i10 = 0;
        while (true) {
            C11700f1 c11700f1 = this.f9608x;
            if (i10 >= c11700f1.f30692a) {
                m12289j();
                return;
            }
            C11694d1 m36857c = c11700f1.m36857c(i10);
            boolean m12287h = m12287h(i10);
            CheckedTextView[][] checkedTextViewArr = this.f9605u;
            int i11 = m36857c.f30658a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            C4769c[] c4769cArr = new C4769c[i11];
            for (int i12 = 0; i12 < m36857c.f30658a; i12++) {
                c4769cArr[i12] = new C4769c(i10, i12, m36857c.m36849d(i12));
            }
            Comparator<C4769c> comparator = this.f9610z;
            if (comparator != null) {
                Arrays.sort(c4769cArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f9597b.inflate(C10638c.f26883a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f9597b.inflate((m12287h || m12288i) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f9596a);
                checkedTextView.setText(this.f9604t.mo32421a(c4769cArr[i13].f9614c));
                checkedTextView.setTag(c4769cArr[i13]);
                if (this.f9606v.m31046g(this.f9607w, i10, i13) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f9600e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f9605u[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
            i10++;
        }
    }

    public boolean getIsDisabled() {
        return this.f9609y;
    }

    public List<C10307m.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f9601f.size());
        for (int i10 = 0; i10 < this.f9601f.size(); i10++) {
            arrayList.add(this.f9601f.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f9602r != z10) {
            this.f9602r = z10;
            m12290k();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f9603s != z10) {
            this.f9603s = z10;
            if (!z10 && this.f9601f.size() > 1) {
                for (int size = this.f9601f.size() - 1; size > 0; size--) {
                    this.f9601f.remove(size);
                }
            }
            m12290k();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f9598c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC10641f interfaceC10641f) {
        this.f9604t = (InterfaceC10641f) C11137a.m34603e(interfaceC10641f);
        m12290k();
    }
}
