.class Ld6/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld6/c$d;->onAdLoaded(Lcom/facebook/ads/Ad;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld6/c$d;


# direct methods
.method constructor <init>(Ld6/c$d;)V
    .locals 0

    iput-object p1, p0, Ld6/c$d$a;->a:Ld6/c$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Ld6/c$d$a;->a:Ld6/c$d;

    iget-object v0, v0, Ld6/c$d;->c:Ld6/c;

    invoke-static {v0}, Ld6/c;->P(Ld6/c;)Li9/e;

    move-result-object v1

    iget-object v2, p0, Ld6/c$d$a;->a:Ld6/c$d;

    iget-object v2, v2, Ld6/c$d;->c:Ld6/c;

    invoke-interface {v1, v2}, Li9/e;->onSuccess(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/t;

    invoke-static {v0, v1}, Ld6/c;->R(Ld6/c;Li9/t;)V

    return-void
.end method

.method public b(Lx8/b;)V
    .locals 2

    sget-object v0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ld6/c$d$a;->a:Ld6/c$d;

    iget-object v0, v0, Ld6/c$d;->c:Ld6/c;

    invoke-static {v0}, Ld6/c;->P(Ld6/c;)Li9/e;

    move-result-object v0

    invoke-interface {v0, p1}, Li9/e;->onFailure(Lx8/b;)V

    return-void
.end method
