.class public final Lcom/facebook/appevents/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/appevents/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application;Ljava/lang/String;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/appevents/r$a;->f(Landroid/app/Application;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0, p1}, Lcom/facebook/appevents/r$a;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lcom/facebook/appevents/o$b;
    .locals 1

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0}, Lcom/facebook/appevents/r$a;->j()Lcom/facebook/appevents/o$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/appevents/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/appevents/r$a;->m(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Landroid/content/Context;)Lcom/facebook/appevents/o;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/appevents/o;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1, v1}, Lcom/facebook/appevents/o;-><init>(Landroid/content/Context;Ljava/lang/String;Li4/a;Lkotlin/jvm/internal/g;)V

    return-object v0
.end method

.method public final g()V
    .locals 1

    sget-object v0, Lcom/facebook/appevents/r;->c:Lcom/facebook/appevents/r$a;

    invoke-virtual {v0}, Lcom/facebook/appevents/r$a;->s()V

    return-void
.end method
