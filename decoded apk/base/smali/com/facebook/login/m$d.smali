.class public final Lcom/facebook/login/m$d;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/m;->j(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/m;


# direct methods
.method constructor <init>(Lcom/facebook/login/m;Landroidx/fragment/app/e;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/m$d;->a:Lcom/facebook/login/m;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/m$d;->a:Lcom/facebook/login/m;

    invoke-virtual {v0}, Lcom/facebook/login/m;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    :cond_0
    return-void
.end method
