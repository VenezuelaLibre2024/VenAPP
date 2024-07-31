.class Lcom/google/ads/mediation/facebook/FacebookMediationAdapter$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/mediation/facebook/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->initialize(Landroid/content/Context;Li9/b;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li9/b;

.field final synthetic b:Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;


# direct methods
.method constructor <init>(Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;Li9/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter$a;->b:Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;

    iput-object p2, p0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter$a;->a:Li9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter$a;->a:Li9/b;

    invoke-interface {v0}, Li9/b;->onInitializationSucceeded()V

    return-void
.end method

.method public b(Lx8/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter$a;->a:Li9/b;

    invoke-virtual {p1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Li9/b;->onInitializationFailed(Ljava/lang/String;)V

    return-void
.end method
