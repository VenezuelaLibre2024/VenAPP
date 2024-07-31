.class public final synthetic Lcom/facebook/internal/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/v$b;

.field public final synthetic b:Lcom/facebook/internal/r;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/v$b;Lcom/facebook/internal/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/u;->a:Lcom/facebook/internal/v$b;

    iput-object p2, p0, Lcom/facebook/internal/u;->b:Lcom/facebook/internal/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/internal/u;->a:Lcom/facebook/internal/v$b;

    iget-object v1, p0, Lcom/facebook/internal/u;->b:Lcom/facebook/internal/r;

    invoke-static {v0, v1}, Lcom/facebook/internal/v;->c(Lcom/facebook/internal/v$b;Lcom/facebook/internal/r;)V

    return-void
.end method
