.class Landroidx/browser/customtabs/c$b;
.super Lb/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c;->c(Landroidx/browser/customtabs/b;)Lb/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field final synthetic b:Landroidx/browser/customtabs/b;

.field final synthetic c:Landroidx/browser/customtabs/c;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/c;Landroidx/browser/customtabs/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/c$b;->c:Landroidx/browser/customtabs/c;

    iput-object p2, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    invoke-direct {p0}, Lb/a$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/browser/customtabs/b;->extraCallbackWithResult(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public H1(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$b$a;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$b$a;-><init>(Landroidx/browser/customtabs/c$b;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public V(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$b$b;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$b$b;-><init>(Landroidx/browser/customtabs/c$b;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public V1(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$b$d;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$b$d;-><init>(Landroidx/browser/customtabs/c$b;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public X1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$b$c;

    invoke-direct {v1, p0, p1}, Landroidx/browser/customtabs/c$b$c;-><init>(Landroidx/browser/customtabs/c$b;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public Z1(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 8

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v7, Landroidx/browser/customtabs/c$b$e;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/browser/customtabs/c$b$e;-><init>(Landroidx/browser/customtabs/c$b;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public r1(IILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->b:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$b;->a:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$b$f;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/browser/customtabs/c$b$f;-><init>(Landroidx/browser/customtabs/c$b;IILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
