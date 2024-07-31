.class final Lpl/c$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/c;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;ILjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lpl/c;


# direct methods
.method constructor <init>(Lpl/c;)V
    .locals 0

    iput-object p1, p0, Lpl/c$b;->a:Lpl/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lpl/c$b;->a:Lpl/c;

    invoke-static {v0}, Lpl/c;->d(Lpl/c;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpl/c$b;->a:Lpl/c;

    invoke-static {v0}, Lpl/c;->a(Lpl/c;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpl/c$b;->a:Lpl/c;

    invoke-static {v0}, Lpl/c;->e(Lpl/c;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpl/c$b;->a:Lpl/c;

    invoke-static {v0}, Lpl/c;->d(Lpl/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpl/c$b;->a:Lpl/c;

    invoke-static {v0}, Lpl/c;->b(Lpl/c;)Lpl/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->y()V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpl/c$b;->a()V

    sget-object v0, Lck/v;->a:Lck/v;

    return-object v0
.end method
