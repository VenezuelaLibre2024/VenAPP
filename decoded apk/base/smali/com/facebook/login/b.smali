.class public final synthetic Lcom/facebook/login/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/login/c;

.field public final synthetic b:Lcom/facebook/login/u$e;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/b;->a:Lcom/facebook/login/c;

    iput-object p2, p0, Lcom/facebook/login/b;->b:Lcom/facebook/login/u$e;

    iput-object p3, p0, Lcom/facebook/login/b;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/login/b;->a:Lcom/facebook/login/c;

    iget-object v1, p0, Lcom/facebook/login/b;->b:Lcom/facebook/login/u$e;

    iget-object v2, p0, Lcom/facebook/login/b;->c:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Lcom/facebook/login/c;->x(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V

    return-void
.end method
