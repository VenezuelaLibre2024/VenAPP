.class public final synthetic Lcom/facebook/login/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/f0$b;


# instance fields
.field public final synthetic a:Lcom/facebook/login/q;

.field public final synthetic b:Lcom/facebook/login/u$e;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/q;Lcom/facebook/login/u$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/p;->a:Lcom/facebook/login/q;

    iput-object p2, p0, Lcom/facebook/login/p;->b:Lcom/facebook/login/u$e;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/p;->a:Lcom/facebook/login/q;

    iget-object v1, p0, Lcom/facebook/login/p;->b:Lcom/facebook/login/u$e;

    invoke-static {v0, v1, p1}, Lcom/facebook/login/q;->p(Lcom/facebook/login/q;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V

    return-void
.end method
