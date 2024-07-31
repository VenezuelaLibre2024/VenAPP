.class public final Lcom/facebook/internal/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/n$a;

.field final synthetic b:Lcom/facebook/internal/n$b;


# direct methods
.method constructor <init>(Lcom/facebook/internal/n$a;Lcom/facebook/internal/n$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/n$d;->a:Lcom/facebook/internal/n$a;

    iput-object p2, p0, Lcom/facebook/internal/n$d;->b:Lcom/facebook/internal/n$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/internal/n$d;->a:Lcom/facebook/internal/n$a;

    sget-object v1, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    iget-object v1, p0, Lcom/facebook/internal/n$d;->b:Lcom/facebook/internal/n$b;

    invoke-static {v1}, Lcom/facebook/internal/n;->g(Lcom/facebook/internal/n$b;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/facebook/internal/n$a;->a(Z)V

    return-void
.end method
