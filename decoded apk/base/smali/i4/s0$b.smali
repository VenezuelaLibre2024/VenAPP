.class public final Li4/s0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Li4/s0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Li4/a;->w:Li4/a$c;

    invoke-virtual {v0}, Li4/a$c;->e()Li4/a;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Li4/a$c;->g()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Li4/s0$b;->c(Li4/s0;)V

    return-void

    :cond_1
    sget-object v0, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    invoke-virtual {v1}, Li4/a;->m()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Li4/s0$b$a;

    invoke-direct {v1}, Li4/s0$b$a;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/n0;->H(Ljava/lang/String;Lcom/facebook/internal/n0$a;)V

    return-void
.end method

.method public final b()Li4/s0;
    .locals 1

    sget-object v0, Li4/u0;->d:Li4/u0$a;

    invoke-virtual {v0}, Li4/u0$a;->a()Li4/u0;

    move-result-object v0

    invoke-virtual {v0}, Li4/u0;->c()Li4/s0;

    move-result-object v0

    return-object v0
.end method

.method public final c(Li4/s0;)V
    .locals 1

    sget-object v0, Li4/u0;->d:Li4/u0$a;

    invoke-virtual {v0}, Li4/u0$a;->a()Li4/u0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li4/u0;->f(Li4/s0;)V

    return-void
.end method
