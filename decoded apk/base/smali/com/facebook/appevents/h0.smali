.class public final Lcom/facebook/appevents/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/appevents/h0$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/facebook/appevents/h0$a;


# instance fields
.field private final a:Lcom/facebook/appevents/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/appevents/h0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/appevents/h0;->b:Lcom/facebook/appevents/h0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/r;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lcom/facebook/appevents/r;-><init>(Landroid/content/Context;Ljava/lang/String;Li4/a;)V

    invoke-direct {p0, v0}, Lcom/facebook/appevents/h0;-><init>(Lcom/facebook/appevents/r;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/r;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/facebook/appevents/r;-><init>(Landroid/content/Context;Ljava/lang/String;Li4/a;)V

    invoke-direct {p0, v0}, Lcom/facebook/appevents/h0;-><init>(Lcom/facebook/appevents/r;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/appevents/r;)V
    .locals 1

    const-string v0, "loggerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Li4/a;)V
    .locals 1

    const-string v0, "activityName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/appevents/r;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/appevents/r;-><init>(Ljava/lang/String;Ljava/lang/String;Li4/a;)V

    invoke-direct {p0, v0}, Lcom/facebook/appevents/h0;-><init>(Lcom/facebook/appevents/r;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0}, Lcom/facebook/appevents/r;->j()V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previous"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    const/4 v1, 0x0

    const-string v2, "fb_sdk_settings_changed"

    invoke-virtual {v0, v2, v1, p1}, Lcom/facebook/appevents/r;->o(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public final c(Ljava/lang/String;DLandroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/appevents/r;->k(Ljava/lang/String;DLandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/appevents/r;->l(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/appevents/r;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1}, Lcom/facebook/appevents/r;->o(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/facebook/appevents/r;->o(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/appevents/r;->o(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/appevents/r;->p(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final j(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/appevents/h0;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/appevents/r;->r(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
