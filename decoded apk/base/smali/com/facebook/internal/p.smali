.class public final synthetic Lcom/facebook/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/q$a;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/p;->a:Lcom/facebook/internal/q$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/p;->a:Lcom/facebook/internal/q$a;

    invoke-static {v0}, Lcom/facebook/internal/q;->a(Lcom/facebook/internal/q$a;)V

    return-void
.end method
