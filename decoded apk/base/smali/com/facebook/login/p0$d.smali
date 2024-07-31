.class public final Lcom/facebook/login/p0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/s0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/p0;->o(Lcom/facebook/login/u$e;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/p0;

.field final synthetic b:Lcom/facebook/login/u$e;


# direct methods
.method constructor <init>(Lcom/facebook/login/p0;Lcom/facebook/login/u$e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/p0$d;->a:Lcom/facebook/login/p0;

    iput-object p2, p0, Lcom/facebook/login/p0$d;->b:Lcom/facebook/login/u$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Li4/r;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/p0$d;->a:Lcom/facebook/login/p0;

    iget-object v1, p0, Lcom/facebook/login/p0$d;->b:Lcom/facebook/login/u$e;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/login/p0;->x(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    return-void
.end method
