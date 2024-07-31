.class public final Lq4/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq4/f;->x(Landroid/app/Application;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v0, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onActivityCreated"

    invoke-virtual {p2, v0, v1, v2}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lq4/g;->a()V

    invoke-static {p1}, Lq4/f;->p(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onActivityDestroyed"

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->a:Lq4/f;

    invoke-static {v0, p1}, Lq4/f;->h(Lq4/f;Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onActivityPaused"

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lq4/g;->a()V

    sget-object v0, Lq4/f;->a:Lq4/f;

    invoke-static {v0, p1}, Lq4/f;->i(Lq4/f;Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onActivityResumed"

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lq4/g;->a()V

    invoke-static {p1}, Lq4/f;->v(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object p2, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onActivitySaveInstanceState"

    invoke-virtual {p1, p2, v0, v1}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lq4/f;->f()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lq4/f;->j(I)V

    sget-object p1, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v0, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onActivityStarted"

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v0, Li4/q0;->APP_EVENTS:Li4/q0;

    invoke-static {}, Lq4/f;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onActivityStopped"

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/internal/c0$a;->b(Li4/q0;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/facebook/appevents/o;->b:Lcom/facebook/appevents/o$a;

    invoke-virtual {p1}, Lcom/facebook/appevents/o$a;->g()V

    invoke-static {}, Lq4/f;->f()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Lq4/f;->j(I)V

    return-void
.end method
