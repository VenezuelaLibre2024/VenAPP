.class public final synthetic Lcom/facebook/login/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/d$a;


# instance fields
.field public final synthetic a:Lcom/facebook/login/e0;

.field public final synthetic b:Li4/o;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/e0;Li4/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/b0;->a:Lcom/facebook/login/e0;

    iput-object p2, p0, Lcom/facebook/login/b0;->b:Li4/o;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/b0;->a:Lcom/facebook/login/e0;

    iget-object v1, p0, Lcom/facebook/login/b0;->b:Li4/o;

    invoke-static {v0, v1, p1, p2}, Lcom/facebook/login/e0;->c(Lcom/facebook/login/e0;Li4/o;ILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method
