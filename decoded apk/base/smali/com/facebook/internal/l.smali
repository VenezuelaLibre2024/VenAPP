.class public final synthetic Lcom/facebook/internal/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/m;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/l;->a:Lcom/facebook/internal/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/l;->a:Lcom/facebook/internal/m;

    invoke-static {v0}, Lcom/facebook/internal/m;->E(Lcom/facebook/internal/m;)V

    return-void
.end method
