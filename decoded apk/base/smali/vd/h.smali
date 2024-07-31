.class public Lvd/h;
.super Lvd/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/h$a;
    }
.end annotation


# instance fields
.field private d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

.field private e:Landroid/view/ViewGroup;

.field private f:Landroid/widget/ScrollView;

.field private g:Landroid/widget/Button;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Lde/j;

.field private m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public constructor <init>(Lud/l;Landroid/view/LayoutInflater;Lde/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvd/c;-><init>(Lud/l;Landroid/view/LayoutInflater;Lde/i;)V

    new-instance p1, Lvd/h$a;

    invoke-direct {p1, p0}, Lvd/h$a;-><init>(Lvd/h;)V

    iput-object p1, p0, Lvd/h;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-void
.end method

.method static synthetic l(Lvd/h;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    return-object p0
.end method

.method private m(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lde/a;",
            "Landroid/view/View$OnClickListener;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lvd/h;->l:Lde/j;

    invoke-virtual {v0}, Lde/j;->e()Lde/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v1

    invoke-virtual {v1}, Lde/d;->c()Lde/n;

    move-result-object v1

    invoke-virtual {v1}, Lde/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lvd/h;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v0

    invoke-static {v1, v0}, Lvd/c;->k(Landroid/widget/Button;Lde/d;)V

    iget-object v0, p0, Lvd/h;->g:Landroid/widget/Button;

    iget-object v1, p0, Lvd/h;->l:Lde/j;

    invoke-virtual {v1}, Lde/j;->e()Lde/a;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0, p1}, Lvd/c;->h(Landroid/widget/Button;Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lvd/h;->g:Landroid/widget/Button;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvd/h;->g:Landroid/widget/Button;

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private n(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lvd/h;->h:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lvd/h;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    invoke-virtual {v0, p1}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;->setDismissListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private o(Lud/l;)V
    .locals 2

    iget-object v0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lud/l;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    iget-object v0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lud/l;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    return-void
.end method

.method private p(Lde/j;)V
    .locals 4

    invoke-virtual {p1}, Lde/j;->b()Lde/g;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lde/j;->b()Lde/g;

    move-result-object v0

    invoke-virtual {v0}, Lde/g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    invoke-virtual {p1}, Lde/j;->h()Lde/n;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lde/j;->h()Lde/n;

    move-result-object v0

    invoke-virtual {v0}, Lde/n;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lvd/h;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lvd/h;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/j;->h()Lde/n;

    move-result-object v3

    invoke-virtual {v3}, Lde/n;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lvd/h;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {p1}, Lde/j;->h()Lde/n;

    move-result-object v0

    invoke-virtual {v0}, Lde/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lvd/h;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/j;->h()Lde/n;

    move-result-object v3

    invoke-virtual {v3}, Lde/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    invoke-virtual {p1}, Lde/j;->g()Lde/n;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lde/j;->g()Lde/n;

    move-result-object v0

    invoke-virtual {v0}, Lde/n;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lvd/h;->f:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lvd/h;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lvd/h;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/j;->g()Lde/n;

    move-result-object v1

    invoke-virtual {v1}, Lde/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lvd/h;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/j;->g()Lde/n;

    move-result-object p1

    invoke-virtual {p1}, Lde/n;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lvd/h;->f:Landroid/widget/ScrollView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lvd/h;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    return-void
.end method


# virtual methods
.method public b()Lud/l;
    .locals 1

    iget-object v0, p0, Lvd/c;->b:Lud/l;

    return-object v0
.end method

.method public c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lvd/h;->e:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public e()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lvd/h;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method public f()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lvd/h;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    return-object v0
.end method

.method public g(Ljava/util/Map;Landroid/view/View$OnClickListener;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lde/a;",
            "Landroid/view/View$OnClickListener;",
            ">;",
            "Landroid/view/View$OnClickListener;",
            ")",
            "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;"
        }
    .end annotation

    iget-object v0, p0, Lvd/c;->c:Landroid/view/LayoutInflater;

    sget v1, Lsd/g;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lsd/f;->g:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lvd/h;->f:Landroid/widget/ScrollView;

    sget v1, Lsd/f;->h:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lvd/h;->g:Landroid/widget/Button;

    sget v1, Lsd/f;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lvd/h;->h:Landroid/view/View;

    sget v1, Lsd/f;->n:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lvd/h;->i:Landroid/widget/ImageView;

    sget v1, Lsd/f;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lvd/h;->j:Landroid/widget/TextView;

    sget v1, Lsd/f;->p:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lvd/h;->k:Landroid/widget/TextView;

    sget v1, Lsd/f;->r:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    iput-object v1, p0, Lvd/h;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    sget v1, Lsd/f;->q:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lvd/h;->e:Landroid/view/ViewGroup;

    iget-object v0, p0, Lvd/c;->a:Lde/i;

    invoke-virtual {v0}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->MODAL:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvd/c;->a:Lde/i;

    check-cast v0, Lde/j;

    iput-object v0, p0, Lvd/h;->l:Lde/j;

    invoke-direct {p0, v0}, Lvd/h;->p(Lde/j;)V

    invoke-direct {p0, p1}, Lvd/h;->m(Ljava/util/Map;)V

    iget-object p1, p0, Lvd/c;->b:Lud/l;

    invoke-direct {p0, p1}, Lvd/h;->o(Lud/l;)V

    invoke-direct {p0, p2}, Lvd/h;->n(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lvd/h;->e:Landroid/view/ViewGroup;

    iget-object p2, p0, Lvd/h;->l:Lde/j;

    invoke-virtual {p2}, Lde/j;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lvd/c;->j(Landroid/view/View;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lvd/h;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-object p1
.end method
