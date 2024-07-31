.class public final synthetic Lcom/facebook/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/v$b;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/v$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/t;->a:Lcom/facebook/internal/v$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/t;->a:Lcom/facebook/internal/v$b;

    invoke-static {v0}, Lcom/facebook/internal/v;->b(Lcom/facebook/internal/v$b;)V

    return-void
.end method
