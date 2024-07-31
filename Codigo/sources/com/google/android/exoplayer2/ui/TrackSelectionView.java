package com.google.android.exoplayer2.ui;

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
import q8.m;
import q8.t;
import t6.u1;
import v7.d1;
import v7.f1;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f8529a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f8530b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckedTextView f8531c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckedTextView f8532d;

    /* renamed from: e, reason: collision with root package name */
    private final b f8533e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray<m.e> f8534f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8535r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8536s;

    /* renamed from: t, reason: collision with root package name */
    private r8.f f8537t;

    /* renamed from: u, reason: collision with root package name */
    private CheckedTextView[][] f8538u;

    /* renamed from: v, reason: collision with root package name */
    private t.a f8539v;

    /* renamed from: w, reason: collision with root package name */
    private int f8540w;

    /* renamed from: x, reason: collision with root package name */
    private f1 f8541x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8542y;

    /* renamed from: z, reason: collision with root package name */
    private Comparator<c> f8543z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8545a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8546b;

        /* renamed from: c, reason: collision with root package name */
        public final u1 f8547c;

        public c(int i10, int i11, u1 u1Var) {
            this.f8545a = i10;
            this.f8546b = i11;
            this.f8547c = u1Var;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f8534f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f8529a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f8530b = from;
        b bVar = new b();
        this.f8533e = bVar;
        this.f8537t = new r8.b(getResources());
        this.f8541x = f1.f28311d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f8531c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(r8.d.f24779j);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(r8.c.f24769a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f8532d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(r8.d.f24778i);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    private static int[] b(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i10;
        return copyOf;
    }

    private static int[] c(int[] iArr, int i10) {
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
    public void d(View view) {
        if (view == this.f8531c) {
            f();
        } else if (view == this.f8532d) {
            e();
        } else {
            g(view);
        }
        j();
    }

    private void e() {
        this.f8542y = false;
        this.f8534f.clear();
    }

    private void f() {
        this.f8542y = true;
        this.f8534f.clear();
    }

    private void g(View view) {
        SparseArray<m.e> sparseArray;
        m.e eVar;
        SparseArray<m.e> sparseArray2;
        m.e eVar2;
        this.f8542y = false;
        c cVar = (c) t8.a.e(view.getTag());
        int i10 = cVar.f8545a;
        int i11 = cVar.f8546b;
        m.e eVar3 = this.f8534f.get(i10);
        t8.a.e(this.f8539v);
        if (eVar3 != null) {
            int i12 = eVar3.f23686c;
            int[] iArr = eVar3.f23685b;
            boolean isChecked = ((CheckedTextView) view).isChecked();
            boolean h10 = h(i10);
            boolean z10 = h10 || i();
            if (isChecked && z10) {
                if (i12 == 1) {
                    this.f8534f.remove(i10);
                    return;
                } else {
                    int[] c10 = c(iArr, i11);
                    sparseArray2 = this.f8534f;
                    eVar2 = new m.e(i10, c10);
                }
            } else {
                if (isChecked) {
                    return;
                }
                if (h10) {
                    int[] b10 = b(iArr, i11);
                    sparseArray2 = this.f8534f;
                    eVar2 = new m.e(i10, b10);
                } else {
                    sparseArray = this.f8534f;
                    eVar = new m.e(i10, i11);
                }
            }
            sparseArray2.put(i10, eVar2);
            return;
        }
        if (!this.f8536s && this.f8534f.size() > 0) {
            this.f8534f.clear();
        }
        sparseArray = this.f8534f;
        eVar = new m.e(i10, i11);
        sparseArray.put(i10, eVar);
    }

    private boolean h(int i10) {
        return this.f8535r && this.f8541x.c(i10).f28288a > 1 && this.f8539v.a(this.f8540w, i10, false) != 0;
    }

    private boolean i() {
        return this.f8536s && this.f8541x.f28314a > 1;
    }

    private void j() {
        this.f8531c.setChecked(this.f8542y);
        this.f8532d.setChecked(!this.f8542y && this.f8534f.size() == 0);
        for (int i10 = 0; i10 < this.f8538u.length; i10++) {
            m.e eVar = this.f8534f.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f8538u[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (eVar != null) {
                        this.f8538u[i10][i11].setChecked(eVar.c(((c) t8.a.e(checkedTextViewArr[i11].getTag())).f8546b));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f8539v == null) {
            this.f8531c.setEnabled(false);
            this.f8532d.setEnabled(false);
            return;
        }
        this.f8531c.setEnabled(true);
        this.f8532d.setEnabled(true);
        f1 f10 = this.f8539v.f(this.f8540w);
        this.f8541x = f10;
        this.f8538u = new CheckedTextView[f10.f28314a];
        boolean i10 = i();
        int i11 = 0;
        while (true) {
            f1 f1Var = this.f8541x;
            if (i11 >= f1Var.f28314a) {
                j();
                return;
            }
            d1 c10 = f1Var.c(i11);
            boolean h10 = h(i11);
            CheckedTextView[][] checkedTextViewArr = this.f8538u;
            int i12 = c10.f28288a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < c10.f28288a; i13++) {
                cVarArr[i13] = new c(i11, i13, c10.d(i13));
            }
            Comparator<c> comparator = this.f8543z;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 == 0) {
                    addView(this.f8530b.inflate(r8.c.f24769a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f8530b.inflate((h10 || i10) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f8529a);
                checkedTextView.setText(this.f8537t.a(cVarArr[i14].f8547c));
                checkedTextView.setTag(cVarArr[i14]);
                if (this.f8539v.g(this.f8540w, i11, i14) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f8533e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f8538u[i11][i14] = checkedTextView;
                addView(checkedTextView);
            }
            i11++;
        }
    }

    public boolean getIsDisabled() {
        return this.f8542y;
    }

    public List<m.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f8534f.size());
        for (int i10 = 0; i10 < this.f8534f.size(); i10++) {
            arrayList.add(this.f8534f.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f8535r != z10) {
            this.f8535r = z10;
            k();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f8536s != z10) {
            this.f8536s = z10;
            if (!z10 && this.f8534f.size() > 1) {
                for (int size = this.f8534f.size() - 1; size > 0; size--) {
                    this.f8534f.remove(size);
                }
            }
            k();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f8531c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(r8.f fVar) {
        this.f8537t = (r8.f) t8.a.e(fVar);
        k();
    }
}
