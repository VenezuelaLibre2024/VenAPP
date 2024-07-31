.class public Lvd/d;
.super Lvd/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/d$a;
    }
.end annotation


# instance fields
.field private d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

.field private e:Lcom/google/firebase/inappmessaging/display/internal/layout/a;

.field private f:Landroid/widget/ScrollView;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Lde/f;

.field private m:Landroid/view/View$OnClickListener;

.field private n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public constructor <init>(Lud/l;Landroid/view/LayoutInflater;Lde/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvd/c;-><init>(Lud/l;Landroid/view/LayoutInflater;Lde/i;)V

    new-instance p1, Lvd/d$a;

    invoke-direct {p1, p0}, Lvd/d$a;-><init>(Lvd/d;)V

    iput-object p1, p0, Lvd/d;->n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-void
.end method

.method static synthetic l(Lvd/d;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lvd/d;->i:Landroid/widget/ImageView;

    return-object p0
.end method

.method private m(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lde/a;",
            "Landroid/view/View$OnClickListener;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lvd/d;->l:Lde/f;

    invoke-virtual {v0}, Lde/f;->i()Lde/a;

    move-result-object v0

    iget-object v1, p0, Lvd/d;->l:Lde/f;

    invoke-virtual {v1}, Lde/f;->j()Lde/a;

    move-result-object v1

    iget-object v2, p0, Lvd/d;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v3

    invoke-static {v2, v3}, Lvd/c;->k(Landroid/widget/Button;Lde/d;)V

    iget-object v2, p0, Lvd/d;->g:Landroid/widget/Button;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v2, v0}, Lvd/c;->h(Landroid/widget/Button;Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lvd/d;->g:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lde/a;->c()Lde/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvd/d;->h:Landroid/widget/Button;

    invoke-virtual {v1}, Lde/a;->c()Lde/d;

    move-result-object v3

    invoke-static {v0, v3}, Lvd/c;->k(Landroid/widget/Button;Lde/d;)V

    iget-object v0, p0, Lvd/d;->h:Landroid/widget/Button;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0, p1}, Lvd/c;->h(Landroid/widget/Button;Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lvd/d;->h:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvd/d;->h:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private n(Landroid/view/View$OnClickListener;)V
    .locals 1

    iput-object p1, p0, Lvd/d;->m:Landroid/view/View$OnClickListener;

    iget-object v0, p0, Lvd/d;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    invoke-virtual {v0, p1}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;->setDismissListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private o(Lde/f;)V
    .locals 1

    invoke-virtual {p1}, Lde/f;->h()Lde/g;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lde/f;->g()Lde/g;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvd/d;->i:Landroid/widget/ImageView;

    const/16 v0, 0x8

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lvd/d;->i:Landroid/widget/ImageView;

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private p(Lud/l;)V
    .locals 2

    iget-object v0, p0, Lvd/d;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lud/l;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    iget-object v0, p0, Lvd/d;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lud/l;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    return-void
.end method

.method private q(Lde/f;)V
    .locals 2

    iget-object v0, p0, Lvd/d;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/f;->k()Lde/n;

    move-result-object v1

    invoke-virtual {v1}, Lde/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lvd/d;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/f;->k()Lde/n;

    move-result-object v1

    invoke-virtual {v1}, Lde/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Lde/f;->f()Lde/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/f;->f()Lde/n;

    move-result-object v0

    invoke-virtual {v0}, Lde/n;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvd/d;->f:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lvd/d;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lvd/d;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/f;->f()Lde/n;

    move-result-object v1

    invoke-virtual {v1}, Lde/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lvd/d;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Lde/f;->f()Lde/n;

    move-result-object p1

    invoke-virtual {p1}, Lde/n;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvd/d;->f:Landroid/widget/ScrollView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lvd/d;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
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

    iget-object v0, p0, Lvd/d;->e:Lcom/google/firebase/inappmessaging/display/internal/layout/a;

    return-object v0
.end method

.method public d()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lvd/d;->m:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public e()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lvd/d;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method public f()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lvd/d;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

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

    sget v1, Lsd/g;->b:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lsd/f;->g:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lvd/d;->f:Landroid/widget/ScrollView;

    sget v1, Lsd/f;->s:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lvd/d;->g:Landroid/widget/Button;

    sget v1, Lsd/f;->t:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lvd/d;->h:Landroid/widget/Button;

    sget v1, Lsd/f;->n:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lvd/d;->i:Landroid/widget/ImageView;

    sget v1, Lsd/f;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lvd/d;->j:Landroid/widget/TextView;

    sget v1, Lsd/f;->p:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lvd/d;->k:Landroid/widget/TextView;

    sget v1, Lsd/f;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    iput-object v1, p0, Lvd/d;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    sget v1, Lsd/f;->i:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/inappmessaging/display/internal/layout/a;

    iput-object v0, p0, Lvd/d;->e:Lcom/google/firebase/inappmessaging/display/internal/layout/a;

    iget-object v0, p0, Lvd/c;->a:Lde/i;

    invoke-virtual {v0}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->CARD:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvd/c;->a:Lde/i;

    check-cast v0, Lde/f;

    iput-object v0, p0, Lvd/d;->l:Lde/f;

    invoke-direct {p0, v0}, Lvd/d;->q(Lde/f;)V

    iget-object v0, p0, Lvd/d;->l:Lde/f;

    invoke-direct {p0, v0}, Lvd/d;->o(Lde/f;)V

    invoke-direct {p0, p1}, Lvd/d;->m(Ljava/util/Map;)V

    iget-object p1, p0, Lvd/c;->b:Lud/l;

    invoke-direct {p0, p1}, Lvd/d;->p(Lud/l;)V

    invoke-direct {p0, p2}, Lvd/d;->n(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lvd/d;->e:Lcom/google/firebase/inappmessaging/display/internal/layout/a;

    iget-object p2, p0, Lvd/d;->l:Lde/f;

    invoke-virtual {p2}, Lde/f;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lvd/c;->j(Landroid/view/View;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lvd/d;->n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-object p1
.end method
