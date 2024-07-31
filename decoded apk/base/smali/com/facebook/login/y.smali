.class public Lcom/facebook/login/y;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/y$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/facebook/login/y$a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/facebook/login/u$e;

.field private c:Lcom/facebook/login/u;

.field private d:Landroidx/activity/result/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/c<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/y$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/y;->f:Lcom/facebook/login/y$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/login/y;Lcom/facebook/login/u$f;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/login/y;->o(Lcom/facebook/login/y;Lcom/facebook/login/u$f;)V

    return-void
.end method

.method public static synthetic e(Lok/l;Landroidx/activity/result/a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/login/y;->p(Lok/l;Landroidx/activity/result/a;)V

    return-void
.end method

.method public static final synthetic f(Lcom/facebook/login/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/login/y;->m()V

    return-void
.end method

.method public static final synthetic g(Lcom/facebook/login/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/login/y;->t()V

    return-void
.end method

.method private final l(Landroidx/fragment/app/e;)Lok/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/e;",
            ")",
            "Lok/l<",
            "Landroidx/activity/result/a;",
            "Lck/v;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/login/y$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/login/y$b;-><init>(Lcom/facebook/login/y;Landroidx/fragment/app/e;)V

    return-object v0
.end method

.method private final m()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/y;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/facebook/login/y;->r()V

    return-void

    :cond_0
    const-string v0, "progressBar"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final n(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p1}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/y;->a:Ljava/lang/String;

    return-void
.end method

.method private static final o(Lcom/facebook/login/y;Lcom/facebook/login/u$f;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outcome"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/y;->q(Lcom/facebook/login/u$f;)V

    return-void
.end method

.method private static final p(Lok/l;Landroidx/activity/result/a;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final q(Lcom/facebook/login/u$f;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/y;->b:Lcom/facebook/login/u$e;

    iget-object v0, p1, Lcom/facebook/login/u$f;->a:Lcom/facebook/login/u$f$a;

    sget-object v1, Lcom/facebook/login/u$f$a;->CANCEL:Lcom/facebook/login/u$f$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "com.facebook.LoginFragment:Result"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method private final t()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/y;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/facebook/login/y;->s()V

    return-void

    :cond_0
    const-string v0, "progressBar"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method protected h()Lcom/facebook/login/u;
    .locals 1

    new-instance v0, Lcom/facebook/login/u;

    invoke-direct {v0, p0}, Lcom/facebook/login/u;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method public final i()Landroidx/activity/result/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/c<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/login/y;->d:Landroidx/activity/result/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "launcher"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected j()I
    .locals 1

    sget v0, Lcom/facebook/common/c;->c:I

    return v0
.end method

.method public final k()Lcom/facebook/login/u;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/y;->c:Lcom/facebook/login/u;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "loginClient"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/login/u;->v(IILandroid/content/Intent;)Z

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "loginClient"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/facebook/login/u;

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Lcom/facebook/login/u;->x(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/login/y;->h()Lcom/facebook/login/u;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lcom/facebook/login/y;->c:Lcom/facebook/login/u;

    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object p1

    new-instance v0, Lcom/facebook/login/w;

    invoke-direct {v0, p0}, Lcom/facebook/login/w;-><init>(Lcom/facebook/login/y;)V

    invoke-virtual {p1, v0}, Lcom/facebook/login/u;->y(Lcom/facebook/login/u$d;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/e;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/login/y;->n(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "com.facebook.LoginFragment:Request"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "request"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/login/u$e;

    iput-object v0, p0, Lcom/facebook/login/y;->b:Lcom/facebook/login/u$e;

    :cond_3
    new-instance v0, Lf/f;

    invoke-direct {v0}, Lf/f;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/login/y;->l(Landroidx/fragment/app/e;)Lok/l;

    move-result-object p1

    new-instance v1, Lcom/facebook/login/x;

    invoke-direct {v1, p1}, Lcom/facebook/login/x;-><init>(Lok/l;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lf/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object p1

    const-string v0, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/login/y;->d:Landroidx/activity/result/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/login/y;->j()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lcom/facebook/common/b;->d:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/facebook/login/y;->e:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object p2

    new-instance p3, Lcom/facebook/login/y$c;

    invoke-direct {p3, p0}, Lcom/facebook/login/y$c;-><init>(Lcom/facebook/login/y;)V

    invoke-virtual {p2, p3}, Lcom/facebook/login/u;->w(Lcom/facebook/login/u$a;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/u;->c()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget v1, Lcom/facebook/common/b;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-object v0, p0, Lcom/facebook/login/y;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "LoginFragment"

    const-string v1, "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/e;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/login/y;->b:Lcom/facebook/login/u$e;

    invoke-virtual {v0, v1}, Lcom/facebook/login/u;->z(Lcom/facebook/login/u$e;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "loginClient"

    invoke-virtual {p0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected r()V
    .locals 0

    return-void
.end method

.method protected s()V
    .locals 0

    return-void
.end method
