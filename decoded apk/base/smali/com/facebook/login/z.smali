.class public final synthetic Lcom/facebook/login/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/login/a0;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/a0;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/z;->a:Lcom/facebook/login/a0;

    iput-object p2, p0, Lcom/facebook/login/z;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/z;->a:Lcom/facebook/login/a0;

    iget-object v1, p0, Lcom/facebook/login/z;->b:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lcom/facebook/login/a0;->a(Lcom/facebook/login/a0;Landroid/os/Bundle;)V

    return-void
.end method
