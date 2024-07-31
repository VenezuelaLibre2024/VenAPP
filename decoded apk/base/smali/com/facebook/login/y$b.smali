.class final Lcom/facebook/login/y$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/y;->l(Landroidx/fragment/app/e;)Lok/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Landroidx/activity/result/a;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/y;

.field final synthetic b:Landroidx/fragment/app/e;


# direct methods
.method constructor <init>(Lcom/facebook/login/y;Landroidx/fragment/app/e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$b;->a:Lcom/facebook/login/y;

    iput-object p2, p0, Lcom/facebook/login/y$b;->b:Landroidx/fragment/app/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/result/a;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/login/y$b;->a:Lcom/facebook/login/y;

    invoke-virtual {v0}, Lcom/facebook/login/y;->k()Lcom/facebook/login/u;

    move-result-object v0

    sget-object v1, Lcom/facebook/login/u;->x:Lcom/facebook/login/u$c;

    invoke-virtual {v1}, Lcom/facebook/login/u$c;->b()I

    move-result v1

    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    move-result v2

    invoke-virtual {p1}, Landroidx/activity/result/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/login/u;->v(IILandroid/content/Intent;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/login/y$b;->b:Landroidx/fragment/app/e;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/activity/result/a;

    invoke-virtual {p0, p1}, Lcom/facebook/login/y$b;->a(Landroidx/activity/result/a;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
