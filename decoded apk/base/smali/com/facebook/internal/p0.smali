.class public final synthetic Lcom/facebook/internal/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/s0;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/p0;->a:Lcom/facebook/internal/s0;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/p0;->a:Lcom/facebook/internal/s0;

    invoke-static {v0, p1}, Lcom/facebook/internal/s0;->b(Lcom/facebook/internal/s0;Landroid/content/DialogInterface;)V

    return-void
.end method
